package com.wenjutian.mvp_dagger2_retofit.ui.login.mvp;

import com.wenjutian.mvp_dagger2_retofit.api.ApiService;
import com.wenjutian.mvp_dagger2_retofit.entity._User;
import com.wenjutian.mvp_dagger2_retofit.mvp.BaseModel;
import com.wenjutian.mvp_dagger2_retofit.utils.RxsRxSchedulers;

import rx.Observable;


/**
 * Created by V.Wenju.Tian on 2016/9/2.
 */
public class LoginModel extends BaseModel implements LoginContract.Model {


    public LoginModel(ApiService service) {
        super(service);
    }
    @Override
    public Observable<_User.LoginResult> login(String name, String password) {

        _User user = new _User();
        user.setUsername(name);
        user.setPassword(password);
//        //// TODO: 2016/10/19 如果先从本地读取在从网络获取怎么写
//        Observable<_User.LoginResult> observable = Observable.create(new Observable.OnSubscribe<_User.LoginResult>() {
//            @Override
//            public void call(Subscriber<? super _User.LoginResult> subscriber) {
//                _User.LoginResult loginResult = new _User.LoginResult();
//
//                if (loginResult != null) {
//
//                    subscriber.onNext(loginResult);
//                } else {
//
//                }
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());

        return getApiService().login(user).compose(RxsRxSchedulers.<_User.LoginResult>io_main());
    }
}


