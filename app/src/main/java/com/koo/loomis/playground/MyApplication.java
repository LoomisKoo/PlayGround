package com.koo.loomis.playground;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.view.View;
import android.widget.LinearLayout;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;

/**
 * @ProjectName: PlayGround
 * @Package: com.koo.loomis.playground
 * @ClassName: MyApplication
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/12 16:07
 * @UpdateUser:
 * @UpdateDate: 2019/4/12 16:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        boolean isDebug = isApkInDebug(this);
        if (isDebug) {
            // 打印日志
            ARouter.openLog();
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug();
        }
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this);

        /**
         * 必须在 Application 的 onCreate 方法中执行 BGASwipeBackHelper.init 来初始化滑动返回
         * 第一个参数：应用程序上下文
         * 第二个参数：如果发现滑动返回后立即触摸界面时应用崩溃，请把该界面里比较特殊的 View 的 class 添加到该集合中，目前在库中已经添加了 WebView 和 SurfaceView
         */

        List<Class<? extends View>> problemViewClassList = new ArrayList<>();
        problemViewClassList.add(LinearLayout.class);
        BGASwipeBackHelper.init(this, null);
    }

    //判断当前应用是否是debug状态
    public static boolean isApkInDebug(Context context) {
        try {
            ApplicationInfo info = context.getApplicationInfo();
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        }
        catch (Exception e) {
            return false;
        }
    }
}
