package com.koo.loomis.playground.designpatterns.Memoto;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.Memoto
 * @ClassName: Caretaker
 * @Description: java类作用描述   备忘录管理类
 * @Author: koo
 * @CreateDate: 2019/4/9 11:23
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Caretaker {
    private Memento mMemento;

    public void setMemento(Memento memento) {
        mMemento = memento;
    }

    public Memento getMemento() {
        return mMemento;
    }
}
