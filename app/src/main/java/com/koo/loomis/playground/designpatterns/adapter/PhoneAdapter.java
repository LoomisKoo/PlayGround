package com.koo.loomis.playground.designpatterns.adapter;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.adapter
 * @ClassName: PhoneAdapter
 * @Description: java类作用描述   手机适配器类
 * @Author: koo
 * @CreateDate: 2019/4/9 16:37
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PhoneAdapter implements Adapter {
    /**
     * 适配器持有源目标对象
     */
    private Electric mElectric;

    /**
     * 通过构造方法传入对象
     * @param electric
     */
    public PhoneAdapter(Electric electric) {
        mElectric = electric;
    }

    @Override
    public int convert_5v() {
        System.out.println("适配器开始工作：");
        System.out.println("输入电压：" + mElectric.output_220v());
        System.out.println("输出电压：" + 5);
        return 5;
    }
}