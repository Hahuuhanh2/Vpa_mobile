package okhttp3;

import java.util.List;
import sk.j;

/* compiled from: CookieJar.kt */
public interface CookieJar {

    /* renamed from: a  reason: collision with root package name */
    public static final CookieJar f21977a = new Companion.NoCookies();

    /* compiled from: CookieJar.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f21978a = 0;

        /* compiled from: CookieJar.kt */
        public static final class NoCookies implements CookieJar {
            public final void a(HttpUrl httpUrl, List<Cookie> list) {
                j.f(httpUrl, "url");
            }

            public final void b(HttpUrl httpUrl) {
                j.f(httpUrl, "url");
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f21978a;
    }

    void a(HttpUrl httpUrl, List<Cookie> list);

    void b(HttpUrl httpUrl);
}
