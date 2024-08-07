package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import f0.b0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o5.c;
import o5.h;
import y4.f;

/* compiled from: HttpUrlFetcher */
public final class i implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final f f4980a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4981b;

    /* renamed from: c  reason: collision with root package name */
    public HttpURLConnection f4982c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f4983d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4984e;

    /* compiled from: HttpUrlFetcher */
    public static class a {
    }

    static {
        new a();
    }

    public i(f fVar, int i10) {
        this.f4980a = fVar;
        this.f4981b = i10;
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f4983d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f4982c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f4982c = null;
    }

    public final InputStream c(URL url, int i10, URL url2, Map<String, String> map) {
        int i11;
        boolean z10;
        int i12 = -1;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException(-1, "In re-direct loop", (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z11 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f4981b);
                httpURLConnection.setReadTimeout(this.f4981b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f4982c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f4983d = this.f4982c.getInputStream();
                    if (this.f4984e) {
                        return null;
                    }
                    try {
                        i11 = this.f4982c.getResponseCode();
                    } catch (IOException unused2) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                        i11 = -1;
                    }
                    int i13 = i11 / 100;
                    if (i13 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        HttpURLConnection httpURLConnection2 = this.f4982c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f4983d = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    httpURLConnection2.getContentEncoding();
                                }
                                this.f4983d = httpURLConnection2.getInputStream();
                            }
                            return this.f4983d;
                        } catch (IOException e10) {
                            try {
                                i12 = httpURLConnection2.getResponseCode();
                            } catch (IOException unused3) {
                                Log.isLoggable("HttpUrlFetcher", 3);
                            }
                            throw new HttpException(i12, "Failed to obtain InputStream", e10);
                        }
                    } else {
                        if (i13 == 3) {
                            z11 = true;
                        }
                        if (z11) {
                            String headerField = this.f4982c.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return c(url3, i10 + 1, url, map);
                                } catch (MalformedURLException e11) {
                                    throw new HttpException(i11, b0.r("Bad redirect url: ", headerField), e11);
                                }
                            } else {
                                throw new HttpException(i11, "Received empty or null redirect url", (IOException) null);
                            }
                        } else if (i11 == -1) {
                            throw new HttpException(i11, "Http request failed", (IOException) null);
                        } else {
                            try {
                                throw new HttpException(i11, this.f4982c.getResponseMessage(), (IOException) null);
                            } catch (IOException e12) {
                                throw new HttpException(i11, "Failed to get a response message", e12);
                            }
                        }
                    }
                } catch (IOException e13) {
                    try {
                        i12 = this.f4982c.getResponseCode();
                    } catch (IOException unused4) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                    }
                    throw new HttpException(i12, "Failed to connect or obtain data", e13);
                }
            } catch (IOException e14) {
                throw new HttpException(0, "URL.openConnection threw", e14);
            }
        } else {
            throw new HttpException(-1, "Too many (> 5) redirects!", (IOException) null);
        }
    }

    public final void cancel() {
        this.f4984e = true;
    }

    public final s4.a d() {
        return s4.a.REMOTE;
    }

    /* JADX INFO: finally extract failed */
    public final void e(j jVar, d.a<? super InputStream> aVar) {
        int i10 = h.f13744a;
        SystemClock.elapsedRealtimeNanos();
        try {
            f fVar = this.f4980a;
            if (fVar.f17466f == null) {
                fVar.f17466f = new URL(fVar.d());
            }
            aVar.f(c(fVar.f17466f, 0, (URL) null, this.f4980a.f17462b.b()));
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (IOException e10) {
            Log.isLoggable("HttpUrlFetcher", 3);
            aVar.c(e10);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th2;
        }
        SystemClock.elapsedRealtimeNanos();
    }
}
