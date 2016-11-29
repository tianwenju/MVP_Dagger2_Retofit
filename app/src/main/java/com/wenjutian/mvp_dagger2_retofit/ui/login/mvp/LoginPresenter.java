package com.wenjutian.mvp_dagger2_retofit.ui.login.mvp;

import android.util.Log;

import com.wenjutian.mvp_dagger2_retofit.di.scope.ActivityScope;
import com.wenjutian.mvp_dagger2_retofit.entity._User;
import com.wenjutian.mvp_dagger2_retofit.mvp.BasePresenter;

import javax.inject.Inject;

import rx.functions.Action1;

/**
 * Created by V.Wenju.Tian on 2016/9/2.
 */
@ActivityScope
public class LoginPresenter extends BasePresenter<LoginContract.Model,LoginContract.View> {


    @Inject
    public LoginPresenter(LoginContract.Model model, LoginContract.View mView) {
        super(model, mView);
    }

    public void login(String name, String password){

        getmModel().login(name,password).subscribe(new Action1<_User.LoginResult>() {
            @Override
            public void call(_User.LoginResult loginResult) {

                Log.e(TAG, "call() called with: loginResult = [" + loginResult + "]");
                getmView().loginSucess();

            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.e(TAG, "call() called with: throwable = [" + throwable + "]");
                getmView().loginFailed();
            }
        });

    }
}
