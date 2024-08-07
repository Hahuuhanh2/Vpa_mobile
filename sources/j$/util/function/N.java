package j$.util.function;

import java.util.function.IntPredicate;

public final /* synthetic */ class N implements P {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntPredicate f18504a;

    private /* synthetic */ N(IntPredicate intPredicate) {
        this.f18504a = intPredicate;
    }

    public static /* synthetic */ P b(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return intPredicate instanceof O ? ((O) intPredicate).f18506a : new N(intPredicate);
    }

    public final /* synthetic */ P a(P p10) {
        return b(this.f18504a.and(O.a(p10)));
    }

    public final /* synthetic */ P c() {
        return b(this.f18504a.negate());
    }

    public final /* synthetic */ P d(P p10) {
        return b(this.f18504a.or(O.a(p10)));
    }

    public final /* synthetic */ boolean e(int i10) {
        return this.f18504a.test(i10);
    }
}
