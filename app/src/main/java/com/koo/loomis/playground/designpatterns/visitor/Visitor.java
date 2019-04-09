package com.koo.loomis.playground.designpatterns.visitor;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.visitor
 * @ClassName: Visitor
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:39
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Visitor {
    /**
     * 访问音乐类
     */
    void visit(Music music);

    /**
     * 访问视频类
     */
    void visit(Video video);
}