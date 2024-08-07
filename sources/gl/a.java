package gl;

import al.g0;
import ek.i;
import f0.b0;
import fl.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sk.j;
import sk.r;
import tk.c;
import u9.b;
import v.v;

/* compiled from: CoroutineScheduler.kt */
public final class a implements Executor, Closeable {

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20460o = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20461p = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20462q = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: r  reason: collision with root package name */
    public static final b f20463r = new b("NOT_IN_STACK", 1);
    private volatile int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f20464a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20465b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20466c;
    private volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f20467d;

    /* renamed from: e  reason: collision with root package name */
    public final d f20468e;

    /* renamed from: f  reason: collision with root package name */
    public final d f20469f;

    /* renamed from: n  reason: collision with root package name */
    public final q<C0286a> f20470n;
    private volatile long parkedWorkersStack;

    /* renamed from: gl.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutineScheduler.kt */
    public final class C0286a extends Thread {

        /* renamed from: p  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f20471p = AtomicIntegerFieldUpdater.newUpdater(C0286a.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final m f20472a;

        /* renamed from: b  reason: collision with root package name */
        public final r<g> f20473b;

        /* renamed from: c  reason: collision with root package name */
        public int f20474c;

        /* renamed from: d  reason: collision with root package name */
        public long f20475d;

        /* renamed from: e  reason: collision with root package name */
        public long f20476e;

        /* renamed from: f  reason: collision with root package name */
        public int f20477f;
        private volatile int indexInArray;

        /* renamed from: n  reason: collision with root package name */
        public boolean f20478n;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public C0286a() {
            throw null;
        }

