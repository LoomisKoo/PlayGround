package com.koo.loomis.playground.designpatterns.strategy;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.strategy
 * @ClassName: TaxiCalculate
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 13:59
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 13:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TaxiCalculate implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 2 * km;
    }
}