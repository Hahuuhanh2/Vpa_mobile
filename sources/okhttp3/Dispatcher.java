package okhttp3;

import ek.i;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.internal.connection.RealCall;
import sk.j;

/* compiled from: Dispatcher.kt */
public final class Dispatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f21980a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f21981b = 5;

    /* renamed from: c  reason: collision with root package name */
    public ThreadPoolExecutor f21982c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<RealCall.AsyncCall> f21983d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<RealCall.AsyncCall> f21984e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<RealCall> f21985f = new ArrayDeque<>();

    public final void a(RealCall.AsyncCall asyncCall) {
        j.f(asyncCall, "call");
        asyncCall.f22267b.decrementAndGet();
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.f21984e;
        synchronized (this) {
            if (arrayDeque.remove(asyncCall)) {
                i iVar = i.f20112a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void b() {
        /*
            r14 = this;
            byte[] r0 = okhttp3.internal.Util.f22171a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r14.f21983d     // Catch:{ all -> 0x00e5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            sk.j.e(r1, r2)     // Catch:{ all -> 0x00e5 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00e5 }
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2     // Catch:{ all -> 0x00e5 }
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r14.f21984e     // Catch:{ all -> 0x00e5 }
            int r3 = r3.size()     // Catch:{ all -> 0x00e5 }
            int r4 = r14.f21980a     // Catch:{ all -> 0x00e5 }
            if (r3 >= r4) goto L_0x0044
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f22267b     // Catch:{ all -> 0x00e5 }
            int r3 = r3.get()     // Catch:{ all -> 0x00e5 }
            int r4 = r14.f21981b     // Catch:{ all -> 0x00e5 }
            if (r3 >= r4) goto L_0x0013
            r1.remove()     // Catch:{ all -> 0x00e5 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f22267b     // Catch:{ all -> 0x00e5 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00e5 }
            r0.add(r2)     // Catch:{ all -> 0x00e5 }
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r3 = r14.f21984e     // Catch:{ all -> 0x00e5 }
            r3.add(r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x0013
        L_0x0044:
            monitor-enter(r14)     // Catch:{ all -> 0x00e5 }
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r14.f21984e     // Catch:{ all -> 0x00e2 }
            int r1 = r1.size()     // Catch:{ all -> 0x00e2 }
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r2 = r14.f21985f     // Catch:{ all -> 0x00e2 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e2 }
            int r1 = r1 + r2
            monitor-exit(r14)     // Catch:{ all -> 0x00e5 }
            r2 = 0
            ek.i r1 = ek.i.f20112a     // Catch:{ all -> 0x00e5 }
            monitor-exit(r14)
            int r1 = r0.size()
            r3 = r2
        L_0x005c:
            if (r3 >= r1) goto L_0x00e1
            java.lang.Object r4 = r0.get(r3)
            okhttp3.internal.connection.RealCall$AsyncCall r4 = (okhttp3.internal.connection.RealCall.AsyncCall) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f21982c     // Catch:{ all -> 0x00de }
            if (r5 != 0) goto L_0x009b
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00de }
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00de }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00de }
            r12.<init>()     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r6.<init>()     // Catch:{ all -> 0x00de }
            java.lang.String r13 = okhttp3.internal.Util.f22177g     // Catch:{ all -> 0x00de }
            r6.append(r13)     // Catch:{ all -> 0x00de }
            java.lang.String r13 = " Dispatcher"
            r6.append(r13)     // Catch:{ all -> 0x00de }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00de }
            java.lang.String r13 = "name"
            sk.j.f(r6, r13)     // Catch:{ all -> 0x00de }
            kl.a r13 = new kl.a     // Catch:{ all -> 0x00de }
            r13.<init>(r6, r2)     // Catch:{ all -> 0x00de }
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x00de }
            r14.f21982c = r5     // Catch:{ all -> 0x00de }
        L_0x009b:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f21982c     // Catch:{ all -> 0x00de }
            sk.j.c(r5)     // Catch:{ all -> 0x00de }
            monitor-exit(r14)
            r4.getClass()
            okhttp3.internal.connection.RealCall r6 = r4.f22268c
            okhttp3.OkHttpClient r6 = r6.f22248a
            okhttp3.Dispatcher r6 = r6.f22050a
            byte[] r6 = okhttp3.internal.Util.f22171a
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x00b0 }
            goto L_0x00d0
        L_0x00b0:
            r5 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00d3 }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x00d3 }
            r6.initCause(r5)     // Catch:{ all -> 0x00d3 }
            okhttp3.internal.connection.RealCall r5 = r4.f22268c     // Catch:{ all -> 0x00d3 }
            r5.j(r6)     // Catch:{ all -> 0x00d3 }
            okhttp3.Callback r5 = r4.f22266a     // Catch:{ all -> 0x00d3 }
            okhttp3.internal.connection.RealCall r7 = r4.f22268c     // Catch:{ all -> 0x00d3 }
            r5.f(r7, r6)     // Catch:{ all -> 0x00d3 }
            okhttp3.internal.connection.RealCall r5 = r4.f22268c
            okhttp3.OkHttpClient r5 = r5.f22248a
            okhttp3.Dispatcher r5 = r5.f22050a
            r5.a(r4)
        L_0x00d0:
            int r3 = r3 + 1
            goto L_0x005c
        L_0x00d3:
            r0 = move-exception
            okhttp3.internal.connection.RealCall r1 = r4.f22268c
            okhttp3.OkHttpClient r1 = r1.f22248a
            okhttp3.Dispatcher r1 = r1.f22050a
            r1.a(r4)
            throw r0
        L_0x00de:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00e1:
            return
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Dispatcher.b():void");
    }
}
