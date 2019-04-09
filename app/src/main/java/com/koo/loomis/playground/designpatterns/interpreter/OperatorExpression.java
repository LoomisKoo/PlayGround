package com.koo.loomis.playground.designpatterns.interpreter;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.interpreter
 * @ClassName: OperatorExpression
 * @Description: java类作用描述   抽象的运算符解释器，要求传入两个参数进行计算
 * @Author: koo
 * @CreateDate: 2019/4/9 14:41
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class OperatorExpression extends ArithmeticExpression {
    protected ArithmeticExpression exp1, exp2;

    public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}