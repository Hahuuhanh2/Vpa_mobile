package okhttp3.internal.http;

import ek.i;
import fk.p;
import fk.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import sk.j;

/* compiled from: RetryAndFollowUpInterceptor.kt */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f22331a;

    /* compiled from: RetryAndFollowUpInterceptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        j.f(okHttpClient, "client");
        this.f22331a = okHttpClient;
    }

    public static int d(Response response, int i10) {
        String h10 = Response.h(response, "Retry-After");
        if (h10 == null) {
            return i10;
        }
        Pattern compile = Pattern.compile("\\d+");
        j.e(compile, "compile(pattern)");
        if (!compile.matcher(h10).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(h10);
        j.e(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        boolean z10;
        Response response;
        int i10;
        List list;
        boolean z11;
        boolean z12;
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        RealInterceptorChain realInterceptorChain2 = realInterceptorChain;
        Request request = realInterceptorChain2.f22322e;
        RealCall realCall = realInterceptorChain2.f22318a;
        boolean z13 = true;
        List list2 = r.f20213a;
        Response response2 = null;
        int i11 = 0;
        Request request2 = request;
        boolean z14 = true;
        while (true) {
            realCall.getClass();
            j.f(request2, "request");
            if (realCall.f22259s == null) {
                z10 = z13;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (realCall) {
                    if (!(realCall.f22261u ^ z13)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    } else if (realCall.f22260t ^ z13) {
                        i iVar = i.f20112a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (z14) {
                    RealConnectionPool realConnectionPool = realCall.f22251d;
                    HttpUrl httpUrl = request2.f22104a;
                    if (httpUrl.f22016j) {
                        OkHttpClient okHttpClient = realCall.f22248a;
                        SSLSocketFactory sSLSocketFactory2 = okHttpClient.f22066x;
                        if (sSLSocketFactory2 != null) {
                            HostnameVerifier hostnameVerifier2 = okHttpClient.B;
                            certificatePinner = okHttpClient.C;
                            sSLSocketFactory = sSLSocketFactory2;
                            hostnameVerifier = hostnameVerifier2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        certificatePinner = null;
                    }
                    String str = httpUrl.f22010d;
                    int i12 = httpUrl.f22011e;
                    OkHttpClient okHttpClient2 = realCall.f22248a;
                    list = list2;
                    i10 = i11;
                    response = response2;
                    Address address = r12;
                    Address address2 = new Address(str, i12, okHttpClient2.f22061s, okHttpClient2.f22065w, sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient2.f22064v, okHttpClient2.f22062t, okHttpClient2.A, okHttpClient2.f22068z, okHttpClient2.f22063u);
                    realCall.f22256p = new ExchangeFinder(realConnectionPool, address, realCall, realCall.f22252e);
                } else {
                    list = list2;
                    response = response2;
                    i10 = i11;
                }
                try {
                    if (!realCall.f22263w) {
                        Response c10 = realInterceptorChain2.c(request2);
                        if (response != null) {
                            Response.Builder builder = new Response.Builder(c10);
                            Response.Builder builder2 = new Response.Builder(response);
                            builder2.f22144g = null;
                            Response a10 = builder2.a();
                            if (a10.f22130n == null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                builder.f22147j = a10;
                                c10 = builder.a();
                            } else {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                        }
                        response2 = c10;
                        Exchange exchange = realCall.f22259s;
                        request2 = b(response2, exchange);
                        if (request2 == null) {
                            if (exchange != null && exchange.f22224e) {
                                realCall.l();
                            }
                            realCall.e(false);
                            return response2;
                        }
                        ResponseBody responseBody = response2.f22130n;
                        if (responseBody != null) {
                            Util.c(responseBody);
                        }
                        i11 = i10 + 1;
                        if (i11 <= 20) {
                            realCall.e(true);
                            list2 = list;
                            z14 = true;
                            z13 = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i11);
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (RouteException e10) {
                    List list3 = list;
                    Response response3 = response;
                    RouteException routeException = e10;
                    if (c(routeException.f22300b, realCall, request2, false)) {
                        list2 = p.T0(routeException.f22299a, list3);
                        z13 = true;
                        realCall.e(true);
                        z14 = false;
                        i11 = i10;
                        response2 = response3;
                    } else {
                        IOException iOException = routeException.f22299a;
                        Util.A(iOException, list3);
                        throw iOException;
                    }
                } catch (IOException e11) {
                    Response response4 = response;
                    IOException iOException2 = e11;
                    if (!(iOException2 instanceof ConnectionShutdownException)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c(iOException2, realCall, request2, z11)) {
                        list2 = p.T0(iOException2, list);
                        z13 = true;
                        realCall.e(true);
                        response2 = response4;
                        i11 = i10;
                        z14 = false;
                    } else {
                        Util.A(iOException2, list);
                        throw iOException2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    realCall.e(true);
                    throw th;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public final Request b(Response response, Exchange exchange) {
        Route route;
        String h10;
        HttpUrl.Builder builder;
        HttpUrl httpUrl;
        RealConnection realConnection;
        RequestBody requestBody = null;
        if (exchange == null || (realConnection = exchange.f22226g) == null) {
            route = null;
        } else {
            route = realConnection.f22271b;
        }
        int i10 = response.f22127d;
        String str = response.f22124a.f22105b;
        boolean z10 = false;
        if (!(i10 == 307 || i10 == 308)) {
            if (i10 == 401) {
                return this.f22331a.f22056n.a(route, response);
            }
            if (i10 != 421) {
                if (i10 == 503) {
                    Response response2 = response.f22133q;
                    if ((response2 == null || response2.f22127d != 503) && d(response, Integer.MAX_VALUE) == 0) {
                        return response.f22124a;
                    }
                    return null;
                } else if (i10 == 407) {
                    j.c(route);
                    if (route.f22161b.type() == Proxy.Type.HTTP) {
                        return this.f22331a.f22064v.a(route, response);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (i10 != 408) {
                    switch (i10) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (!this.f22331a.f22055f) {
                    return null;
                } else {
                    Response response3 = response.f22133q;
                    if ((response3 == null || response3.f22127d != 408) && d(response, 0) <= 0) {
                        return response.f22124a;
                    }
                    return null;
                }
            } else if (exchange == null || !(!j.a(exchange.f22222c.f22239b.f21901i.f22010d, exchange.f22226g.f22271b.f22160a.f21901i.f22010d))) {
                return null;
            } else {
                RealConnection realConnection2 = exchange.f22226g;
                synchronized (realConnection2) {
                    realConnection2.f22280k = true;
                }
                return response.f22124a;
            }
        }
        if (!this.f22331a.f22057o || (h10 = Response.h(response, "Location")) == null) {
            return null;
        }
        HttpUrl httpUrl2 = response.f22124a.f22104a;
        httpUrl2.getClass();
        try {
            builder = new HttpUrl.Builder();
            builder.c(httpUrl2, h10);
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        if (builder != null) {
            httpUrl = builder.a();
        } else {
            httpUrl = null;
        }
        if (httpUrl == null) {
            return null;
        }
        if (!j.a(httpUrl.f22007a, response.f22124a.f22104a.f22007a) && !this.f22331a.f22058p) {
            return null;
        }
        Request request = response.f22124a;
        request.getClass();
        Request.Builder builder2 = new Request.Builder(request);
        if (HttpMethod.b(str)) {
            int i11 = response.f22127d;
            HttpMethod.f22317a.getClass();
            if (j.a(str, "PROPFIND") || i11 == 308 || i11 == 307) {
                z10 = true;
            }
            if (!(true ^ j.a(str, "PROPFIND")) || i11 == 308 || i11 == 307) {
                if (z10) {
                    requestBody = response.f22124a.f22107d;
                }
                builder2.c(str, requestBody);
            } else {
                builder2.c("GET", (RequestBody) null);
            }
            if (!z10) {
                builder2.f22112c.e("Transfer-Encoding");
                builder2.f22112c.e("Content-Length");
                builder2.f22112c.e("Content-Type");
            }
        }
        if (!Util.a(response.f22124a.f22104a, httpUrl)) {
            builder2.f22112c.e("Authorization");
        }
        builder2.f22110a = httpUrl;
        return builder2.a();
    }

    public final boolean c(IOException iOException, RealCall realCall, Request request, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        RouteSelector routeSelector;
        RealConnection realConnection;
        if (!this.f22331a.f22055f) {
            return false;
        }
        if (z10 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.f22256p;
        j.c(exchangeFinder);
        int i10 = exchangeFinder.f22244g;
        if (i10 == 0 && exchangeFinder.f22245h == 0 && exchangeFinder.f22246i == 0) {
            z12 = false;
        } else {
            if (exchangeFinder.f22247j == null) {
                Route route = null;
                if (i10 <= 1 && exchangeFinder.f22245h <= 1 && exchangeFinder.f22246i <= 0 && (realConnection = exchangeFinder.f22240c.f22257q) != null) {
                    synchronized (realConnection) {
                        if (realConnection.f22281l == 0) {
                            if (Util.a(realConnection.f22271b.f22160a.f21901i, exchangeFinder.f22239b.f21901i)) {
                                route = realConnection.f22271b;
                            }
                        }
                    }
                }
                if (route != null) {
                    exchangeFinder.f22247j = route;
                } else {
                    RouteSelector.Selection selection = exchangeFinder.f22242e;
                    if (selection == null || !selection.a()) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (!z13 && (routeSelector = exchangeFinder.f22243f) != null) {
                        z12 = routeSelector.a();
                    }
                }
            }
            z12 = true;
        }
        if (!z12) {
            return false;
        }
        return true;
    }
}
