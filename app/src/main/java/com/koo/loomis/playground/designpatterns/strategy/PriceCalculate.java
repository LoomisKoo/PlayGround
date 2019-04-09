package com.koo.loomis.playground.designpatterns.strategy;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.strategy
 * @ClassName: PriceCalculate
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 14:26
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 14:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PriceCalculate {
    private CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int getPrice(int km) {
        return calculateStrategy.calculatePrice(km);
    }
}
