package com.vpa.daugia.module.sse.data.api;

import com.vpa.daugia.module.sse.data.model.SSEEventData;
import com.vpa.daugia.module.sse.data.model.STATUS;
import dl.r;
import dl.z;
import f0.b0;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.sse.EventSources;
import sk.e;
import sk.j;

/* compiled from: SSERepository.kt */
public final class SSERepository {
    private OkHttpClient sseClient;
    private r<SSEEventData> sseEventsFlow = new z(new SSEEventData(STATUS.NONE, (String) null, 2, (e) null));

    public SSERepository(String str, String str2) {
        j.f(str, "channel");
        j.f(str2, "accessToken");
        initEventSource(str, str2);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j.f(timeUnit, "unit");
        builder.f22093y = Util.b(90, timeUnit);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        j.f(timeUnit2, "unit");
        builder.f22094z = Util.b(20, timeUnit2);
        builder.A = Util.b(20, timeUnit2);
        this.sseClient = new OkHttpClient(builder);
    }

    private final void initEventSource(String str, String str2) {
        Request initSSEClient = initSSEClient(str, str2);
        SSERepository$initEventSource$sseEventSourceListener$1 sSERepository$initEventSource$sseEventSourceListener$1 = new SSERepository$initEventSource$sseEventSourceListener$1(this);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j.f(timeUnit, "unit");
        builder.f22093y = Util.b(90, timeUnit);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        j.f(timeUnit2, "unit");
        builder.f22094z = Util.b(10, timeUnit2);
        builder.A = Util.b(10, timeUnit2);
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        this.sseClient = okHttpClient;
        EventSources.a(okHttpClient).a(initSSEClient, sSERepository$initEventSource$sseEventSourceListener$1);
    }

    private final Request initSSEClient(String str, String str2) {
        String s10 = b0.s("https://stg-dgbs.vpa.com.vn/phong-dau-gia/sse/", str, "/bidding-stream");
        Request.Builder builder = new Request.Builder();
        builder.e(s10);
        String str3 = "Bearer " + str2;
        j.f(str3, "value");
        builder.f22112c.a("Authorization", str3);
        return builder.a();
    }

    public final r<SSEEventData> getSseEventsFlow() {
        return this.sseEventsFlow;
    }
}
