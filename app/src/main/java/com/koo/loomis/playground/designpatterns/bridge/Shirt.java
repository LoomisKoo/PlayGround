package com.koo.loomis.playground.designpatterns.bridge;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.bridge
 * @ClassName: Shirt
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 17:05
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 17:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Shirt implements Clothes {

    @Override
    public String getName() {
        return "衬衫";
    }
}