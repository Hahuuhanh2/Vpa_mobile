package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.K0;

/* renamed from: j$.util.stream.t0  reason: case insensitive filesystem */
final class C0493t0 implements A3 {

    /* renamed from: a  reason: collision with root package name */
    final C0489s0 f18895a;

    /* renamed from: b  reason: collision with root package name */
    final K0 f18896b;

    C0493t0(int i10, C0489s0 s0Var, C0469n nVar) {
        this.f18895a = s0Var;
        this.f18896b = nVar;
    }

    public final int N() {
        return T2.f18706u | T2.f18703r;
    }

    public final Object l0(C0501v0 v0Var, Spliterator spliterator) {
        C0485r0 r0Var = (C0485r0) this.f18896b.get();
        v0Var.u1(spliterator, r0Var);
        return Boolean.valueOf(r0Var.f18883b);
    }

    public final Object w(C0501v0 v0Var, Spliterator spliterator) {
        return (Boolean) new C0497u0(this, v0Var, spliterator).invoke();
    }
}
