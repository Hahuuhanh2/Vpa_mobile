package al;

import al.l0;
import ek.i;
import fk.g;
import fl.k;
import fl.w;
import fl.x;
import ik.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: EventLoop.common.kt */
public abstract class y0 extends z0 implements l0 {

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19109n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19110o;

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19111p;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    public final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public final k<i> f19112c;

        public a(long j10, l lVar) {
            super(j10);
            this.f19112c = lVar;
        }

        public final void run() {
            this.f19112c.j(y0.this, i.f20112a);
        }

        public final String toString() {
            return super.toString() + this.f19112c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f19114c;

        public b(b2 b2Var, long j10) {
            super(j10);
            this.f19114c = b2Var;
        }

        public final void run() {
            this.f19114c.run();
        }

        public final String toString() {
            return super.toString() + this.f19114c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, t0, x {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f19115a;

        /* renamed from: b  reason: collision with root package name */
        public int f19116b = -1;

        public c(long j10) {
            this.f19115a = j10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: fl.w} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object r0 = r5._heap     // Catch:{ all -> 0x0031 }
                u9.b r1 = j7.a.f11703d     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)
                return
            L_0x0009:
                boolean r2 = r0 instanceof al.y0.d     // Catch:{ all -> 0x0031 }
                r3 = 0
                if (r2 == 0) goto L_0x0011
                al.y0$d r0 = (al.y0.d) r0     // Catch:{ all -> 0x0031 }
                goto L_0x0012
            L_0x0011:
                r0 = r3
            L_0x0012:
                if (r0 == 0) goto L_0x002b
                monitor-enter(r0)     // Catch:{ all -> 0x0031 }
                java.lang.Object r2 = r5._heap     // Catch:{ all -> 0x0028 }
                boolean r4 = r2 instanceof fl.w     // Catch:{ all -> 0x0028 }
                if (r4 == 0) goto L_0x001e
                r3 = r2
                fl.w r3 = (fl.w) r3     // Catch:{ all -> 0x0028 }
            L_0x001e:
                if (r3 != 0) goto L_0x0021
                goto L_0x0026
            L_0x0021:
                int r2 = r5.f19116b     // Catch:{ all -> 0x0028 }
                r0.c(r2)     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                goto L_0x002b
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                throw r1     // Catch:{ all -> 0x0031 }
            L_0x002b:
                r5._heap = r1     // Catch:{ all -> 0x0031 }
                ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x0031 }
                monitor-exit(r5)
                return
            L_0x0031:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: al.y0.c.b():void");
        }

