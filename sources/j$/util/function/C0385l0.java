package j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.l0  reason: case insensitive filesystem */
public final /* synthetic */ class C0385l0 implements LongPredicate {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0387m0 f18539a;

    private /* synthetic */ C0385l0(C0387m0 m0Var) {
        this.f18539a = m0Var;
    }

    public static /* synthetic */ LongPredicate a(C0387m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        return m0Var instanceof C0383k0 ? ((C0383k0) m0Var).f18537a : new C0385l0(m0Var);
    }

    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return a(((C0383k0) this.f18539a).a(C0383k0.b(longPredicate)));
    }

    public final /* synthetic */ LongPredicate negate() {
        return a(((C0383k0) this.f18539a).c());
    }

    public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return a(((C0383k0) this.f18539a).d(C0383k0.b(longPredicate)));
    }

    public final /* synthetic */ boolean test(long j10) {
        return ((C0383k0) this.f18539a).e(j10);
    }
}
