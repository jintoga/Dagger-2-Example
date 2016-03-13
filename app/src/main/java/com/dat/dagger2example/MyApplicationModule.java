package com.dat.dagger2example;

import android.app.Application;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DAT on 13-Mar-16.
 */
@Module
public class MyApplicationModule {

    private final MyApplication myApplication;

    public MyApplicationModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Provides
    @Singleton
    public MyApplication provideMyApplication(){
        return myApplication;
    }

    @Provides
    @Singleton
    public Picasso providePicasso() {
        return Picasso.with(myApplication.getApplicationContext());
    }

}
