package com.koo.loomis.playground.designpatterns.chain;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.chain
 * @ClassName: ChainPostman
 * @Description: java类作用描述   快递员抽象类
 * @Author: koo
 * @CreateDate: 2019/4/9 10:25
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class ChainPostman {//
    public ChainPostman nextChainPostman;//下一个快递员

    public abstract void handleCourier(String address);//派送快递
}