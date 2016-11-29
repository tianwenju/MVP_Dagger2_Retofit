package com.wenjutian.mvp_dagger2_retofit.ui.login.di;

import com.wenjutian.mvp_dagger2_retofit.api.ApiService;
import com.wenjutian.mvp_dagger2_retofit.di.scope.ActivityScope;
import com.wenjutian.mvp_dagger2_retofit.ui.login.mvp.LoginContract;
import com.wenjutian.mvp_dagger2_retofit.ui.login.mvp.LoginModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by V.Wenju.Tian on 2016/11/29.
 */

@Module
public class LoginModule {

    private LoginContract.View view;

    public LoginModule(LoginContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    LoginContract.View  providerContract() {
        return  view;
    }
    @ActivityScope
    @Provides
    LoginContract.Model providerModel(ApiService service){
        return  new LoginModel(service);
    }

}
