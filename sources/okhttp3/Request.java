package okhttp3;

import android.support.v4.media.a;
import ek.e;
import f0.b0;
import fk.s;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import sk.j;
import yk.h;

/* compiled from: Request.kt */
public final class Request {

    /* renamed from: a  reason: collision with root package name */
    public final HttpUrl f22104a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22105b;

    /* renamed from: c  reason: collision with root package name */
    public final Headers f22106c;

    /* renamed from: d  reason: collision with root package name */
    public final RequestBody f22107d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f22108e;

    /* renamed from: f  reason: collision with root package name */
    public CacheControl f22109f;

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        j.f(str, "method");
        this.f22104a = httpUrl;
        this.f22105b = str;
        this.f22106c = headers;
        this.f22107d = requestBody;
        this.f22108e = map;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Request{method=");
        q10.append(this.f22105b);
        q10.append(", url=");
        q10.append(this.f22104a);
        if (this.f22106c.f22003a.length / 2 != 0) {
            q10.append(", headers=[");
            int i10 = 0;
            for (Object next : this.f22106c) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    e eVar = (e) next;
                    String str = (String) eVar.f20102a;
                    String str2 = (String) eVar.f20103b;
                    if (i10 > 0) {
                        q10.append(", ");
                    }
                    q10.append(str);
                    q10.append(':');
                    q10.append(str2);
                    i10 = i11;
                } else {
                    j7.a.x0();
                    throw null;
                }
            }
            q10.append(']');
        }
        if (!this.f22108e.isEmpty()) {
            q10.append(", tags=");
            q10.append(this.f22108e);
        }
        q10.append('}');
        String sb2 = q10.toString();
        j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* compiled from: Request.kt */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public HttpUrl f22110a;

        /* renamed from: b  reason: collision with root package name */
        public String f22111b;

        /* renamed from: c  reason: collision with root package name */
        public Headers.Builder f22112c;

        /* renamed from: d  reason: collision with root package name */
        public RequestBody f22113d;

        /* renamed from: e  reason: collision with root package name */
        public LinkedHashMap f22114e;

        public Builder() {
            this.f22114e = new LinkedHashMap();
            this.f22111b = "GET";
            this.f22112c = new Headers.Builder();
        }

        public final Request a() {
            Map map;
            HttpUrl httpUrl = this.f22110a;
            if (httpUrl != null) {
                String str = this.f22111b;
                Headers d10 = this.f22112c.d();
                RequestBody requestBody = this.f22113d;
                LinkedHashMap linkedHashMap = this.f22114e;
                byte[] bArr = Util.f22171a;
                j.f(linkedHashMap, "<this>");
                if (linkedHashMap.isEmpty()) {
                    map = s.f20214a;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                    j.e(map, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                }
                return new Request(httpUrl, str, d10, requestBody, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void b(String str, String str2) {
            j.f(str2, "value");
            Headers.Builder builder = this.f22112c;
            builder.getClass();
            Headers.f22002b.getClass();
            Headers.Companion.a(str);
            Headers.Companion.b(str2, str);
            builder.e(str);
            builder.c(str, str2);
        }

        public final void c(String str, RequestBody requestBody) {
            boolean z10;
            j.f(str, "method");
            boolean z11 = false;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (requestBody == null) {
                    HttpMethod httpMethod = HttpMethod.f22317a;
                    if (j.a(str, "POST") || j.a(str, "PUT") || j.a(str, "PATCH") || j.a(str, "PROPPATCH") || j.a(str, "REPORT")) {
                        z11 = true;
                    }
                    if (!(!z11)) {
                        throw new IllegalArgumentException(b0.s("method ", str, " must have a request body.").toString());
                    }
                } else if (!HttpMethod.b(str)) {
                    throw new IllegalArgumentException(b0.s("method ", str, " must not have a request body.").toString());
                }
                this.f22111b = str;
                this.f22113d = requestBody;
                return;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public final void d(Class cls, Object obj) {
            j.f(cls, "type");
            if (obj == null) {
                this.f22114e.remove(cls);
                return;
            }
            if (this.f22114e.isEmpty()) {
                this.f22114e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f22114e;
            Object cast = cls.cast(obj);
            j.c(cast);
            linkedHashMap.put(cls, cast);
        }

        public final void e(String str) {
            j.f(str, "url");
            if (h.L0(str, "ws:", true)) {
                StringBuilder q10 = a.q("http:");
                String substring = str.substring(3);
                j.e(substring, "this as java.lang.String).substring(startIndex)");
                q10.append(substring);
                str = q10.toString();
            } else if (h.L0(str, "wss:", true)) {
                StringBuilder q11 = a.q("https:");
                String substring2 = str.substring(4);
                j.e(substring2, "this as java.lang.String).substring(startIndex)");
                q11.append(substring2);
                str = q11.toString();
            }
            HttpUrl.f22005k.getClass();
            this.f22110a = HttpUrl.Companion.c(str);
        }

        public Builder(Request request) {
            LinkedHashMap linkedHashMap;
            j.f(request, "request");
            this.f22114e = new LinkedHashMap();
            this.f22110a = request.f22104a;
            this.f22111b = request.f22105b;
            this.f22113d = request.f22107d;
            if (request.f22108e.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = request.f22108e;
                j.f(map, "<this>");
                linkedHashMap = new LinkedHashMap(map);
            }
            this.f22114e = linkedHashMap;
            this.f22112c = request.f22106c.l();
        }
    }
}
