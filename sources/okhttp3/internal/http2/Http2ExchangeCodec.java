package okhttp3.internal.http2;

import java.util.List;
import ll.a0;
import ll.c0;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import sk.j;

/* compiled from: Http2ExchangeCodec.kt */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f22467g = new Companion(0);

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f22468h = Util.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i  reason: collision with root package name */
    public static final List<String> f22469i = Util.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final RealConnection f22470a;

    /* renamed from: b  reason: collision with root package name */
    public final RealInterceptorChain f22471b;

    /* renamed from: c  reason: collision with root package name */
    public final Http2Connection f22472c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Http2Stream f22473d;

    /* renamed from: e  reason: collision with root package name */
    public final Protocol f22474e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f22475f;

    /* compiled from: Http2ExchangeCodec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        j.f(realConnection, "connection");
        this.f22470a = realConnection;
        this.f22471b = realInterceptorChain;
        this.f22472c = http2Connection;
        List<Protocol> list = okHttpClient.A;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f22474e = !list.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    public final void a() {
        Http2Stream http2Stream = this.f22473d;
        j.c(http2Stream);
        http2Stream.f().close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(okhttp3.Request r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            okhttp3.internal.http2.Http2Stream r2 = r1.f22473d
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            okhttp3.RequestBody r2 = r0.f22107d
            r4 = 1
            if (r2 == 0) goto L_0x0010
            r2 = r4
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r5 = f22467g
            r5.getClass()
            okhttp3.Headers r5 = r0.f22106c
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.String[] r7 = r5.f22003a
            int r7 = r7.length
            int r7 = r7 / 2
            r8 = 4
            int r7 = r7 + r8
            r6.<init>(r7)
            okhttp3.internal.http2.Header r7 = new okhttp3.internal.http2.Header
            ll.j r9 = okhttp3.internal.http2.Header.f22372f
            java.lang.String r10 = r0.f22105b
            r7.<init>((ll.j) r9, (java.lang.String) r10)
            r6.add(r7)
            okhttp3.internal.http2.Header r7 = new okhttp3.internal.http2.Header
            ll.j r9 = okhttp3.internal.http2.Header.f22373g
            okhttp3.internal.http.RequestLine r10 = okhttp3.internal.http.RequestLine.f22330a
            okhttp3.HttpUrl r11 = r0.f22104a
            r10.getClass()
            java.lang.String r10 = okhttp3.internal.http.RequestLine.a(r11)
            r7.<init>((ll.j) r9, (java.lang.String) r10)
            r6.add(r7)
            java.lang.String r7 = "Host"
            okhttp3.Headers r9 = r0.f22106c
            java.lang.String r7 = r9.g(r7)
            if (r7 == 0) goto L_0x0059
            okhttp3.internal.http2.Header r9 = new okhttp3.internal.http2.Header
            ll.j r10 = okhttp3.internal.http2.Header.f22375i
            r9.<init>((ll.j) r10, (java.lang.String) r7)
            r6.add(r9)
        L_0x0059:
            okhttp3.internal.http2.Header r7 = new okhttp3.internal.http2.Header
            ll.j r9 = okhttp3.internal.http2.Header.f22374h
            okhttp3.HttpUrl r0 = r0.f22104a
            java.lang.String r0 = r0.f22007a
            r7.<init>((ll.j) r9, (java.lang.String) r0)
            r6.add(r7)
            java.lang.String[] r0 = r5.f22003a
            int r0 = r0.length
            int r0 = r0 / 2
            r7 = 0
        L_0x006d:
            if (r7 >= r0) goto L_0x00ae
            java.lang.String r9 = r5.i(r7)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "US"
            sk.j.e(r10, r11)
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r10 = "this as java.lang.String).toLowerCase(locale)"
            sk.j.e(r9, r10)
            java.util.List<java.lang.String> r10 = f22468h
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x009f
            java.lang.String r10 = "te"
            boolean r10 = sk.j.a(r9, r10)
            if (r10 == 0) goto L_0x00ab
            java.lang.String r10 = r5.m(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = sk.j.a(r10, r11)
            if (r10 == 0) goto L_0x00ab
        L_0x009f:
            okhttp3.internal.http2.Header r10 = new okhttp3.internal.http2.Header
            java.lang.String r11 = r5.m(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r6.add(r10)
        L_0x00ab:
            int r7 = r7 + 1
            goto L_0x006d
        L_0x00ae:
            okhttp3.internal.http2.Http2Connection r5 = r1.f22472c
            r5.getClass()
            r0 = r2 ^ 1
            r13 = 0
            okhttp3.internal.http2.Http2Writer r7 = r5.F
            monitor-enter(r7)
            monitor-enter(r5)     // Catch:{ all -> 0x01a7 }
            int r9 = r5.f22409f     // Catch:{ all -> 0x01a4 }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00c6
            okhttp3.internal.http2.ErrorCode r9 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x01a4 }
            r5.s(r9)     // Catch:{ all -> 0x01a4 }
        L_0x00c6:
            boolean r9 = r5.f22410n     // Catch:{ all -> 0x01a4 }
            if (r9 != 0) goto L_0x019e
            int r15 = r5.f22409f     // Catch:{ all -> 0x01a4 }
            int r9 = r15 + 2
            r5.f22409f = r9     // Catch:{ all -> 0x01a4 }
            okhttp3.internal.http2.Http2Stream r14 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x01a4 }
            r16 = 0
            r9 = r14
            r10 = r15
            r11 = r5
            r12 = r0
            r3 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01a4 }
            if (r2 == 0) goto L_0x00f3
            long r9 = r5.C     // Catch:{ all -> 0x01a4 }
            long r11 = r5.D     // Catch:{ all -> 0x01a4 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f3
            long r9 = r3.f22492e     // Catch:{ all -> 0x01a4 }
            long r11 = r3.f22493f     // Catch:{ all -> 0x01a4 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r2 = 0
            goto L_0x00f4
        L_0x00f3:
            r2 = r4
        L_0x00f4:
            boolean r9 = r3.h()     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x0103
            java.util.LinkedHashMap r9 = r5.f22406c     // Catch:{ all -> 0x01a4 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x01a4 }
            r9.put(r10, r3)     // Catch:{ all -> 0x01a4 }
        L_0x0103:
            ek.i r9 = ek.i.f20112a     // Catch:{ all -> 0x01a4 }
            monitor-exit(r5)     // Catch:{ all -> 0x01a7 }
            okhttp3.internal.http2.Http2Writer r9 = r5.F     // Catch:{ all -> 0x01a7 }
            monitor-enter(r9)     // Catch:{ all -> 0x01a7 }
            boolean r10 = r9.f22518e     // Catch:{ all -> 0x019b }
            if (r10 != 0) goto L_0x0193
            okhttp3.internal.http2.Hpack$Writer r10 = r9.f22519f     // Catch:{ all -> 0x019b }
            r10.d(r6)     // Catch:{ all -> 0x019b }
            ll.f r6 = r9.f22516c     // Catch:{ all -> 0x019b }
            long r10 = r6.f20878b     // Catch:{ all -> 0x019b }
            int r6 = r9.f22517d     // Catch:{ all -> 0x019b }
            long r12 = (long) r6     // Catch:{ all -> 0x019b }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x019b }
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0124
            r17 = r8
            goto L_0x0126
        L_0x0124:
            r17 = 0
        L_0x0126:
            if (r0 == 0) goto L_0x012a
            r17 = r17 | 1
        L_0x012a:
            r0 = r17
            int r8 = (int) r12     // Catch:{ all -> 0x019b }
            r9.i(r15, r8, r4, r0)     // Catch:{ all -> 0x019b }
            ll.h r0 = r9.f22514a     // Catch:{ all -> 0x019b }
            ll.f r4 = r9.f22516c     // Catch:{ all -> 0x019b }
            r0.Q(r4, r12)     // Catch:{ all -> 0x019b }
            if (r6 <= 0) goto L_0x013d
            long r10 = r10 - r12
            r9.z(r15, r10)     // Catch:{ all -> 0x019b }
        L_0x013d:
            monitor-exit(r9)     // Catch:{ all -> 0x01a7 }
            monitor-exit(r7)
            if (r2 == 0) goto L_0x015a
            okhttp3.internal.http2.Http2Writer r2 = r5.F
            monitor-enter(r2)
            boolean r0 = r2.f22518e     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x014f
            ll.h r0 = r2.f22514a     // Catch:{ all -> 0x0157 }
            r0.flush()     // Catch:{ all -> 0x0157 }
            monitor-exit(r2)
            goto L_0x015a
        L_0x014f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            java.lang.String r3 = "closed"
            r0.<init>(r3)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x015a:
            r1.f22473d = r3
            boolean r0 = r1.f22475f
            if (r0 != 0) goto L_0x0181
            okhttp3.internal.http2.Http2Stream r0 = r1.f22473d
            sk.j.c(r0)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.f22498k
            okhttp3.internal.http.RealInterceptorChain r2 = r1.f22471b
            int r2 = r2.f22324g
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.g(r2, r4)
            okhttp3.internal.http2.Http2Stream r0 = r1.f22473d
            sk.j.c(r0)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.f22499l
            okhttp3.internal.http.RealInterceptorChain r2 = r1.f22471b
            int r2 = r2.f22325h
            long r2 = (long) r2
            r0.g(r2, r4)
            return
        L_0x0181:
            okhttp3.internal.http2.Http2Stream r0 = r1.f22473d
            sk.j.c(r0)
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL
            r0.e(r2)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0193:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x019b }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x019b:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01a7 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x019e:
            okhttp3.internal.http2.ConnectionShutdownException r0 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x01a4 }
            r0.<init>()     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01a7 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.b(okhttp3.Request):void");
    }

    public final c0 c(Response response) {
        Http2Stream http2Stream = this.f22473d;
        j.c(http2Stream);
        return http2Stream.f22496i;
    }

    public final void cancel() {
        this.f22475f = true;
        Http2Stream http2Stream = this.f22473d;
        if (http2Stream != null) {
            http2Stream.e(ErrorCode.CANCEL);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r0.f22498k.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response.Builder d(boolean r11) {
        /*
            r10 = this;
            okhttp3.internal.http2.Http2Stream r0 = r10.f22473d
            if (r0 == 0) goto L_0x00d8
            monitor-enter(r0)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.f22498k     // Catch:{ all -> 0x00d5 }
            r1.h()     // Catch:{ all -> 0x00d5 }
        L_0x000a:
            java.util.ArrayDeque<okhttp3.Headers> r1 = r0.f22494g     // Catch:{ all -> 0x00ce }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x001a
            okhttp3.internal.http2.ErrorCode r1 = r0.f22500m     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x001a
            r0.j()     // Catch:{ all -> 0x00ce }
            goto L_0x000a
        L_0x001a:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.f22498k     // Catch:{ all -> 0x00d5 }
            r1.l()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayDeque<okhttp3.Headers> r1 = r0.f22494g     // Catch:{ all -> 0x00d5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d5 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00be
            java.util.ArrayDeque<okhttp3.Headers> r1 = r0.f22494g     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            sk.j.e(r1, r2)     // Catch:{ all -> 0x00d5 }
            okhttp3.Headers r1 = (okhttp3.Headers) r1     // Catch:{ all -> 0x00d5 }
            monitor-exit(r0)
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r0 = f22467g
            okhttp3.Protocol r2 = r10.f22474e
            r0.getClass()
            java.lang.String r0 = "protocol"
            sk.j.f(r2, r0)
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.lang.String[] r3 = r1.f22003a
            int r3 = r3.length
            int r3 = r3 / 2
            r4 = 0
            r5 = 0
            r6 = r5
        L_0x0050:
            if (r4 >= r3) goto L_0x008b
            java.lang.String r7 = r1.i(r4)
            java.lang.String r8 = r1.m(r4)
            java.lang.String r9 = ":status"
            boolean r9 = sk.j.a(r7, r9)
            if (r9 == 0) goto L_0x007d
            okhttp3.internal.http.StatusLine$Companion r6 = okhttp3.internal.http.StatusLine.f22332d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "HTTP/1.1 "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.getClass()
            okhttp3.internal.http.StatusLine r6 = okhttp3.internal.http.StatusLine.Companion.a(r7)
            goto L_0x0088
        L_0x007d:
            java.util.List<java.lang.String> r9 = f22469i
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x0088
            r0.c(r7, r8)
        L_0x0088:
            int r4 = r4 + 1
            goto L_0x0050
        L_0x008b:
            if (r6 == 0) goto L_0x00b6
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder
            r1.<init>()
            r1.f22139b = r2
            int r2 = r6.f22334b
            r1.f22140c = r2
            java.lang.String r2 = r6.f22335c
            java.lang.String r3 = "message"
            sk.j.f(r2, r3)
            r1.f22141d = r2
            okhttp3.Headers r0 = r0.d()
            okhttp3.Headers$Builder r0 = r0.l()
            r1.f22143f = r0
            if (r11 == 0) goto L_0x00b4
            int r11 = r1.f22140c
            r0 = 100
            if (r11 != r0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r5 = r1
        L_0x00b5:
            return r5
        L_0x00b6:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00be:
            java.io.IOException r11 = r0.f22501n     // Catch:{ all -> 0x00d5 }
            if (r11 == 0) goto L_0x00c3
            goto L_0x00cd
        L_0x00c3:
            okhttp3.internal.http2.StreamResetException r11 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x00d5 }
            okhttp3.internal.http2.ErrorCode r1 = r0.f22500m     // Catch:{ all -> 0x00d5 }
            sk.j.c(r1)     // Catch:{ all -> 0x00d5 }
            r11.<init>(r1)     // Catch:{ all -> 0x00d5 }
        L_0x00cd:
            throw r11     // Catch:{ all -> 0x00d5 }
        L_0x00ce:
            r11 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.f22498k     // Catch:{ all -> 0x00d5 }
            r1.l()     // Catch:{ all -> 0x00d5 }
            throw r11     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L_0x00d8:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "stream wasn't created"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.d(boolean):okhttp3.Response$Builder");
    }

    public final RealConnection e() {
        return this.f22470a;
    }

    public final void f() {
        this.f22472c.flush();
    }

    public final long g(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0;
        }
        return Util.j(response);
    }

    public final a0 h(Request request, long j10) {
        Http2Stream http2Stream = this.f22473d;
        j.c(http2Stream);
        return http2Stream.f();
    }
}
