package okhttp3.logging;

import android.support.v4.media.a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.logging.HttpLoggingInterceptor;
import sk.j;

/* compiled from: LoggingEventListener.kt */
public final class LoggingEventListener extends EventListener {

    /* renamed from: b  reason: collision with root package name */
    public long f22628b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpLoggingInterceptor.Logger f22629c;

    /* compiled from: LoggingEventListener.kt */
    public static class Factory implements EventListener.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final HttpLoggingInterceptor.Logger f22630a;

        public Factory() {
            HttpLoggingInterceptor.Logger logger = HttpLoggingInterceptor.Logger.f22627a;
            j.f(logger, "logger");
            this.f22630a = logger;
        }

        public final EventListener b(Call call) {
            j.f(call, "call");
            return new LoggingEventListener(this.f22630a);
        }
    }

    public LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.f22629c = logger;
    }

    public final void A(Call call, Response response) {
        j.f(call, "call");
        D("satisfactionFailure: " + response);
    }

    public final void B(RealCall realCall, Handshake handshake) {
        j.f(realCall, "call");
        D("secureConnectEnd: " + handshake);
    }

    public final void C(RealCall realCall) {
        j.f(realCall, "call");
        D("secureConnectStart");
    }

    public final void D(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f22628b);
        HttpLoggingInterceptor.Logger logger = this.f22629c;
        logger.a('[' + millis + " ms] " + str);
    }

    public final void a(Call call, Response response) {
        j.f(call, "call");
        D("cacheConditionalHit: " + response);
    }

    public final void b(Call call, Response response) {
        j.f(call, "call");
        D("cacheHit: " + response);
    }

    public final void c(Call call) {
        j.f(call, "call");
        D("cacheMiss");
    }

    public final void d(Call call) {
        j.f(call, "call");
        D("callEnd");
    }

    public final void e(Call call, IOException iOException) {
        j.f(call, "call");
        D("callFailed: " + iOException);
    }

    public final void f(Call call) {
        j.f(call, "call");
        this.f22628b = System.nanoTime();
        StringBuilder q10 = a.q("callStart: ");
        q10.append(call.i());
        D(q10.toString());
    }

    public final void g(Call call) {
        j.f(call, "call");
        D("canceled");
    }

    public final void h(RealCall realCall, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        j.f(realCall, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        j.f(proxy, "proxy");
        D("connectEnd: " + protocol);
    }

    public final void i(RealCall realCall, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        j.f(realCall, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        j.f(proxy, "proxy");
        D("connectFailed: " + null + ' ' + iOException);
    }

    public final void j(RealCall realCall, InetSocketAddress inetSocketAddress, Proxy proxy) {
        j.f(realCall, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        D("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    public final void k(RealCall realCall, RealConnection realConnection) {
        j.f(realCall, "call");
        D("connectionAcquired: " + realConnection);
    }

    public final void l(Call call, RealConnection realConnection) {
        j.f(call, "call");
        D("connectionReleased");
    }

    public final void m(Call call, String str, List<? extends InetAddress> list) {
        j.f(call, "call");
        D("dnsEnd: " + list);
    }

    public final void n(Call call, String str) {
        j.f(call, "call");
        D("dnsStart: " + str);
    }

    public final void o(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        j.f(call, "call");
        j.f(httpUrl, "url");
        D("proxySelectEnd: " + list);
    }

    public final void p(Call call, HttpUrl httpUrl) {
        j.f(call, "call");
        j.f(httpUrl, "url");
        D("proxySelectStart: " + httpUrl);
    }

    public final void q(RealCall realCall, long j10) {
        j.f(realCall, "call");
        D("requestBodyEnd: byteCount=" + j10);
    }

    public final void r(RealCall realCall) {
        j.f(realCall, "call");
        D("requestBodyStart");
    }

    public final void s(RealCall realCall, IOException iOException) {
        j.f(realCall, "call");
        j.f(iOException, "ioe");
        D("requestFailed: " + iOException);
    }

    public final void t(RealCall realCall, Request request) {
        j.f(realCall, "call");
        D("requestHeadersEnd");
    }

    public final void u(RealCall realCall) {
        j.f(realCall, "call");
        D("requestHeadersStart");
    }

    public final void v(RealCall realCall, long j10) {
        j.f(realCall, "call");
        D("responseBodyEnd: byteCount=" + j10);
    }

    public final void w(RealCall realCall) {
        j.f(realCall, "call");
        D("responseBodyStart");
    }

    public final void x(RealCall realCall, IOException iOException) {
        j.f(realCall, "call");
        j.f(iOException, "ioe");
        D("responseFailed: " + iOException);
    }

    public final void y(RealCall realCall, Response response) {
        j.f(realCall, "call");
        D("responseHeadersEnd: " + response);
    }

    public final void z(RealCall realCall) {
        j.f(realCall, "call");
        D("responseHeadersStart");
    }
}
