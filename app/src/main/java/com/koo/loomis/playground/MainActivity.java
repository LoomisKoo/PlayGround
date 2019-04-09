package com.koo.loomis.playground;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.koo.loomis.othertest.R;
import com.koo.loomis.othertest.util.TestDesignPatternsUtil;
import com.koo.loomis.playground.util.TestDesignPatternsUtil;

import cn.simonlee.widget.swipeback.SwipeBackHelper;

public class MainActivity extends AppCompatActivity {
    SwipeBackHelper mSwipeBackHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnGoToSecondActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SwipeBackActivity.class));
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mSwipeBackHelper = new SwipeBackHelper(this);
            //设置窗口背景颜色，以覆盖不可见区域的黑色背景（不可见区域常见为当输入法及导航栏变化时的背景）
            mSwipeBackHelper.setWindowBackgroundColor(Color.BLUE);
        }

        testDesignPatterns();
    }


    /**
     * 设计模式
     */
    private void testDesignPatterns() {
        TestDesignPatternsUtil TestDesignPatternsUtil = new TestDesignPatternsUtil();
        TestDesignPatternsUtil.test();
    }
}
