package com.why.dragger.Utils;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by 小慧莹 on 2018/4/9.
 */

public class Mapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
