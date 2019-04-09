package com.koo.loomis.playground.designpatterns.strategy;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.strategy
 * @ClassName: CalculateStrategy
 * @Description: java类作用描述   计算路费
 * @Author: koo
 * @CreateDate: 2019/4/8 13:55
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 13:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface CalculateStrategy {
    int calculatePrice(int km);
}
