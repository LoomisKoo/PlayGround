package com.koo.loomis.playground.designpatterns.command;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.command
 * @ClassName: Receiver
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 15:50
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 15:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Receiver {
    public void action() {//接收者执行具体的操作
        System.out.println("接收者执行具体的操作");
        System.out.println("开始执行关机操作：");
        System.out.println("退出所有程序进程");
        System.out.println("关机～");
    }
}
