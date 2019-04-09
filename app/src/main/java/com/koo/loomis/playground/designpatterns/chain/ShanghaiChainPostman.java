package com.koo.loomis.playground.designpatterns.chain;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.chain
 * @ClassName: ShanghaiChainPostman
 * @Description: java类作用描述   上海快递员
 * @Author: koo
 * @CreateDate: 2019/4/9 10:26
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ShanghaiChainPostman extends ChainPostman {

    @Override
    public void handleCourier(String address) {
        if (address.equals("Shanghai")) {
            System.out.println("派送到上海");
            return;
        } else {
            nextChainPostman.handleCourier(address);
        }
    }
}