package okhttp3.internal.http;

import sk.j;

/* compiled from: HttpMethod.kt */
public final class HttpMethod {

    /* renamed from: a  reason: collision with root package name */
    public static final HttpMethod f22317a = new HttpMethod();

    private HttpMethod() {
    }

    public static boolean a(String str) {
        j.f(str, "method");
        if (j.a(str, "POST") || j.a(str, "PATCH") || j.a(str, "PUT") || j.a(str, "DELETE") || j.a(str, "MOVE")) {
            return true;
        }
        return false;
    }

    public static final boolean b(String str) {
        j.f(str, "method");
        if (j.a(str, "GET") || j.a(str, "HEAD")) {
            return false;
        }
        return true;
    }
}
