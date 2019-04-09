package com.koo.loomis.playground.designpatterns.factory;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.factory
 * @ClassName: AbstractComputerFactory
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 11:32
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:32
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class AbstractComputerFactory {
    public abstract CPU createCPU();

    public abstract Memory createMemory();

    public abstract HD createHD();
}
