package com.koo.loomis.playground.designpatterns.adapter;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.adapter
 * @ClassName: Adapter
 * @Description: java类作用描述   220V转换成5V的接口
 * @Author: koo
 * @CreateDate: 2019/4/9 16:36
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Adapter {

    /**
     * 装换成5V
     * @return
     */
    int convert_5v();
}