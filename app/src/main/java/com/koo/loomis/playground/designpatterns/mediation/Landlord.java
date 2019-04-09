package com.koo.loomis.playground.designpatterns.mediation;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.mediation
 * @ClassName: Landlord
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 14:14
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Landlord extends Person {//房东者类，继承Person
    public Landlord(HouseMediator houseMediator) {
        super(houseMediator);
    }

    @Override
    public void send(String message) {
        System.out.println("房东发布信息：" + message);
        houseMediator.notice(this, message);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("房东收到消息：" + message);
    }
}