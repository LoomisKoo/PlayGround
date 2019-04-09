package com.koo.loomis.playground.designpatterns.observer;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.observer
 * @ClassName: Boy
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 10:38
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Boy implements Observer {
    //名字
    private String name;

    public Boy(String name) {
        this.name = name;
    }

    //男孩的具体反应
    @Override
    public void update(String message) {
        System.out.println(name + ",收到了信息:" + message + "屁颠颠的去取快递.");
    }
}