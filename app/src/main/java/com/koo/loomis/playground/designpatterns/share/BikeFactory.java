package com.koo.loomis.playground.designpatterns.share;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.share
 * @ClassName: BikeFactory
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 16:55
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BikeFactory {
    /**
     * 使用HashMap来保存IBike对象
     */
    private static Map<String, IBike> pool = new HashMap<>();

    public IBike getBike(String name) {
        IBike bike = null;
        //如果存在对象的话，直接使用
        if (pool.containsKey(name)) {
            System.out.println("押金已交，直接用车：" + name);
            bike = pool.get(name);
        }
        else {//对象不存在的话，先创建对象
            bike = new ShareBike();
            pool.put(name, bike);
            System.out.println(name + "交100押金，可以用车了。");
        }
        return bike;
    }
}
