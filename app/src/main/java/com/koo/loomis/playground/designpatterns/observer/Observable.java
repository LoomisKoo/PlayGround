package com.koo.loomis.playground.designpatterns.observer;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.observer
 * @ClassName: Observable
 * @Description: java类作用描述   抽象被观察者
 * @Author: koo
 * @CreateDate: 2019/4/9 10:40
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Observable {
    /**
     * 添加观察者
     */
    void add(Observer observer);

    /**
     * 删除观察者
     */
    void remove(Observer observer);

    /**
     * 通知观察者
     */
    void notify(String message);
}