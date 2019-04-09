package com.koo.loomis.playground.designpatterns.decorator;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.decorator
 * @ClassName: Kitchen
 * @Description: java类作用描述   厨房类
 * @Author: koo
 * @CreateDate: 2019/4/9 16:43
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Kitchen extends RoomDecorator {

    public Kitchen(Room room) {
        super(room);
    }

    @Override
    public void fitment() {
        super.fitment();
        addKitchenware();
    }

    private void addKitchenware() {
        System.out.println("装修成厨房：添加厨具");
    }
}