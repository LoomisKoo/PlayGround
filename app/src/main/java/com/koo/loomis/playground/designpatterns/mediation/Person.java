package com.koo.loomis.playground.designpatterns.mediation;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.mediation
 * @ClassName: Person
 * @Description: java类作用描述  人物类
 * @Author: koo
 * @CreateDate: 2019/4/9 14:13
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Person {
    protected HouseMediator houseMediator;

    public Person(HouseMediator houseMediator) {
        //获取中介
        this.houseMediator = houseMediator;
    }

    //发布信息
    public abstract void send(String message);

    //接受信息
    public abstract void getNotice(String message);
}