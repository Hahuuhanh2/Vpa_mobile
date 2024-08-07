package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0382k;
import j$.util.function.C0388n;

final class O extends T implements C0426c2 {

    /* renamed from: b  reason: collision with root package name */
    final C0388n f18670b;

    O(C0388n nVar, boolean z10) {
        super(z10);
        this.f18670b = nVar;
    }

    public final void accept(double d10) {
        this.f18670b.accept(d10);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    public final Object l0(C0501v0 v0Var, Spliterator spliterator) {
        v0Var.u1(spliterator, this);
        return null;
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }

    public final /* bridge */ /* synthetic */ Object w(C0501v0 v0Var, Spliterator spliterator) {
        a(v0Var, spliterator);
        return null;
    }
}
