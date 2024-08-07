package okhttp3.internal.connection;

import android.support.v4.media.a;
import ek.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import sk.j;

/* compiled from: RealCall.kt */
public final class RealCall implements Call {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f22248a;

    /* renamed from: b  reason: collision with root package name */
    public final Request f22249b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22250c;

    /* renamed from: d  reason: collision with root package name */
    public final RealConnectionPool f22251d;

    /* renamed from: e  reason: collision with root package name */
    public final EventListener f22252e;

    /* renamed from: f  reason: collision with root package name */
    public final RealCall$timeout$1 f22253f;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicBoolean f22254n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    public Object f22255o;

    /* renamed from: p  reason: collision with root package name */
    public ExchangeFinder f22256p;

    /* renamed from: q  reason: collision with root package name */
    public RealConnection f22257q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f22258r;

    /* renamed from: s  reason: collision with root package name */
    public Exchange f22259s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f22260t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f22261u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f22262v = true;

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f22263w;

    /* renamed from: x  reason: collision with root package name */
    public volatile Exchange f22264x;

    /* renamed from: y  reason: collision with root package name */
    public volatile RealConnection f22265y;

    /* compiled from: RealCall.kt */
    public final class AsyncCall implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Callback f22266a;

        /* renamed from: b  reason: collision with root package name */
        public volatile AtomicInteger f22267b = new AtomicInteger(0);

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ RealCall f22268c;

        public AsyncCall(RealCall realCall, Callback callback) {
            j.f(callback, "responseCallback");
            this.f22268c = realCall;
            this.f22266a = callback;
        }

