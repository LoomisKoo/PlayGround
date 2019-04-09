package com.koo.loomis.playground.designpatterns.strategy;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.strategy
 * @ClassName: SubwayCalculate
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 13:58
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 13:58
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SubwayCalculate implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int subwayP = 0;
        if (km < 5) {
            subwayP = 3;
        }
        if (km > 5 && km <= 10) {
            subwayP = 4;
        }
        if (km > 10) {
            subwayP = 5;
        }
        return subwayP;
    }
}
