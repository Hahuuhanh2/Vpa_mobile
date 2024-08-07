package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import sk.j;

/* compiled from: ExchangeFinder.kt */
public final class ExchangeFinder {

    /* renamed from: a  reason: collision with root package name */
    public final RealConnectionPool f22238a;

    /* renamed from: b  reason: collision with root package name */
    public final Address f22239b;

    /* renamed from: c  reason: collision with root package name */
    public final RealCall f22240c;

    /* renamed from: d  reason: collision with root package name */
    public final EventListener f22241d;

    /* renamed from: e  reason: collision with root package name */
    public RouteSelector.Selection f22242e;

    /* renamed from: f  reason: collision with root package name */
    public RouteSelector f22243f;

    /* renamed from: g  reason: collision with root package name */
    public int f22244g;

    /* renamed from: h  reason: collision with root package name */
    public int f22245h;

    /* renamed from: i  reason: collision with root package name */
    public int f22246i;

    /* renamed from: j  reason: collision with root package name */
    public Route f22247j;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        j.f(realConnectionPool, "connectionPool");
        j.f(eventListener, "eventListener");
        this.f22238a = realConnectionPool;
        this.f22239b = address;
        this.f22240c = realCall;
        this.f22241d = eventListener;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: okhttp3.Route} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0349 A[SYNTHETIC] */
    public final okhttp3.internal.connection.RealConnection a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r1 = r15
        L_0x0001:
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            boolean r0 = r0.f22263w
            if (r0 != 0) goto L_0x0391
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            okhttp3.internal.connection.RealConnection r2 = r0.f22257q
            r3 = 0
            r0 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0056
            monitor-enter(r2)
            boolean r5 = r2.f22279j     // Catch:{ all -> 0x0053 }
            if (r5 != 0) goto L_0x0024
            okhttp3.Route r5 = r2.f22271b     // Catch:{ all -> 0x0053 }
            okhttp3.Address r5 = r5.f22160a     // Catch:{ all -> 0x0053 }
            okhttp3.HttpUrl r5 = r5.f21901i     // Catch:{ all -> 0x0053 }
            boolean r5 = r15.b(r5)     // Catch:{ all -> 0x0053 }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x002a
        L_0x0024:
            okhttp3.internal.connection.RealCall r5 = r1.f22240c     // Catch:{ all -> 0x0053 }
            java.net.Socket r5 = r5.k()     // Catch:{ all -> 0x0053 }
        L_0x002a:
            ek.i r6 = ek.i.f20112a     // Catch:{ all -> 0x0053 }
            monitor-exit(r2)
            okhttp3.internal.connection.RealCall r6 = r1.f22240c
            okhttp3.internal.connection.RealConnection r6 = r6.f22257q
            if (r6 == 0) goto L_0x0046
            if (r5 != 0) goto L_0x0036
            r0 = r4
        L_0x0036:
            if (r0 == 0) goto L_0x003a
            goto L_0x0318
        L_0x003a:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0046:
            if (r5 == 0) goto L_0x004b
            okhttp3.internal.Util.d(r5)
        L_0x004b:
            okhttp3.EventListener r5 = r1.f22241d
            okhttp3.internal.connection.RealCall r6 = r1.f22240c
            r5.l(r6, r2)
            goto L_0x0056
        L_0x0053:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0056:
            r1.f22244g = r0
            r1.f22245h = r0
            r1.f22246i = r0
            okhttp3.internal.connection.RealConnectionPool r2 = r1.f22238a
            okhttp3.Address r5 = r1.f22239b
            okhttp3.internal.connection.RealCall r6 = r1.f22240c
            boolean r2 = r2.a(r5, r6, r3, r0)
            if (r2 == 0) goto L_0x0078
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            okhttp3.internal.connection.RealConnection r2 = r0.f22257q
            sk.j.c(r2)
            okhttp3.EventListener r0 = r1.f22241d
            okhttp3.internal.connection.RealCall r3 = r1.f22240c
            r0.k(r3, r2)
            goto L_0x0318
        L_0x0078:
            okhttp3.Route r2 = r1.f22247j
            if (r2 == 0) goto L_0x007f
            r1.f22247j = r3
            goto L_0x00a3
        L_0x007f:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.f22242e
            if (r2 == 0) goto L_0x00ac
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x00ac
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.f22242e
            sk.j.c(r0)
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x00a6
            java.util.List<okhttp3.Route> r2 = r0.f22310a
            int r5 = r0.f22311b
            int r6 = r5 + 1
            r0.f22311b = r6
            java.lang.Object r0 = r2.get(r5)
            r2 = r0
            okhttp3.Route r2 = (okhttp3.Route) r2
        L_0x00a3:
            r5 = r3
            goto L_0x02be
        L_0x00a6:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00ac:
            okhttp3.internal.connection.RouteSelector r2 = r1.f22243f
            if (r2 != 0) goto L_0x00c1
            okhttp3.internal.connection.RouteSelector r2 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r5 = r1.f22239b
            okhttp3.internal.connection.RealCall r6 = r1.f22240c
            okhttp3.OkHttpClient r7 = r6.f22248a
            okhttp3.internal.connection.RouteDatabase r7 = r7.K
            okhttp3.EventListener r8 = r1.f22241d
            r2.<init>(r5, r7, r6, r8)
            r1.f22243f = r2
        L_0x00c1:
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x038b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00cc:
            int r6 = r2.f22307f
            java.util.List<? extends java.net.Proxy> r7 = r2.f22306e
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00d8
            r6 = r4
            goto L_0x00d9
        L_0x00d8:
            r6 = r0
        L_0x00d9:
            if (r6 == 0) goto L_0x0273
            int r6 = r2.f22307f
            java.util.List<? extends java.net.Proxy> r7 = r2.f22306e
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00e7
            r6 = r4
            goto L_0x00e8
        L_0x00e7:
            r6 = r0
        L_0x00e8:
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L_0x0252
            java.util.List<? extends java.net.Proxy> r6 = r2.f22306e
            int r8 = r2.f22307f
            int r9 = r8 + 1
            r2.f22307f = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.f22308g = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L_0x015f
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L_0x0112
            goto L_0x015f
        L_0x0112:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L_0x0144
            okhttp3.internal.connection.RouteSelector$Companion r10 = okhttp3.internal.connection.RouteSelector.f22301i
            java.lang.String r11 = "proxyAddress"
            sk.j.e(r9, r11)
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            r10.getClass()
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 != 0) goto L_0x0136
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
            sk.j.e(r10, r11)
            goto L_0x013f
        L_0x0136:
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            sk.j.e(r10, r11)
        L_0x013f:
            int r9 = r9.getPort()
            goto L_0x0167
        L_0x0144:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x015f:
            okhttp3.Address r9 = r2.f22302a
            okhttp3.HttpUrl r9 = r9.f21901i
            java.lang.String r10 = r9.f22010d
            int r9 = r9.f22011e
        L_0x0167:
            if (r4 > r9) goto L_0x016f
            r11 = 65536(0x10000, float:9.18355E-41)
            if (r9 >= r11) goto L_0x016f
            r11 = r4
            goto L_0x0170
        L_0x016f:
            r11 = r0
        L_0x0170:
            if (r11 == 0) goto L_0x0230
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L_0x0182
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L_0x01d8
        L_0x0182:
            byte[] r7 = okhttp3.internal.Util.f22171a
            java.lang.String r7 = "<this>"
            sk.j.f(r10, r7)
            yk.c r7 = okhttp3.internal.Util.f22176f
            r7.getClass()
            java.util.regex.Pattern r7 = r7.f23595a
            java.util.regex.Matcher r7 = r7.matcher(r10)
            boolean r7 = r7.matches()
            if (r7 == 0) goto L_0x01a3
            java.net.InetAddress r7 = java.net.InetAddress.getByName(r10)
            java.util.List r7 = j7.a.c0(r7)
            goto L_0x01bf
        L_0x01a3:
            okhttp3.EventListener r7 = r2.f22305d
            okhttp3.Call r11 = r2.f22304c
            r7.n(r11, r10)
            okhttp3.Address r7 = r2.f22302a
            okhttp3.Dns r7 = r7.f21893a
            java.util.List r7 = r7.a(r10)
            boolean r11 = r7.isEmpty()
            if (r11 != 0) goto L_0x0212
            okhttp3.EventListener r11 = r2.f22305d
            okhttp3.Call r12 = r2.f22304c
            r11.m(r12, r10, r7)
        L_0x01bf:
            java.util.Iterator r7 = r7.iterator()
        L_0x01c3:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01d8
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L_0x01c3
        L_0x01d8:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f22308g
            java.util.Iterator r7 = r7.iterator()
        L_0x01de:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x020a
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            okhttp3.Route r9 = new okhttp3.Route
            okhttp3.Address r10 = r2.f22302a
            r9.<init>(r10, r6, r8)
            okhttp3.internal.connection.RouteDatabase r8 = r2.f22303b
            monitor-enter(r8)
            java.util.LinkedHashSet r10 = r8.f22298a     // Catch:{ all -> 0x0207 }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x0207 }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x0203
            java.util.ArrayList r8 = r2.f22309h
            r8.add(r9)
            goto L_0x01de
        L_0x0203:
            r5.add(r9)
            goto L_0x01de
        L_0x0207:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x020a:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x00cc
            goto L_0x0273
        L_0x0212:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            okhttp3.Address r2 = r2.f22302a
            okhttp3.Dns r2 = r2.f21893a
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0230:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0252:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = android.support.v4.media.a.q(r7)
            okhttp3.Address r4 = r2.f22302a
            okhttp3.HttpUrl r4 = r4.f21901i
            java.lang.String r4 = r4.f22010d
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f22306e
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0273:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0283
            java.util.ArrayList r6 = r2.f22309h
            fk.l.I0(r6, r5)
            java.util.ArrayList r2 = r2.f22309h
            r2.clear()
        L_0x0283:
            okhttp3.internal.connection.RouteSelector$Selection r2 = new okhttp3.internal.connection.RouteSelector$Selection
            r2.<init>(r5)
            r1.f22242e = r2
            okhttp3.internal.connection.RealCall r6 = r1.f22240c
            boolean r6 = r6.f22263w
            if (r6 != 0) goto L_0x0383
            okhttp3.internal.connection.RealConnectionPool r6 = r1.f22238a
            okhttp3.Address r7 = r1.f22239b
            okhttp3.internal.connection.RealCall r8 = r1.f22240c
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x02ab
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            okhttp3.internal.connection.RealConnection r2 = r0.f22257q
            sk.j.c(r2)
            okhttp3.EventListener r0 = r1.f22241d
            okhttp3.internal.connection.RealCall r3 = r1.f22240c
            r0.k(r3, r2)
            goto L_0x0318
        L_0x02ab:
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x037d
            int r0 = r2.f22311b
            int r6 = r0 + 1
            r2.f22311b = r6
            java.lang.Object r0 = r5.get(r0)
            r2 = r0
            okhttp3.Route r2 = (okhttp3.Route) r2
        L_0x02be:
            okhttp3.internal.connection.RealConnection r14 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.RealConnectionPool r0 = r1.f22238a
            r14.<init>(r0, r2)
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            r0.f22265y = r14
            okhttp3.internal.connection.RealCall r12 = r1.f22240c     // Catch:{ all -> 0x0377 }
            okhttp3.EventListener r13 = r1.f22241d     // Catch:{ all -> 0x0377 }
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.c(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0377 }
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            r0.f22265y = r3
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            okhttp3.OkHttpClient r0 = r0.f22248a
            okhttp3.internal.connection.RouteDatabase r3 = r0.K
            okhttp3.Route r0 = r14.f22271b
            monitor-enter(r3)
            java.lang.String r6 = "route"
            sk.j.f(r0, r6)     // Catch:{ all -> 0x0374 }
            java.util.LinkedHashSet r6 = r3.f22298a     // Catch:{ all -> 0x0374 }
            r6.remove(r0)     // Catch:{ all -> 0x0374 }
            monitor-exit(r3)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.f22238a
            okhttp3.Address r3 = r1.f22239b
            okhttp3.internal.connection.RealCall r6 = r1.f22240c
            boolean r0 = r0.a(r3, r6, r5, r4)
            if (r0 == 0) goto L_0x031c
            okhttp3.internal.connection.RealCall r0 = r1.f22240c
            okhttp3.internal.connection.RealConnection r0 = r0.f22257q
            sk.j.c(r0)
            r1.f22247j = r2
            java.net.Socket r2 = r14.f22273d
            sk.j.c(r2)
            okhttp3.internal.Util.d(r2)
            okhttp3.EventListener r2 = r1.f22241d
            okhttp3.internal.connection.RealCall r3 = r1.f22240c
            r2.k(r3, r0)
            r2 = r0
        L_0x0318:
            r0 = r21
            r14 = r2
            goto L_0x0343
        L_0x031c:
            monitor-enter(r14)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.f22238a     // Catch:{ all -> 0x0371 }
            r0.getClass()     // Catch:{ all -> 0x0371 }
            byte[] r2 = okhttp3.internal.Util.f22171a     // Catch:{ all -> 0x0371 }
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r2 = r0.f22296e     // Catch:{ all -> 0x0371 }
            r2.add(r14)     // Catch:{ all -> 0x0371 }
            okhttp3.internal.concurrent.TaskQueue r2 = r0.f22294c     // Catch:{ all -> 0x0371 }
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r0 = r0.f22295d     // Catch:{ all -> 0x0371 }
            r5 = 0
            r2.c(r0, r5)     // Catch:{ all -> 0x0371 }
            okhttp3.internal.connection.RealCall r0 = r1.f22240c     // Catch:{ all -> 0x0371 }
            r0.b(r14)     // Catch:{ all -> 0x0371 }
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x0371 }
            monitor-exit(r14)
            okhttp3.EventListener r0 = r1.f22241d
            okhttp3.internal.connection.RealCall r2 = r1.f22240c
            r0.k(r2, r14)
            r0 = r21
        L_0x0343:
            boolean r2 = r14.i(r0)
            if (r2 == 0) goto L_0x034a
            return r14
        L_0x034a:
            r14.k()
            okhttp3.Route r2 = r1.f22247j
            if (r2 != 0) goto L_0x0001
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.f22242e
            if (r2 == 0) goto L_0x035a
            boolean r2 = r2.a()
            goto L_0x035b
        L_0x035a:
            r2 = r4
        L_0x035b:
            if (r2 != 0) goto L_0x0001
            okhttp3.internal.connection.RouteSelector r2 = r1.f22243f
            if (r2 == 0) goto L_0x0365
            boolean r4 = r2.a()
        L_0x0365:
            if (r4 == 0) goto L_0x0369
            goto L_0x0001
        L_0x0369:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0371:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0374:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0377:
            r0 = move-exception
            okhttp3.internal.connection.RealCall r2 = r1.f22240c
            r2.f22265y = r3
            throw r0
        L_0x037d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0383:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x038b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0391:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final boolean b(HttpUrl httpUrl) {
        j.f(httpUrl, "url");
        HttpUrl httpUrl2 = this.f22239b.f21901i;
        if (httpUrl.f22011e != httpUrl2.f22011e || !j.a(httpUrl.f22010d, httpUrl2.f22010d)) {
            return false;
        }
        return true;
    }

    public final void c(IOException iOException) {
        j.f(iOException, "e");
        this.f22247j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f22531a == ErrorCode.REFUSED_STREAM) {
            this.f22244g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f22245h++;
        } else {
            this.f22246i++;
        }
    }
}
