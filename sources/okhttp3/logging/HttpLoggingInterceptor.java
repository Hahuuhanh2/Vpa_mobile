package okhttp3.logging;

import fk.t;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.internal.platform.Platform;
import sk.j;

/* compiled from: HttpLoggingInterceptor.kt */
public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public volatile t f22620a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Level f22621b;

    /* renamed from: c  reason: collision with root package name */
    public final Logger f22622c;

    /* compiled from: HttpLoggingInterceptor.kt */
    public enum Level {
        NONE,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    public interface Logger {

        /* renamed from: a  reason: collision with root package name */
        public static final Logger f22627a = new Companion.DefaultLogger();

        /* compiled from: HttpLoggingInterceptor.kt */
        public static final class Companion {

            /* compiled from: HttpLoggingInterceptor.kt */
            public static final class DefaultLogger implements Logger {
                public final void a(String str) {
                    j.f(str, "message");
                    Platform.f22562a.getClass();
                    Platform.j(Platform.f22563b, str, 0, 6);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(int i10) {
                this();
            }
        }

        static {
            new Companion(0);
        }

        void a(String str);
    }

    public HttpLoggingInterceptor() {
        this(0);
    }

    public HttpLoggingInterceptor(int i10) {
        Logger logger = Logger.f22627a;
        j.f(logger, "logger");
        this.f22622c = logger;
        this.f22620a = t.f20215a;
        this.f22621b = Level.NONE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ed A[LOOP:0: B:39:0x00eb->B:40:0x00ed, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = r1.f22621b
            okhttp3.Request r3 = r0.f22322e
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r2 != r4) goto L_0x0011
            okhttp3.Response r0 = r0.c(r3)
            return r0
        L_0x0011:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            if (r2 != r4) goto L_0x0017
            r4 = 1
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            if (r4 != 0) goto L_0x0021
            okhttp3.logging.HttpLoggingInterceptor$Level r5 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r2 != r5) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = 0
            goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            okhttp3.RequestBody r5 = r3.f22107d
            okhttp3.internal.connection.RealConnection r6 = r25.a()
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = android.support.v4.media.a.q(r7)
            java.lang.String r8 = r3.f22105b
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            okhttp3.HttpUrl r8 = r3.f22104a
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0054
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = android.support.v4.media.a.q(r9)
            okhttp3.Protocol r6 = r6.f22275f
            sk.j.c(r6)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0055
        L_0x0054:
            r6 = r8
        L_0x0055:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r2 != 0) goto L_0x0076
            if (r5 == 0) goto L_0x0076
            java.lang.StringBuilder r6 = f0.b0.v(r6, r9)
            long r10 = r5.a()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x0076:
            okhttp3.logging.HttpLoggingInterceptor$Logger r10 = r1.f22622c
            r10.a(r6)
            java.lang.String r6 = "-byte body omitted)"
            java.lang.String r10 = "UTF_8"
            java.lang.String r11 = "identity"
            java.lang.String r12 = "gzip"
            java.lang.String r13 = "Content-Encoding"
            if (r2 == 0) goto L_0x01c0
            okhttp3.Headers r14 = r3.f22106c
            if (r5 == 0) goto L_0x00e0
            okhttp3.MediaType r15 = r5.b()
            r16 = r2
            if (r15 == 0) goto L_0x00b4
            java.lang.String r2 = "Content-Type"
            java.lang.String r2 = r14.g(r2)
            if (r2 != 0) goto L_0x00b4
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r17 = r6
            java.lang.String r6 = "Content-Type: "
            r0.append(r6)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2.a(r0)
            goto L_0x00b6
        L_0x00b4:
            r17 = r6
        L_0x00b6:
            long r18 = r5.a()
            r20 = -1
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r14.g(r0)
            if (r0 != 0) goto L_0x00e4
            okhttp3.logging.HttpLoggingInterceptor$Logger r0 = r1.f22622c
            java.lang.String r2 = "Content-Length: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            r15 = r7
            long r6 = r5.a()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.a(r2)
            goto L_0x00e5
        L_0x00e0:
            r16 = r2
            r17 = r6
        L_0x00e4:
            r15 = r7
        L_0x00e5:
            java.lang.String[] r0 = r14.f22003a
            int r0 = r0.length
            int r0 = r0 / 2
            r2 = 0
        L_0x00eb:
            if (r2 >= r0) goto L_0x00f3
            r1.b(r14, r2)
            int r2 = r2 + 1
            goto L_0x00eb
        L_0x00f3:
            java.lang.String r0 = "--> END "
            if (r4 == 0) goto L_0x01aa
            if (r5 != 0) goto L_0x00fb
            goto L_0x01aa
        L_0x00fb:
            okhttp3.Headers r2 = r3.f22106c
            java.lang.String r2 = r2.g(r13)
            if (r2 == 0) goto L_0x0111
            boolean r6 = yk.h.G0(r2, r11)
            if (r6 != 0) goto L_0x0111
            boolean r2 = yk.h.G0(r2, r12)
            if (r2 != 0) goto L_0x0111
            r2 = 1
            goto L_0x0112
        L_0x0111:
            r2 = 0
        L_0x0112:
            if (r2 == 0) goto L_0x012d
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            java.lang.String r5 = r3.f22105b
            r0.append(r5)
            java.lang.String r5 = " (encoded body omitted)"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.a(r0)
            r6 = r15
            goto L_0x0182
        L_0x012d:
            ll.f r2 = new ll.f
            r2.<init>()
            r5.c(r2)
            okhttp3.MediaType r6 = r5.b()
            if (r6 == 0) goto L_0x0144
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r6 = r6.a(r7)
            if (r6 == 0) goto L_0x0144
            goto L_0x0149
        L_0x0144:
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            sk.j.e(r6, r10)
        L_0x0149:
            okhttp3.logging.HttpLoggingInterceptor$Logger r7 = r1.f22622c
            r7.a(r8)
            boolean r7 = okhttp3.logging.Utf8Kt.a(r2)
            if (r7 == 0) goto L_0x0185
            okhttp3.logging.HttpLoggingInterceptor$Logger r7 = r1.f22622c
            r18 = r15
            long r14 = r2.f20878b
            java.lang.String r2 = r2.S(r14, r6)
            r7.a(r2)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            java.lang.String r6 = r3.f22105b
            r0.append(r6)
            r0.append(r9)
            long r5 = r5.a()
            r0.append(r5)
            r6 = r18
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2.a(r0)
        L_0x0182:
            r5 = r17
            goto L_0x01c4
        L_0x0185:
            r6 = r15
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            java.lang.String r7 = r3.f22105b
            r0.append(r7)
            java.lang.String r7 = " (binary "
            r0.append(r7)
            long r14 = r5.a()
            r0.append(r14)
            r5 = r17
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.a(r0)
            goto L_0x01c4
        L_0x01aa:
            r6 = r15
            r5 = r17
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            java.lang.String r7 = r3.f22105b
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r2.a(r0)
            goto L_0x01c4
        L_0x01c0:
            r16 = r2
            r5 = r6
            r6 = r7
        L_0x01c4:
            long r14 = java.lang.System.nanoTime()
            r0 = r25
            okhttp3.Response r0 = r0.c(r3)     // Catch:{ Exception -> 0x0397 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r17 = java.lang.System.nanoTime()
            long r14 = r17 - r14
            long r2 = r2.toMillis(r14)
            okhttp3.ResponseBody r7 = r0.f22130n
            sk.j.c(r7)
            long r14 = r7.d()
            r17 = -1
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 == 0) goto L_0x01ff
            r18 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            r19 = r14
            java.lang.String r14 = "-byte"
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            goto L_0x0205
        L_0x01ff:
            r18 = r6
            r19 = r14
            java.lang.String r6 = "unknown-length"
        L_0x0205:
            okhttp3.logging.HttpLoggingInterceptor$Logger r14 = r1.f22622c
            java.lang.String r15 = "<-- "
            java.lang.StringBuilder r15 = android.support.v4.media.a.q(r15)
            r17 = r5
            int r5 = r0.f22127d
            r15.append(r5)
            java.lang.String r5 = r0.f22126c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x021e
            r5 = 1
            goto L_0x021f
        L_0x021e:
            r5 = 0
        L_0x021f:
            if (r5 == 0) goto L_0x022b
            r5 = 32
            r21 = r8
            r23 = r10
            r8 = r5
            r5 = r21
            goto L_0x0248
        L_0x022b:
            java.lang.String r5 = r0.f22126c
            r21 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r22 = 32
            r23 = r10
            java.lang.String r10 = java.lang.String.valueOf(r22)
            r8.append(r10)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r8 = r22
        L_0x0248:
            r15.append(r5)
            r15.append(r8)
            okhttp3.Request r5 = r0.f22124a
            okhttp3.HttpUrl r5 = r5.f22104a
            r15.append(r5)
            r15.append(r9)
            r15.append(r2)
            java.lang.String r2 = "ms"
            r15.append(r2)
            if (r16 != 0) goto L_0x026b
            java.lang.String r2 = ", "
            java.lang.String r3 = " body"
            java.lang.String r2 = f0.b0.s(r2, r6, r3)
            goto L_0x026d
        L_0x026b:
            r2 = r21
        L_0x026d:
            r15.append(r2)
            r2 = 41
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.a(r2)
            if (r16 == 0) goto L_0x0396
            okhttp3.Headers r2 = r0.f22129f
            java.lang.String[] r3 = r2.f22003a
            int r3 = r3.length
            int r3 = r3 / 2
            r5 = 0
        L_0x0286:
            if (r5 >= r3) goto L_0x028e
            r1.b(r2, r5)
            int r5 = r5 + 1
            goto L_0x0286
        L_0x028e:
            if (r4 == 0) goto L_0x038f
            boolean r3 = okhttp3.internal.http.HttpHeaders.a(r0)
            if (r3 != 0) goto L_0x0298
            goto L_0x038f
        L_0x0298:
            okhttp3.Headers r3 = r0.f22129f
            java.lang.String r3 = r3.g(r13)
            if (r3 == 0) goto L_0x02ae
            boolean r4 = yk.h.G0(r3, r11)
            if (r4 != 0) goto L_0x02ae
            boolean r3 = yk.h.G0(r3, r12)
            if (r3 != 0) goto L_0x02ae
            r3 = 1
            goto L_0x02af
        L_0x02ae:
            r3 = 0
        L_0x02af:
            if (r3 == 0) goto L_0x02ba
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.a(r3)
            goto L_0x0396
        L_0x02ba:
            ll.i r3 = r7.i()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.i0(r4)
            ll.f r3 = r3.a()
            java.lang.String r2 = r2.g(r13)
            boolean r2 = yk.h.G0(r12, r2)
            r4 = 0
            if (r2 == 0) goto L_0x02fa
            long r5 = r3.f20878b
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            ll.o r5 = new ll.o
            ll.f r3 = r3.clone()
            r5.<init>(r3)
            ll.f r3 = new ll.f     // Catch:{ all -> 0x02f1 }
            r3.<init>()     // Catch:{ all -> 0x02f1 }
            r3.E0(r5)     // Catch:{ all -> 0x02f1 }
            p3.l0.u(r5, r4)
            r4 = r2
            goto L_0x02fa
        L_0x02f1:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x02f4 }
        L_0x02f4:
            r0 = move-exception
            r3 = r0
            p3.l0.u(r5, r2)
            throw r3
        L_0x02fa:
            okhttp3.MediaType r2 = r7.h()
            if (r2 == 0) goto L_0x0309
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r2 = r2.a(r5)
            if (r2 == 0) goto L_0x0309
            goto L_0x0310
        L_0x0309:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r5 = r23
            sk.j.e(r2, r5)
        L_0x0310:
            boolean r5 = okhttp3.logging.Utf8Kt.a(r3)
            if (r5 != 0) goto L_0x0337
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            r5 = r21
            r2.a(r5)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.String r4 = "<-- END HTTP (binary "
            java.lang.StringBuilder r4 = android.support.v4.media.a.q(r4)
            long r5 = r3.f20878b
            r4.append(r5)
            r3 = r17
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.a(r3)
            return r0
        L_0x0337:
            r5 = r21
            r6 = 0
            int r6 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0353
            okhttp3.logging.HttpLoggingInterceptor$Logger r6 = r1.f22622c
            r6.a(r5)
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f22622c
            ll.f r6 = r3.clone()
            long r7 = r6.f20878b
            java.lang.String r2 = r6.S(r7, r2)
            r5.a(r2)
        L_0x0353:
            java.lang.String r2 = "<-- END HTTP ("
            if (r4 == 0) goto L_0x0377
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.f22622c
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            long r6 = r3.f20878b
            r2.append(r6)
            java.lang.String r3 = "-byte, "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "-gzipped-byte body)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.a(r2)
            goto L_0x0396
        L_0x0377:
            okhttp3.logging.HttpLoggingInterceptor$Logger r4 = r1.f22622c
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            long r5 = r3.f20878b
            r2.append(r5)
            r3 = r18
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.a(r2)
            goto L_0x0396
        L_0x038f:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.f22622c
            java.lang.String r3 = "<-- END HTTP"
            r2.a(r3)
        L_0x0396:
            return r0
        L_0x0397:
            r0 = move-exception
            r2 = r0
            okhttp3.logging.HttpLoggingInterceptor$Logger r0 = r1.f22622c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.a(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }

    public final void b(Headers headers, int i10) {
        this.f22620a.contains(headers.i(i10));
        String m10 = headers.m(i10);
        Logger logger = this.f22622c;
        logger.a(headers.i(i10) + ": " + m10);
    }
}
