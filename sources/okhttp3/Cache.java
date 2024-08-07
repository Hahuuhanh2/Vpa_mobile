package okhttp3;

import fk.t;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import ll.i;
import ll.j;
import ll.m;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.platform.Platform;
import sk.j;
import yk.h;
import yk.l;

/* compiled from: Cache.kt */
public final class Cache implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f21906a = new Companion(0);

    /* compiled from: Cache.kt */
    public static final class CacheResponseBody extends ResponseBody {

        /* renamed from: okhttp3.Cache$CacheResponseBody$1  reason: invalid class name */
        /* compiled from: Cache.kt */
        public final class AnonymousClass1 extends m {
            public final void close() {
                throw null;
            }
        }

        public CacheResponseBody() {
            throw null;
        }

        public final long d() {
            return -1;
        }

        public final MediaType h() {
            return null;
        }

        public final i i() {
            return null;
        }
    }

    /* compiled from: Cache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static void a(HttpUrl httpUrl) {
            j.f(httpUrl, "url");
            ll.j jVar = ll.j.f20882d;
            j.a.b(httpUrl.f22015i).c("MD5").j();
        }

        public static Set b(Headers headers) {
            int length = headers.f22003a.length / 2;
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (h.G0("Vary", headers.i(i10))) {
                    String m10 = headers.m(i10);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        sk.j.e(comparator, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(comparator);
                    }
                    for (String k12 : l.e1(m10, new char[]{','})) {
                        treeSet.add(l.k1(k12).toString());
                    }
                }
            }
            if (treeSet == null) {
                return t.f20215a;
            }
            return treeSet;
        }
    }

    /* compiled from: Cache.kt */
    public static final class Entry {

        /* compiled from: Cache.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i10) {
                this();
            }
        }

        static {
            new Companion(0);
            Platform.f22562a.getClass();
            Platform.f22563b.getClass();
            Platform.f22563b.getClass();
        }

        public Entry() {
            throw null;
        }

        public Entry(Response response) {
            HttpUrl httpUrl = response.f22124a.f22104a;
            Cache.f21906a.getClass();
            Response response2 = response.f22131o;
            sk.j.c(response2);
            Headers headers = response2.f22124a.f22106c;
            Set b10 = Companion.b(response.f22129f);
            if (b10.isEmpty()) {
                byte[] bArr = Util.f22171a;
            } else {
                Headers.Builder builder = new Headers.Builder();
                int length = headers.f22003a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    String i11 = headers.i(i10);
                    if (b10.contains(i11)) {
                        builder.a(i11, headers.m(i10));
                    }
                }
                builder.d();
            }
            String str = response.f22124a.f22105b;
        }
    }

    /* compiled from: Cache.kt */
    public final class RealCacheRequest implements CacheRequest {
        public RealCacheRequest() {
            throw null;
        }
    }

    public static void d(Response response) {
        String str = response.f22124a.f22105b;
        HttpMethod.f22317a.getClass();
        if (HttpMethod.a(str)) {
            try {
                Request request = response.f22124a;
                sk.j.f(request, "request");
                Companion companion = f21906a;
                HttpUrl httpUrl = request.f22104a;
                companion.getClass();
                Companion.a(httpUrl);
                throw null;
            } catch (IOException unused) {
            }
        } else if (sk.j.a(str, "GET")) {
            f21906a.getClass();
            if (!Companion.b(response.f22129f).contains("*")) {
                new Entry(response);
                try {
                    Companion.a(response.f22124a.f22104a);
                    int i10 = DiskLruCache.f22187a;
                    throw null;
                } catch (IOException unused2) {
                }
            }
        }
    }

    public static void h(Response response, Response response2) {
        new Entry(response2);
        ResponseBody responseBody = response.f22130n;
        sk.j.d(responseBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        CacheResponseBody cacheResponseBody = (CacheResponseBody) responseBody;
        throw null;
    }

    public final void close() {
        throw null;
    }

    public final void flush() {
        throw null;
    }
}
