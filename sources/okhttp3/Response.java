package okhttp3;

import android.support.v4.media.a;
import f0.b0;
import java.io.Closeable;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import sk.j;

/* compiled from: Response.kt */
public final class Response implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Request f22124a;

    /* renamed from: b  reason: collision with root package name */
    public final Protocol f22125b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22126c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22127d;

    /* renamed from: e  reason: collision with root package name */
    public final Handshake f22128e;

    /* renamed from: f  reason: collision with root package name */
    public final Headers f22129f;

    /* renamed from: n  reason: collision with root package name */
    public final ResponseBody f22130n;

    /* renamed from: o  reason: collision with root package name */
    public final Response f22131o;

    /* renamed from: p  reason: collision with root package name */
    public final Response f22132p;

    /* renamed from: q  reason: collision with root package name */
    public final Response f22133q;

    /* renamed from: r  reason: collision with root package name */
    public final long f22134r;

    /* renamed from: s  reason: collision with root package name */
    public final long f22135s;

    /* renamed from: t  reason: collision with root package name */
    public final Exchange f22136t;

    /* renamed from: u  reason: collision with root package name */
    public CacheControl f22137u;

    public Response(Request request, Protocol protocol, String str, int i10, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j10, long j11, Exchange exchange) {
        this.f22124a = request;
        this.f22125b = protocol;
        this.f22126c = str;
        this.f22127d = i10;
        this.f22128e = handshake;
        this.f22129f = headers;
        this.f22130n = responseBody;
        this.f22131o = response;
        this.f22132p = response2;
        this.f22133q = response3;
        this.f22134r = j10;
        this.f22135s = j11;
        this.f22136t = exchange;
    }

    public static String h(Response response, String str) {
        response.getClass();
        String g2 = response.f22129f.g(str);
        if (g2 == null) {
            return null;
        }
        return g2;
    }

    public final void close() {
        ResponseBody responseBody = this.f22130n;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final CacheControl d() {
        CacheControl cacheControl = this.f22137u;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.Companion companion = CacheControl.f21908n;
        Headers headers = this.f22129f;
        companion.getClass();
        CacheControl a10 = CacheControl.Companion.a(headers);
        this.f22137u = a10;
        return a10;
    }

    public final boolean i() {
        int i10 = this.f22127d;
        if (200 > i10 || i10 >= 300) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Response{protocol=");
        q10.append(this.f22125b);
        q10.append(", code=");
        q10.append(this.f22127d);
        q10.append(", message=");
        q10.append(this.f22126c);
        q10.append(", url=");
        q10.append(this.f22124a.f22104a);
        q10.append('}');
        return q10.toString();
    }

    /* compiled from: Response.kt */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Request f22138a;

        /* renamed from: b  reason: collision with root package name */
        public Protocol f22139b;

        /* renamed from: c  reason: collision with root package name */
        public int f22140c;

        /* renamed from: d  reason: collision with root package name */
        public String f22141d;

        /* renamed from: e  reason: collision with root package name */
        public Handshake f22142e;

        /* renamed from: f  reason: collision with root package name */
        public Headers.Builder f22143f;

        /* renamed from: g  reason: collision with root package name */
        public ResponseBody f22144g;

        /* renamed from: h  reason: collision with root package name */
        public Response f22145h;

        /* renamed from: i  reason: collision with root package name */
        public Response f22146i;

        /* renamed from: j  reason: collision with root package name */
        public Response f22147j;

        /* renamed from: k  reason: collision with root package name */
        public long f22148k;

        /* renamed from: l  reason: collision with root package name */
        public long f22149l;

        /* renamed from: m  reason: collision with root package name */
        public Exchange f22150m;

        public Builder() {
            this.f22140c = -1;
            this.f22143f = new Headers.Builder();
        }

        public static void b(String str, Response response) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (response != null) {
                boolean z13 = true;
                if (response.f22130n == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (response.f22131o == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (response.f22132p == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (response.f22133q != null) {
                                z13 = false;
                            }
                            if (!z13) {
                                throw new IllegalArgumentException(b0.r(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(b0.r(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(b0.r(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(b0.r(str, ".body != null").toString());
            }
        }

        public final Response a() {
            boolean z10;
            int i10 = this.f22140c;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Request request = this.f22138a;
                if (request != null) {
                    Protocol protocol = this.f22139b;
                    if (protocol != null) {
                        String str = this.f22141d;
                        if (str != null) {
                            return new Response(request, protocol, str, i10, this.f22142e, this.f22143f.d(), this.f22144g, this.f22145h, this.f22146i, this.f22147j, this.f22148k, this.f22149l, this.f22150m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder q10 = a.q("code < 0: ");
            q10.append(this.f22140c);
            throw new IllegalStateException(q10.toString().toString());
        }

        public Builder(Response response) {
            j.f(response, "response");
            this.f22138a = response.f22124a;
            this.f22139b = response.f22125b;
            this.f22140c = response.f22127d;
            this.f22141d = response.f22126c;
            this.f22142e = response.f22128e;
            this.f22143f = response.f22129f.l();
            this.f22144g = response.f22130n;
            this.f22145h = response.f22131o;
            this.f22146i = response.f22132p;
            this.f22147j = response.f22133q;
            this.f22148k = response.f22134r;
            this.f22149l = response.f22135s;
            this.f22150m = response.f22136t;
        }
    }
}
