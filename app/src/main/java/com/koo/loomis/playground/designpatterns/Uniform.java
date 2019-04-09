package com.koo.loomis.playground.designpatterns;

import com.koo.loomis.othertest.designpatterns.bridge.Clothes;
import com.koo.loomis.playground.designpatterns.bridge.Clothes;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns
 * @ClassName: Uniform
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 17:04
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 17:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Uniform implements Clothes {

    @Override
    public String getName() {
        return "校服";
    }
}
