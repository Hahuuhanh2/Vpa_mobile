package okhttp3.internal.connection;

import ek.i;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import sk.j;

/* compiled from: ConnectInterceptor.kt */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final ConnectInterceptor f22215a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        boolean z10;
        RealCall realCall = realInterceptorChain.f22318a;
        realCall.getClass();
        synchronized (realCall) {
            if (!realCall.f22262v) {
                throw new IllegalStateException("released".toString());
            } else if (!(!realCall.f22261u)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!realCall.f22260t) {
                i iVar = i.f20112a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ExchangeFinder exchangeFinder = realCall.f22256p;
        j.c(exchangeFinder);
        OkHttpClient okHttpClient = realCall.f22248a;
        j.f(okHttpClient, "client");
        try {
            int i10 = realInterceptorChain.f22323f;
            int i11 = realInterceptorChain.f22324g;
            int i12 = realInterceptorChain.f22325h;
            int i13 = okHttpClient.I;
            boolean z11 = okHttpClient.f22055f;
            if (!j.a(realInterceptorChain.f22322e.f22105b, "GET")) {
                z10 = true;
            } else {
                z10 = false;
            }
            Exchange exchange = new Exchange(realCall, realCall.f22252e, exchangeFinder, exchangeFinder.a(i10, i11, i12, i13, z11, z10).j(okHttpClient, realInterceptorChain));
            realCall.f22259s = exchange;
            realCall.f22264x = exchange;
            synchronized (realCall) {
                realCall.f22260t = true;
                realCall.f22261u = true;
            }
            if (!realCall.f22263w) {
                return RealInterceptorChain.b(realInterceptorChain, 0, exchange, (Request) null, 61).c(realInterceptorChain.f22322e);
            }
            throw new IOException("Canceled");
        } catch (RouteException e10) {
            exchangeFinder.c(e10.f22300b);
            throw e10;
        } catch (IOException e11) {
            exchangeFinder.c(e11);
            throw new RouteException(e11);
        }
    }
}
