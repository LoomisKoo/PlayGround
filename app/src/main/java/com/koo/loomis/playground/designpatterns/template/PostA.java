package com.koo.loomis.playground.designpatterns.template;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.template
 * @ClassName: PostA
 * @Description: java类作用描述   派送给A先生
 * @Author: koo
 * @CreateDate: 2019/4/9 10:53
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PostA extends TemplatePostman {
    //联系收货，实现父类的抽象方法
    @Override
    protected void call() {
        System.out.println("联系A先生并送到门口");
    }
}