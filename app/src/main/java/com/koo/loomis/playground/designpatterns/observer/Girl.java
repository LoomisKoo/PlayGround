package com.koo.loomis.playground.designpatterns.observer;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.observer
 * @ClassName: Girl
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 10:39
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Girl implements Observer {
    //名字
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    //女孩的具体反应
    @Override
    public void update(String message) {
        System.out.println(name + ",收到了信息:" + message + "让男朋友去取快递~");
    }
}