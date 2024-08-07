package okhttp3.internal.http;

import okhttp3.HttpUrl;
import sk.j;

/* compiled from: RequestLine.kt */
public final class RequestLine {

    /* renamed from: a  reason: collision with root package name */
    public static final RequestLine f22330a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl httpUrl) {
        j.f(httpUrl, "url");
        String b10 = httpUrl.b();
        String d10 = httpUrl.d();
        if (d10 == null) {
            return b10;
        }
        return b10 + '?' + d10;
    }
}
