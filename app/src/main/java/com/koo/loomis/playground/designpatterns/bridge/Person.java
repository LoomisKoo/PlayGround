package com.koo.loomis.playground.designpatterns.bridge;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.bridge
 * @ClassName: Person
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 17:05
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 17:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class Person {
    /**
     * 持有衣服类的引用
     */
    Clothes mClothes;

    public void setClothes(Clothes clothes) {
        mClothes = clothes;
    }

    /**
     * 穿衣服
     */
    public abstract void dress();
}