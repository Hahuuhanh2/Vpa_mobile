package j$.util.function;

import java.util.function.IntPredicate;

public final /* synthetic */ class O implements IntPredicate {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ P f18506a;

    private /* synthetic */ O(P p10) {
        this.f18506a = p10;
    }

    public static /* synthetic */ IntPredicate a(P p10) {
        if (p10 == null) {
            return null;
        }
        return p10 instanceof N ? ((N) p10).f18504a : new O(p10);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return a(((N) this.f18506a).a(N.b(intPredicate)));
    }

    public final /* synthetic */ IntPredicate negate() {
        return a(((N) this.f18506a).c());
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return a(((N) this.f18506a).d(N.b(intPredicate)));
    }

    public final /* synthetic */ boolean test(int i10) {
        return ((N) this.f18506a).e(i10);
    }
}
