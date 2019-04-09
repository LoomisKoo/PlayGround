package com.koo.loomis.playground.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.observer
 * @ClassName: ChainPostman
 * @Description: java类作用描述   快递员
 * @Author: koo
 * @CreateDate: 2019/4/9 10:41
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ObserverPostman implements Observable {
    /**
     * 保存收件人（观察者）的信息
     */
    private List<Observer> personList = new ArrayList<>();

    /**
     * 添加收件人
     */
    @Override
    public void add(Observer observer) {
        personList.add(observer);
    }

    /**
     * 移除收件人
     */
    @Override
    public void remove(Observer observer) {
        personList.remove(observer);
    }

    /**
     * 逐一通知收件人（观察者）
     */
    @Override
    public void notify(String message) {
        for (Observer observer : personList) {
            observer.update(message);
        }
    }
}