package com.wenjutian.mvp_dagger2_retofit.base;

import android.app.Application;
import android.content.Context;

import com.wenjutian.mvp_dagger2_retofit.di.module.AppModule;
import com.wenjutian.mvp_dagger2_retofit.di.module.ClientModule;
import com.wenjutian.mvp_dagger2_retofit.di.module.ServiceModule;
import com.wenjutian.mvp_dagger2_retofit.http.GlobeHttpHandler;

import java.util.LinkedList;

import okhttp3.Interceptor;

/**
 * 本项目由
 * mvp
 * +dagger2
 * +retrofit
 * +rxjava
 * +androideventbus
 * +butterknife组成
 */
public abstract class BaseApplication extends Application {
    static private BaseApplication mApplication;
    public LinkedList<BaseActiviy> mActivityList;
    private ClientModule mClientModule;
    private AppModule mAppModule;
    private  ServiceModule serviceModule;
    protected final String TAG = this.getClass().getSimpleName();


    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        this.mClientModule = ClientModule//用于提供okhttp和retrofit的单列
                .buidler()
                .baseurl(getBaseUrl())
                .globeHttpHandler(getHttpHandler())
                .interceptors(getInterceptors())
                .build();
        this.mAppModule = new AppModule(this);//提供application
       this.serviceModule = new ServiceModule();
    }


    /**
     * 提供基础url给retrofit
     *
     * @return
     */
    protected abstract String getBaseUrl();


    public ServiceModule getServiceModule() {
        return serviceModule;
    }

    public ClientModule getClientModule() {
        return mClientModule;
    }

    public AppModule getAppModule() {
        return mAppModule;
    }

    /**
     * 这里可以提供一个全局处理http响应结果的处理类,
     * 这里可以比客户端提前一步拿到服务器返回的结果,可以做一些操作,比如token超时,重新获取
     * 默认不实现,如果有需求可以重写此方法
     *
     * @return
     */
    protected GlobeHttpHandler getHttpHandler() {
        return null;
    }

    /**
     * 用来提供interceptor,如果要提供额外的interceptor可以让子application实现此方法
     *
     * @return
     */
    protected Interceptor[] getInterceptors() {
        return null;
    }

    /**
     * 返回上下文
     *
     * @return
     */
    public static Context getContext() {
        return mApplication;
    }

}
