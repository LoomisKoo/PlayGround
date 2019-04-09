package com.koo.loomis.playground;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;

import com.koo.loomis.othertest.R;

import cn.simonlee.widget.swipeback.SwipeBackHelper;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest
 * @ClassName: SwipeBackActivity
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/3/19 11:16
 * @UpdateUser:
 * @UpdateDate: 2019/3/19 11:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SwipeBackActivity extends Activity {
    SwipeBackHelper mSwipeBackHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_back);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mSwipeBackHelper = new SwipeBackHelper(this);
            //设置窗口背景颜色，以覆盖不可见区域的黑色背景（不可见区域常见为当输入法及导航栏变化时的背景）
            mSwipeBackHelper.setWindowBackgroundColor(Color.BLUE);
        }

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (mSwipeBackHelper != null) {
            mSwipeBackHelper.dispatchTouchEvent(event);
        }
        return super.dispatchTouchEvent(event);
    }


}
