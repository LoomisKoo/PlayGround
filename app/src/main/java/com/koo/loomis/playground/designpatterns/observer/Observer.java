package com.koo.loomis.playground.designpatterns.observer;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.observer
 * @ClassName: Observer
 * @Description: java类作用描述   抽象观察者
 * @Author: koo
 * @CreateDate: 2019/4/9 10:38
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Observer {
    /**
     *     更新方法
     */
    public void update(String message);
}