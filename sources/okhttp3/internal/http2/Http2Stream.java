package okhttp3.internal.http2;

import android.support.v4.media.a;
import ek.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import ll.a0;
import ll.c;
import ll.c0;
import ll.d0;
import ll.f;
import okhttp3.Headers;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: Http2Stream.kt */
public final class Http2Stream {

    /* renamed from: a  reason: collision with root package name */
    public final int f22488a;

    /* renamed from: b  reason: collision with root package name */
    public final Http2Connection f22489b;

    /* renamed from: c  reason: collision with root package name */
    public long f22490c;

    /* renamed from: d  reason: collision with root package name */
    public long f22491d;

    /* renamed from: e  reason: collision with root package name */
    public long f22492e;

    /* renamed from: f  reason: collision with root package name */
    public long f22493f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<Headers> f22494g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22495h;

    /* renamed from: i  reason: collision with root package name */
    public final FramingSource f22496i;

    /* renamed from: j  reason: collision with root package name */
    public final FramingSink f22497j;

    /* renamed from: k  reason: collision with root package name */
    public final StreamTimeout f22498k = new StreamTimeout();

    /* renamed from: l  reason: collision with root package name */
    public final StreamTimeout f22499l = new StreamTimeout();

    /* renamed from: m  reason: collision with root package name */
    public ErrorCode f22500m;

    /* renamed from: n  reason: collision with root package name */
    public IOException f22501n;

    /* compiled from: Http2Stream.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class FramingSink implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22502a;

        /* renamed from: b  reason: collision with root package name */
        public final f f22503b = new f();

        /* renamed from: c  reason: collision with root package name */
        public boolean f22504c;

        public FramingSink(boolean z10) {
            this.f22502a = z10;
        }

