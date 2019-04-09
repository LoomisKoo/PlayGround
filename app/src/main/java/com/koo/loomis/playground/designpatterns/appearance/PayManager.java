package com.koo.loomis.playground.designpatterns.appearance;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.appearance
 * @ClassName: PayManager
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 17:00
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 17:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PayManager {
    public void pay(int momey) {
        System.out.println("生成订单信息");
        System.out.println("选择支付方式");
        System.out.println("支付成功：" + momey + "元");
    }
}
