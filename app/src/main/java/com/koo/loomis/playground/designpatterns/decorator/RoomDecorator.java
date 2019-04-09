package com.koo.loomis.playground.designpatterns.decorator;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.decorator
 * @ClassName: RoomDecorator
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 16:42
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class RoomDecorator extends Room {
    /**
     * 持有被装饰者的引用，这里是需要装修的房间
     */
    private Room mRoom;

    public RoomDecorator(Room room) {
        this.mRoom = room;
    }

    @Override
    public void fitment() {
        //调用被装饰者的方法
        mRoom.fitment();
    }
}