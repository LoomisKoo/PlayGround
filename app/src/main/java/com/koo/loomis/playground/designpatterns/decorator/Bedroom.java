package com.koo.loomis.playground.designpatterns.decorator;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.decorator
 * @ClassName: Bedroom
 * @Description: java类作用描述   卧室类
 * @Author: koo
 * @CreateDate: 2019/4/9 16:43
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Bedroom extends RoomDecorator {

    public Bedroom(Room room) {
        super(room);
    }

    @Override
    public void fitment() {
        super.fitment();
        addBedding();
    }

    private void addBedding() {
        System.out.println("装修成卧室：添加卧具");
    }
}