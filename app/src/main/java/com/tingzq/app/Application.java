package com.tingzq.app;


import android.content.Context;

import com.bytedance.boost_multidex.BoostMultiDex;
import com.tencent.mmkv.BuildConfig;
import com.tingzq.base.base.BaseApplication;
import com.tingzq.common.config.ModuleLifecycleConfig;

public class Application extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        setsDebug(BuildConfig.DEBUG);

        // 初始化需要初始化的组件
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        BoostMultiDex.install(base);
    }
}
