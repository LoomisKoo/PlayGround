package com.koo.loomis.playground.designpatterns.appearance;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.appearance
 * @ClassName: GameSdk
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 16:59
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class GameSdk {
    public void login() {
        //登录接口
        //调用登录子系统的接口
        LoginManager loginManager = new LoginManager();
        loginManager.login();
    }

    public void pay(int money) {
        //支付接口
        //调用支付子系统的接口
        PayManager payManager = new PayManager();
        payManager.pay(money);
    }
}
