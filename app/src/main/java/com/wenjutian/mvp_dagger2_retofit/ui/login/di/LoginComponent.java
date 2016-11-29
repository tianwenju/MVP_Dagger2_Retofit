package com.wenjutian.mvp_dagger2_retofit.ui.login.di;

import com.wenjutian.mvp_dagger2_retofit.MainActivity;
import com.wenjutian.mvp_dagger2_retofit.di.component.AppComponent;
import com.wenjutian.mvp_dagger2_retofit.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by V.Wenju.Tian on 2016/11/29.
 */
@ActivityScope
@Component(modules = LoginModule.class,dependencies = AppComponent.class)
public interface LoginComponent {
    public void inject(MainActivity activity);
}
