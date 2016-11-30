package com.wenjutian.mvp_dagger2_retofit.di.component;

import android.app.Application;

import com.wenjutian.mvp_dagger2_retofit.api.ApiService;
import com.wenjutian.mvp_dagger2_retofit.di.module.AppModule;
import com.wenjutian.mvp_dagger2_retofit.di.module.ClientModule;
import com.wenjutian.mvp_dagger2_retofit.di.module.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by V.Wenju.Tian on 2016/11/22.
 */
@Singleton
@Component(modules = {AppModule.class, ClientModule.class, ServiceModule.class})
public interface AppComponent {

    Application Application();

    ApiService  apiService();
}
