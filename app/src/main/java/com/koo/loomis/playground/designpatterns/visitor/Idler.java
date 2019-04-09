package com.koo.loomis.playground.designpatterns.visitor;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.visitor
 * @ClassName: Idler
 * @Description: java类作用描述   闲人
 * @Author: koo
 * @CreateDate: 2019/4/9 11:41
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Idler implements Visitor {

    private String name;

    public Idler(String name) {
        this.name = name;
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "浏览音乐网站：" + music.getName());
        music.playMusic();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "浏览视频网站：" + video.getName());
        video.playVideo();
    }
}

