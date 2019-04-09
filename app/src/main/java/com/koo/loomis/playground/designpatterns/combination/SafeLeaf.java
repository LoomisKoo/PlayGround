package com.koo.loomis.playground.designpatterns.combination;

import android.util.Log;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.combination
 * @ClassName: SafeLeaf
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 16:29
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SafeLeaf extends SafeComponent {
    private static final String TAG = SafeLeaf.class.getSimpleName();

    public SafeLeaf(String name) {
        super(name);
    }

    @Override
    public void print() {
        Log.d(TAG, name);
    }
}

