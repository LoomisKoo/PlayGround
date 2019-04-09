package com.koo.loomis.playground.designpatterns.mediation;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.mediation
 * @ClassName: HouseMediator
 * @Description: java类作用描述   房屋中介类
 * @Author: koo
 * @CreateDate: 2019/4/9 14:15
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface HouseMediator {
    /**
     * 通知方法
     *
     * @param person
     * @param msg
     */
    void notice(Person person, String msg);
}