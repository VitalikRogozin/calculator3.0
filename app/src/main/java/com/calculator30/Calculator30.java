package com.calculator30;

import android.app.Application;
import android.content.Context;

public class Calculator30 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Context context = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
