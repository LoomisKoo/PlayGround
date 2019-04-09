package com.koo.loomis.playground.designpatterns.factory;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns
 * @ClassName: Factory
 * @Description: java类作用描述
 * 简单工厂模式
 * 生成复杂对象时，确定只有一个工厂类，可以使用简单工厂模式。
 * 优点：
 * ----代码解耦，创建实例的工作与使用实例的工作分开，使用者不必关心类对象如何创建。
 * 缺点：
 * ---违背开放封闭原则，若需添加新产品则必须修改工厂类逻辑，会造成工厂逻辑过于复杂。
 * ---简单工厂模式使用了静态工厂方法，因此静态方法不能被继承和重写。
 * ---工厂类包含了所有实例（产品）的创建逻辑，若工厂类出错，则会造成整个系统都会会受到影响。
 * @Author: koo
 * @CreateDate: 2019/4/8 11:22
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:22
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Factory {
    public static final String PRODUCT_NAME_A = "a";
    public static final String PRODUCT_NAME_B = "b";

    /**
     * 实现工厂类
     *
     * @param productName
     * @return
     */
    public AbstractProduct getProduct(String productName) {
        switch (productName) {
            case PRODUCT_NAME_A:
                return new ProductA();
            case PRODUCT_NAME_B:
                return new ProductB();
            default:
                return null;
        }
    }

    /**
     * 使用反射来实现工厂类，新增产品时无需修改工厂类，但是使用反射来创建实例对象的话会比正常使用new来创建的要慢。
     *
     * @param clz
     * @param <T>
     * @return
     */
    public static <T extends AbstractProduct> T create(Class<T> clz) {
        AbstractProduct product = null;
        try {
            //反射出实例
            product = (AbstractProduct) Class.forName(clz.getName())
                                             .newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
