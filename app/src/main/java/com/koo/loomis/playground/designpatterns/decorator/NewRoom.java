package com.koo.loomis.playground.designpatterns.decorator;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.decorator
 * @ClassName: NewRoom
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 16:42
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NewRoom extends Room {
    @Override
    public void fitment() {
        System.out.println("这是一间新房：装上电");
    }
}
