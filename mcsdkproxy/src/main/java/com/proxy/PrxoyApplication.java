package com.proxy;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.proxy.configurator.Proxys;

/**
 * Created by Administrator on 2018/4/10 0010.
 */

public class PrxoyApplication extends MultiDexApplication {

    private Activity mActivity;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Proxys.init(this)
                .withApiHost("http://oms.u7game.cn")
                .withLoaderDelayed(500)
                .withActivity(mActivity)
                .withAppId("")
                .withAppKey("")
                .configure();
    }
}
