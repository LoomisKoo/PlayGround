package com.koo.loomis.playground.designpatterns.proxy;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.proxy
 * @ClassName: Oversea
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 15:53
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 15:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Oversea implements People {
    /**
     * 持有People类的引用
     */
    People mPeople;

    public Oversea(People people) {
        mPeople = people;
    }

    @Override
    public void buy() {
        System.out.println("我是海外代购：");
        //调用了被代理者的buy()方法,
        mPeople.buy();
    }
}
