package com.koo.loomis.playground.designpatterns.interpreter;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.interpreter
 * @ClassName: ArithmeticExpression
 * @Description: java类作用描述   抽象的解释器，定义每个解释器都有个方法提取结果值
 * @Author: koo
 * @CreateDate: 2019/4/9 14:40
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class ArithmeticExpression {
    public abstract int interpret();
}
