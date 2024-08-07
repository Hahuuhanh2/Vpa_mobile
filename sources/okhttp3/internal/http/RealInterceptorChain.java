package okhttp3.internal.http;

import android.support.v4.media.a;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import sk.j;

/* compiled from: RealInterceptorChain.kt */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a  reason: collision with root package name */
    public final RealCall f22318a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Interceptor> f22319b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22320c;

    /* renamed from: d  reason: collision with root package name */
    public final Exchange f22321d;

    /* renamed from: e  reason: collision with root package name */
    public final Request f22322e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22323f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22324g;

    /* renamed from: h  reason: collision with root package name */
    public final int f22325h;

    /* renamed from: i  reason: collision with root package name */
    public int f22326i;

    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i10, Exchange exchange, Request request, int i11, int i12, int i13) {
        j.f(realCall, "call");
        j.f(list, "interceptors");
        j.f(request, "request");
        this.f22318a = realCall;
        this.f22319b = list;
        this.f22320c = i10;
        this.f22321d = exchange;
        this.f22322e = request;
        this.f22323f = i11;
        this.f22324g = i12;
        this.f22325h = i13;
    }

    public static RealInterceptorChain b(RealInterceptorChain realInterceptorChain, int i10, Exchange exchange, Request request, int i11) {
        int i12;
        int i13;
        int i14;
        if ((i11 & 1) != 0) {
            i10 = realInterceptorChain.f22320c;
        }
        int i15 = i10;
        if ((i11 & 2) != 0) {
            exchange = realInterceptorChain.f22321d;
        }
        Exchange exchange2 = exchange;
        if ((i11 & 4) != 0) {
            request = realInterceptorChain.f22322e;
        }
        Request request2 = request;
        if ((i11 & 8) != 0) {
            i12 = realInterceptorChain.f22323f;
        } else {
            i12 = 0;
        }
        if ((i11 & 16) != 0) {
            i13 = realInterceptorChain.f22324g;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            i14 = realInterceptorChain.f22325h;
        } else {
            i14 = 0;
        }
        realInterceptorChain.getClass();
        j.f(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f22318a, realInterceptorChain.f22319b, i15, exchange2, request2, i12, i13, i14);
    }

    public final RealConnection a() {
        Exchange exchange = this.f22321d;
        if (exchange != null) {
            return exchange.f22226g;
        }
        return null;
    }

    public final Response c(Request request) {
        boolean z10;
        boolean z11;
        boolean z12;
        j.f(request, "request");
        boolean z13 = true;
        if (this.f22320c < this.f22319b.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f22326i++;
            Exchange exchange = this.f22321d;
            if (exchange != null) {
                if (exchange.f22222c.b(request.f22104a)) {
                    if (this.f22326i == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        StringBuilder q10 = a.q("network interceptor ");
                        q10.append(this.f22319b.get(this.f22320c - 1));
                        q10.append(" must call proceed() exactly once");
                        throw new IllegalStateException(q10.toString().toString());
                    }
                } else {
                    StringBuilder q11 = a.q("network interceptor ");
                    q11.append(this.f22319b.get(this.f22320c - 1));
                    q11.append(" must retain the same host and port");
                    throw new IllegalStateException(q11.toString().toString());
                }
            }
            RealInterceptorChain b10 = b(this, this.f22320c + 1, (Exchange) null, request, 58);
            Interceptor interceptor = this.f22319b.get(this.f22320c);
            Response a10 = interceptor.a(b10);
            if (a10 != null) {
                if (this.f22321d != null) {
                    if (this.f22320c + 1 >= this.f22319b.size() || b10.f22326i == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
                    }
                }
                if (a10.f22130n == null) {
                    z13 = false;
                }
                if (z13) {
                    return a10;
                }
                throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
