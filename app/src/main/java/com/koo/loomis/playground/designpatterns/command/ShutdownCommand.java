package com.koo.loomis.playground.designpatterns.command;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.command
 * @ClassName: ShutdownCommand
 * @Description: java类作用描述   关机命令
 * @Author: koo
 * @CreateDate: 2019/4/9 15:49
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 15:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ShutdownCommand implements Command {
    /**
     * 接受者
     */
    private Receiver receiver;

    public ShutdownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令角色执行关机命令");
        //调用接受者
        receiver.action();
    }
}
