package com.koo.loomis.playground.designpatterns.interpreter;

import java.util.Stack;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.interpreter
 * @ClassName: Calculator
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 15:18
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 15:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Calculator {
    private Stack<ArithmeticExpression> mExp = new Stack<>();

    //使用的时候在构造方法里传入要计算的字符串。
    public Calculator(String expression) {
        //准备两个解释器
        ArithmeticExpression exp1, exp2;
        //将字符串按空格分割
        String[] elements = expression.split(" ");
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    //如果是’+‘，说明是个运算符，将上一个数和下一个数相加，也就是当前下标i的i-1和i+1相加。
                    //去除栈中前一次压入的数。也就是这个加号之前的计算结果。
                    exp1 = mExp.pop();
                    //取出这个加号后面的数，解析成数字，
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //将这两个数进行计算，并将结果压入栈中。
                    mExp.push(new AddExpression(exp1, exp2));
                    break;
                case '-':
                    exp1 = mExp.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExp.push(new SubtractionExpression(exp1, exp2));
                    break;
                default:
                    //如果是数字，就解析为数字，加入栈中。
                    mExp.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate() {
        return mExp.pop()
                   .interpret();
    }

}