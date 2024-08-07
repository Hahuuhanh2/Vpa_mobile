package okhttp3.internal.http;

import okhttp3.Interceptor;

/* compiled from: CallServerInterceptor.kt */
public final class CallServerInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22313a;

    public CallServerInterceptor(boolean z10) {
        this.f22313a = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7 A[SYNTHETIC, Splitter:B:48:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d6 A[Catch:{ IOException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d7 A[Catch:{ IOException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8 A[Catch:{ IOException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011d A[Catch:{ IOException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012b A[Catch:{ IOException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0167 A[Catch:{ IOException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x016c A[Catch:{ IOException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0174 A[Catch:{ IOException -> 0x00b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            okhttp3.internal.connection.Exchange r2 = r14.f22321d
            sk.j.c(r2)
            okhttp3.Request r14 = r14.f22322e
            okhttp3.RequestBody r3 = r14.f22107d
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            r7 = 1
            r8 = 0
            r2.f(r14)     // Catch:{ IOException -> 0x009a }
            java.lang.String r9 = r14.f22105b     // Catch:{ IOException -> 0x009a }
            boolean r9 = okhttp3.internal.http.HttpMethod.b(r9)     // Catch:{ IOException -> 0x009a }
            if (r9 == 0) goto L_0x0080
            if (r3 == 0) goto L_0x0080
            java.lang.String r9 = "100-continue"
            java.lang.String r10 = "Expect"
            okhttp3.Headers r11 = r14.f22106c     // Catch:{ IOException -> 0x009a }
            java.lang.String r10 = r11.g(r10)     // Catch:{ IOException -> 0x009a }
            boolean r9 = yk.h.G0(r9, r10)     // Catch:{ IOException -> 0x009a }
            if (r9 == 0) goto L_0x0051
            okhttp3.internal.http.ExchangeCodec r9 = r2.f22223d     // Catch:{ IOException -> 0x0045 }
            r9.f()     // Catch:{ IOException -> 0x0045 }
            okhttp3.Response$Builder r9 = r2.d(r7)     // Catch:{ IOException -> 0x009a }
            okhttp3.EventListener r10 = r2.f22221b     // Catch:{ IOException -> 0x0043 }
            okhttp3.internal.connection.RealCall r11 = r2.f22220a     // Catch:{ IOException -> 0x0043 }
            r10.z(r11)     // Catch:{ IOException -> 0x0043 }
            r10 = r8
            goto L_0x0053
        L_0x0043:
            r3 = move-exception
            goto L_0x009c
        L_0x0045:
            r3 = move-exception
            okhttp3.EventListener r9 = r2.f22221b     // Catch:{ IOException -> 0x009a }
            okhttp3.internal.connection.RealCall r10 = r2.f22220a     // Catch:{ IOException -> 0x009a }
            r9.s(r10, r3)     // Catch:{ IOException -> 0x009a }
            r2.e(r3)     // Catch:{ IOException -> 0x009a }
            throw r3     // Catch:{ IOException -> 0x009a }
        L_0x0051:
            r9 = r6
            r10 = r7
        L_0x0053:
            if (r9 != 0) goto L_0x0064
            ll.a0 r11 = r2.b(r14)     // Catch:{ IOException -> 0x007e }
            ll.v r11 = j7.a.i(r11)     // Catch:{ IOException -> 0x007e }
            r3.c(r11)     // Catch:{ IOException -> 0x007e }
            r11.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0087
        L_0x0064:
            okhttp3.internal.connection.RealCall r3 = r2.f22220a     // Catch:{ IOException -> 0x007e }
            r3.g(r2, r7, r8, r6)     // Catch:{ IOException -> 0x007e }
            okhttp3.internal.connection.RealConnection r3 = r2.f22226g     // Catch:{ IOException -> 0x007e }
            okhttp3.internal.http2.Http2Connection r3 = r3.f22276g     // Catch:{ IOException -> 0x007e }
            if (r3 == 0) goto L_0x0071
            r3 = r7
            goto L_0x0072
        L_0x0071:
            r3 = r8
        L_0x0072:
            if (r3 != 0) goto L_0x0087
            okhttp3.internal.http.ExchangeCodec r3 = r2.f22223d     // Catch:{ IOException -> 0x007e }
            okhttp3.internal.connection.RealConnection r3 = r3.e()     // Catch:{ IOException -> 0x007e }
            r3.k()     // Catch:{ IOException -> 0x007e }
            goto L_0x0087
        L_0x007e:
            r3 = move-exception
            goto L_0x009d
        L_0x0080:
            okhttp3.internal.connection.RealCall r3 = r2.f22220a     // Catch:{ IOException -> 0x009a }
            r3.g(r2, r7, r8, r6)     // Catch:{ IOException -> 0x009a }
            r9 = r6
            r10 = r7
        L_0x0087:
            okhttp3.internal.http.ExchangeCodec r3 = r2.f22223d     // Catch:{ IOException -> 0x008e }
            r3.a()     // Catch:{ IOException -> 0x008e }
            r3 = r6
            goto L_0x00a5
        L_0x008e:
            r3 = move-exception
            okhttp3.EventListener r11 = r2.f22221b     // Catch:{ IOException -> 0x007e }
            okhttp3.internal.connection.RealCall r12 = r2.f22220a     // Catch:{ IOException -> 0x007e }
            r11.s(r12, r3)     // Catch:{ IOException -> 0x007e }
            r2.e(r3)     // Catch:{ IOException -> 0x007e }
            throw r3     // Catch:{ IOException -> 0x007e }
        L_0x009a:
            r3 = move-exception
            r9 = r6
        L_0x009c:
            r10 = r7
        L_0x009d:
            boolean r11 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r11 != 0) goto L_0x01a8
            boolean r11 = r2.f22225f
            if (r11 == 0) goto L_0x01a7
        L_0x00a5:
            if (r9 != 0) goto L_0x00bc
            okhttp3.Response$Builder r9 = r2.d(r8)     // Catch:{ IOException -> 0x00b9 }
            sk.j.c(r9)     // Catch:{ IOException -> 0x00b9 }
            if (r10 == 0) goto L_0x00bc
            okhttp3.EventListener r10 = r2.f22221b     // Catch:{ IOException -> 0x00b9 }
            okhttp3.internal.connection.RealCall r11 = r2.f22220a     // Catch:{ IOException -> 0x00b9 }
            r10.z(r11)     // Catch:{ IOException -> 0x00b9 }
            r10 = r8
            goto L_0x00bc
        L_0x00b9:
            r14 = move-exception
            goto L_0x01a0
        L_0x00bc:
            r9.f22138a = r14     // Catch:{ IOException -> 0x00b9 }
            okhttp3.internal.connection.RealConnection r11 = r2.f22226g     // Catch:{ IOException -> 0x00b9 }
            okhttp3.Handshake r11 = r11.f22274e     // Catch:{ IOException -> 0x00b9 }
            r9.f22142e = r11     // Catch:{ IOException -> 0x00b9 }
            r9.f22148k = r4     // Catch:{ IOException -> 0x00b9 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b9 }
            r9.f22149l = r11     // Catch:{ IOException -> 0x00b9 }
            okhttp3.Response r9 = r9.a()     // Catch:{ IOException -> 0x00b9 }
            int r11 = r9.f22127d     // Catch:{ IOException -> 0x00b9 }
            r12 = 100
            if (r11 != r12) goto L_0x00d7
            goto L_0x00e6
        L_0x00d7:
            r12 = 102(0x66, float:1.43E-43)
            if (r12 > r11) goto L_0x00e1
            r12 = 200(0xc8, float:2.8E-43)
            if (r11 >= r12) goto L_0x00e1
            r12 = r7
            goto L_0x00e2
        L_0x00e1:
            r12 = r8
        L_0x00e2:
            if (r12 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r7 = r8
        L_0x00e6:
            if (r7 == 0) goto L_0x010e
            okhttp3.Response$Builder r7 = r2.d(r8)     // Catch:{ IOException -> 0x00b9 }
            sk.j.c(r7)     // Catch:{ IOException -> 0x00b9 }
            if (r10 == 0) goto L_0x00f8
            okhttp3.EventListener r8 = r2.f22221b     // Catch:{ IOException -> 0x00b9 }
            okhttp3.internal.connection.RealCall r9 = r2.f22220a     // Catch:{ IOException -> 0x00b9 }
            r8.z(r9)     // Catch:{ IOException -> 0x00b9 }
        L_0x00f8:
            r7.f22138a = r14     // Catch:{ IOException -> 0x00b9 }
            okhttp3.internal.connection.RealConnection r14 = r2.f22226g     // Catch:{ IOException -> 0x00b9 }
            okhttp3.Handshake r14 = r14.f22274e     // Catch:{ IOException -> 0x00b9 }
            r7.f22142e = r14     // Catch:{ IOException -> 0x00b9 }
            r7.f22148k = r4     // Catch:{ IOException -> 0x00b9 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b9 }
            r7.f22149l = r4     // Catch:{ IOException -> 0x00b9 }
            okhttp3.Response r9 = r7.a()     // Catch:{ IOException -> 0x00b9 }
            int r11 = r9.f22127d     // Catch:{ IOException -> 0x00b9 }
        L_0x010e:
            okhttp3.EventListener r14 = r2.f22221b     // Catch:{ IOException -> 0x00b9 }
            okhttp3.internal.connection.RealCall r4 = r2.f22220a     // Catch:{ IOException -> 0x00b9 }
            r14.y(r4, r9)     // Catch:{ IOException -> 0x00b9 }
            boolean r14 = r13.f22313a     // Catch:{ IOException -> 0x00b9 }
            if (r14 == 0) goto L_0x012b
            r14 = 101(0x65, float:1.42E-43)
            if (r11 != r14) goto L_0x012b
            okhttp3.Response$Builder r14 = new okhttp3.Response$Builder     // Catch:{ IOException -> 0x00b9 }
            r14.<init>(r9)     // Catch:{ IOException -> 0x00b9 }
            okhttp3.ResponseBody$Companion$asResponseBody$1 r4 = okhttp3.internal.Util.f22173c     // Catch:{ IOException -> 0x00b9 }
            r14.f22144g = r4     // Catch:{ IOException -> 0x00b9 }
            okhttp3.Response r14 = r14.a()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x013a
        L_0x012b:
            okhttp3.Response$Builder r14 = new okhttp3.Response$Builder     // Catch:{ IOException -> 0x00b9 }
            r14.<init>(r9)     // Catch:{ IOException -> 0x00b9 }
            okhttp3.internal.http.RealResponseBody r4 = r2.c(r9)     // Catch:{ IOException -> 0x00b9 }
            r14.f22144g = r4     // Catch:{ IOException -> 0x00b9 }
            okhttp3.Response r14 = r14.a()     // Catch:{ IOException -> 0x00b9 }
        L_0x013a:
            okhttp3.Request r4 = r14.f22124a     // Catch:{ IOException -> 0x00b9 }
            okhttp3.Headers r4 = r4.f22106c     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r4 = r4.g(r0)     // Catch:{ IOException -> 0x00b9 }
            boolean r4 = yk.h.G0(r1, r4)     // Catch:{ IOException -> 0x00b9 }
            if (r4 != 0) goto L_0x0152
            java.lang.String r0 = okhttp3.Response.h(r14, r0)     // Catch:{ IOException -> 0x00b9 }
            boolean r0 = yk.h.G0(r1, r0)     // Catch:{ IOException -> 0x00b9 }
            if (r0 == 0) goto L_0x015b
        L_0x0152:
            okhttp3.internal.http.ExchangeCodec r0 = r2.f22223d     // Catch:{ IOException -> 0x00b9 }
            okhttp3.internal.connection.RealConnection r0 = r0.e()     // Catch:{ IOException -> 0x00b9 }
            r0.k()     // Catch:{ IOException -> 0x00b9 }
        L_0x015b:
            r0 = 204(0xcc, float:2.86E-43)
            if (r11 == r0) goto L_0x0163
            r0 = 205(0xcd, float:2.87E-43)
            if (r11 != r0) goto L_0x019f
        L_0x0163:
            okhttp3.ResponseBody r0 = r14.f22130n     // Catch:{ IOException -> 0x00b9 }
            if (r0 == 0) goto L_0x016c
            long r0 = r0.d()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x016e
        L_0x016c:
            r0 = -1
        L_0x016e:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x00b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b9 }
            r1.<init>()     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r2 = "HTTP "
            r1.append(r2)     // Catch:{ IOException -> 0x00b9 }
            r1.append(r11)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)     // Catch:{ IOException -> 0x00b9 }
            okhttp3.ResponseBody r14 = r14.f22130n     // Catch:{ IOException -> 0x00b9 }
            if (r14 == 0) goto L_0x0194
            long r4 = r14.d()     // Catch:{ IOException -> 0x00b9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x00b9 }
        L_0x0194:
            r1.append(r6)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r14 = r1.toString()     // Catch:{ IOException -> 0x00b9 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x00b9 }
            throw r0     // Catch:{ IOException -> 0x00b9 }
        L_0x019f:
            return r14
        L_0x01a0:
            if (r3 == 0) goto L_0x01a6
            al.g0.s(r3, r14)
            throw r3
        L_0x01a6:
            throw r14
        L_0x01a7:
            throw r3
        L_0x01a8:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}
