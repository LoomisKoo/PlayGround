package com.koo.loomis.playground.designpatterns.factory;

import android.util.Log;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.factory
 * @ClassName: ProductA
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/8 11:25
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ProductB extends AbstractProduct {
    private static final String TAG = ProductB.class.getSimpleName();

    @Override
    public void show() {
        Log.i(TAG, "createProduct");
    }
}
