package j$.util.stream;

import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.K0;
import java.util.Comparator;

abstract class U2 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final boolean f18721a;

    /* renamed from: b  reason: collision with root package name */
    final C0501v0 f18722b;

    /* renamed from: c  reason: collision with root package name */
    private K0 f18723c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f18724d;

    /* renamed from: e  reason: collision with root package name */
    C0440f2 f18725e;

    /* renamed from: f  reason: collision with root package name */
    C0413a f18726f;

    /* renamed from: g  reason: collision with root package name */
    long f18727g;

    /* renamed from: h  reason: collision with root package name */
    C0433e f18728h;

    /* renamed from: i  reason: collision with root package name */
    boolean f18729i;

    U2(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        this.f18722b = v0Var;
        this.f18723c = null;
        this.f18724d = spliterator;
        this.f18721a = z10;
    }

    U2(C0501v0 v0Var, C0413a aVar, boolean z10) {
        this.f18722b = v0Var;
        this.f18723c = aVar;
        this.f18724d = null;
        this.f18721a = z10;
    }

    private boolean g() {
        boolean z10;
        while (this.f18728h.count() == 0) {
            if (!this.f18725e.h()) {
                C0413a aVar = this.f18726f;
                switch (aVar.f18747a) {
                    case 4:
                        C0432d3 d3Var = (C0432d3) aVar.f18748b;
                        z10 = d3Var.f18724d.a(d3Var.f18725e);
                        break;
                    case 5:
                        f3 f3Var = (f3) aVar.f18748b;
                        z10 = f3Var.f18724d.a(f3Var.f18725e);
                        break;
                    case 6:
                        h3 h3Var = (h3) aVar.f18748b;
                        z10 = h3Var.f18724d.a(h3Var.f18725e);
                        break;
                    default:
                        y3 y3Var = (y3) aVar.f18748b;
                        z10 = y3Var.f18724d.a(y3Var.f18725e);
                        break;
                }
                if (z10) {
                    continue;
                }
            }
            if (this.f18729i) {
                return false;
            }
            this.f18725e.end();
            this.f18729i = true;
        }
        return true;
    }

    public final int characteristics() {
        h();
        int U = T2.U(this.f18722b.e1()) & T2.f18691f;
        return (U & 64) != 0 ? (U & -16449) | (this.f18724d.characteristics() & 16448) : U;
    }

    public final long estimateSize() {
        h();
        return this.f18724d.estimateSize();
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        C0433e eVar = this.f18728h;
        boolean z10 = false;
        if (eVar != null) {
            long j10 = this.f18727g + 1;
            this.f18727g = j10;
            if (j10 < eVar.count()) {
                z10 = true;
            }
            if (z10) {
                return z10;
            }
            this.f18727g = 0;
            this.f18728h.clear();
            return g();
        } else if (this.f18729i) {
            return false;
        } else {
            h();
            i();
            this.f18727g = 0;
            this.f18725e.f(this.f18724d.getExactSizeIfKnown());
            return g();
        }
    }

    public final Comparator getComparator() {
        if (C0407m.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final long getExactSizeIfKnown() {
        h();
        if (T2.SIZED.t(this.f18722b.e1())) {
            return this.f18724d.getExactSizeIfKnown();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        if (this.f18724d == null) {
            this.f18724d = (Spliterator) this.f18723c.get();
            this.f18723c = null;
        }
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    /* access modifiers changed from: package-private */
    public abstract void i();

    /* access modifiers changed from: package-private */
    public abstract U2 k(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", new Object[]{getClass().getName(), this.f18724d});
    }

    public Spliterator trySplit() {
        if (!this.f18721a || this.f18729i) {
            return null;
        }
        h();
        Spliterator trySplit = this.f18724d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return k(trySplit);
    }
}
