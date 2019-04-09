package com.koo.loomis.playground.designpatterns.mediation;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.mediation
 * @ClassName: Lianjia
 * @Description: java类作用描述   链家，实现HouseMediator
 * @Author: koo
 * @CreateDate: 2019/4/9 14:15
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 14:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Lianjia implements HouseMediator {
    Purchaser mPurchaser;
    Landlord  mLandlord;

    /**
     * 设置买房者
     *
     * @param purchaser
     */
    public void setPurchaser(Purchaser purchaser) {
        mPurchaser = purchaser;
    }

    /**
     * 设置房东
     *
     * @param landlord
     */
    public void setLandlord(Landlord landlord) {
        mLandlord = landlord;
    }

    /**
     * 发送通知
     *
     * @param person
     * @param message
     */
    @Override
    public void notice(Person person, String message) {
        System.out.println("中介收到信息，并转发给相应的目标人群");
        if (person instanceof Purchaser) {
            if (null != mLandlord) {
                mLandlord.getNotice(message);
            }
        }
        else if (person instanceof Landlord) {
            if (null != mPurchaser) {
                mPurchaser.getNotice(message);
            }
        }
    }
}