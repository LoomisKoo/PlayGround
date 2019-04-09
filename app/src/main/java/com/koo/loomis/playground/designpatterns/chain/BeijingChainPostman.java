package com.koo.loomis.playground.designpatterns.chain;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.chain
 * @ClassName: BeijingChainPostman
 * @Description: java类作用描述   北京快递员
 * @Author: koo
 * @CreateDate: 2019/4/9 10:26
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BeijingChainPostman extends ChainPostman {

    @Override
    public void handleCourier(String address) {
        //北京地区的则派送
        if (address.equals("Beijing")) {
            System.out.println("派送到北京");
            return;
        }
        else {//否则交给下一个快递员去处理
            nextChainPostman.handleCourier(address);
        }
    }
}