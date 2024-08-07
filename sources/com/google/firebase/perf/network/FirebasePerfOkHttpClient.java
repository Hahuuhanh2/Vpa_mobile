package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import mb.d;
import ob.g;
import ob.h;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class FirebasePerfOkHttpClient {
    public FirebasePerfOkHttpClient() {
        throw null;
    }

    public static void a(Response response, d dVar, long j10, long j11) {
        Request request = response.f22124a;
        if (request != null) {
            dVar.n(request.f22104a.h().toString());
            dVar.g(request.f22105b);
            RequestBody requestBody = request.f22107d;
            if (requestBody != null) {
                long a10 = requestBody.a();
                if (a10 != -1) {
                    dVar.i(a10);
                }
            }
            ResponseBody responseBody = response.f22130n;
            if (responseBody != null) {
                long d10 = responseBody.d();
                if (d10 != -1) {
                    dVar.l(d10);
                }
                MediaType h10 = responseBody.h();
                if (h10 != null) {
                    dVar.k(h10.f22029a);
                }
            }
            dVar.h(response.f22127d);
            dVar.j(j10);
            dVar.m(j11);
            dVar.e();
        }
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        Callback callback2 = callback;
        call.v(new g(callback2, rb.d.f14546z, timer, timer.f7662a));
    }

    @Keep
    public static Response execute(Call call) {
        d dVar = new d(rb.d.f14546z);
        Timer timer = new Timer();
        long j10 = timer.f7662a;
        try {
            Response d10 = call.d();
            a(d10, dVar, j10, timer.a());
            return d10;
        } catch (IOException e10) {
            Request i10 = call.i();
            if (i10 != null) {
                HttpUrl httpUrl = i10.f22104a;
                if (httpUrl != null) {
                    dVar.n(httpUrl.h().toString());
                }
                String str = i10.f22105b;
                if (str != null) {
                    dVar.g(str);
                }
            }
            dVar.j(j10);
            dVar.m(timer.a());
            h.c(dVar);
            throw e10;
        }
    }
}
