package ob;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import mb.d;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* compiled from: InstrumentOkHttpEnqueueCallback */
public final class g implements Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Callback f13812a;

    /* renamed from: b  reason: collision with root package name */
    public final d f13813b;

    /* renamed from: c  reason: collision with root package name */
    public final Timer f13814c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13815d;

    public g(Callback callback, rb.d dVar, Timer timer, long j10) {
        this.f13812a = callback;
        this.f13813b = new d(dVar);
        this.f13815d = j10;
        this.f13814c = timer;
    }

    public final void c(RealCall realCall, Response response) {
        Response response2 = response;
        FirebasePerfOkHttpClient.a(response2, this.f13813b, this.f13815d, this.f13814c.a());
        this.f13812a.c(realCall, response);
    }

    public final void f(RealCall realCall, IOException iOException) {
        Request request = realCall.f22249b;
        if (request != null) {
            HttpUrl httpUrl = request.f22104a;
            if (httpUrl != null) {
                this.f13813b.n(httpUrl.h().toString());
            }
            String str = request.f22105b;
            if (str != null) {
                this.f13813b.g(str);
            }
        }
        this.f13813b.j(this.f13815d);
        this.f13813b.m(this.f13814c.a());
        h.c(this.f13813b);
        this.f13812a.f(realCall, iOException);
    }
}
