package com.example.sweet_xue.xingzuofortune;

import android.app.Application;

import com.baidu.apistore.sdk.ApiStoreSDK;

/**
 * Created by sweet_xue on 23/3/16.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        ApiStoreSDK.init(this, "fda10c676a9c9676aac9ee20a8568ba4");
        super.onCreate();

    }
}
