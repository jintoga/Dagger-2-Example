package com.dat.dagger2example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DAT on 13-Mar-16.
 */
@Module
public class MyOtherModule {

    @Provides
    @Singleton
    public EmptyModel provideEmptyModel(String name) {
        return new EmptyModel(name);
    }
}
