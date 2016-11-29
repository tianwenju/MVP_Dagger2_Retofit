package com.wenjutian.mvp_dagger2_retofit.app;

import com.wenjutian.mvp_dagger2_retofit.api.API;
import com.wenjutian.mvp_dagger2_retofit.base.BaseApplication;
import com.wenjutian.mvp_dagger2_retofit.di.component.AppComponent;
import com.wenjutian.mvp_dagger2_retofit.di.component.DaggerAppComponent;

/**
 * Created by V.Wenju.Tian on 2016/11/29.
 */

public class App  extends BaseApplication{

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().clientModule(getClientModule()).appModule(getAppModule()).serviceModule(getServiceModule()).build();

    }

    @Override
    protected String getBaseUrl() {
        return API.BASE_URL;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