        public final void run() {
            HttpUrl.Builder builder;
            StringBuilder q10 = a.q("OkHttp ");
            HttpUrl httpUrl = this.f22268c.f22249b.f22104a;
            httpUrl.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.c(httpUrl, "/...");
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            j.c(builder);
            HttpUrl.Companion companion = HttpUrl.f22005k;
            builder.f22019b = HttpUrl.Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
            builder.f22020c = HttpUrl.Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
            q10.append(builder.a().f22015i);
            String sb2 = q10.toString();
            RealCall realCall = this.f22268c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(sb2);
            boolean z10 = false;
            try {
                realCall.f22253f.h();
                try {
                    z10 = true;
                    this.f22266a.c(realCall, realCall.f());
                } catch (IOException e10) {
                    if (z10) {
                        Platform.f22562a.getClass();
                        Platform.f22563b.getClass();
                        Platform.i(4, "Callback failure for " + RealCall.a(realCall), e10);
                    } else {
                        this.f22266a.f(realCall, e10);
                    }
                } catch (Throwable th2) {
                    realCall.f22248a.f22050a.a(this);
                    throw th2;
                }
                realCall.f22248a.f22050a.a(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f22269a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            j.f(realCall, "referent");
            this.f22269a = obj;
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        j.f(okHttpClient, "client");
        j.f(request, "originalRequest");
        this.f22248a = okHttpClient;
        this.f22249b = request;
        this.f22250c = z10;
        this.f22251d = okHttpClient.f22051b.f21952a;
        this.f22252e = okHttpClient.f22054e.b(this);
        RealCall$timeout$1 realCall$timeout$1 = new RealCall$timeout$1(this);
        realCall$timeout$1.g((long) okHttpClient.E, TimeUnit.MILLISECONDS);
        this.f22253f = realCall$timeout$1;
    }

    public static final String a(RealCall realCall) {
        String str;
        String str2;
        HttpUrl.Builder builder;
        RealCall realCall2 = realCall;
        StringBuilder sb2 = new StringBuilder();
        if (realCall2.f22263w) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (realCall2.f22250c) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        HttpUrl httpUrl = realCall2.f22249b.f22104a;
        httpUrl.getClass();
        try {
            builder = new HttpUrl.Builder();
            builder.c(httpUrl, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        j.c(builder);
        HttpUrl.Companion companion = HttpUrl.f22005k;
        builder.f22019b = HttpUrl.Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        builder.f22020c = HttpUrl.Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        sb2.append(builder.a().f22015i);
        return sb2.toString();
    }

    public final void b(RealConnection realConnection) {
        boolean z10;
        byte[] bArr = Util.f22171a;
        if (this.f22257q == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f22257q = realConnection;
            realConnection.f22285p.add(new CallReference(this, this.f22255o));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E c(E e10) {
        E e11;
        Socket k10;
        boolean z10;
        byte[] bArr = Util.f22171a;
        RealConnection realConnection = this.f22257q;
        if (realConnection != null) {
            synchronized (realConnection) {
                k10 = k();
            }
            if (this.f22257q == null) {
                if (k10 != null) {
                    Util.d(k10);
                }
                this.f22252e.l(this, realConnection);
            } else {
                if (k10 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f22258r && this.f22253f.i()) {
            e11 = new InterruptedIOException("timeout");
            if (e10 != null) {
                e11.initCause(e10);
            }
        } else {
            e11 = e10;
        }
        if (e10 != null) {
            EventListener eventListener = this.f22252e;
            j.c(e11);
            eventListener.e(this, e11);
        } else {
            this.f22252e.d(this);
        }
        return e11;
    }

    public final void cancel() {
        Socket socket;
        if (!this.f22263w) {
            this.f22263w = true;
            Exchange exchange = this.f22264x;
            if (exchange != null) {
                exchange.f22223d.cancel();
            }
            RealConnection realConnection = this.f22265y;
            if (!(realConnection == null || (socket = realConnection.f22272c) == null)) {
                Util.d(socket);
            }
            this.f22252e.g(this);
        }
    }

    public final Object clone() {
        return new RealCall(this.f22248a, this.f22249b, this.f22250c);
    }

    public final Response d() {
        if (this.f22254n.compareAndSet(false, true)) {
            this.f22253f.h();
            Platform.f22562a.getClass();
            this.f22255o = Platform.f22563b.g();
            this.f22252e.f(this);
            try {
                Dispatcher dispatcher = this.f22248a.f22050a;
                synchronized (dispatcher) {
                    dispatcher.f21985f.add(this);
                }
                Response f10 = f();
                Dispatcher dispatcher2 = this.f22248a.f22050a;
                dispatcher2.getClass();
                ArrayDeque<RealCall> arrayDeque = dispatcher2.f21985f;
                synchronized (dispatcher2) {
                    if (arrayDeque.remove(this)) {
                        i iVar = i.f20112a;
                    } else {
                        throw new AssertionError("Call wasn't in-flight!");
                    }
                }
                dispatcher2.b();
                return f10;
            } catch (Throwable th2) {
                Dispatcher dispatcher3 = this.f22248a.f22050a;
                dispatcher3.getClass();
                ArrayDeque<RealCall> arrayDeque2 = dispatcher3.f21985f;
                synchronized (dispatcher3) {
                    if (arrayDeque2.remove(this)) {
                        i iVar2 = i.f20112a;
                        dispatcher3.b();
                        throw th2;
                    }
                    throw new AssertionError("Call wasn't in-flight!");
                }
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void e(boolean z10) {
        Exchange exchange;
        synchronized (this) {
            if (this.f22262v) {
                i iVar = i.f20112a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (exchange = this.f22264x) != null) {
            exchange.f22223d.cancel();
            exchange.f22220a.g(exchange, true, true, (IOException) null);
        }
        this.f22259s = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response f() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.f22248a
            java.util.List<okhttp3.Interceptor> r0 = r0.f22052c
            fk.l.I0(r0, r2)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.f22248a
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.f22248a
            okhttp3.CookieJar r1 = r1.f22059q
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.f22248a
            okhttp3.Cache r1 = r1.f22060r
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.f22215a
            r2.add(r0)
            boolean r0 = r11.f22250c
            if (r0 != 0) goto L_0x003e
            okhttp3.OkHttpClient r0 = r11.f22248a
            java.util.List<okhttp3.Interceptor> r0 = r0.f22053d
            fk.l.I0(r0, r2)
        L_0x003e:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.f22250c
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.f22249b
            okhttp3.OkHttpClient r0 = r11.f22248a
            int r6 = r0.F
            int r7 = r0.G
            int r8 = r0.H
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.f22249b     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            okhttp3.Response r2 = r9.c(r2)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            boolean r3 = r11.f22263w     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            if (r3 != 0) goto L_0x006b
            r11.j(r1)
            return r2
        L_0x006b:
            okhttp3.internal.Util.c(r2)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            throw r2     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            goto L_0x0088
        L_0x0078:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.j(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            sk.j.d(r0, r3)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x0088:
            if (r0 != 0) goto L_0x008d
            r11.j(r1)
        L_0x008d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.f():okhttp3.Response");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0022 A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0026 A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0018 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E g(okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            sk.j.f(r3, r0)
            okhttp3.internal.connection.Exchange r0 = r2.f22264x
            boolean r3 = sk.j.a(r3, r0)
            if (r3 != 0) goto L_0x000e
            return r6
        L_0x000e:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L_0x001a
            boolean r1 = r2.f22260t     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0020
            goto L_0x001a
        L_0x0018:
            r3 = move-exception
            goto L_0x0061
        L_0x001a:
            if (r5 == 0) goto L_0x0041
            boolean r1 = r2.f22261u     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0041
        L_0x0020:
            if (r4 == 0) goto L_0x0024
            r2.f22260t = r0     // Catch:{ all -> 0x0018 }
        L_0x0024:
            if (r5 == 0) goto L_0x0028
            r2.f22261u = r0     // Catch:{ all -> 0x0018 }
        L_0x0028:
            boolean r4 = r2.f22260t     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x0032
            boolean r5 = r2.f22261u     // Catch:{ all -> 0x0018 }
            if (r5 != 0) goto L_0x0032
            r5 = r3
            goto L_0x0033
        L_0x0032:
            r5 = r0
        L_0x0033:
            if (r4 != 0) goto L_0x003e
            boolean r4 = r2.f22261u     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x003e
            boolean r4 = r2.f22262v     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x003e
            r0 = r3
        L_0x003e:
            r4 = r0
            r0 = r5
            goto L_0x0042
        L_0x0041:
            r4 = r0
        L_0x0042:
            ek.i r5 = ek.i.f20112a     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0059
            r5 = 0
            r2.f22264x = r5
            okhttp3.internal.connection.RealConnection r5 = r2.f22257q
            if (r5 == 0) goto L_0x0059
            monitor-enter(r5)
            int r0 = r5.f22282m     // Catch:{ all -> 0x0056 }
            int r0 = r0 + r3
            r5.f22282m = r0     // Catch:{ all -> 0x0056 }
            monitor-exit(r5)
            goto L_0x0059
        L_0x0056:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L_0x0059:
            if (r4 == 0) goto L_0x0060
            java.io.IOException r3 = r2.c(r6)
            return r3
        L_0x0060:
            return r6
        L_0x0061:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.g(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final boolean h() {
        return this.f22263w;
    }

    public final Request i() {
        return this.f22249b;
    }

    public final IOException j(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f22262v) {
                this.f22262v = false;
                if (!this.f22260t && !this.f22261u) {
                    z10 = true;
                }
            }
            i iVar = i.f20112a;
        }
        if (z10) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket k() {
        boolean z10;
        RealConnection realConnection = this.f22257q;
        j.c(realConnection);
        byte[] bArr = Util.f22171a;
        ArrayList arrayList = realConnection.f22285p;
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (j.a(((Reference) it.next()).get(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.remove(i10);
            this.f22257q = null;
            if (arrayList.isEmpty()) {
                realConnection.f22286q = System.nanoTime();
                RealConnectionPool realConnectionPool = this.f22251d;
                realConnectionPool.getClass();
                byte[] bArr2 = Util.f22171a;
                if (realConnection.f22279j || realConnectionPool.f22292a == 0) {
                    realConnection.f22279j = true;
                    realConnectionPool.f22296e.remove(realConnection);
                    if (realConnectionPool.f22296e.isEmpty()) {
                        realConnectionPool.f22294c.a();
                    }
                    z11 = true;
                } else {
                    realConnectionPool.f22294c.c(realConnectionPool.f22295d, 0);
                }
                if (z11) {
                    Socket socket = realConnection.f22273d;
                    j.c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void l() {
        if (!this.f22258r) {
            this.f22258r = true;
            this.f22253f.i();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void v(Callback callback) {
        AsyncCall asyncCall;
        j.f(callback, "responseCallback");
        if (this.f22254n.compareAndSet(false, true)) {
            Platform.f22562a.getClass();
            this.f22255o = Platform.f22563b.g();
            this.f22252e.f(this);
            Dispatcher dispatcher = this.f22248a.f22050a;
            AsyncCall asyncCall2 = new AsyncCall(this, callback);
            dispatcher.getClass();
            synchronized (dispatcher) {
                dispatcher.f21983d.add(asyncCall2);
                RealCall realCall = asyncCall2.f22268c;
                if (!realCall.f22250c) {
                    String str = realCall.f22249b.f22104a.f22010d;
                    Iterator<AsyncCall> it = dispatcher.f21984e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<AsyncCall> it2 = dispatcher.f21983d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    asyncCall = null;
                                    break;
                                }
                                asyncCall = it2.next();
                                if (j.a(asyncCall.f22268c.f22249b.f22104a.f22010d, str)) {
                                    break;
                                }
                            }
                        } else {
                            asyncCall = it.next();
                            if (j.a(asyncCall.f22268c.f22249b.f22104a.f22010d, str)) {
                                break;
                            }
                        }
                    }
                    if (asyncCall != null) {
                        asyncCall2.f22267b = asyncCall.f22267b;
                    }
                }
                i iVar = i.f20112a;
            }
            dispatcher.b();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }
}
