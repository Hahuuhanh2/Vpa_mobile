package okhttp3.internal.cache;

import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import sk.j;

/* compiled from: CacheStrategy.kt */
public final class CacheStrategy {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f22183c = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final Request f22184a;

    /* renamed from: b  reason: collision with root package name */
    public final Response f22185b;

    /* compiled from: CacheStrategy.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static boolean a(Request request, Response response) {
            j.f(response, "response");
            j.f(request, "request");
            int i10 = response.f22127d;
            if (!(i10 == 200 || i10 == 410 || i10 == 414 || i10 == 501 || i10 == 203 || i10 == 204)) {
                if (i10 != 307) {
                    if (!(i10 == 308 || i10 == 404 || i10 == 405)) {
                        switch (i10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.h(response, "Expires") == null && response.d().f21911c == -1 && !response.d().f21914f && !response.d().f21913e) {
                    return false;
                }
            }
            if (response.d().f21910b) {
                return false;
            }
            CacheControl cacheControl = request.f22109f;
            if (cacheControl == null) {
                CacheControl.Companion companion = CacheControl.f21908n;
                Headers headers = request.f22106c;
                companion.getClass();
                cacheControl = CacheControl.Companion.a(headers);
                request.f22109f = cacheControl;
            }
            if (!cacheControl.f21910b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: CacheStrategy.kt */
    public static final class Factory {

        /* renamed from: a  reason: collision with root package name */
        public final Request f22186a;

        public Factory(long j10, Request request) {
            j.f(request, "request");
            this.f22186a = request;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f22184a = request;
        this.f22185b = response;
    }
}
