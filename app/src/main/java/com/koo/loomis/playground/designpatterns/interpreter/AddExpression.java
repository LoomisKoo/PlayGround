package com.koo.loomis.playground.designpatterns.interpreter;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.interpreter
 * @ClassName: AddExpression
 * @Description: java类作用描述   一个具体的加法运算符,解析出两个参数的和
 * @Author: koo
 * @CreateDate: 2019/4/9 14:45
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AddExpression extends OperatorExpression {
    public AddExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}