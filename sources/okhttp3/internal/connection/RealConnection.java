package okhttp3.internal.connection;

import f0.b0;
import j7.a;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ll.v;
import ll.w;
import okhttp3.Address;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import sk.j;
import yk.h;

/* compiled from: RealConnection.kt */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: b  reason: collision with root package name */
    public final Route f22271b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f22272c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f22273d;

    /* renamed from: e  reason: collision with root package name */
    public Handshake f22274e;

    /* renamed from: f  reason: collision with root package name */
    public Protocol f22275f;

    /* renamed from: g  reason: collision with root package name */
    public Http2Connection f22276g;

    /* renamed from: h  reason: collision with root package name */
    public w f22277h;

    /* renamed from: i  reason: collision with root package name */
    public v f22278i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22279j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f22280k;

    /* renamed from: l  reason: collision with root package name */
    public int f22281l;

    /* renamed from: m  reason: collision with root package name */
    public int f22282m;

    /* renamed from: n  reason: collision with root package name */
    public int f22283n;

    /* renamed from: o  reason: collision with root package name */
    public int f22284o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f22285p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f22286q = Long.MAX_VALUE;

    /* compiled from: RealConnection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: RealConnection.kt */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22287a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f22287a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.WhenMappings.<clinit>():void");
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        j.f(realConnectionPool, "connectionPool");
        j.f(route, "route");
        this.f22271b = route;
    }

    public static void d(OkHttpClient okHttpClient, Route route, IOException iOException) {
        j.f(okHttpClient, "client");
        j.f(route, "failedRoute");
        j.f(iOException, "failure");
        if (route.f22161b.type() != Proxy.Type.DIRECT) {
            Address address = route.f22160a;
            address.f21900h.connectFailed(address.f21901i.g(), route.f22161b.address(), iOException);
        }
        RouteDatabase routeDatabase = okHttpClient.K;
        synchronized (routeDatabase) {
            routeDatabase.f22298a.add(route);
        }
    }

    public final synchronized void a(Http2Connection http2Connection, Settings settings) {
        int i10;
        j.f(http2Connection, "connection");
        j.f(settings, "settings");
        if ((settings.f22529a & 16) != 0) {
            i10 = settings.f22530b[4];
        } else {
            i10 = Integer.MAX_VALUE;
        }
        this.f22284o = i10;
    }

    public final void b(Http2Stream http2Stream) {
        j.f(http2Stream, "stream");
        http2Stream.c(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015e A[EDGE_INSN: B:87:0x015e->B:80:0x015e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r16, int r17, int r18, int r19, boolean r20, okhttp3.internal.connection.RealCall r21, okhttp3.EventListener r22) {
        /*
            r15 = this;
            r7 = r15
            r8 = r21
            r9 = r22
            java.lang.String r0 = "call"
            sk.j.f(r8, r0)
            java.lang.String r0 = "eventListener"
            sk.j.f(r9, r0)
            okhttp3.Protocol r0 = r7.f22275f
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r0 = r10
            goto L_0x0018
        L_0x0017:
            r0 = r11
        L_0x0018:
            if (r0 == 0) goto L_0x016c
            okhttp3.Route r0 = r7.f22271b
            okhttp3.Address r0 = r0.f22160a
            java.util.List<okhttp3.ConnectionSpec> r0 = r0.f21903k
            okhttp3.internal.connection.ConnectionSpecSelector r12 = new okhttp3.internal.connection.ConnectionSpecSelector
            r12.<init>(r0)
            okhttp3.Route r1 = r7.f22271b
            okhttp3.Address r1 = r1.f22160a
            javax.net.ssl.SSLSocketFactory r2 = r1.f21895c
            if (r2 != 0) goto L_0x006b
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.f21954f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005e
            okhttp3.Route r0 = r7.f22271b
            okhttp3.Address r0 = r0.f22160a
            okhttp3.HttpUrl r0 = r0.f21901i
            java.lang.String r0 = r0.f22010d
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.f22562a
            r1.getClass()
            okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.Platform.f22563b
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x004b
            goto L_0x0075
        L_0x004b:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = f0.b0.s(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005e:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.util.List<okhttp3.Protocol> r0 = r1.f21902j
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x015f
        L_0x0075:
            r13 = 0
            r14 = r13
        L_0x0077:
            okhttp3.Route r0 = r7.f22271b     // Catch:{ IOException -> 0x00f2 }
            okhttp3.Address r1 = r0.f22160a     // Catch:{ IOException -> 0x00f2 }
            javax.net.ssl.SSLSocketFactory r1 = r1.f21895c     // Catch:{ IOException -> 0x00f2 }
            if (r1 == 0) goto L_0x008b
            java.net.Proxy r0 = r0.f22161b     // Catch:{ IOException -> 0x00f2 }
            java.net.Proxy$Type r0 = r0.type()     // Catch:{ IOException -> 0x00f2 }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00f2 }
            if (r0 != r1) goto L_0x008b
            r0 = r10
            goto L_0x008c
        L_0x008b:
            r0 = r11
        L_0x008c:
            if (r0 == 0) goto L_0x00a6
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f2 }
            java.net.Socket r0 = r7.f22272c     // Catch:{ IOException -> 0x00f2 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00bd
        L_0x00a1:
            r1 = r16
            r2 = r17
            goto L_0x00ad
        L_0x00a6:
            r1 = r16
            r2 = r17
            r15.e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00ee }
        L_0x00ad:
            r3 = r19
            r15.g(r12, r3, r8, r9)     // Catch:{ IOException -> 0x00ec }
            okhttp3.Route r0 = r7.f22271b     // Catch:{ IOException -> 0x00ec }
            java.net.InetSocketAddress r4 = r0.f22162c     // Catch:{ IOException -> 0x00ec }
            java.net.Proxy r0 = r0.f22161b     // Catch:{ IOException -> 0x00ec }
            okhttp3.Protocol r5 = r7.f22275f     // Catch:{ IOException -> 0x00ec }
            r9.h(r8, r4, r0, r5)     // Catch:{ IOException -> 0x00ec }
        L_0x00bd:
            okhttp3.Route r0 = r7.f22271b
            okhttp3.Address r1 = r0.f22160a
            javax.net.ssl.SSLSocketFactory r1 = r1.f21895c
            if (r1 == 0) goto L_0x00d0
            java.net.Proxy r0 = r0.f22161b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r10 = r11
        L_0x00d1:
            if (r10 == 0) goto L_0x00e5
            java.net.Socket r0 = r7.f22272c
            if (r0 == 0) goto L_0x00d8
            goto L_0x00e5
        L_0x00d8:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            long r0 = java.lang.System.nanoTime()
            r7.f22286q = r0
            return
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f8
        L_0x00ee:
            r0 = move-exception
        L_0x00ef:
            r3 = r19
            goto L_0x00f8
        L_0x00f2:
            r0 = move-exception
            r1 = r16
            r2 = r17
            goto L_0x00ef
        L_0x00f8:
            java.net.Socket r4 = r7.f22273d
            if (r4 == 0) goto L_0x00ff
            okhttp3.internal.Util.d(r4)
        L_0x00ff:
            java.net.Socket r4 = r7.f22272c
            if (r4 == 0) goto L_0x0106
            okhttp3.internal.Util.d(r4)
        L_0x0106:
            r7.f22273d = r13
            r7.f22272c = r13
            r7.f22277h = r13
            r7.f22278i = r13
            r7.f22274e = r13
            r7.f22275f = r13
            r7.f22276g = r13
            r7.f22284o = r10
            okhttp3.Route r4 = r7.f22271b
            java.net.InetSocketAddress r5 = r4.f22162c
            java.net.Proxy r4 = r4.f22161b
            r9.i(r8, r5, r4, r0)
            if (r14 != 0) goto L_0x0127
            okhttp3.internal.connection.RouteException r14 = new okhttp3.internal.connection.RouteException
            r14.<init>(r0)
            goto L_0x012e
        L_0x0127:
            java.io.IOException r4 = r14.f22299a
            al.g0.s(r4, r0)
            r14.f22300b = r0
        L_0x012e:
            if (r20 == 0) goto L_0x015e
            r12.f22219d = r10
            boolean r4 = r12.f22218c
            if (r4 != 0) goto L_0x0137
            goto L_0x0159
        L_0x0137:
            boolean r4 = r0 instanceof java.net.ProtocolException
            if (r4 == 0) goto L_0x013c
            goto L_0x0159
        L_0x013c:
            boolean r4 = r0 instanceof java.io.InterruptedIOException
            if (r4 == 0) goto L_0x0141
            goto L_0x0159
        L_0x0141:
            boolean r4 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L_0x014e
            java.lang.Throwable r4 = r0.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L_0x014e
            goto L_0x0159
        L_0x014e:
            boolean r4 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L_0x0153
            goto L_0x0159
        L_0x0153:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0159
            r0 = r10
            goto L_0x015a
        L_0x0159:
            r0 = r11
        L_0x015a:
            if (r0 == 0) goto L_0x015e
            goto L_0x0077
        L_0x015e:
            throw r14
        L_0x015f:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.c(int, int, int, int, boolean, okhttp3.internal.connection.RealCall, okhttp3.EventListener):void");
    }

    public final void e(int i10, int i11, RealCall realCall, EventListener eventListener) {
        int i12;
        Socket socket;
        Route route = this.f22271b;
        Proxy proxy = route.f22161b;
        Address address = route.f22160a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i12 = -1;
        } else {
            i12 = WhenMappings.f22287a[type.ordinal()];
        }
        if (i12 == 1 || i12 == 2) {
            socket = address.f21894b.createSocket();
            j.c(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f22272c = socket;
        eventListener.j(realCall, this.f22271b.f22162c, proxy);
        socket.setSoTimeout(i11);
        try {
            Platform.f22562a.getClass();
            Platform.f22563b.e(socket, this.f22271b.f22162c, i10);
            try {
                this.f22277h = new w(a.v0(socket));
                this.f22278i = a.i(a.u0(socket));
            } catch (NullPointerException e10) {
                if (j.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder q10 = android.support.v4.media.a.q("Failed to connect to ");
            q10.append(this.f22271b.f22162c);
            ConnectException connectException = new ConnectException(q10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, RealCall realCall, EventListener eventListener) {
        Request request;
        int i13;
        int i14 = i11;
        RealCall realCall2 = realCall;
        EventListener eventListener2 = eventListener;
        Request.Builder builder = new Request.Builder();
        HttpUrl httpUrl = this.f22271b.f22160a.f21901i;
        j.f(httpUrl, "url");
        builder.f22110a = httpUrl;
        OkHttpClient okHttpClient = null;
        builder.c("CONNECT", (RequestBody) null);
        boolean z10 = true;
        builder.b("Host", Util.w(this.f22271b.f22160a.f21901i, true));
        builder.b("Proxy-Connection", "Keep-Alive");
        builder.b("User-Agent", "okhttp/4.12.0");
        Request a10 = builder.a();
        Response.Builder builder2 = new Response.Builder();
        builder2.f22138a = a10;
        builder2.f22139b = Protocol.HTTP_1_1;
        builder2.f22140c = 407;
        builder2.f22141d = "Preemptive Authenticate";
        builder2.f22144g = Util.f22173c;
        builder2.f22148k = -1;
        builder2.f22149l = -1;
        Headers.Builder builder3 = builder2.f22143f;
        builder3.getClass();
        Headers.f22002b.getClass();
        Headers.Companion.a("Proxy-Authenticate");
        Headers.Companion.b("OkHttp-Preemptive", "Proxy-Authenticate");
        builder3.e("Proxy-Authenticate");
        builder3.c("Proxy-Authenticate", "OkHttp-Preemptive");
        Response a11 = builder2.a();
        Route route = this.f22271b;
        Request a12 = route.f22160a.f21898f.a(route, a11);
        if (a12 != null) {
            a10 = a12;
        }
        HttpUrl httpUrl2 = request.f22104a;
        int i15 = 0;
        while (i15 < 21) {
            e(i10, i14, realCall2, eventListener2);
            String str = "CONNECT " + Util.w(httpUrl2, z10) + " HTTP/1.1";
            while (true) {
                w wVar = this.f22277h;
                j.c(wVar);
                v vVar = this.f22278i;
                j.c(vVar);
                Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, this, wVar, vVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                wVar.f().g((long) i14, timeUnit);
                i13 = i15;
                vVar.f().g((long) i12, timeUnit);
                http1ExchangeCodec.l(request.f22106c, str);
                http1ExchangeCodec.a();
                Response.Builder d10 = http1ExchangeCodec.d(false);
                j.c(d10);
                d10.f22138a = request;
                Response a13 = d10.a();
                http1ExchangeCodec.k(a13);
                int i16 = a13.f22127d;
                if (i16 != 200) {
                    if (i16 == 407) {
                        Route route2 = this.f22271b;
                        Request a14 = route2.f22160a.f21898f.a(route2, a13);
                        if (a14 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if (h.G0("close", Response.h(a13, "Connection"))) {
                            request = a14;
                            break;
                        } else {
                            int i17 = i10;
                            i15 = i13;
                            Request request2 = a14;
                            okHttpClient = null;
                            request = request2;
                        }
                    } else {
                        StringBuilder q10 = android.support.v4.media.a.q("Unexpected response code for CONNECT: ");
                        q10.append(a13.f22127d);
                        throw new IOException(q10.toString());
                    }
                } else if (!wVar.f20915b.A() || !vVar.f20912b.A()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    request = null;
                }
            }
            if (request != null) {
                Socket socket = this.f22272c;
                if (socket != null) {
                    Util.d(socket);
                }
                okHttpClient = null;
                this.f22272c = null;
                this.f22278i = null;
                this.f22277h = null;
                Route route3 = this.f22271b;
                eventListener2.h(realCall2, route3.f22162c, route3.f22161b, (Protocol) null);
                i15 = i13 + 1;
                z10 = true;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(okhttp3.internal.connection.ConnectionSpecSelector r11, int r12, okhttp3.internal.connection.RealCall r13, okhttp3.EventListener r14) {
        /*
            r10 = this;
            okhttp3.Route r0 = r10.f22271b
            okhttp3.Address r0 = r0.f22160a
            javax.net.ssl.SSLSocketFactory r1 = r0.f21895c
            if (r1 != 0) goto L_0x0025
            java.util.List<okhttp3.Protocol> r11 = r0.f21902j
            okhttp3.Protocol r13 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x001c
            java.net.Socket r11 = r10.f22272c
            r10.f22273d = r11
            r10.f22275f = r13
            r10.l(r12)
            return
        L_0x001c:
            java.net.Socket r11 = r10.f22272c
            r10.f22273d = r11
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1
            r10.f22275f = r11
            return
        L_0x0025:
            r14.C(r13)
            okhttp3.Route r0 = r10.f22271b
            okhttp3.Address r0 = r0.f22160a
            javax.net.ssl.SSLSocketFactory r1 = r0.f21895c
            r2 = 0
            sk.j.c(r1)     // Catch:{ all -> 0x01b8 }
            java.net.Socket r3 = r10.f22272c     // Catch:{ all -> 0x01b8 }
            okhttp3.HttpUrl r4 = r0.f21901i     // Catch:{ all -> 0x01b8 }
            java.lang.String r5 = r4.f22010d     // Catch:{ all -> 0x01b8 }
            int r4 = r4.f22011e     // Catch:{ all -> 0x01b8 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r5, r4, r6)     // Catch:{ all -> 0x01b8 }
            java.lang.String r3 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            sk.j.d(r1, r3)     // Catch:{ all -> 0x01b8 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x01b8 }
            okhttp3.ConnectionSpec r11 = r11.a(r1)     // Catch:{ all -> 0x01b5 }
            boolean r3 = r11.f21956b     // Catch:{ all -> 0x01b5 }
            if (r3 == 0) goto L_0x005e
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.f22562a     // Catch:{ all -> 0x01b5 }
            r3.getClass()     // Catch:{ all -> 0x01b5 }
            okhttp3.internal.platform.Platform r3 = okhttp3.internal.platform.Platform.f22563b     // Catch:{ all -> 0x01b5 }
            okhttp3.HttpUrl r4 = r0.f21901i     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = r4.f22010d     // Catch:{ all -> 0x01b5 }
            java.util.List<okhttp3.Protocol> r5 = r0.f21902j     // Catch:{ all -> 0x01b5 }
            r3.d(r1, r4, r5)     // Catch:{ all -> 0x01b5 }
        L_0x005e:
            r1.startHandshake()     // Catch:{ all -> 0x01b5 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x01b5 }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.f21995e     // Catch:{ all -> 0x01b5 }
            java.lang.String r5 = "sslSocketSession"
            sk.j.e(r3, r5)     // Catch:{ all -> 0x01b5 }
            r4.getClass()     // Catch:{ all -> 0x01b5 }
            okhttp3.Handshake r4 = okhttp3.Handshake.Companion.a(r3)     // Catch:{ all -> 0x01b5 }
            javax.net.ssl.HostnameVerifier r5 = r0.f21896d     // Catch:{ all -> 0x01b5 }
            sk.j.c(r5)     // Catch:{ all -> 0x01b5 }
            okhttp3.HttpUrl r7 = r0.f21901i     // Catch:{ all -> 0x01b5 }
            java.lang.String r7 = r7.f22010d     // Catch:{ all -> 0x01b5 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x01b5 }
            if (r3 != 0) goto L_0x0143
            java.util.List r11 = r4.a()     // Catch:{ all -> 0x01b5 }
            boolean r12 = r11.isEmpty()     // Catch:{ all -> 0x01b5 }
            r12 = r12 ^ r6
            if (r12 == 0) goto L_0x0123
            r12 = 0
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x01b5 }
            java.lang.String r12 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            sk.j.d(r11, r12)     // Catch:{ all -> 0x01b5 }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x01b5 }
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r13.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r14 = "\n              |Hostname "
            r13.append(r14)     // Catch:{ all -> 0x01b5 }
            okhttp3.HttpUrl r14 = r0.f21901i     // Catch:{ all -> 0x01b5 }
            java.lang.String r14 = r14.f22010d     // Catch:{ all -> 0x01b5 }
            r13.append(r14)     // Catch:{ all -> 0x01b5 }
            java.lang.String r14 = " not verified:\n              |    certificate: "
            r13.append(r14)     // Catch:{ all -> 0x01b5 }
            okhttp3.CertificatePinner$Companion r14 = okhttp3.CertificatePinner.f21922c     // Catch:{ all -> 0x01b5 }
            r14.getClass()     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r14.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "sha256/"
            r14.append(r0)     // Catch:{ all -> 0x01b5 }
            ll.j r0 = ll.j.f20882d     // Catch:{ all -> 0x01b5 }
            java.security.PublicKey r0 = r11.getPublicKey()     // Catch:{ all -> 0x01b5 }
            byte[] r0 = r0.getEncoded()     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = "publicKey.encoded"
            sk.j.e(r0, r2)     // Catch:{ all -> 0x01b5 }
            ll.j r0 = ll.j.a.c(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = "SHA-256"
            ll.j r0 = r0.c(r2)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r0.b()     // Catch:{ all -> 0x01b5 }
            r14.append(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x01b5 }
            r13.append(r14)     // Catch:{ all -> 0x01b5 }
            java.lang.String r14 = "\n              |    DN: "
            r13.append(r14)     // Catch:{ all -> 0x01b5 }
            java.security.Principal r14 = r11.getSubjectDN()     // Catch:{ all -> 0x01b5 }
            java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x01b5 }
            r13.append(r14)     // Catch:{ all -> 0x01b5 }
            java.lang.String r14 = "\n              |    subjectAltNames: "
            r13.append(r14)     // Catch:{ all -> 0x01b5 }
            okhttp3.internal.tls.OkHostnameVerifier r14 = okhttp3.internal.tls.OkHostnameVerifier.f22612a     // Catch:{ all -> 0x01b5 }
            r14.getClass()     // Catch:{ all -> 0x01b5 }
            r14 = 7
            java.util.List r14 = okhttp3.internal.tls.OkHostnameVerifier.a(r11, r14)     // Catch:{ all -> 0x01b5 }
            r0 = 2
            java.util.List r11 = okhttp3.internal.tls.OkHostnameVerifier.a(r11, r0)     // Catch:{ all -> 0x01b5 }
            java.util.ArrayList r11 = fk.p.U0(r11, r14)     // Catch:{ all -> 0x01b5 }
            r13.append(r11)     // Catch:{ all -> 0x01b5 }
            java.lang.String r11 = "\n              "
            r13.append(r11)     // Catch:{ all -> 0x01b5 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x01b5 }
            java.lang.String r11 = fk.h.E0(r11)     // Catch:{ all -> 0x01b5 }
            r12.<init>(r11)     // Catch:{ all -> 0x01b5 }
            throw r12     // Catch:{ all -> 0x01b5 }
        L_0x0123:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r12.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r13 = "Hostname "
            r12.append(r13)     // Catch:{ all -> 0x01b5 }
            okhttp3.HttpUrl r13 = r0.f21901i     // Catch:{ all -> 0x01b5 }
            java.lang.String r13 = r13.f22010d     // Catch:{ all -> 0x01b5 }
            r12.append(r13)     // Catch:{ all -> 0x01b5 }
            java.lang.String r13 = " not verified (no certificates)"
            r12.append(r13)     // Catch:{ all -> 0x01b5 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01b5 }
            r11.<init>(r12)     // Catch:{ all -> 0x01b5 }
            throw r11     // Catch:{ all -> 0x01b5 }
        L_0x0143:
            okhttp3.CertificatePinner r3 = r0.f21897e     // Catch:{ all -> 0x01b5 }
            sk.j.c(r3)     // Catch:{ all -> 0x01b5 }
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x01b5 }
            okhttp3.TlsVersion r6 = r4.f21996a     // Catch:{ all -> 0x01b5 }
            okhttp3.CipherSuite r7 = r4.f21997b     // Catch:{ all -> 0x01b5 }
            java.util.List<java.security.cert.Certificate> r8 = r4.f21998c     // Catch:{ all -> 0x01b5 }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x01b5 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x01b5 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x01b5 }
            r10.f22274e = r5     // Catch:{ all -> 0x01b5 }
            okhttp3.HttpUrl r0 = r0.f21901i     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r0.f22010d     // Catch:{ all -> 0x01b5 }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x01b5 }
            r4.<init>(r10)     // Catch:{ all -> 0x01b5 }
            r3.b(r0, r4)     // Catch:{ all -> 0x01b5 }
            boolean r11 = r11.f21956b     // Catch:{ all -> 0x01b5 }
            if (r11 == 0) goto L_0x0175
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.f22562a     // Catch:{ all -> 0x01b5 }
            r11.getClass()     // Catch:{ all -> 0x01b5 }
            okhttp3.internal.platform.Platform r11 = okhttp3.internal.platform.Platform.f22563b     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = r11.f(r1)     // Catch:{ all -> 0x01b5 }
        L_0x0175:
            r10.f22273d = r1     // Catch:{ all -> 0x01b5 }
            ll.e r11 = j7.a.v0(r1)     // Catch:{ all -> 0x01b5 }
            ll.w r0 = new ll.w     // Catch:{ all -> 0x01b5 }
            r0.<init>(r11)     // Catch:{ all -> 0x01b5 }
            r10.f22277h = r0     // Catch:{ all -> 0x01b5 }
            ll.d r11 = j7.a.u0(r1)     // Catch:{ all -> 0x01b5 }
            ll.v r11 = j7.a.i(r11)     // Catch:{ all -> 0x01b5 }
            r10.f22278i = r11     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0198
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.f22095b     // Catch:{ all -> 0x01b5 }
            r11.getClass()     // Catch:{ all -> 0x01b5 }
            okhttp3.Protocol r11 = okhttp3.Protocol.Companion.a(r2)     // Catch:{ all -> 0x01b5 }
            goto L_0x019a
        L_0x0198:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x01b5 }
        L_0x019a:
            r10.f22275f = r11     // Catch:{ all -> 0x01b5 }
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.f22562a
            r11.getClass()
            okhttp3.internal.platform.Platform r11 = okhttp3.internal.platform.Platform.f22563b
            r11.a(r1)
            okhttp3.Handshake r11 = r10.f22274e
            r14.B(r13, r11)
            okhttp3.Protocol r11 = r10.f22275f
            okhttp3.Protocol r13 = okhttp3.Protocol.HTTP_2
            if (r11 != r13) goto L_0x01b4
            r10.l(r12)
        L_0x01b4:
            return
        L_0x01b5:
            r11 = move-exception
            r2 = r1
            goto L_0x01b9
        L_0x01b8:
            r11 = move-exception
        L_0x01b9:
            if (r2 == 0) goto L_0x01c5
            okhttp3.internal.platform.Platform$Companion r12 = okhttp3.internal.platform.Platform.f22562a
            r12.getClass()
            okhttp3.internal.platform.Platform r12 = okhttp3.internal.platform.Platform.f22563b
            r12.a(r2)
        L_0x01c5:
            if (r2 == 0) goto L_0x01ca
            okhttp3.internal.Util.d(r2)
        L_0x01ca:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.g(okhttp3.internal.connection.ConnectionSpecSelector, int, okhttp3.internal.connection.RealCall, okhttp3.EventListener):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r8 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC, Splitter:B:53:0x00da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(okhttp3.Address r7, java.util.List<okhttp3.Route> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "address"
            sk.j.f(r7, r0)
            byte[] r0 = okhttp3.internal.Util.f22171a
            java.util.ArrayList r0 = r6.f22285p
            int r0 = r0.size()
            int r1 = r6.f22284o
            r2 = 0
            if (r0 >= r1) goto L_0x00f0
            boolean r0 = r6.f22279j
            if (r0 == 0) goto L_0x0018
            goto L_0x00f0
        L_0x0018:
            okhttp3.Route r0 = r6.f22271b
            okhttp3.Address r0 = r0.f22160a
            boolean r0 = r0.a(r7)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            okhttp3.HttpUrl r0 = r7.f21901i
            java.lang.String r0 = r0.f22010d
            okhttp3.Route r1 = r6.f22271b
            okhttp3.Address r1 = r1.f22160a
            okhttp3.HttpUrl r1 = r1.f21901i
            java.lang.String r1 = r1.f22010d
            boolean r0 = sk.j.a(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x0037
            return r1
        L_0x0037:
            okhttp3.internal.http2.Http2Connection r0 = r6.f22276g
            if (r0 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r8 == 0) goto L_0x00f0
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0045
            goto L_0x007e
        L_0x0045:
            java.util.Iterator r8 = r8.iterator()
        L_0x0049:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r8.next()
            okhttp3.Route r0 = (okhttp3.Route) r0
            java.net.Proxy r3 = r0.f22161b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            okhttp3.Route r3 = r6.f22271b
            java.net.Proxy r3 = r3.f22161b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            okhttp3.Route r3 = r6.f22271b
            java.net.InetSocketAddress r3 = r3.f22162c
            java.net.InetSocketAddress r0 = r0.f22162c
            boolean r0 = sk.j.a(r3, r0)
            if (r0 == 0) goto L_0x0079
            r0 = r1
            goto L_0x007a
        L_0x0079:
            r0 = r2
        L_0x007a:
            if (r0 == 0) goto L_0x0049
            r8 = r1
            goto L_0x007f
        L_0x007e:
            r8 = r2
        L_0x007f:
            if (r8 != 0) goto L_0x0083
            goto L_0x00f0
        L_0x0083:
            javax.net.ssl.HostnameVerifier r8 = r7.f21896d
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.f22612a
            if (r8 == r0) goto L_0x008a
            return r2
        L_0x008a:
            okhttp3.HttpUrl r8 = r7.f21901i
            byte[] r3 = okhttp3.internal.Util.f22171a
            okhttp3.Route r3 = r6.f22271b
            okhttp3.Address r3 = r3.f22160a
            okhttp3.HttpUrl r3 = r3.f21901i
            int r4 = r8.f22011e
            int r5 = r3.f22011e
            if (r4 == r5) goto L_0x009b
            goto L_0x00d6
        L_0x009b:
            java.lang.String r4 = r8.f22010d
            java.lang.String r3 = r3.f22010d
            boolean r3 = sk.j.a(r4, r3)
            if (r3 == 0) goto L_0x00a6
            goto L_0x00d4
        L_0x00a6:
            boolean r3 = r6.f22280k
            if (r3 != 0) goto L_0x00d6
            okhttp3.Handshake r3 = r6.f22274e
            if (r3 == 0) goto L_0x00d6
            java.util.List r3 = r3.a()
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x00d1
            java.lang.String r8 = r8.f22010d
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            sk.j.d(r3, r4)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            r0.getClass()
            boolean r8 = okhttp3.internal.tls.OkHostnameVerifier.c(r8, r3)
            if (r8 == 0) goto L_0x00d1
            r8 = r1
            goto L_0x00d2
        L_0x00d1:
            r8 = r2
        L_0x00d2:
            if (r8 == 0) goto L_0x00d6
        L_0x00d4:
            r8 = r1
            goto L_0x00d7
        L_0x00d6:
            r8 = r2
        L_0x00d7:
            if (r8 != 0) goto L_0x00da
            return r2
        L_0x00da:
            okhttp3.CertificatePinner r8 = r7.f21897e     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            sk.j.c(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            okhttp3.HttpUrl r7 = r7.f21901i     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            java.lang.String r7 = r7.f22010d     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            okhttp3.Handshake r0 = r6.f22274e     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            sk.j.c(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            java.util.List r0 = r0.a()     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            r8.a(r7, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f0 }
            return r1
        L_0x00f0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.h(okhttp3.Address, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = okhttp3.internal.Util.f22171a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f22272c
            sk.j.c(r2)
            java.net.Socket r3 = r9.f22273d
            sk.j.c(r3)
            ll.w r4 = r9.f22277h
            sk.j.c(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x007d
        L_0x002f:
            okhttp3.internal.http2.Http2Connection r2 = r9.f22276g
            r6 = 1
            if (r2 == 0) goto L_0x0051
            monitor-enter(r2)
            boolean r10 = r2.f22410n     // Catch:{ all -> 0x004e }
            if (r10 == 0) goto L_0x003b
            monitor-exit(r2)
            goto L_0x004d
        L_0x003b:
            long r3 = r2.f22419w     // Catch:{ all -> 0x004e }
            long r7 = r2.f22418v     // Catch:{ all -> 0x004e }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004b
            long r3 = r2.f22420x     // Catch:{ all -> 0x004e }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004b
            monitor-exit(r2)
            goto L_0x004d
        L_0x004b:
            monitor-exit(r2)
            r5 = r6
        L_0x004d:
            return r5
        L_0x004e:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0051:
            monitor-enter(r9)
            long r7 = r9.f22286q     // Catch:{ all -> 0x007a }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0079
            if (r10 == 0) goto L_0x0079
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x0072 }
            boolean r0 = r4.A()     // Catch:{ all -> 0x0072 }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r5 = r0
            goto L_0x0078
        L_0x0072:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
        L_0x0077:
            r5 = r6
        L_0x0078:
            return r5
        L_0x0079:
            return r6
        L_0x007a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.i(boolean):boolean");
    }

    public final ExchangeCodec j(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        Socket socket = this.f22273d;
        j.c(socket);
        w wVar = this.f22277h;
        j.c(wVar);
        v vVar = this.f22278i;
        j.c(vVar);
        Http2Connection http2Connection = this.f22276g;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.f22324g);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.f().g((long) realInterceptorChain.f22324g, timeUnit);
        vVar.f().g((long) realInterceptorChain.f22325h, timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, wVar, vVar);
    }

    public final synchronized void k() {
        this.f22279j = true;
    }

    public final void l(int i10) {
        String str;
        int i11;
        int i12;
        Socket socket = this.f22273d;
        j.c(socket);
        w wVar = this.f22277h;
        j.c(wVar);
        v vVar = this.f22278i;
        j.c(vVar);
        socket.setSoTimeout(0);
        TaskRunner taskRunner = TaskRunner.f22204i;
        Http2Connection.Builder builder = new Http2Connection.Builder(taskRunner);
        String str2 = this.f22271b.f22160a.f21901i.f22010d;
        j.f(str2, "peerName");
        builder.f22457c = socket;
        if (builder.f22455a) {
            str = Util.f22177g + ' ' + str2;
        } else {
            str = b0.r("MockWebServer ", str2);
        }
        j.f(str, "<set-?>");
        builder.f22458d = str;
        builder.f22459e = wVar;
        builder.f22460f = vVar;
        builder.f22461g = this;
        builder.f22463i = i10;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.f22276g = http2Connection;
        Http2Connection.I.getClass();
        Settings settings = Http2Connection.J;
        if ((settings.f22529a & 16) != 0) {
            i11 = settings.f22530b[4];
        } else {
            i11 = Integer.MAX_VALUE;
        }
        this.f22284o = i11;
        Http2Writer http2Writer = http2Connection.F;
        synchronized (http2Writer) {
            if (http2Writer.f22518e) {
                throw new IOException("closed");
            } else if (http2Writer.f22515b) {
                Logger logger = Http2Writer.f22513n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.h(">> CONNECTION " + Http2.f22400b.j(), new Object[0]));
                }
                http2Writer.f22514a.Y(Http2.f22400b);
                http2Writer.f22514a.flush();
            }
        }
        Http2Writer http2Writer2 = http2Connection.F;
        Settings settings2 = http2Connection.f22421y;
        synchronized (http2Writer2) {
            j.f(settings2, "settings");
            if (!http2Writer2.f22518e) {
                http2Writer2.i(0, Integer.bitCount(settings2.f22529a) * 6, 4, 0);
                for (int i13 = 0; i13 < 10; i13++) {
                    boolean z10 = true;
                    if (((1 << i13) & settings2.f22529a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        if (i13 == 4) {
                            i12 = 3;
                        } else if (i13 != 7) {
                            i12 = i13;
                        } else {
                            i12 = 4;
                        }
                        http2Writer2.f22514a.writeShort(i12);
                        http2Writer2.f22514a.writeInt(settings2.f22530b[i13]);
                    }
                }
                http2Writer2.f22514a.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a10 = http2Connection.f22421y.a();
        if (a10 != 65535) {
            http2Connection.F.x(0, (long) (a10 - 65535));
        }
        taskRunner.f().c(new TaskQueue$execute$1(http2Connection.f22407d, http2Connection.G), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder q10 = android.support.v4.media.a.q("Connection{");
        q10.append(this.f22271b.f22160a.f21901i.f22010d);
        q10.append(':');
        q10.append(this.f22271b.f22160a.f21901i.f22011e);
        q10.append(", proxy=");
        q10.append(this.f22271b.f22161b);
        q10.append(" hostAddress=");
        q10.append(this.f22271b.f22162c);
        q10.append(" cipherSuite=");
        Handshake handshake = this.f22274e;
        if (handshake == null || (obj = handshake.f21997b) == null) {
            obj = "none";
        }
        q10.append(obj);
        q10.append(" protocol=");
        q10.append(this.f22275f);
        q10.append('}');
        return q10.toString();
    }
}
