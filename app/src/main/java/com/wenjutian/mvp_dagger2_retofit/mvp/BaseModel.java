package com.wenjutian.mvp_dagger2_retofit.mvp;

import com.wenjutian.mvp_dagger2_retofit.api.ApiService;

/**
 * Created by V.Wenju.Tian on 2016/11/29.
 */

public class BaseModel {
    public BaseModel() {
    }

    private ApiService apiService;

    public BaseModel(ApiService apiService) {
        this.apiService = apiService;
    }

    public ApiService getApiService() {
        return apiService;
    }
}
