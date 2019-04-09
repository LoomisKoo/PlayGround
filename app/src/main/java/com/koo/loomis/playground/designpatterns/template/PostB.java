package com.koo.loomis.playground.designpatterns.template;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.template
 * @ClassName: PostB
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 10:53
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PostB extends TemplatePostman {//派送给B先生

    @Override
    protected void call() {//联系收货，实现父类的抽象方法
        System.out.println("联系B先生并送到门口");
    }

    @Override
    protected boolean isSign() {//是否签收,覆盖父类的钩子方法，控制流程的走向
        return false;
    }

    @Override
    protected void refuse() {//拒签，覆盖父类的钩子方法
        System.out.println("拒绝签收：商品不符");
    }
}
