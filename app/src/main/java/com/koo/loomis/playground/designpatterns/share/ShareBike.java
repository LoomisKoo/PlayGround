package com.koo.loomis.playground.designpatterns.share;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.share
 * @ClassName: ShareBike
 * @Description: java类作用描述   共享单车类
 * @Author: koo
 * @CreateDate: 2019/4/9 16:54
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ShareBike implements IBike {
    /**
     * 单价
     */
    private int price = 1;
    /**
     * 总价
     */
    private int total;

    @Override
    public void billing(int time) {
        total = price * time;
        System.out.println("骑车花费了" + total + "元");
    }
}