        public final void c(d dVar) {
            boolean z10;
            if (this._heap != j7.a.f11703d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this._heap = dVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final int compareTo(Object obj) {
            int i10 = ((this.f19115a - ((c) obj).f19115a) > 0 ? 1 : ((this.f19115a - ((c) obj).f19115a) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            return 0;
        }

        public final int j(long j10, d dVar, y0 y0Var) {
            T t10;
            synchronized (this) {
                if (this._heap == j7.a.f11703d) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        T[] tArr = dVar.f20272a;
                        if (tArr != null) {
                            t10 = tArr[0];
                        } else {
                            t10 = null;
                        }
                        c cVar = (c) t10;
                        if (y0.n0(y0Var)) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f19117c = j10;
                        } else {
                            long j11 = cVar.f19115a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f19117c > 0) {
                                dVar.f19117c = j10;
                            }
                        }
                        long j12 = this.f19115a;
                        long j13 = dVar.f19117c;
                        if (j12 - j13 < 0) {
                            this.f19115a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final void setIndex(int i10) {
            this.f19116b = i10;
        }

        public String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Delayed[nanos=");
            q10.append(this.f19115a);
            q10.append(']');
            return q10.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class d extends w<c> {

        /* renamed from: c  reason: collision with root package name */
        public long f19117c;

        public d(long j10) {
            this.f19117c = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<y0> cls2 = y0.class;
        f19109n = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f19110o = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
        f19111p = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleted");
    }

    public static final boolean n0(y0 y0Var) {
        y0Var.getClass();
        if (f19111p.get(y0Var) != 0) {
            return true;
        }
        return false;
    }

    public t0 d(long j10, b2 b2Var, f fVar) {
        return l0.a.a(j10, b2Var, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008c, code lost:
        r8 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a A[LOOP:2: B:46:0x007a->B:49:0x0085, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g0() {
        /*
            r12 = this;
            boolean r0 = r12.j0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19110o
            java.lang.Object r0 = r0.get(r12)
            al.y0$d r0 = (al.y0.d) r0
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0059
            int r6 = r0.b()
            if (r6 != 0) goto L_0x001e
            r6 = r4
            goto L_0x001f
        L_0x001e:
            r6 = r5
        L_0x001f:
            if (r6 != 0) goto L_0x0059
            long r6 = java.lang.System.nanoTime()
        L_0x0025:
            monitor-enter(r0)
            T[] r8 = r0.f20272a     // Catch:{ all -> 0x0056 }
            if (r8 == 0) goto L_0x002d
            r8 = r8[r5]     // Catch:{ all -> 0x0056 }
            goto L_0x002e
        L_0x002d:
            r8 = r3
        L_0x002e:
            if (r8 != 0) goto L_0x0033
            monitor-exit(r0)
            r8 = r3
            goto L_0x0051
        L_0x0033:
            al.y0$c r8 = (al.y0.c) r8     // Catch:{ all -> 0x0056 }
            long r9 = r8.f19115a     // Catch:{ all -> 0x0056 }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x003f
            r9 = r4
            goto L_0x0040
        L_0x003f:
            r9 = r5
        L_0x0040:
            if (r9 == 0) goto L_0x0047
            boolean r8 = r12.s0(r8)     // Catch:{ all -> 0x0056 }
            goto L_0x0048
        L_0x0047:
            r8 = r5
        L_0x0048:
            if (r8 == 0) goto L_0x004f
            fl.x r8 = r0.c(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0050
        L_0x004f:
            r8 = r3
        L_0x0050:
            monitor-exit(r0)
        L_0x0051:
            al.y0$c r8 = (al.y0.c) r8
            if (r8 != 0) goto L_0x0025
            goto L_0x0059
        L_0x0056:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0059:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19109n
        L_0x005b:
            java.lang.Object r6 = r0.get(r12)
            if (r6 != 0) goto L_0x0062
            goto L_0x008c
        L_0x0062:
            boolean r7 = r6 instanceof fl.k
            if (r7 == 0) goto L_0x0088
            r7 = r6
            fl.k r7 = (fl.k) r7
            java.lang.Object r8 = r7.d()
            u9.b r9 = fl.k.f20248g
            if (r8 == r9) goto L_0x0074
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            goto L_0x00a4
        L_0x0074:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f19109n
            fl.k r7 = r7.c()
        L_0x007a:
            boolean r9 = r8.compareAndSet(r12, r6, r7)
            if (r9 == 0) goto L_0x0081
            goto L_0x005b
        L_0x0081:
            java.lang.Object r9 = r8.get(r12)
            if (r9 == r6) goto L_0x007a
            goto L_0x005b
        L_0x0088:
            u9.b r7 = j7.a.f11704e
            if (r6 != r7) goto L_0x008e
        L_0x008c:
            r8 = r3
            goto L_0x00a4
        L_0x008e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f19109n
        L_0x0090:
            boolean r8 = r7.compareAndSet(r12, r6, r3)
            if (r8 == 0) goto L_0x0098
            r7 = r4
            goto L_0x009f
        L_0x0098:
            java.lang.Object r8 = r7.get(r12)
            if (r8 == r6) goto L_0x0090
            r7 = r5
        L_0x009f:
            if (r7 == 0) goto L_0x005b
            r8 = r6
            java.lang.Runnable r8 = (java.lang.Runnable) r8
        L_0x00a4:
            if (r8 == 0) goto L_0x00aa
            r8.run()
            return r1
        L_0x00aa:
            fk.g<al.p0<?>> r0 = r12.f19105e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00bc
        L_0x00ba:
            r8 = r6
            goto L_0x00bd
        L_0x00bc:
            r8 = r1
        L_0x00bd:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            goto L_0x011b
        L_0x00c2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19109n
            java.lang.Object r0 = r0.get(r12)
            if (r0 == 0) goto L_0x00f2
            boolean r8 = r0 instanceof fl.k
            if (r8 == 0) goto L_0x00ed
            fl.k r0 = (fl.k) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = fl.k.f20247f
            long r8 = r8.get(r0)
            r10 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r10 = r10 & r8
            long r10 = r10 >> r5
            int r0 = (int) r10
            r10 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r8 = r8 & r10
            r10 = 30
            long r8 = r8 >> r10
            int r8 = (int) r8
            if (r0 != r8) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r4 = r5
        L_0x00ea:
            if (r4 != 0) goto L_0x00f2
            goto L_0x011b
        L_0x00ed:
            u9.b r3 = j7.a.f11704e
            if (r0 != r3) goto L_0x011b
            goto L_0x011a
        L_0x00f2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19110o
            java.lang.Object r0 = r0.get(r12)
            al.y0$d r0 = (al.y0.d) r0
            if (r0 == 0) goto L_0x011a
            monitor-enter(r0)
            T[] r4 = r0.f20272a     // Catch:{ all -> 0x0117 }
            if (r4 == 0) goto L_0x0103
            r3 = r4[r5]     // Catch:{ all -> 0x0117 }
        L_0x0103:
            monitor-exit(r0)
            al.y0$c r3 = (al.y0.c) r3
            if (r3 != 0) goto L_0x0109
            goto L_0x011a
        L_0x0109:
            long r3 = r3.f19115a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0115
            goto L_0x011b
        L_0x0115:
            r1 = r3
            goto L_0x011b
        L_0x0117:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x011a:
            r1 = r6
        L_0x011b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: al.y0.g0():long");
    }

    public final void i(long j10, l lVar) {
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j11 + nanoTime, lVar);
            v0(nanoTime, aVar);
            lVar.v(new u0(aVar));
        }
    }

    public void o0(Runnable runnable) {
        if (s0(runnable)) {
            Thread k02 = k0();
            if (Thread.currentThread() != k02) {
                LockSupport.unpark(k02);
                return;
            }
            return;
        }
        h0.f19040q.o0(runnable);
    }

    public final void s(f fVar, Runnable runnable) {
        o0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[LOOP:2: B:25:0x0046->B:28:0x0051, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s0(java.lang.Runnable r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19109n
        L_0x0002:
            java.lang.Object r1 = r0.get(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f19111p
            int r2 = r2.get(r7)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0013
        L_0x0012:
            r2 = r4
        L_0x0013:
            if (r2 == 0) goto L_0x0016
            return r4
        L_0x0016:
            if (r1 != 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f19109n
            r5 = 0
        L_0x001b:
            boolean r1 = r2.compareAndSet(r7, r5, r8)
            if (r1 == 0) goto L_0x0023
            r4 = r3
            goto L_0x0029
        L_0x0023:
            java.lang.Object r1 = r2.get(r7)
            if (r1 == 0) goto L_0x001b
        L_0x0029:
            if (r4 == 0) goto L_0x0002
            return r3
        L_0x002c:
            boolean r2 = r1 instanceof fl.k
            if (r2 == 0) goto L_0x0055
            r2 = r1
            fl.k r2 = (fl.k) r2
            int r5 = r2.a(r8)
            if (r5 == 0) goto L_0x0054
            if (r5 == r3) goto L_0x0040
            r1 = 2
            if (r5 == r1) goto L_0x003f
            goto L_0x0002
        L_0x003f:
            return r4
        L_0x0040:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f19109n
            fl.k r2 = r2.c()
        L_0x0046:
            boolean r3 = r4.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L_0x004d
            goto L_0x0002
        L_0x004d:
            java.lang.Object r3 = r4.get(r7)
            if (r3 == r1) goto L_0x0046
            goto L_0x0002
        L_0x0054:
            return r3
        L_0x0055:
            u9.b r2 = j7.a.f11704e
            if (r1 != r2) goto L_0x005a
            return r4
        L_0x005a:
            fl.k r2 = new fl.k
            r5 = 8
            r2.<init>(r5, r3)
            r5 = r1
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r2.a(r5)
            r2.a(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f19109n
        L_0x006c:
            boolean r6 = r5.compareAndSet(r7, r1, r2)
            if (r6 == 0) goto L_0x0074
            r4 = r3
            goto L_0x007a
        L_0x0074:
            java.lang.Object r6 = r5.get(r7)
            if (r6 == r1) goto L_0x006c
        L_0x007a:
            if (r4 == 0) goto L_0x0002
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: al.y0.s0(java.lang.Runnable):boolean");
    }

    public void shutdown() {
        x xVar;
        boolean z10;
        boolean z11;
        ThreadLocal<x0> threadLocal = a2.f18990a;
        a2.f18990a.set((Object) null);
        f19111p.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19109n;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19109n;
                u9.b bVar = j7.a.f11704e;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, (Object) null, bVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != null) {
                            z11 = false;
                            break;
                        }
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    break;
                }
            } else if (obj instanceof k) {
                ((k) obj).b();
                break;
            } else if (obj == j7.a.f11704e) {
                break;
            } else {
                k kVar = new k(8, true);
                kVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f19109n;
                while (true) {
                    if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, kVar)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (g0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f19110o.get(this);
            if (dVar != null) {
                synchronized (dVar) {
                    if (dVar.b() > 0) {
                        xVar = dVar.c(0);
                    } else {
                        xVar = null;
                    }
                }
                c cVar = (c) xVar;
                if (cVar != null) {
                    l0(nanoTime, cVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean t0() {
        boolean z10;
        boolean z11;
        g<p0<?>> gVar = this.f19105e;
        if (gVar != null) {
            z10 = gVar.isEmpty();
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        d dVar = (d) f19110o.get(this);
        if (dVar != null) {
            if (dVar.b() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
        }
        Object obj = f19109n.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof k) {
            long j10 = k.f20247f.get((k) obj);
            if (((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == j7.a.f11704e) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: al.y0$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[LOOP:0: B:10:0x0021->B:13:0x002c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v0(long r7, al.y0.c r9) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f19111p
            int r0 = r0.get(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            r0 = r1
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            r3 = 0
            if (r0 == 0) goto L_0x0012
            r0 = r1
            goto L_0x003e
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19110o
            java.lang.Object r4 = r0.get(r6)
            al.y0$d r4 = (al.y0.d) r4
            if (r4 != 0) goto L_0x003a
            al.y0$d r5 = new al.y0$d
            r5.<init>(r7)
        L_0x0021:
            boolean r4 = r0.compareAndSet(r6, r3, r5)
            if (r4 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == 0) goto L_0x0021
        L_0x002e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19110o
            java.lang.Object r0 = r0.get(r6)
            sk.j.c(r0)
            r4 = r0
            al.y0$d r4 = (al.y0.d) r4
        L_0x003a:
            int r0 = r9.j(r7, r4, r6)
        L_0x003e:
            if (r0 == 0) goto L_0x0056
            if (r0 == r1) goto L_0x0052
            r7 = 2
            if (r0 != r7) goto L_0x0046
            goto L_0x0081
        L_0x0046:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "unexpected result"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0052:
            r6.l0(r7, r9)
            goto L_0x0081
        L_0x0056:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f19110o
            java.lang.Object r7 = r7.get(r6)
            al.y0$d r7 = (al.y0.d) r7
            if (r7 == 0) goto L_0x006e
            monitor-enter(r7)
            T[] r8 = r7.f20272a     // Catch:{ all -> 0x006b }
            if (r8 == 0) goto L_0x0067
            r3 = r8[r2]     // Catch:{ all -> 0x006b }
        L_0x0067:
            monitor-exit(r7)
            al.y0$c r3 = (al.y0.c) r3
            goto L_0x006e
        L_0x006b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x006e:
            if (r3 != r9) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r1 = r2
        L_0x0072:
            if (r1 == 0) goto L_0x0081
            java.lang.Thread r7 = r6.k0()
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            if (r8 == r7) goto L_0x0081
            java.util.concurrent.locks.LockSupport.unpark(r7)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al.y0.v0(long, al.y0$c):void");
    }
}
