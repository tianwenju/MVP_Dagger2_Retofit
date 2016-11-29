package com.wenjutian.mvp_dagger2_retofit.utils;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by V.Wenju.Tian on 2016/10/18.
 */

public class RxsRxSchedulers {
    public static <T> Observable.Transformer<T, T> io_main() {

        Observable.Transformer<T, T> transformer = new Observable.Transformer<T, T>() {

            @Override
            public Observable<T> call(Observable<T> tObservable) {
                return tObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
        return transformer;
    }
}
