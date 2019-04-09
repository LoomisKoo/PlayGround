package com.koo.loomis.playground.designpatterns.proxy;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.proxy
 * @ClassName: Domestic
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 15:53
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 15:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Domestic implements People {

    @Override
    public void buy() {
        //具体实现
        System.out.println("国内要买一个包");
    }
}

