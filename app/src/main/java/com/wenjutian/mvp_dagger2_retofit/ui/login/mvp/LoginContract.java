package com.wenjutian.mvp_dagger2_retofit.ui.login.mvp;


import com.wenjutian.mvp_dagger2_retofit.entity._User;
import com.wenjutian.mvp_dagger2_retofit.mvp.IModel;
import com.wenjutian.mvp_dagger2_retofit.mvp.IView;

import rx.Observable;

/**
 * Created by V.Wenju.Tian on 2016/9/2.
 */
public interface LoginContract {

    interface Model extends IModel {

        Observable<_User.LoginResult> login(String name, String password);

    }

    interface View extends IView {

        void loginSucess();
        void loginFailed();

    }

}
