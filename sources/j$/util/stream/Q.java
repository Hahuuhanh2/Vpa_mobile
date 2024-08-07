package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0369d0;
import j$.util.function.C0375g0;

final class Q extends T implements C0436e2 {

    /* renamed from: b  reason: collision with root package name */
    final C0375g0 f18677b;

    Q(C0375g0 g0Var, boolean z10) {
        super(z10);
        this.f18677b = g0Var;
    }

    public final void accept(long j10) {
        this.f18677b.accept(j10);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }

    public final Object l0(C0501v0 v0Var, Spliterator spliterator) {
        v0Var.u1(spliterator, this);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object w(C0501v0 v0Var, Spliterator spliterator) {
        a(v0Var, spliterator);
        return null;
    }
}
