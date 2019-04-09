package com.koo.loomis.playground.designpatterns.state;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.state
 * @ClassName: LoveState
 * @Description: java类作用描述   恋爱状态
 * @Author: koo
 * @CreateDate: 2019/4/9 10:14
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LoveState implements PersonState {

    @Override
    public void movies() {
        System.out.println("一起上电影院看大片~");
    }

    @Override
    public void shopping() {
        System.out.println("一起愉快的逛街去~");
    }
}