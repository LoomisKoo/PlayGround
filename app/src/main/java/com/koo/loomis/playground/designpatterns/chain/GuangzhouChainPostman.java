package com.koo.loomis.playground.designpatterns.chain;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.chain
 * @ClassName: GuangzhouChainPostman
 * @Description: java类作用描述   广州快递员
 * @Author: koo
 * @CreateDate: 2019/4/9 10:27
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class GuangzhouChainPostman extends ChainPostman {

    @Override
    public void handleCourier(String address) {
        if (address.equals("Guangzhou")) {
            System.out.println("派送到广州");
            return;
        }
        else {
            if (nextChainPostman != null) {
                nextChainPostman.handleCourier(address);
            }
        }
    }
}