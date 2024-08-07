package okhttp3.internal.cache;

import java.io.IOException;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealInterceptorChain;
import sk.j;
import yk.h;

/* compiled from: CacheInterceptor.kt */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f22180b = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final Cache f22181a;

    /* compiled from: CacheInterceptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static final Response a(Companion companion, Response response) {
            ResponseBody responseBody;
            companion.getClass();
            if (response != null) {
                responseBody = response.f22130n;
            } else {
                responseBody = null;
            }
            if (responseBody == null) {
                return response;
            }
            response.getClass();
            Response.Builder builder = new Response.Builder(response);
            builder.f22144g = null;
            return builder.a();
        }

        public static boolean b(String str) {
            if (h.G0("Connection", str) || h.G0("Keep-Alive", str) || h.G0("Proxy-Authenticate", str) || h.G0("Proxy-Authorization", str) || h.G0("TE", str) || h.G0("Trailers", str) || h.G0("Transfer-Encoding", str) || h.G0("Upgrade", str)) {
                return false;
            }
            return true;
        }
    }

    public CacheInterceptor(Cache cache) {
        this.f22181a = cache;
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        RealCall realCall;
        EventListener eventListener;
        boolean z10;
        boolean z11;
        boolean z12;
        RealCall realCall2 = realInterceptorChain.f22318a;
        if (this.f22181a == null) {
            CacheStrategy.Factory factory = new CacheStrategy.Factory(System.currentTimeMillis(), realInterceptorChain.f22322e);
            CacheStrategy cacheStrategy = new CacheStrategy(factory.f22186a, (Response) null);
            if (cacheStrategy.f22184a != null) {
                Request request = factory.f22186a;
                CacheControl cacheControl = request.f22109f;
                if (cacheControl == null) {
                    CacheControl.Companion companion = CacheControl.f21908n;
                    Headers headers = request.f22106c;
                    companion.getClass();
                    cacheControl = CacheControl.Companion.a(headers);
                    request.f22109f = cacheControl;
                }
                if (cacheControl.f21918j) {
                    cacheStrategy = new CacheStrategy((Request) null, (Response) null);
                }
            }
            Request request2 = cacheStrategy.f22184a;
            Response response = cacheStrategy.f22185b;
            Cache cache = this.f22181a;
            if (cache != null) {
                synchronized (cache) {
                    if (cacheStrategy.f22184a == null) {
                        Response response2 = cacheStrategy.f22185b;
                    }
                }
            }
            if (realCall2 instanceof RealCall) {
                realCall = realCall2;
            } else {
                realCall = null;
            }
            if (realCall == null || (eventListener = realCall.f22252e) == null) {
                eventListener = EventListener.f21988a;
            }
            if (request2 == null && response == null) {
                Response.Builder builder = new Response.Builder();
                Request request3 = realInterceptorChain.f22322e;
                j.f(request3, "request");
                builder.f22138a = request3;
                builder.f22139b = Protocol.HTTP_1_1;
                builder.f22140c = 504;
                builder.f22141d = "Unsatisfiable Request (only-if-cached)";
                builder.f22144g = Util.f22173c;
                builder.f22148k = -1;
                builder.f22149l = System.currentTimeMillis();
                Response a10 = builder.a();
                eventListener.A(realCall2, a10);
                return a10;
            } else if (request2 == null) {
                j.c(response);
                Response.Builder builder2 = new Response.Builder(response);
                Response a11 = Companion.a(f22180b, response);
                Response.Builder.b("cacheResponse", a11);
                builder2.f22146i = a11;
                Response a12 = builder2.a();
                eventListener.b(realCall2, a12);
                return a12;
            } else {
                if (response != null) {
                    eventListener.a(realCall2, response);
                } else if (this.f22181a != null) {
                    eventListener.c(realCall2);
                }
                Response c10 = realInterceptorChain.c(request2);
                if (response != null) {
                    if (c10.f22127d == 304) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Response.Builder builder3 = new Response.Builder(response);
                        Companion companion2 = f22180b;
                        Headers headers2 = response.f22129f;
                        Headers headers3 = c10.f22129f;
                        companion2.getClass();
                        Headers.Builder builder4 = new Headers.Builder();
                        int length = headers2.f22003a.length / 2;
                        for (int i10 = 0; i10 < length; i10++) {
                            String i11 = headers2.i(i10);
                            String m10 = headers2.m(i10);
                            if (!h.G0("Warning", i11) || !h.L0(m10, "1", false)) {
                                if (h.G0("Content-Length", i11) || h.G0("Content-Encoding", i11) || h.G0("Content-Type", i11)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12 || !Companion.b(i11) || headers3.g(i11) == null) {
                                    builder4.c(i11, m10);
                                }
                            }
                        }
                        int length2 = headers3.f22003a.length / 2;
                        for (int i12 = 0; i12 < length2; i12++) {
                            String i13 = headers3.i(i12);
                            if (h.G0("Content-Length", i13) || h.G0("Content-Encoding", i13) || h.G0("Content-Type", i13)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && Companion.b(i13)) {
                                builder4.c(i13, headers3.m(i12));
                            }
                        }
                        builder3.f22143f = builder4.d().l();
                        builder3.f22148k = c10.f22134r;
                        builder3.f22149l = c10.f22135s;
                        Companion companion3 = f22180b;
                        Response a13 = Companion.a(companion3, response);
                        Response.Builder.b("cacheResponse", a13);
                        builder3.f22146i = a13;
                        Response a14 = Companion.a(companion3, c10);
                        Response.Builder.b("networkResponse", a14);
                        builder3.f22145h = a14;
                        Response a15 = builder3.a();
                        ResponseBody responseBody = c10.f22130n;
                        j.c(responseBody);
                        responseBody.close();
                        Cache cache2 = this.f22181a;
                        j.c(cache2);
                        synchronized (cache2) {
                        }
                        this.f22181a.getClass();
                        Cache.h(response, a15);
                        throw null;
                    }
                    ResponseBody responseBody2 = response.f22130n;
                    if (responseBody2 != null) {
                        Util.c(responseBody2);
                    }
                }
                Response.Builder builder5 = new Response.Builder(c10);
                Companion companion4 = f22180b;
                Response a16 = Companion.a(companion4, response);
                Response.Builder.b("cacheResponse", a16);
                builder5.f22146i = a16;
                Response a17 = Companion.a(companion4, c10);
                Response.Builder.b("networkResponse", a17);
                builder5.f22145h = a17;
                Response a18 = builder5.a();
                if (this.f22181a != null) {
                    if (HttpHeaders.a(a18)) {
                        CacheStrategy.f22183c.getClass();
                        if (CacheStrategy.Companion.a(request2, a18)) {
                            this.f22181a.getClass();
                            Cache.d(a18);
                            if (response != null) {
                                eventListener.c(realCall2);
                            }
                            return a18;
                        }
                    }
                    HttpMethod httpMethod = HttpMethod.f22317a;
                    String str = request2.f22105b;
                    httpMethod.getClass();
                    if (HttpMethod.a(str)) {
                        try {
                            this.f22181a.getClass();
                            Cache.Companion companion5 = Cache.f21906a;
                            HttpUrl httpUrl = request2.f22104a;
                            companion5.getClass();
                            Cache.Companion.a(httpUrl);
                            throw null;
                        } catch (IOException unused) {
                        }
                    }
                }
                return a18;
            }
        } else {
            Request request4 = realInterceptorChain.f22322e;
            j.f(request4, "request");
            Cache.Companion companion6 = Cache.f21906a;
            HttpUrl httpUrl2 = request4.f22104a;
            companion6.getClass();
            Cache.Companion.a(httpUrl2);
            throw null;
        }
    }
}
