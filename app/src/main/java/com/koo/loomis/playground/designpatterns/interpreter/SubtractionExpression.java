package com.koo.loomis.playground.designpatterns.interpreter;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.interpreter
 * @ClassName: SubtractionExpression
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 15:21
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 15:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SubtractionExpression extends OperatorExpression {
    public SubtractionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}