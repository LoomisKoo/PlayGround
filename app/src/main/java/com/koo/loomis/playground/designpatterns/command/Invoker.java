package com.koo.loomis.playground.designpatterns.command;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.command
 * @ClassName: Invoker
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 15:50
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 15:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        System.out.println("调用者执行命令");
        command.execute();
    }
}
