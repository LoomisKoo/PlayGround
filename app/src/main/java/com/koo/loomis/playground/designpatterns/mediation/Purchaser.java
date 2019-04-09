package com.koo.loomis.playground.designpatterns.mediation;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.mediation
 * @ClassName: Purchaser
 * @Description: java类作用描述   买房者类
 * @Author: koo
 * @CreateDate: 2019/4/9 14:14
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Purchaser extends Person {
    public Purchaser(HouseMediator houseMediator) {
        super(houseMediator);
    }

    @Override
    public void send(String message) {
        System.out.println("买房者发布信息：" + message);
        houseMediator.notice(this, message);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("买房者收到消息：" + message);
    }
}
