package com.AdviceForParents.advice;

import android.app.Application;

import com.onesignal.OneSignal;

public class ApplicationClass extends Application {
    private static final String ONESIGNAL_APP_ID = "b433c748-2f1d-49da-9700-e7482ae1f4dc";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
