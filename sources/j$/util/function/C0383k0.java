package j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.k0  reason: case insensitive filesystem */
public final /* synthetic */ class C0383k0 implements C0387m0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongPredicate f18537a;

    private /* synthetic */ C0383k0(LongPredicate longPredicate) {
        this.f18537a = longPredicate;
    }

    public static /* synthetic */ C0387m0 b(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return longPredicate instanceof C0385l0 ? ((C0385l0) longPredicate).f18539a : new C0383k0(longPredicate);
    }

    public final /* synthetic */ C0387m0 a(C0387m0 m0Var) {
        return b(this.f18537a.and(C0385l0.a(m0Var)));
    }

    public final /* synthetic */ C0387m0 c() {
        return b(this.f18537a.negate());
    }

    public final /* synthetic */ C0387m0 d(C0387m0 m0Var) {
        return b(this.f18537a.or(C0385l0.a(m0Var)));
    }

    public final /* synthetic */ boolean e(long j10) {
        return this.f18537a.test(j10);
    }
}
