package fl;

import al.a0;
import al.b2;
import al.c0;
import al.i0;
import al.l0;
import al.t0;
import gl.l;
import ik.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: LimitedDispatcher.kt */
public final class g extends a0 implements l0 {

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20232o = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");

    /* renamed from: c  reason: collision with root package name */
    public final a0 f20233c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20234d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l0 f20235e;

    /* renamed from: f  reason: collision with root package name */
    public final j<Runnable> f20236f;

    /* renamed from: n  reason: collision with root package name */
    public final Object f20237n;
    private volatile int runningWorkers;

    /* compiled from: LimitedDispatcher.kt */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f20238a;

        public a(Runnable runnable) {
            this.f20238a = runnable;
        }

        public final void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f20238a.run();
                } catch (Throwable th2) {
                    c0.a(ik.g.f20653a, th2);
                }
                Runnable a02 = g.this.a0();
                if (a02 != null) {
                    this.f20238a = a02;
                    i10++;
                    if (i10 >= 16) {
                        g gVar = g.this;
                        if (gVar.f20233c.W(gVar)) {
                            g gVar2 = g.this;
                            gVar2.f20233c.s(gVar2, this);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public g(l lVar, int i10) {
        l0 l0Var;
        this.f20233c = lVar;
        this.f20234d = i10;
        if (lVar instanceof l0) {
            l0Var = (l0) lVar;
        } else {
            l0Var = null;
        }
        this.f20235e = l0Var == null ? i0.f19043a : l0Var;
        this.f20236f = new j<>();
        this.f20237n = new Object();
    }

    public final void U(f fVar, Runnable runnable) {
        boolean z10;
        Runnable a02;
        this.f20236f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20232o;
        if (atomicIntegerFieldUpdater.get(this) < this.f20234d) {
            synchronized (this.f20237n) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f20234d) {
                    z10 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z10 = true;
                }
            }
            if (z10 && (a02 = a0()) != null) {
                this.f20233c.U(this, new a(a02));
            }
        }
    }

    public final Runnable a0() {
        while (true) {
            Runnable d10 = this.f20236f.d();
            if (d10 != null) {
                return d10;
            }
            synchronized (this.f20237n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20232o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f20236f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final t0 d(long j10, b2 b2Var, f fVar) {
        return this.f20235e.d(j10, b2Var, fVar);
    }

    public final void i(long j10, al.l lVar) {
        this.f20235e.i(j10, lVar);
    }

    public final void s(f fVar, Runnable runnable) {
        boolean z10;
        Runnable a02;
        this.f20236f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20232o;
        if (atomicIntegerFieldUpdater.get(this) < this.f20234d) {
            synchronized (this.f20237n) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f20234d) {
                    z10 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z10 = true;
                }
            }
            if (z10 && (a02 = a0()) != null) {
                this.f20233c.s(this, new a(a02));
            }
        }
    }
}
