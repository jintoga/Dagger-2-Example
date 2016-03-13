package com.dat.dagger2example;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by DAT on 13-Mar-16.
 */
public class MyApplication extends Application {
    @NonNull
    private MyAppComponent myAppComponent;

    public static MyApplication get(Context context){
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myAppComponent = DaggerMyAppComponent.builder().myApplicationModule(new MyApplicationModule(this)).build();
    }

    @NonNull
    public MyAppComponent getMyAppComponent() {
        return myAppComponent;
    }
}
