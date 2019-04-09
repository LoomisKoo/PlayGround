package com.koo.loomis.playground.designpatterns.strategy;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.strategy
 * @ClassName: BusCalculate
 * @Description: java类作用描述  bus计费方式
 * @Author: koo
 * @CreateDate: 2019/4/8 13:57
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 13:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BusCalculate implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int busP = 2;
        if (km > 5) {
            busP = busP + km - 5;
        }
        return busP;
    }
}
