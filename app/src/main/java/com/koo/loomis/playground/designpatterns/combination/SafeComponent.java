package com.koo.loomis.playground.designpatterns.combination;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.combination
 * @ClassName: SafeComponent
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 16:29
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class SafeComponent {
    protected String name;
    public SafeComponent(String name) {
        this.name = name;
    }
    public abstract void print();
}