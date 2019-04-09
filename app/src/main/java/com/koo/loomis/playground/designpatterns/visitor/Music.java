package com.koo.loomis.playground.designpatterns.visitor;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.visitor
 * @ClassName: Music
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:39
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Music extends Web {//音乐类，继承自Web类

    public Music(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {//接受访问者的访问
        visitor.visit(this);
    }

    @Override
    public void download() {//实现父类中的公共方法
        System.out.println("下载音乐~~");
    }

    public void playMusic() {//音乐类独有方法
        System.out.println("播放音乐ing");
    }
}
