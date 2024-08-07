package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
abstract class C0423c extends C0501v0 implements C0449i {

    /* renamed from: h  reason: collision with root package name */
    private final C0423c f18759h;

    /* renamed from: i  reason: collision with root package name */
    private final C0423c f18760i;

    /* renamed from: j  reason: collision with root package name */
    protected final int f18761j;

    /* renamed from: k  reason: collision with root package name */
    private C0423c f18762k;

    /* renamed from: l  reason: collision with root package name */
    private int f18763l;

    /* renamed from: m  reason: collision with root package name */
    private int f18764m;

    /* renamed from: n  reason: collision with root package name */
    private Spliterator f18765n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18766o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f18767p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f18768q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f18769r;

    static {
        Class<C0423c> cls = C0423c.class;
    }

    C0423c(Spliterator spliterator, int i10, boolean z10) {
        this.f18760i = null;
        this.f18765n = spliterator;
        this.f18759h = this;
        int i11 = T2.f18692g & i10;
        this.f18761j = i11;
        this.f18764m = (~(i11 << 1)) & T2.f18697l;
        this.f18763l = 0;
        this.f18769r = z10;
    }

    C0423c(C0423c cVar, int i10) {
        if (!cVar.f18766o) {
            cVar.f18766o = true;
            cVar.f18762k = this;
            this.f18760i = cVar;
            this.f18761j = T2.f18693h & i10;
            this.f18764m = T2.m(i10, cVar.f18764m);
            C0423c cVar2 = cVar.f18759h;
            this.f18759h = cVar2;
            if (H1()) {
                cVar2.f18767p = true;
            }
            this.f18763l = cVar.f18763l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    private Spliterator J1(int i10) {
        int i11;
        int i12;
        C0423c cVar = this.f18759h;
        Spliterator spliterator = cVar.f18765n;
        if (spliterator != null) {
            cVar.f18765n = null;
            if (cVar.f18769r && cVar.f18767p) {
                C0423c cVar2 = cVar.f18762k;
                int i13 = 1;
                while (cVar != this) {
                    int i14 = cVar2.f18761j;
                    if (cVar2.H1()) {
                        i13 = 0;
                        if (T2.SHORT_CIRCUIT.t(i14)) {
                            i14 &= ~T2.f18706u;
                        }
                        spliterator = cVar2.G1(cVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i12 = i14 & (~T2.f18705t);
                            i11 = T2.f18704s;
                        } else {
                            i12 = i14 & (~T2.f18704s);
                            i11 = T2.f18705t;
                        }
                        i14 = i12 | i11;
                    }
                    cVar2.f18763l = i13;
                    cVar2.f18764m = T2.m(i14, cVar.f18764m);
                    i13++;
                    C0423c cVar3 = cVar2;
                    cVar2 = cVar2.f18762k;
                    cVar = cVar3;
                }
            }
            if (i10 != 0) {
                this.f18764m = T2.m(i10, this.f18764m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* access modifiers changed from: package-private */
    public abstract void A1(Spliterator spliterator, C0440f2 f2Var);

    /* access modifiers changed from: package-private */
    public abstract int B1();

    /* access modifiers changed from: package-private */
    public final int C1() {
        C0423c cVar = this;
        while (cVar.f18763l > 0) {
            cVar = cVar.f18760i;
        }
        return cVar.B1();
    }

    /* access modifiers changed from: package-private */
    public final boolean D1() {
        return T2.ORDERED.t(this.f18764m);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator E1() {
        return J1(0);
    }

    /* access modifiers changed from: package-private */
    public E0 F1(Spliterator spliterator, IntFunction intFunction, C0423c cVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* access modifiers changed from: package-private */
    public Spliterator G1(C0423c cVar, Spliterator spliterator) {
        return F1(spliterator, new C0418b(0), cVar).spliterator();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean H1();

    /* access modifiers changed from: package-private */
    public abstract C0440f2 I1(int i10, C0440f2 f2Var);

    /* access modifiers changed from: package-private */
    public final Spliterator K1() {
        C0423c cVar = this.f18759h;
        if (this != cVar) {
            throw new IllegalStateException();
        } else if (!this.f18766o) {
            this.f18766o = true;
            Spliterator spliterator = cVar.f18765n;
            if (spliterator != null) {
                cVar.f18765n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Spliterator L1(C0501v0 v0Var, C0413a aVar, boolean z10);

    /* access modifiers changed from: package-private */
    public final Spliterator M1(Spliterator spliterator) {
        return this.f18763l == 0 ? spliterator : L1(this, new C0413a(0, spliterator), this.f18759h.f18769r);
    }

    /* access modifiers changed from: package-private */
    public final void T0(Spliterator spliterator, C0440f2 f2Var) {
        f2Var.getClass();
        if (!T2.SHORT_CIRCUIT.t(this.f18764m)) {
            f2Var.f(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(f2Var);
            f2Var.end();
            return;
        }
        U0(spliterator, f2Var);
    }

    /* access modifiers changed from: package-private */
    public final void U0(Spliterator spliterator, C0440f2 f2Var) {
        C0423c cVar = this;
        while (cVar.f18763l > 0) {
            cVar = cVar.f18760i;
        }
        f2Var.f(spliterator.getExactSizeIfKnown());
        cVar.A1(spliterator, f2Var);
        f2Var.end();
    }

    /* access modifiers changed from: package-private */
    public final long Y0(Spliterator spliterator) {
        if (T2.SIZED.t(this.f18764m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1;
    }

    public final void close() {
        this.f18766o = true;
        this.f18765n = null;
        C0423c cVar = this.f18759h;
        Runnable runnable = cVar.f18768q;
        if (runnable != null) {
            cVar.f18768q = null;
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    public final int e1() {
        return this.f18764m;
    }

    public final boolean isParallel() {
        return this.f18759h.f18769r;
    }

    public final C0449i onClose(Runnable runnable) {
        C0423c cVar = this.f18759h;
        Runnable runnable2 = cVar.f18768q;
        if (runnable2 != null) {
            runnable = new z3(runnable2, runnable);
        }
        cVar.f18768q = runnable;
        return this;
    }

    public final C0449i parallel() {
        this.f18759h.f18769r = true;
        return this;
    }

    public final C0449i sequential() {
        this.f18759h.f18769r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (!this.f18766o) {
            this.f18766o = true;
            C0423c cVar = this.f18759h;
            if (this != cVar) {
                return L1(this, new C0413a(1, this), cVar.f18769r);
            }
            Spliterator spliterator = cVar.f18765n;
            if (spliterator != null) {
                cVar.f18765n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 u1(Spliterator spliterator, C0440f2 f2Var) {
        f2Var.getClass();
        T0(spliterator, v1(f2Var));
        return f2Var;
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 v1(C0440f2 f2Var) {
        f2Var.getClass();
        for (C0423c cVar = this; cVar.f18763l > 0; cVar = cVar.f18760i) {
            f2Var = cVar.I1(cVar.f18760i.f18764m, f2Var);
        }
        return f2Var;
    }

    /* access modifiers changed from: package-private */
    public final E0 w1(Spliterator spliterator, boolean z10, IntFunction intFunction) {
        if (this.f18759h.f18769r) {
            return z1(this, spliterator, z10, intFunction);
        }
        C0517z0 p12 = p1(Y0(spliterator), intFunction);
        u1(spliterator, p12);
        return p12.build();
    }

    /* access modifiers changed from: package-private */
    public final Object x1(A3 a32) {
        if (!this.f18766o) {
            this.f18766o = true;
            return this.f18759h.f18769r ? a32.w(this, J1(a32.N())) : a32.l0(this, J1(a32.N()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    public final E0 y1(IntFunction intFunction) {
        if (!this.f18766o) {
            this.f18766o = true;
            if (!this.f18759h.f18769r || this.f18760i == null || !H1()) {
                return w1(J1(0), true, intFunction);
            }
            this.f18763l = 0;
            C0423c cVar = this.f18760i;
            return F1(cVar.J1(0), intFunction, cVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    public abstract E0 z1(C0501v0 v0Var, Spliterator spliterator, boolean z10, IntFunction intFunction);
}
