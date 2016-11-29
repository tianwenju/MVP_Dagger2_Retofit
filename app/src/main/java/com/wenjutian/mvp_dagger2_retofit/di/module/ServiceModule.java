package com.wenjutian.mvp_dagger2_retofit.di.module;


import com.wenjutian.mvp_dagger2_retofit.api.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;


@Module
public class ServiceModule {

    @Singleton
    @Provides
    ApiService provideCommonService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

}
