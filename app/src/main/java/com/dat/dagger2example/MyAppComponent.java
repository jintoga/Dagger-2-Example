package com.dat.dagger2example;

import android.support.annotation.NonNull;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by DAT on 13-Mar-16.
 */
@Singleton
@Component(modules = {
        MyApplicationModule.class,MyOtherModule.class
})
public interface MyAppComponent {
    @NonNull
    MyApplication myApplication();

    @NonNull
    Picasso picasso();

}
