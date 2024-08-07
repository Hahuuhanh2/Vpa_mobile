package okhttp3.internal.http;

import ll.o;
import ll.w;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import sk.j;
import yk.h;

/* compiled from: BridgeInterceptor.kt */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final CookieJar f22312a;

    public BridgeInterceptor(CookieJar cookieJar) {
        j.f(cookieJar, "cookieJar");
        this.f22312a = cookieJar;
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        ResponseBody responseBody;
        Request request = realInterceptorChain.f22322e;
        request.getClass();
        Request.Builder builder = new Request.Builder(request);
        RequestBody requestBody = request.f22107d;
        if (requestBody != null) {
            MediaType b10 = requestBody.b();
            if (b10 != null) {
                builder.b("Content-Type", b10.f22029a);
            }
            long a10 = requestBody.a();
            if (a10 != -1) {
                builder.b("Content-Length", String.valueOf(a10));
                builder.f22112c.e("Transfer-Encoding");
            } else {
                builder.b("Transfer-Encoding", "chunked");
                builder.f22112c.e("Content-Length");
            }
        }
        boolean z10 = false;
        if (request.f22106c.g("Host") == null) {
            builder.b("Host", Util.w(request.f22104a, false));
        }
        if (request.f22106c.g("Connection") == null) {
            builder.b("Connection", "Keep-Alive");
        }
        if (request.f22106c.g("Accept-Encoding") == null && request.f22106c.g("Range") == null) {
            builder.b("Accept-Encoding", "gzip");
            z10 = true;
        }
        this.f22312a.b(request.f22104a);
        if (request.f22106c.g("User-Agent") == null) {
            builder.b("User-Agent", "okhttp/4.12.0");
        }
        Response c10 = realInterceptorChain.c(builder.a());
        HttpHeaders.d(this.f22312a, request.f22104a, c10.f22129f);
        Response.Builder builder2 = new Response.Builder(c10);
        builder2.f22138a = request;
        if (z10 && h.G0("gzip", Response.h(c10, "Content-Encoding")) && HttpHeaders.a(c10) && (responseBody = c10.f22130n) != null) {
            o oVar = new o(responseBody.i());
            Headers.Builder l10 = c10.f22129f.l();
            l10.e("Content-Encoding");
            l10.e("Content-Length");
            builder2.f22143f = l10.d().l();
            builder2.f22144g = new RealResponseBody(Response.h(c10, "Content-Type"), -1, new w(oVar));
        }
        return builder2.a();
    }
}
