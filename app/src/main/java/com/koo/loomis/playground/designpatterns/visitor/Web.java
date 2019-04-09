package com.koo.loomis.playground.designpatterns.visitor;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.visitor
 * @ClassName: Web
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:39
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Web {
    public String name;

    public Web(String name) {
        this.name = name;
    }

    //定义一个抽象的受访问方法
    public abstract void accept(Visitor visitor);

    //下载资源
    public abstract void download();

    public String getName() {
        return name;
    }
}