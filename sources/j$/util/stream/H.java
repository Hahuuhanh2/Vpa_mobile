package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.K0;
import j$.util.function.Predicate;

final class H implements A3 {

    /* renamed from: a  reason: collision with root package name */
    final boolean f18624a;

    /* renamed from: b  reason: collision with root package name */
    final Object f18625b;

    /* renamed from: c  reason: collision with root package name */
    final Predicate f18626c;

    /* renamed from: d  reason: collision with root package name */
    final K0 f18627d;

    H(boolean z10, int i10, Object obj, Predicate predicate, C0418b bVar) {
        this.f18624a = z10;
        this.f18625b = obj;
        this.f18626c = predicate;
        this.f18627d = bVar;
    }

    public final int N() {
        return T2.f18706u | (this.f18624a ? 0 : T2.f18703r);
    }

    public final Object l0(C0501v0 v0Var, Spliterator spliterator) {
        B3 b32 = (B3) this.f18627d.get();
        v0Var.u1(spliterator, b32);
        Object obj = b32.get();
        return obj != null ? obj : this.f18625b;
    }

    public final Object w(C0501v0 v0Var, Spliterator spliterator) {
        return new N(this, v0Var, spliterator).invoke();
    }
}
