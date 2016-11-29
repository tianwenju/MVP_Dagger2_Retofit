package com.wenjutian.mvp_dagger2_retofit.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wenjutian.mvp_dagger2_retofit.app.App;
import com.wenjutian.mvp_dagger2_retofit.di.component.AppComponent;
import com.wenjutian.mvp_dagger2_retofit.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * Created by V.Wenju.Tian on 2016/11/29.
 */

public abstract class BaseActiviy <p extends BasePresenter> extends AppCompatActivity{

    @Inject
    protected  p  mPresenter;
    private App application;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = ((App) getApplication());
         
        setContentView(getContentViewId());
        componentInject(application.getAppComponent());//依赖注入
        initData();
    }

    protected abstract void componentInject(AppComponent appComponent);


    public p getmPresenter() {
        return mPresenter;
    }

    protected abstract void initData();

    

    protected abstract int getContentViewId();
}
