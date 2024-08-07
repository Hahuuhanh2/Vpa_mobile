package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.I;
import j$.util.function.L;

final class P extends T implements C0431d2 {

    /* renamed from: b  reason: collision with root package name */
    final L f18673b;

    P(L l10, boolean z10) {
        super(z10);
        this.f18673b = l10;
    }

    public final void accept(int i10) {
        this.f18673b.accept(i10);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        g((Integer) obj);
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    public final Object l0(C0501v0 v0Var, Spliterator spliterator) {
        v0Var.u1(spliterator, this);
        return null;
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }

    public final /* bridge */ /* synthetic */ Object w(C0501v0 v0Var, Spliterator spliterator) {
        a(v0Var, spliterator);
        return null;
    }
}
