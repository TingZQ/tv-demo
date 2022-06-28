package com.tingzq.app;


import com.tencent.mmkv.BuildConfig;
import com.tingzq.base.base.BaseApplication;

public class Application extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        setsDebug(BuildConfig.DEBUG);
    }
}
