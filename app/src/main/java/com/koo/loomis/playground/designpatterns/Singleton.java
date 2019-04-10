package com.koo.loomis.playground.designpatterns;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns
 * @ClassName: Singleton
 * @Description: java类作用描述   单例模式
 * @Author: koo
 * @CreateDate: 2019/4/8 10:51
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 10:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Singleton {
    private volatile static Singleton instance;

    //将默认的构造函数私有化，防止其他类手动new
    private Singleton() {
        System.out.println("----------koo  new Singleton()");
    }

    public static Singleton getInstance() {
        System.out.println("----------koo  getInstance");
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}