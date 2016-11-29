package com.wenjutian.mvp_dagger2_retofit;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.wenjutian.mvp_dagger2_retofit.base.BaseActiviy;
import com.wenjutian.mvp_dagger2_retofit.di.component.AppComponent;
import com.wenjutian.mvp_dagger2_retofit.ui.login.di.DaggerLoginComponent;
import com.wenjutian.mvp_dagger2_retofit.ui.login.di.LoginModule;
import com.wenjutian.mvp_dagger2_retofit.ui.login.mvp.LoginContract;
import com.wenjutian.mvp_dagger2_retofit.ui.login.mvp.LoginPresenter;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends BaseActiviy<LoginPresenter> implements LoginContract.View {


    @InjectView(R.id.login)
    Button login;
    @InjectView(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void componentInject(AppComponent appComponent) {
        DaggerLoginComponent.builder().appComponent(appComponent).loginModule(new LoginModule(this)).build().inject(this);

    }

    @Override
    protected void initData() {


    }


    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void loginSucess() {

    }

    @Override
    public void loginFailed() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.inject(this);
    }

    @OnClick(R.id.login)
    public void onClick() {
        getmPresenter().login("V.Wenju.tian", "2wsx#EDC");
    }
}
