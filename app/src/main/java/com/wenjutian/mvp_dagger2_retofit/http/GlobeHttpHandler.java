package com.wenjutian.mvp_dagger2_retofit.http;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public interface GlobeHttpHandler {
    Response onHttpResultResponse(String httpResult, Interceptor.Chain chain, Response response);

    Request onHttpRequestBefore(Interceptor.Chain chain, Request request);
}