        public C0286a(int i10) {
            setDaemon(true);
            this.f20472a = new m();
            this.f20473b = new r<>();
            this.f20474c = 4;
            this.nextParkedWorker = a.f20463r;
            this.f20477f = c.f23024a.b();
            f(i10);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final gl.g a(boolean r11) {
            /*
                r10 = this;
                int r0 = r10.f20474c
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x0007
                goto L_0x0032
            L_0x0007:
                gl.a r0 = gl.a.this
                java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = gl.a.f20461p
            L_0x000b:
                long r5 = r9.get(r0)
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r3 = (int) r3
                if (r3 != 0) goto L_0x001d
                r0 = r2
                goto L_0x002e
            L_0x001d:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = gl.a.f20461p
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L_0x000b
                r0 = r1
            L_0x002e:
                if (r0 == 0) goto L_0x0034
                r10.f20474c = r1
            L_0x0032:
                r0 = r1
                goto L_0x0035
            L_0x0034:
                r0 = r2
            L_0x0035:
                r3 = 0
                if (r0 == 0) goto L_0x007f
                if (r11 == 0) goto L_0x0072
                gl.a r11 = gl.a.this
                int r11 = r11.f20464a
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r1 = r2
            L_0x0048:
                if (r1 == 0) goto L_0x0051
                gl.g r11 = r10.e()
                if (r11 == 0) goto L_0x0051
                goto L_0x007e
            L_0x0051:
                gl.m r11 = r10.f20472a
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = gl.m.f20498b
                java.lang.Object r0 = r0.getAndSet(r11, r3)
                gl.g r0 = (gl.g) r0
                if (r0 != 0) goto L_0x0065
                gl.g r11 = r11.b()
                goto L_0x0066
            L_0x0065:
                r11 = r0
            L_0x0066:
                if (r11 == 0) goto L_0x0069
                goto L_0x007e
            L_0x0069:
                if (r1 != 0) goto L_0x0079
                gl.g r11 = r10.e()
                if (r11 == 0) goto L_0x0079
                goto L_0x007e
            L_0x0072:
                gl.g r11 = r10.e()
                if (r11 == 0) goto L_0x0079
                goto L_0x007e
            L_0x0079:
                r11 = 3
                gl.g r11 = r10.i(r11)
            L_0x007e:
                return r11
            L_0x007f:
                gl.m r11 = r10.f20472a
                r11.getClass()
            L_0x0084:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = gl.m.f20498b
                java.lang.Object r4 = r0.get(r11)
                gl.g r4 = (gl.g) r4
                if (r4 != 0) goto L_0x008f
                goto L_0x00ae
            L_0x008f:
                gl.h r5 = r4.f20486b
                int r5 = r5.c()
                if (r5 != r1) goto L_0x0099
                r5 = r1
                goto L_0x009a
            L_0x0099:
                r5 = r2
            L_0x009a:
                if (r5 != r1) goto L_0x00ae
            L_0x009c:
                boolean r5 = r0.compareAndSet(r11, r4, r3)
                if (r5 == 0) goto L_0x00a4
                r0 = r1
                goto L_0x00ab
            L_0x00a4:
                java.lang.Object r5 = r0.get(r11)
                if (r5 == r4) goto L_0x009c
                r0 = r2
            L_0x00ab:
                if (r0 == 0) goto L_0x0084
                goto L_0x00cd
            L_0x00ae:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = gl.m.f20500d
                int r0 = r0.get(r11)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = gl.m.f20499c
                int r2 = r2.get(r11)
            L_0x00ba:
                if (r0 == r2) goto L_0x00ce
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = gl.m.f20501e
                int r4 = r4.get(r11)
                if (r4 != 0) goto L_0x00c5
                goto L_0x00ce
            L_0x00c5:
                int r2 = r2 + -1
                gl.g r4 = r11.c(r2, r1)
                if (r4 == 0) goto L_0x00ba
            L_0x00cd:
                r3 = r4
            L_0x00ce:
                if (r3 != 0) goto L_0x00e1
                gl.a r11 = gl.a.this
                gl.d r11 = r11.f20469f
                java.lang.Object r11 = r11.d()
                r3 = r11
                gl.g r3 = (gl.g) r3
                if (r3 != 0) goto L_0x00e1
                gl.g r3 = r10.i(r1)
            L_0x00e1:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: gl.a.C0286a.a(boolean):gl.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f20477f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f20477f = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & Integer.MAX_VALUE) % i10;
        }

        public final g e() {
            if (d(2) == 0) {
                g gVar = (g) a.this.f20468e.d();
                if (gVar != null) {
                    return gVar;
                }
                return (g) a.this.f20469f.d();
            }
            g gVar2 = (g) a.this.f20469f.d();
            if (gVar2 != null) {
                return gVar2;
            }
            return (g) a.this.f20468e.d();
        }

        public final void f(int i10) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f20467d);
            sb2.append("-worker-");
            if (i10 == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i10);
            }
            sb2.append(str);
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i10) {
            int i11 = this.f20474c;
            boolean z10 = true;
            if (i11 != 1) {
                z10 = false;
            }
            if (z10) {
                a.f20461p.addAndGet(a.this, 4398046511104L);
            }
            if (i11 != i10) {
                this.f20474c = i10;
            }
            return z10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00ce A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final gl.g i(int r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                gl.a r2 = gl.a.this
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = gl.a.f20461p
                long r2 = r3.get(r2)
                r4 = 2097151(0x1fffff, double:1.0361303E-317)
                long r2 = r2 & r4
                int r2 = (int) r2
                r3 = 2
                r4 = 0
                if (r2 >= r3) goto L_0x0016
                return r4
            L_0x0016:
                int r5 = r0.d(r2)
                gl.a r6 = gl.a.this
                r10 = 0
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x0022:
                if (r10 >= r2) goto L_0x00f6
                r15 = 1
                int r5 = r5 + r15
                if (r5 <= r2) goto L_0x0029
                r5 = r15
            L_0x0029:
                fl.q<gl.a$a> r3 = r6.f20470n
                java.lang.Object r3 = r3.b(r5)
                gl.a$a r3 = (gl.a.C0286a) r3
                if (r3 == 0) goto L_0x00ec
                if (r3 == r0) goto L_0x00ec
                gl.m r3 = r3.f20472a
                sk.r<gl.g> r9 = r0.f20473b
                r7 = 3
                if (r1 != r7) goto L_0x0041
                gl.g r7 = r3.b()
                goto L_0x006d
            L_0x0041:
                r3.getClass()
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = gl.m.f20500d
                int r7 = r7.get(r3)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = gl.m.f20499c
                int r8 = r8.get(r3)
                if (r1 != r15) goto L_0x0054
                r13 = r15
                goto L_0x0055
            L_0x0054:
                r13 = 0
            L_0x0055:
                if (r7 == r8) goto L_0x006c
                if (r13 == 0) goto L_0x0062
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r14 = gl.m.f20501e
                int r14 = r14.get(r3)
                if (r14 != 0) goto L_0x0062
                goto L_0x006c
            L_0x0062:
                int r14 = r7 + 1
                gl.g r7 = r3.c(r7, r13)
                if (r7 != 0) goto L_0x006d
                r7 = r14
                goto L_0x0055
            L_0x006c:
                r7 = r4
            L_0x006d:
                if (r7 == 0) goto L_0x0074
                r9.f22931a = r7
                r19 = r5
                goto L_0x00c6
            L_0x0074:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = gl.m.f20498b
                java.lang.Object r8 = r7.get(r3)
                gl.g r8 = (gl.g) r8
                r18 = -2
                if (r8 != 0) goto L_0x0081
                goto L_0x0094
            L_0x0081:
                gl.h r13 = r8.f20486b
                int r13 = r13.c()
                if (r13 != r15) goto L_0x008b
                r13 = r15
                goto L_0x008c
            L_0x008b:
                r13 = 0
            L_0x008c:
                if (r13 == 0) goto L_0x0090
                r13 = r15
                goto L_0x0091
            L_0x0090:
                r13 = 2
            L_0x0091:
                r13 = r13 & r1
                if (r13 != 0) goto L_0x009b
            L_0x0094:
                r3 = r18
                r13 = -1
                r19 = r5
                goto L_0x00ca
            L_0x009b:
                gl.e r13 = gl.k.f20494f
                r13.getClass()
                long r13 = java.lang.System.nanoTime()
                r19 = r5
                long r4 = r8.f20485a
                long r13 = r13 - r4
                long r4 = gl.k.f20490b
                int r20 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r20 >= 0) goto L_0x00b2
                long r3 = r4 - r13
                goto L_0x00c8
            L_0x00b2:
                r4 = 0
                boolean r5 = r7.compareAndSet(r3, r8, r4)
                if (r5 == 0) goto L_0x00bb
                r4 = r15
                goto L_0x00c2
            L_0x00bb:
                java.lang.Object r4 = r7.get(r3)
                if (r4 == r8) goto L_0x00e9
                r4 = 0
            L_0x00c2:
                if (r4 == 0) goto L_0x00e3
                r9.f22931a = r8
            L_0x00c6:
                r3 = -1
            L_0x00c8:
                r13 = -1
            L_0x00ca:
                int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                if (r5 != 0) goto L_0x00d8
                sk.r<gl.g> r1 = r0.f20473b
                T r2 = r1.f22931a
                gl.g r2 = (gl.g) r2
                r3 = 0
                r1.f22931a = r3
                return r2
            L_0x00d8:
                r16 = 0
                int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
                if (r5 <= 0) goto L_0x00ee
                long r11 = java.lang.Math.min(r11, r3)
                goto L_0x00ee
            L_0x00e3:
                r16 = 0
                r5 = r19
                r4 = 0
                goto L_0x0074
            L_0x00e9:
                r16 = 0
                goto L_0x00b2
            L_0x00ec:
                r19 = r5
            L_0x00ee:
                int r10 = r10 + 1
                r5 = r19
                r3 = 2
                r4 = 0
                goto L_0x0022
            L_0x00f6:
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r16 = 0
                int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r1 == 0) goto L_0x0102
                goto L_0x0104
            L_0x0102:
                r11 = r16
            L_0x0104:
                r0.f20476e = r11
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: gl.a.C0286a.i(int):gl.g");
        }

        public final void run() {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            loop0:
            while (true) {
                boolean z17 = false;
                boolean z18 = false;
                while (true) {
                    a aVar = a.this;
                    aVar.getClass();
                    if (a.f20462q.get(aVar) != 0) {
                        z10 = true;
                    } else {
                        z10 = z17;
                    }
                    if (z10 || this.f20474c == 5) {
                        h(5);
                    } else {
                        g a10 = a(this.f20478n);
                        long j10 = -2097152;
                        if (a10 != null) {
                            this.f20476e = 0;
                            int c10 = a10.f20486b.c();
                            this.f20475d = 0;
                            if (this.f20474c == 3) {
                                this.f20474c = 2;
                            }
                            if (c10 != 0 && h(2)) {
                                a aVar2 = a.this;
                                if (!aVar2.s() && !aVar2.q(a.f20461p.get(aVar2))) {
                                    aVar2.s();
                                }
                            }
                            a.this.getClass();
                            try {
                                a10.run();
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th3);
                            }
                            if (c10 != 0) {
                                a.f20461p.addAndGet(a.this, -2097152);
                                if (this.f20474c != 5) {
                                    this.f20474c = 4;
                                }
                            }
                        } else {
                            this.f20478n = z17;
                            if (this.f20476e != 0) {
                                if (z18) {
                                    h(3);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f20476e);
                                    this.f20476e = 0;
                                    break;
                                }
                                z18 = true;
                            } else {
                                Object obj = this.nextParkedWorker;
                                b bVar = a.f20463r;
                                if (obj != bVar) {
                                    z11 = true;
                                } else {
                                    z11 = z17;
                                }
                                if (z11) {
                                    f20471p.set(this, -1);
                                    while (true) {
                                        if (this.nextParkedWorker != a.f20463r) {
                                            z12 = true;
                                        } else {
                                            z12 = z17;
                                        }
                                        if (!z12) {
                                            break;
                                        }
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20471p;
                                        if (atomicIntegerFieldUpdater.get(this) != -1) {
                                            break;
                                        }
                                        a aVar3 = a.this;
                                        aVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = a.f20462q;
                                        if (atomicIntegerFieldUpdater2.get(aVar3) != 0) {
                                            z13 = true;
                                        } else {
                                            z13 = z17;
                                        }
                                        if (z13 || this.f20474c == 5) {
                                            break;
                                        }
                                        h(3);
                                        Thread.interrupted();
                                        if (this.f20475d == 0) {
                                            z14 = z18;
                                            this.f20475d = System.nanoTime() + a.this.f20466c;
                                        } else {
                                            z14 = z18;
                                        }
                                        LockSupport.parkNanos(a.this.f20466c);
                                        if (System.nanoTime() - this.f20475d >= 0) {
                                            this.f20475d = 0;
                                            a aVar4 = a.this;
                                            synchronized (aVar4.f20470n) {
                                                if (atomicIntegerFieldUpdater2.get(aVar4) != 0) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (!z16) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = a.f20461p;
                                                    if (((int) (atomicLongFieldUpdater.get(aVar4) & 2097151)) > aVar4.f20464a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i10 = this.indexInArray;
                                                            z15 = false;
                                                            f(0);
                                                            aVar4.i(this, i10, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(aVar4) & 2097151);
                                                            if (andDecrement != i10) {
                                                                C0286a b10 = aVar4.f20470n.b(andDecrement);
                                                                j.c(b10);
                                                                C0286a aVar5 = b10;
                                                                aVar4.f20470n.c(i10, aVar5);
                                                                aVar5.f(i10);
                                                                aVar4.i(aVar5, andDecrement, i10);
                                                            }
                                                            aVar4.f20470n.c(andDecrement, (C0286a) null);
                                                            i iVar = i.f20112a;
                                                            this.f20474c = 5;
                                                        }
                                                    }
                                                }
                                            }
                                            z17 = z15;
                                            z18 = z14;
                                        }
                                        z15 = false;
                                        z17 = z15;
                                        z18 = z14;
                                    }
                                } else {
                                    a aVar6 = a.this;
                                    aVar6.getClass();
                                    if (this.nextParkedWorker == bVar) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = a.f20460o;
                                        while (true) {
                                            long j11 = atomicLongFieldUpdater2.get(aVar6);
                                            int i11 = this.indexInArray;
                                            this.nextParkedWorker = aVar6.f20470n.b((int) (j11 & 2097151));
                                            if (a.f20460o.compareAndSet(aVar6, j11, ((j11 + 2097152) & j10) | ((long) i11))) {
                                                break;
                                            }
                                            j10 = -2097152;
                                        }
                                    }
                                }
                                z17 = z17;
                                z18 = z18;
                            }
                        }
                    }
                }
            }
            h(5);
            return;
        }
    }

    public a(int i10, int i11, long j10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f20464a = i10;
        this.f20465b = i11;
        this.f20466c = j10;
        this.f20467d = str;
        boolean z13 = true;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j10 <= 0 ? false : z13) {
                        this.f20468e = new d();
                        this.f20469f = new d();
                        this.f20470n = new q<>((i10 + 1) * 2);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(v.d("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(b0.p("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(v.d("Core pool size ", i10, " should be at least 1").toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r1 == null) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f20462q
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof gl.a.C0286a
            r4 = 0
            if (r3 == 0) goto L_0x0018
            gl.a$a r0 = (gl.a.C0286a) r0
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            gl.a r3 = gl.a.this
            boolean r3 = sk.j.a(r3, r9)
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            fl.q<gl.a$a> r3 = r9.f20470n
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = f20461p     // Catch:{ all -> 0x00c6 }
            long r5 = r5.get(r9)     // Catch:{ all -> 0x00c6 }
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L_0x007a
            r3 = r2
        L_0x0037:
            fl.q<gl.a$a> r6 = r9.f20470n
            java.lang.Object r6 = r6.b(r3)
            sk.j.c(r6)
            gl.a$a r6 = (gl.a.C0286a) r6
            if (r6 == r0) goto L_0x0075
        L_0x0044:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L_0x0053
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L_0x0044
        L_0x0053:
            gl.m r6 = r6.f20472a
            gl.d r7 = r9.f20469f
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = gl.m.f20498b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            gl.g r8 = (gl.g) r8
            if (r8 == 0) goto L_0x0067
            r7.a(r8)
        L_0x0067:
            gl.g r8 = r6.b()
            if (r8 != 0) goto L_0x006f
            r8 = r1
            goto L_0x0073
        L_0x006f:
            r7.a(r8)
            r8 = r2
        L_0x0073:
            if (r8 != 0) goto L_0x0067
        L_0x0075:
            if (r3 == r5) goto L_0x007a
            int r3 = r3 + 1
            goto L_0x0037
        L_0x007a:
            gl.d r1 = r9.f20469f
            r1.b()
            gl.d r1 = r9.f20468e
            r1.b()
        L_0x0084:
            if (r0 == 0) goto L_0x008c
            gl.g r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00b3
        L_0x008c:
            gl.d r1 = r9.f20468e
            java.lang.Object r1 = r1.d()
            gl.g r1 = (gl.g) r1
            if (r1 != 0) goto L_0x00b3
            gl.d r1 = r9.f20469f
            java.lang.Object r1 = r1.d()
            gl.g r1 = (gl.g) r1
            if (r1 != 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00a6
            r1 = 5
            r0.h(r1)
        L_0x00a6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f20460o
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f20461p
            r0.set(r9, r1)
        L_0x00b2:
            return
        L_0x00b3:
            r1.run()     // Catch:{ all -> 0x00b7 }
            goto L_0x0084
        L_0x00b7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c4 }
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch:{ all -> 0x00c4 }
            r4.uncaughtException(r3, r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x0084
        L_0x00c4:
            r0 = move-exception
            throw r0
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.a.close():void");
    }

    public final int d() {
        boolean z10;
        boolean z11;
        synchronized (this.f20470n) {
            boolean z12 = false;
            if (f20462q.get(this) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20461p;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 >= this.f20464a) {
                return 0;
            }
            if (i10 >= this.f20465b) {
                return 0;
            }
            int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i12 <= 0 || this.f20470n.b(i12) != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                C0286a aVar = new C0286a(i12);
                this.f20470n.c(i12, aVar);
                if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z12 = true;
                }
                if (z12) {
                    int i13 = i11 + 1;
                    aVar.start();
                    return i13;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void execute(Runnable runnable) {
        h(runnable, k.f20495g, false);
    }

    public final void h(Runnable runnable, h hVar, boolean z10) {
        g gVar;
        boolean z11;
        long j10;
        C0286a aVar;
        boolean z12;
        boolean z13;
        k.f20494f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            gVar = (g) runnable;
            gVar.f20485a = nanoTime;
            gVar.f20486b = hVar;
        } else {
            gVar = new j(runnable, nanoTime, hVar);
        }
        boolean z14 = false;
        if (gVar.f20486b.c() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j10 = f20461p.addAndGet(this, 2097152);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C0286a) {
            aVar = (C0286a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !j.a(a.this, this)) {
            aVar = null;
        }
        if (!(aVar == null || aVar.f20474c == 5 || (gVar.f20486b.c() == 0 && aVar.f20474c == 2))) {
            aVar.f20478n = true;
            m mVar = aVar.f20472a;
            if (z10) {
                gVar = mVar.a(gVar);
            } else {
                mVar.getClass();
                g gVar2 = (g) m.f20498b.getAndSet(mVar, gVar);
                if (gVar2 == null) {
                    gVar = null;
                } else {
                    gVar = mVar.a(gVar2);
                }
            }
        }
        if (gVar != null) {
            if (gVar.f20486b.c() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                z13 = this.f20469f.a(gVar);
            } else {
                z13 = this.f20468e.a(gVar);
            }
            if (!z13) {
                throw new RejectedExecutionException(android.support.v4.media.a.o(new StringBuilder(), this.f20467d, " was terminated"));
            }
        }
        if (z10 && aVar != null) {
            z14 = true;
        }
        if (z11) {
            if (!z14 && !s() && !q(j10)) {
                s();
            }
        } else if (!z14 && !s() && !q(f20461p.get(this))) {
            s();
        }
    }

    public final void i(C0286a aVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20460o;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == f20463r) {
                            i12 = -1;
                            break;
                        } else if (c10 == null) {
                            i12 = 0;
                            break;
                        } else {
                            C0286a aVar2 = (C0286a) c10;
                            int b10 = aVar2.b();
                            if (b10 != 0) {
                                i12 = b10;
                                break;
                            }
                            c10 = aVar2.c();
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f20460o.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final boolean q(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f20464a) {
            int d10 = d();
            if (d10 == 1 && this.f20464a > 1) {
                d();
            }
            if (d10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        C0286a b10;
        b bVar;
        int i10;
        do {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20460o;
            while (true) {
                long j10 = atomicLongFieldUpdater.get(this);
                b10 = this.f20470n.b((int) (2097151 & j10));
                if (b10 == null) {
                    b10 = null;
                    break;
                }
                long j11 = (2097152 + j10) & -2097152;
                Object c10 = b10.c();
                while (true) {
                    bVar = f20463r;
                    if (c10 == bVar) {
                        i10 = -1;
                        break;
                    } else if (c10 == null) {
                        i10 = 0;
                        break;
                    } else {
                        C0286a aVar = (C0286a) c10;
                        i10 = aVar.b();
                        if (i10 != 0) {
                            break;
                        }
                        c10 = aVar.c();
                    }
                }
                if (i10 >= 0) {
                    if (f20460o.compareAndSet(this, j10, ((long) i10) | j11)) {
                        b10.g(bVar);
                        break;
                    }
                }
            }
            if (b10 == null) {
                return false;
            }
        } while (!C0286a.f20471p.compareAndSet(b10, -1, 0));
        LockSupport.unpark(b10);
        return true;
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f20470n.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a10; i16++) {
            C0286a b10 = this.f20470n.b(i16);
            if (b10 != null) {
                m mVar = b10.f20472a;
                mVar.getClass();
                if (m.f20498b.get(mVar) != null) {
                    i10 = (m.f20499c.get(mVar) - m.f20500d.get(mVar)) + 1;
                } else {
                    i10 = m.f20499c.get(mVar) - m.f20500d.get(mVar);
                }
                int g2 = v.g(b10.f20474c);
                if (g2 == 0) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (g2 == 1) {
                    i12++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i10);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (g2 == 2) {
                    i13++;
                } else if (g2 == 3) {
                    i14++;
                    if (i10 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i10);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (g2 == 4) {
                    i15++;
                }
            }
        }
        long j10 = f20461p.get(this);
        return this.f20467d + '@' + g0.T(this) + "[Pool Size {core = " + this.f20464a + ", max = " + this.f20465b + "}, Worker States {CPU = " + i11 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f20468e.c() + ", global blocking queue size = " + this.f20469f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f20464a - ((int) ((j10 & 9223367638808264704L) >> 42))) + "}]";
    }
}
