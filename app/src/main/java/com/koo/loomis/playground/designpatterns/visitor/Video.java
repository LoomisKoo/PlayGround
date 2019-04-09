package com.koo.loomis.playground.designpatterns.visitor;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.visitor
 * @ClassName: Video
 * @Description: java类作用描述   视频类，继承自Web类
 * @Author: koo
 * @CreateDate: 2019/4/9 11:40
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

public class Video extends Web {

    public Video(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        //接受访问者的访问
        visitor.visit(this);
    }

    @Override
    public void download() {
        //实现父类中的公共方法
        System.out.println("下载视频~~");
    }

    public void playVideo() {
        //视频类独有方法
        System.out.println("播放视频ing");
    }
}
