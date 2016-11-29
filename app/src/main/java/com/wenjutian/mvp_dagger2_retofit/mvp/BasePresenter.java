package com.wenjutian.mvp_dagger2_retofit.mvp;

/**
 * Created by jess on 16/4/28.
 */
public class BasePresenter<M extends IModel, V extends IView> implements Ipresenter {
    protected final String TAG = this.getClass().getSimpleName();


    protected M mModel;
    protected V mView;

    public BasePresenter() {
    }

    public BasePresenter(M model, V mView) {
        this.mModel = model;
        this.mView = mView;
        onStart();
    }

    public M getmModel() {
        return mModel;
    }

    public V getmView() {
        return mView;
    }

    public BasePresenter(V rootView) {
        this.mView = rootView;
        onStart();
    }


    public void onStart() {

    }



}
