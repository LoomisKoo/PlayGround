package com.koo.loomis.playground.designpatterns.visitor;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.visitor
 * @ClassName: Busy
 * @Description: java类作用描述   忙人
 * @Author: koo
 * @CreateDate: 2019/4/9 11:41
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Busy implements Visitor {
    private String name;

    public Busy(String name) {
        this.name = name;
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "浏览音乐网站：" + music.getName());
        music.download();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "浏览视频网站：" + video.getName());
        video.download();
    }
}
