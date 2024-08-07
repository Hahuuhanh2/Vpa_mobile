package okhttp3;

import ea.c;
import fk.l;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import sk.j;

/* compiled from: OkHttpClient.kt */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion L = new Companion(0);
    public static final List<Protocol> M = Util.k(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<ConnectionSpec> N = Util.k(ConnectionSpec.f21953e, ConnectionSpec.f21954f);
    public final List<Protocol> A;
    public final HostnameVerifier B;
    public final CertificatePinner C;
    public final CertificateChainCleaner D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final long J;
    public final RouteDatabase K;

    /* renamed from: a  reason: collision with root package name */
    public final Dispatcher f22050a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectionPool f22051b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Interceptor> f22052c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Interceptor> f22053d;

    /* renamed from: e  reason: collision with root package name */
    public final EventListener.Factory f22054e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f22055f;

    /* renamed from: n  reason: collision with root package name */
    public final Authenticator f22056n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f22057o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f22058p;

    /* renamed from: q  reason: collision with root package name */
    public final CookieJar f22059q;

    /* renamed from: r  reason: collision with root package name */
    public final Cache f22060r;

    /* renamed from: s  reason: collision with root package name */
    public final Dns f22061s;

    /* renamed from: t  reason: collision with root package name */
    public final Proxy f22062t;

    /* renamed from: u  reason: collision with root package name */
    public final ProxySelector f22063u;

    /* renamed from: v  reason: collision with root package name */
    public final Authenticator f22064v;

    /* renamed from: w  reason: collision with root package name */
    public final SocketFactory f22065w;

    /* renamed from: x  reason: collision with root package name */
    public final SSLSocketFactory f22066x;

    /* renamed from: y  reason: collision with root package name */
    public final X509TrustManager f22067y;

    /* renamed from: z  reason: collision with root package name */
    public final List<ConnectionSpec> f22068z;

    /* compiled from: OkHttpClient.kt */
    public static final class Builder {
        public int A;
        public int B;
        public long C;
        public RouteDatabase D;

        /* renamed from: a  reason: collision with root package name */
        public Dispatcher f22069a = new Dispatcher();

        /* renamed from: b  reason: collision with root package name */
        public ConnectionPool f22070b = new ConnectionPool();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f22071c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f22072d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public EventListener.Factory f22073e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f22074f;

        /* renamed from: g  reason: collision with root package name */
        public Authenticator f22075g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f22076h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f22077i;

        /* renamed from: j  reason: collision with root package name */
        public CookieJar f22078j;

        /* renamed from: k  reason: collision with root package name */
        public Cache f22079k;

        /* renamed from: l  reason: collision with root package name */
        public Dns f22080l;

        /* renamed from: m  reason: collision with root package name */
        public Proxy f22081m;

        /* renamed from: n  reason: collision with root package name */
        public ProxySelector f22082n;

        /* renamed from: o  reason: collision with root package name */
        public Authenticator f22083o;

        /* renamed from: p  reason: collision with root package name */
        public SocketFactory f22084p;

        /* renamed from: q  reason: collision with root package name */
        public SSLSocketFactory f22085q;

        /* renamed from: r  reason: collision with root package name */
        public X509TrustManager f22086r;

        /* renamed from: s  reason: collision with root package name */
        public List<ConnectionSpec> f22087s;

        /* renamed from: t  reason: collision with root package name */
        public List<? extends Protocol> f22088t;

        /* renamed from: u  reason: collision with root package name */
        public HostnameVerifier f22089u;

        /* renamed from: v  reason: collision with root package name */
        public CertificatePinner f22090v;

        /* renamed from: w  reason: collision with root package name */
        public CertificateChainCleaner f22091w;

        /* renamed from: x  reason: collision with root package name */
        public int f22092x;

        /* renamed from: y  reason: collision with root package name */
        public int f22093y;

        /* renamed from: z  reason: collision with root package name */
        public int f22094z;

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f21988a;
            byte[] bArr = Util.f22171a;
            j.f(eventListener$Companion$NONE$1, "<this>");
            this.f22073e = new c(eventListener$Companion$NONE$1, 29);
            this.f22074f = true;
            Authenticator authenticator = Authenticator.f21904a;
            this.f22075g = authenticator;
            this.f22076h = true;
            this.f22077i = true;
            this.f22078j = CookieJar.f21977a;
            this.f22080l = Dns.f21986a;
            this.f22083o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            j.e(socketFactory, "getDefault()");
            this.f22084p = socketFactory;
            OkHttpClient.L.getClass();
            this.f22087s = OkHttpClient.N;
            this.f22088t = OkHttpClient.M;
            this.f22089u = OkHostnameVerifier.f22612a;
            this.f22090v = CertificatePinner.f21923d;
            this.f22093y = 10000;
            this.f22094z = 10000;
            this.A = 10000;
            this.C = 1024;
        }
    }

    /* compiled from: OkHttpClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OkHttpClient(okhttp3.OkHttpClient.Builder r6) {
        /*
            r5 = this;
            r5.<init>()
            okhttp3.Dispatcher r0 = r6.f22069a
            r5.f22050a = r0
            okhttp3.ConnectionPool r0 = r6.f22070b
            r5.f22051b = r0
            java.util.ArrayList r0 = r6.f22071c
            java.util.List r0 = okhttp3.internal.Util.x(r0)
            r5.f22052c = r0
            java.util.ArrayList r0 = r6.f22072d
            java.util.List r0 = okhttp3.internal.Util.x(r0)
            r5.f22053d = r0
            okhttp3.EventListener$Factory r0 = r6.f22073e
            r5.f22054e = r0
            boolean r0 = r6.f22074f
            r5.f22055f = r0
            okhttp3.Authenticator r0 = r6.f22075g
            r5.f22056n = r0
            boolean r0 = r6.f22076h
            r5.f22057o = r0
            boolean r0 = r6.f22077i
            r5.f22058p = r0
            okhttp3.CookieJar r0 = r6.f22078j
            r5.f22059q = r0
            okhttp3.Cache r0 = r6.f22079k
            r5.f22060r = r0
            okhttp3.Dns r0 = r6.f22080l
            r5.f22061s = r0
            java.net.Proxy r0 = r6.f22081m
            r5.f22062t = r0
            if (r0 == 0) goto L_0x0044
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.f22592a
            goto L_0x0050
        L_0x0044:
            java.net.ProxySelector r0 = r6.f22082n
            if (r0 != 0) goto L_0x004c
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x004c:
            if (r0 != 0) goto L_0x0050
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.f22592a
        L_0x0050:
            r5.f22063u = r0
            okhttp3.Authenticator r0 = r6.f22083o
            r5.f22064v = r0
            javax.net.SocketFactory r0 = r6.f22084p
            r5.f22065w = r0
            java.util.List<okhttp3.ConnectionSpec> r0 = r6.f22087s
            r5.f22068z = r0
            java.util.List<? extends okhttp3.Protocol> r1 = r6.f22088t
            r5.A = r1
            javax.net.ssl.HostnameVerifier r1 = r6.f22089u
            r5.B = r1
            int r1 = r6.f22092x
            r5.E = r1
            int r1 = r6.f22093y
            r5.F = r1
            int r1 = r6.f22094z
            r5.G = r1
            int r1 = r6.A
            r5.H = r1
            int r1 = r6.B
            r5.I = r1
            long r1 = r6.C
            r5.J = r1
            okhttp3.internal.connection.RouteDatabase r1 = r6.D
            if (r1 != 0) goto L_0x0087
            okhttp3.internal.connection.RouteDatabase r1 = new okhttp3.internal.connection.RouteDatabase
            r1.<init>()
        L_0x0087:
            r5.K = r1
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0096
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0096
            goto L_0x00ac
        L_0x0096:
            java.util.Iterator r0 = r0.iterator()
        L_0x009a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r0.next()
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.f21955a
            if (r1 == 0) goto L_0x009a
            r0 = r2
            goto L_0x00ad
        L_0x00ac:
            r0 = r3
        L_0x00ad:
            r1 = 0
            if (r0 == 0) goto L_0x00bb
            r5.f22066x = r1
            r5.D = r1
            r5.f22067y = r1
            okhttp3.CertificatePinner r6 = okhttp3.CertificatePinner.f21923d
            r5.C = r6
            goto L_0x0122
        L_0x00bb:
            javax.net.ssl.SSLSocketFactory r0 = r6.f22085q
            if (r0 == 0) goto L_0x00e5
            r5.f22066x = r0
            okhttp3.internal.tls.CertificateChainCleaner r0 = r6.f22091w
            sk.j.c(r0)
            r5.D = r0
            javax.net.ssl.X509TrustManager r4 = r6.f22086r
            sk.j.c(r4)
            r5.f22067y = r4
            okhttp3.CertificatePinner r6 = r6.f22090v
            okhttp3.internal.tls.CertificateChainCleaner r4 = r6.f21925b
            boolean r4 = sk.j.a(r4, r0)
            if (r4 == 0) goto L_0x00da
            goto L_0x00e2
        L_0x00da:
            okhttp3.CertificatePinner r4 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$Pin> r6 = r6.f21924a
            r4.<init>(r6, r0)
            r6 = r4
        L_0x00e2:
            r5.C = r6
            goto L_0x0122
        L_0x00e5:
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.f22562a
            r0.getClass()
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.f22563b
            javax.net.ssl.X509TrustManager r0 = r0.n()
            r5.f22067y = r0
            okhttp3.internal.platform.Platform r4 = okhttp3.internal.platform.Platform.f22563b
            sk.j.c(r0)
            javax.net.ssl.SSLSocketFactory r4 = r4.m(r0)
            r5.f22066x = r4
            okhttp3.internal.tls.CertificateChainCleaner$Companion r4 = okhttp3.internal.tls.CertificateChainCleaner.f22611a
            r4.getClass()
            okhttp3.internal.platform.Platform r4 = okhttp3.internal.platform.Platform.f22563b
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.b(r0)
            r5.D = r0
            okhttp3.CertificatePinner r6 = r6.f22090v
            sk.j.c(r0)
            okhttp3.internal.tls.CertificateChainCleaner r4 = r6.f21925b
            boolean r4 = sk.j.a(r4, r0)
            if (r4 == 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            okhttp3.CertificatePinner r4 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$Pin> r6 = r6.f21924a
            r4.<init>(r6, r0)
            r6 = r4
        L_0x0120:
            r5.C = r6
        L_0x0122:
            java.util.List<okhttp3.Interceptor> r6 = r5.f22052c
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            sk.j.d(r6, r0)
            boolean r6 = r6.contains(r1)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01fa
            java.util.List<okhttp3.Interceptor> r6 = r5.f22053d
            sk.j.d(r6, r0)
            boolean r6 = r6.contains(r1)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01e1
            java.util.List<okhttp3.ConnectionSpec> r6 = r5.f22068z
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0149
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0149
            goto L_0x015f
        L_0x0149:
            java.util.Iterator r6 = r6.iterator()
        L_0x014d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r6.next()
            okhttp3.ConnectionSpec r0 = (okhttp3.ConnectionSpec) r0
            boolean r0 = r0.f21955a
            if (r0 == 0) goto L_0x014d
            r6 = r2
            goto L_0x0160
        L_0x015f:
            r6 = r3
        L_0x0160:
            if (r6 == 0) goto L_0x01b0
            javax.net.ssl.SSLSocketFactory r6 = r5.f22066x
            if (r6 != 0) goto L_0x0168
            r6 = r3
            goto L_0x0169
        L_0x0168:
            r6 = r2
        L_0x0169:
            java.lang.String r0 = "Check failed."
            if (r6 == 0) goto L_0x01a6
            okhttp3.internal.tls.CertificateChainCleaner r6 = r5.D
            if (r6 != 0) goto L_0x0173
            r6 = r3
            goto L_0x0174
        L_0x0173:
            r6 = r2
        L_0x0174:
            if (r6 == 0) goto L_0x019c
            javax.net.ssl.X509TrustManager r6 = r5.f22067y
            if (r6 != 0) goto L_0x017b
            r2 = r3
        L_0x017b:
            if (r2 == 0) goto L_0x0192
            okhttp3.CertificatePinner r6 = r5.C
            okhttp3.CertificatePinner r1 = okhttp3.CertificatePinner.f21923d
            boolean r6 = sk.j.a(r6, r1)
            if (r6 == 0) goto L_0x0188
            goto L_0x01bc
        L_0x0188:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0192:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x019c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01a6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01b0:
            javax.net.ssl.SSLSocketFactory r6 = r5.f22066x
            if (r6 == 0) goto L_0x01d5
            okhttp3.internal.tls.CertificateChainCleaner r6 = r5.D
            if (r6 == 0) goto L_0x01c9
            javax.net.ssl.X509TrustManager r6 = r5.f22067y
            if (r6 == 0) goto L_0x01bd
        L_0x01bc:
            return
        L_0x01bd:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01c9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01d5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01e1:
            java.lang.String r6 = "Null network interceptor: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.q(r6)
            java.util.List<okhttp3.Interceptor> r0 = r5.f22053d
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x01fa:
            java.lang.String r6 = "Null interceptor: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.q(r6)
            java.util.List<okhttp3.Interceptor> r0 = r5.f22052c
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.<init>(okhttp3.OkHttpClient$Builder):void");
    }

    public final RealCall a(Request request) {
        j.f(request, "request");
        return new RealCall(this, request, false);
    }

    public final Builder b() {
        Builder builder = new Builder();
        builder.f22069a = this.f22050a;
        builder.f22070b = this.f22051b;
        l.I0(this.f22052c, builder.f22071c);
        l.I0(this.f22053d, builder.f22072d);
        builder.f22073e = this.f22054e;
        builder.f22074f = this.f22055f;
        builder.f22075g = this.f22056n;
        builder.f22076h = this.f22057o;
        builder.f22077i = this.f22058p;
        builder.f22078j = this.f22059q;
        builder.f22079k = this.f22060r;
        builder.f22080l = this.f22061s;
        builder.f22081m = this.f22062t;
        builder.f22082n = this.f22063u;
        builder.f22083o = this.f22064v;
        builder.f22084p = this.f22065w;
        builder.f22085q = this.f22066x;
        builder.f22086r = this.f22067y;
        builder.f22087s = this.f22068z;
        builder.f22088t = this.A;
        builder.f22089u = this.B;
        builder.f22090v = this.C;
        builder.f22091w = this.D;
        builder.f22092x = this.E;
        builder.f22093y = this.F;
        builder.f22094z = this.G;
        builder.A = this.H;
        builder.B = this.I;
        builder.C = this.J;
        builder.D = this.K;
        return builder;
    }

    public final Object clone() {
        return super.clone();
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
