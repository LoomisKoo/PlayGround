package com.koo.loomis.playground.designpatterns.state;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.state
 * @ClassName: DogState
 * @Description: java类作用描述  单身狗状态
 * @Author: koo
 * @CreateDate: 2019/4/9 10:13
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DogState implements PersonState {

    @Override
    public void movies() {
        System.out.println("一个人孤独看大片");
    }

    @Override
    public void shopping() {
        //单身狗不逛街
        //空实现
    }
}