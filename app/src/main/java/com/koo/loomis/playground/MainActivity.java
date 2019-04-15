package com.koo.loomis.playground;

import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import com.koo.loomis.playground.util.TestDesignPatternsUtil;
import com.loomis.koo.library.activity.BaseActivity;
import com.loomis.koo.library.mvp.IBasePresenter;


public class MainActivity extends BaseActivity {

    @Override
    public void widgetClick(View v) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnGoToSecondActivity).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SwipeBackActivity.class)));
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    public void setListener() {

    }

    @Override
    public void initData(Context mContext) {
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
