package com.koo.loomis.playground.designpatterns.factory;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.factory
 * @ClassName: AsusComputerFactory
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 11:56
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:56
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AsusComputerFactory extends AbstractComputerFactory {

    @Override
    public CPU createCPU() {
        return new AmdCPU();
    }

    @Override
    public Memory createMemory() {
        return new KingstonMemory();
    }

    @Override
    public HD createHD() {
        return new WdHD();
    }
}