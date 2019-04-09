package com.koo.loomis.playground.designpatterns.factory;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.factory
 * @ClassName: LenovoComputerFactory
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 11:54
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LenovoComputerFactory extends AbstractComputerFactory {

    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public Memory createMemory() {
        return new SamsungMemory();
    }

    @Override
    public HD createHD() {
        return new SeagateHD();
    }
}