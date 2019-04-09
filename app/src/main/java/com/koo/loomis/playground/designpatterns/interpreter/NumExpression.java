package com.koo.loomis.playground.designpatterns.interpreter;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.interpreter
 * @ClassName: NumExpression
 * @Description: java类作用描述   数字解释器，仅仅解释数字
 * @Author: koo
 * @CreateDate: 2019/4/9 14:41
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}