        public final void Q(f fVar, long j10) {
            j.f(fVar, "source");
            byte[] bArr = Util.f22171a;
            this.f22503b.Q(fVar, j10);
            while (this.f22503b.f20878b >= 16384) {
                d(false);
            }
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void close() {
            /*
                r14 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                byte[] r1 = okhttp3.internal.Util.f22171a
                monitor-enter(r0)
                boolean r1 = r14.f22504c     // Catch:{ all -> 0x0062 }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                monitor-enter(r0)     // Catch:{ all -> 0x0062 }
                okhttp3.internal.http2.ErrorCode r1 = r0.f22500m     // Catch:{ all -> 0x005f }
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0015
                r1 = r3
                goto L_0x0016
            L_0x0015:
                r1 = r2
            L_0x0016:
                ek.i r4 = ek.i.f20112a     // Catch:{ all -> 0x0062 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r4 = r0.f22497j
                boolean r4 = r4.f22502a
                if (r4 != 0) goto L_0x0047
                ll.f r4 = r14.f22503b
                long r4 = r4.f20878b
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                ll.f r0 = r14.f22503b
                long r0 = r0.f20878b
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.d(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                okhttp3.internal.http2.Http2Connection r8 = r0.f22489b
                int r9 = r0.f22488a
                r10 = 1
                r11 = 0
                r12 = 0
                r8.x(r9, r10, r11, r12)
            L_0x0047:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r14.f22504c = r3     // Catch:{ all -> 0x005c }
                ek.i r1 = ek.i.f20112a     // Catch:{ all -> 0x005c }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.f22489b
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.a()
                return
            L_0x005c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                throw r1     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void d(boolean r12) {
            /*
                r11 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.f22499l     // Catch:{ all -> 0x007b }
                r1.h()     // Catch:{ all -> 0x007b }
            L_0x0008:
                long r1 = r0.f22492e     // Catch:{ all -> 0x0025 }
                long r3 = r0.f22493f     // Catch:{ all -> 0x0025 }
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L_0x0027
                boolean r1 = r11.f22502a     // Catch:{ all -> 0x0025 }
                if (r1 != 0) goto L_0x0027
                boolean r1 = r11.f22504c     // Catch:{ all -> 0x0025 }
                if (r1 != 0) goto L_0x0027
                monitor-enter(r0)     // Catch:{ all -> 0x0025 }
                okhttp3.internal.http2.ErrorCode r1 = r0.f22500m     // Catch:{ all -> 0x0022 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 != 0) goto L_0x0027
                r0.j()     // Catch:{ all -> 0x0025 }
                goto L_0x0008
            L_0x0022:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r12     // Catch:{ all -> 0x0025 }
            L_0x0025:
                r12 = move-exception
                goto L_0x0075
            L_0x0027:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.f22499l     // Catch:{ all -> 0x007b }
                r1.l()     // Catch:{ all -> 0x007b }
                r0.b()     // Catch:{ all -> 0x007b }
                long r1 = r0.f22493f     // Catch:{ all -> 0x007b }
                long r3 = r0.f22492e     // Catch:{ all -> 0x007b }
                long r1 = r1 - r3
                ll.f r3 = r11.f22503b     // Catch:{ all -> 0x007b }
                long r3 = r3.f20878b     // Catch:{ all -> 0x007b }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007b }
                long r1 = r0.f22492e     // Catch:{ all -> 0x007b }
                long r1 = r1 + r9
                r0.f22492e = r1     // Catch:{ all -> 0x007b }
                if (r12 == 0) goto L_0x004d
                ll.f r12 = r11.f22503b     // Catch:{ all -> 0x007b }
                long r1 = r12.f20878b     // Catch:{ all -> 0x007b }
                int r12 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r12 != 0) goto L_0x004d
                r12 = 1
                goto L_0x004e
            L_0x004d:
                r12 = 0
            L_0x004e:
                r7 = r12
                ek.i r12 = ek.i.f20112a     // Catch:{ all -> 0x007b }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r12 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.f22499l
                r12.h()
                okhttp3.internal.http2.Http2Stream r12 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x006c }
                okhttp3.internal.http2.Http2Connection r5 = r12.f22489b     // Catch:{ all -> 0x006c }
                int r6 = r12.f22488a     // Catch:{ all -> 0x006c }
                ll.f r8 = r11.f22503b     // Catch:{ all -> 0x006c }
                r5.x(r6, r7, r8, r9)     // Catch:{ all -> 0x006c }
                okhttp3.internal.http2.Http2Stream r12 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.f22499l
                r12.l()
                return
            L_0x006c:
                r12 = move-exception
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.f22499l
                r0.l()
                throw r12
            L_0x0075:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.f22499l     // Catch:{ all -> 0x007b }
                r1.l()     // Catch:{ all -> 0x007b }
                throw r12     // Catch:{ all -> 0x007b }
            L_0x007b:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.d(boolean):void");
        }

        public final d0 f() {
            return Http2Stream.this.f22499l;
        }

        public final void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util.f22171a;
            synchronized (http2Stream) {
                http2Stream.b();
                i iVar = i.f20112a;
            }
            while (this.f22503b.f20878b > 0) {
                d(false);
                Http2Stream.this.f22489b.flush();
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class FramingSource implements c0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f22506a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22507b;

        /* renamed from: c  reason: collision with root package name */
        public final f f22508c = new f();

        /* renamed from: d  reason: collision with root package name */
        public final f f22509d = new f();

        /* renamed from: e  reason: collision with root package name */
        public boolean f22510e;

        public FramingSource(long j10, boolean z10) {
            this.f22506a = j10;
            this.f22507b = z10;
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final long J0(ll.f r12, long r13) {
            /*
                r11 = this;
                java.lang.String r13 = "sink"
                sk.j.f(r12, r13)
            L_0x0005:
                r13 = 0
                r0 = 0
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r1)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r1.f22498k     // Catch:{ all -> 0x009e }
                r2.h()     // Catch:{ all -> 0x009e }
                monitor-enter(r1)     // Catch:{ all -> 0x002e }
                okhttp3.internal.http2.ErrorCode r2 = r1.f22500m     // Catch:{ all -> 0x0095 }
                monitor-exit(r1)     // Catch:{ all -> 0x002e }
                if (r2 == 0) goto L_0x0030
                boolean r2 = r11.f22507b     // Catch:{ all -> 0x002e }
                if (r2 != 0) goto L_0x0030
                java.io.IOException r0 = r1.f22501n     // Catch:{ all -> 0x002e }
                if (r0 != 0) goto L_0x0030
                okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x002e }
                monitor-enter(r1)     // Catch:{ all -> 0x002e }
                okhttp3.internal.http2.ErrorCode r2 = r1.f22500m     // Catch:{ all -> 0x002b }
                monitor-exit(r1)     // Catch:{ all -> 0x002e }
                sk.j.c(r2)     // Catch:{ all -> 0x002e }
                r0.<init>(r2)     // Catch:{ all -> 0x002e }
                goto L_0x0030
            L_0x002b:
                r12 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002e }
                throw r12     // Catch:{ all -> 0x002e }
            L_0x002e:
                r12 = move-exception
                goto L_0x0098
            L_0x0030:
                boolean r2 = r11.f22510e     // Catch:{ all -> 0x002e }
                if (r2 != 0) goto L_0x008d
                ll.f r2 = r11.f22509d     // Catch:{ all -> 0x002e }
                long r3 = r2.f20878b     // Catch:{ all -> 0x002e }
                int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                r5 = -1
                r14 = 0
                if (r13 <= 0) goto L_0x006e
                r7 = 8192(0x2000, double:4.0474E-320)
                long r3 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x002e }
                long r2 = r2.J0(r12, r3)     // Catch:{ all -> 0x002e }
                long r7 = r1.f22490c     // Catch:{ all -> 0x002e }
                long r7 = r7 + r2
                r1.f22490c = r7     // Catch:{ all -> 0x002e }
                long r9 = r1.f22491d     // Catch:{ all -> 0x002e }
                long r7 = r7 - r9
                if (r0 != 0) goto L_0x0079
                okhttp3.internal.http2.Http2Connection r13 = r1.f22489b     // Catch:{ all -> 0x002e }
                okhttp3.internal.http2.Settings r13 = r13.f22421y     // Catch:{ all -> 0x002e }
                int r13 = r13.a()     // Catch:{ all -> 0x002e }
                int r13 = r13 / 2
                long r9 = (long) r13     // Catch:{ all -> 0x002e }
                int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r13 < 0) goto L_0x0079
                okhttp3.internal.http2.Http2Connection r13 = r1.f22489b     // Catch:{ all -> 0x002e }
                int r4 = r1.f22488a     // Catch:{ all -> 0x002e }
                r13.B(r4, r7)     // Catch:{ all -> 0x002e }
                long r7 = r1.f22490c     // Catch:{ all -> 0x002e }
                r1.f22491d = r7     // Catch:{ all -> 0x002e }
                goto L_0x0079
            L_0x006e:
                boolean r13 = r11.f22507b     // Catch:{ all -> 0x002e }
                if (r13 != 0) goto L_0x0078
                if (r0 != 0) goto L_0x0078
                r1.j()     // Catch:{ all -> 0x002e }
                r14 = 1
            L_0x0078:
                r2 = r5
            L_0x0079:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r1.f22498k     // Catch:{ all -> 0x009e }
                r13.l()     // Catch:{ all -> 0x009e }
                ek.i r13 = ek.i.f20112a     // Catch:{ all -> 0x009e }
                monitor-exit(r1)
                if (r14 == 0) goto L_0x0084
                goto L_0x0005
            L_0x0084:
                int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r12 == 0) goto L_0x0089
                return r2
            L_0x0089:
                if (r0 != 0) goto L_0x008c
                return r5
            L_0x008c:
                throw r0
            L_0x008d:
                java.io.IOException r12 = new java.io.IOException     // Catch:{ all -> 0x002e }
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch:{ all -> 0x002e }
                throw r12     // Catch:{ all -> 0x002e }
            L_0x0095:
                r12 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002e }
                throw r12     // Catch:{ all -> 0x002e }
            L_0x0098:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r1.f22498k     // Catch:{ all -> 0x009e }
                r13.l()     // Catch:{ all -> 0x009e }
                throw r12     // Catch:{ all -> 0x009e }
            L_0x009e:
                r12 = move-exception
                monitor-exit(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.J0(ll.f, long):long");
        }

        public final void close() {
            long j10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.f22510e = true;
                f fVar = this.f22509d;
                j10 = fVar.f20878b;
                fVar.q();
                http2Stream.notifyAll();
                i iVar = i.f20112a;
            }
            if (j10 > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                byte[] bArr = Util.f22171a;
                http2Stream2.f22489b.v(j10);
            }
            Http2Stream.this.a();
        }

        public final d0 f() {
            return Http2Stream.this.f22498k;
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class StreamTimeout extends c {
        public StreamTimeout() {
        }

        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void k() {
            Http2Stream.this.e(ErrorCode.CANCEL);
            Http2Connection http2Connection = Http2Stream.this.f22489b;
            synchronized (http2Connection) {
                long j10 = http2Connection.f22419w;
                long j11 = http2Connection.f22418v;
                if (j10 >= j11) {
                    http2Connection.f22418v = j11 + 1;
                    http2Connection.f22420x = System.nanoTime() + ((long) 1000000000);
                    i iVar = i.f20112a;
                    http2Connection.f22412p.c(new Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(a.o(new StringBuilder(), http2Connection.f22407d, " ping"), http2Connection), 0);
                }
            }
        }

        public final void l() {
            if (i()) {
                throw j((IOException) null);
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i10, Http2Connection http2Connection, boolean z10, boolean z11, Headers headers) {
        this.f22488a = i10;
        this.f22489b = http2Connection;
        this.f22493f = (long) http2Connection.f22422z.a();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f22494g = arrayDeque;
        this.f22496i = new FramingSource((long) http2Connection.f22421y.a(), z11);
        this.f22497j = new FramingSink(z10);
        if (headers != null) {
            if (!g()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!g()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z10;
        boolean h10;
        byte[] bArr = Util.f22171a;
        synchronized (this) {
            FramingSource framingSource = this.f22496i;
            if (!framingSource.f22507b && framingSource.f22510e) {
                FramingSink framingSink = this.f22497j;
                if (framingSink.f22502a || framingSink.f22504c) {
                    z10 = true;
                    h10 = h();
                    i iVar = i.f20112a;
                }
            }
            z10 = false;
            h10 = h();
            i iVar2 = i.f20112a;
        }
        if (z10) {
            c(ErrorCode.CANCEL, (IOException) null);
        } else if (!h10) {
            this.f22489b.q(this.f22488a);
        }
    }

    public final void b() {
        FramingSink framingSink = this.f22497j;
        if (framingSink.f22504c) {
            throw new IOException("stream closed");
        } else if (framingSink.f22502a) {
            throw new IOException("stream finished");
        } else if (this.f22500m != null) {
            Throwable th2 = this.f22501n;
            if (th2 == null) {
                ErrorCode errorCode = this.f22500m;
                j.c(errorCode);
                th2 = new StreamResetException(errorCode);
            }
            throw th2;
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        if (d(errorCode, iOException)) {
            Http2Connection http2Connection = this.f22489b;
            int i10 = this.f22488a;
            http2Connection.getClass();
            http2Connection.F.v(i10, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = Util.f22171a;
        synchronized (this) {
            if (this.f22500m != null) {
                return false;
            }
            this.f22500m = errorCode;
            this.f22501n = iOException;
            notifyAll();
            if (this.f22496i.f22507b && this.f22497j.f22502a) {
                return false;
            }
            i iVar = i.f20112a;
            this.f22489b.q(this.f22488a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, (IOException) null)) {
            this.f22489b.z(this.f22488a, errorCode);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.http2.Http2Stream.FramingSink f() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f22495h     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.g()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.f22497j
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.f():okhttp3.internal.http2.Http2Stream$FramingSink");
    }

    public final boolean g() {
        boolean z10;
        if ((this.f22488a & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f22489b.f22404a == z10) {
            return true;
        }
        return false;
    }

    public final synchronized boolean h() {
        if (this.f22500m != null) {
            return false;
        }
        FramingSource framingSource = this.f22496i;
        if (framingSource.f22507b || framingSource.f22510e) {
            FramingSink framingSink = this.f22497j;
            if ((framingSink.f22502a || framingSink.f22504c) && this.f22495h) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            sk.j.f(r3, r0)
            byte[] r0 = okhttp3.internal.Util.f22171a
            monitor-enter(r2)
            boolean r0 = r2.f22495h     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.f22496i     // Catch:{ all -> 0x0037 }
            r3.getClass()     // Catch:{ all -> 0x0037 }
            goto L_0x001d
        L_0x0016:
            r2.f22495h = r1     // Catch:{ all -> 0x0037 }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.f22494g     // Catch:{ all -> 0x0037 }
            r0.add(r3)     // Catch:{ all -> 0x0037 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.f22496i     // Catch:{ all -> 0x0037 }
            r3.f22507b = r1     // Catch:{ all -> 0x0037 }
        L_0x0023:
            boolean r3 = r2.h()     // Catch:{ all -> 0x0037 }
            r2.notifyAll()     // Catch:{ all -> 0x0037 }
            ek.i r4 = ek.i.f20112a     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0036
            okhttp3.internal.http2.Http2Connection r3 = r2.f22489b
            int r4 = r2.f22488a
            r3.q(r4)
        L_0x0036:
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.i(okhttp3.Headers, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
