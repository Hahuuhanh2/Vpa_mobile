package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import sk.j;

/* compiled from: EventListener.kt */
public abstract class EventListener {

    /* renamed from: a  reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f21988a = new EventListener$Companion$NONE$1();

    /* compiled from: EventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    public interface Factory {
        EventListener b(Call call);
    }

    static {
        new Companion(0);
    }

    public void A(Call call, Response response) {
        j.f(call, "call");
    }

    public void B(RealCall realCall, Handshake handshake) {
        j.f(realCall, "call");
    }

    public void C(RealCall realCall) {
        j.f(realCall, "call");
    }

    public void a(Call call, Response response) {
        j.f(call, "call");
    }

    public void b(Call call, Response response) {
        j.f(call, "call");
    }

    public void c(Call call) {
        j.f(call, "call");
    }

    public void d(Call call) {
        j.f(call, "call");
    }

    public void e(Call call, IOException iOException) {
        j.f(call, "call");
    }

    public void f(Call call) {
        j.f(call, "call");
    }

    public void g(Call call) {
        j.f(call, "call");
    }

    public void h(RealCall realCall, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        j.f(realCall, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        j.f(proxy, "proxy");
    }

    public void i(RealCall realCall, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        j.f(realCall, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        j.f(proxy, "proxy");
    }

    public void j(RealCall realCall, InetSocketAddress inetSocketAddress, Proxy proxy) {
        j.f(realCall, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
    }

    public void k(RealCall realCall, RealConnection realConnection) {
        j.f(realCall, "call");
    }

    public void l(Call call, RealConnection realConnection) {
        j.f(call, "call");
    }

    public void m(Call call, String str, List<InetAddress> list) {
        j.f(call, "call");
    }

    public void n(Call call, String str) {
        j.f(call, "call");
    }

    public void o(Call call, HttpUrl httpUrl, List<Proxy> list) {
        j.f(call, "call");
        j.f(httpUrl, "url");
    }

    public void p(Call call, HttpUrl httpUrl) {
        j.f(call, "call");
        j.f(httpUrl, "url");
    }

    public void q(RealCall realCall, long j10) {
        j.f(realCall, "call");
    }

    public void r(RealCall realCall) {
        j.f(realCall, "call");
    }

    public void s(RealCall realCall, IOException iOException) {
        j.f(realCall, "call");
        j.f(iOException, "ioe");
    }

    public void t(RealCall realCall, Request request) {
        j.f(realCall, "call");
    }

    public void u(RealCall realCall) {
        j.f(realCall, "call");
    }

    public void v(RealCall realCall, long j10) {
        j.f(realCall, "call");
    }

    public void w(RealCall realCall) {
        j.f(realCall, "call");
    }

    public void x(RealCall realCall, IOException iOException) {
        j.f(realCall, "call");
        j.f(iOException, "ioe");
    }

    public void y(RealCall realCall, Response response) {
        j.f(realCall, "call");
    }

    public void z(RealCall realCall) {
        j.f(realCall, "call");
    }
}
