package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import mb.d;
import ob.f;
import ob.h;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    public FirebasePerfHttpClient() {
        throw null;
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpUriRequest.getURI().toString());
            f10.g(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            f10.m(timer.a());
            f10.h(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                f10.l(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                f10.k(b10);
            }
            f10.e();
            return execute;
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpUriRequest.getURI().toString());
            f10.g(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            f10.m(timer.a());
            f10.h(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                f10.l(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                f10.k(b10);
            }
            f10.e();
            return execute;
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpUriRequest.getURI().toString());
            f10.g(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            return httpClient.execute(httpUriRequest, new f(responseHandler, timer, f10));
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpUriRequest.getURI().toString());
            f10.g(httpUriRequest.getMethod());
            Long a10 = h.a(httpUriRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            return httpClient.execute(httpUriRequest, new f(responseHandler, timer, f10), httpContext);
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            f10.g(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            f10.m(timer.a());
            f10.h(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                f10.l(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                f10.k(b10);
            }
            f10.e();
            return execute;
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            f10.g(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            f10.m(timer.a());
            f10.h(execute.getStatusLine().getStatusCode());
            Long a11 = h.a(execute);
            if (a11 != null) {
                f10.l(a11.longValue());
            }
            String b10 = h.b(execute);
            if (b10 != null) {
                f10.k(b10);
            }
            f10.e();
            return execute;
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            f10.g(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            return httpClient.execute(httpHost, httpRequest, new f(responseHandler, timer, f10));
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        Timer timer = new Timer();
        d f10 = d.f(rb.d.f14546z);
        try {
            f10.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            f10.g(httpRequest.getRequestLine().getMethod());
            Long a10 = h.a(httpRequest);
            if (a10 != null) {
                f10.i(a10.longValue());
            }
            timer.e();
            f10.j(timer.d());
            return httpClient.execute(httpHost, httpRequest, new f(responseHandler, timer, f10), httpContext);
        } catch (IOException e10) {
            f10.m(timer.a());
            h.c(f10);
            throw e10;
        }
    }
}
