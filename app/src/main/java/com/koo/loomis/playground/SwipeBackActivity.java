package com.koo.loomis.playground;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.loomis.koo.library.activity.BaseActivity;
import com.loomis.koo.library.mvp.IBasePresenter;

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
public class SwipeBackActivity extends BaseActivity {
    @Override
    public void widgetClick(View v) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_back);

    }

    @Override
    public void initView(Bundle savedInstanceState) {

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

    }

}
