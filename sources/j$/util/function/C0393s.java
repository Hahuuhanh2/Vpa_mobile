package j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0393s implements DoublePredicate {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0394t f18548a;

    private /* synthetic */ C0393s(C0394t tVar) {
        this.f18548a = tVar;
    }

    public static /* synthetic */ DoublePredicate a(C0394t tVar) {
        if (tVar == null) {
            return null;
        }
        return tVar instanceof r ? ((r) tVar).f18546a : new C0393s(tVar);
    }

    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return a(((r) this.f18548a).a(r.b(doublePredicate)));
    }

    public final /* synthetic */ DoublePredicate negate() {
        return a(((r) this.f18548a).c());
    }

    public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
        return a(((r) this.f18548a).d(r.b(doublePredicate)));
    }

    public final /* synthetic */ boolean test(double d10) {
        return ((r) this.f18548a).e(d10);
    }
}
