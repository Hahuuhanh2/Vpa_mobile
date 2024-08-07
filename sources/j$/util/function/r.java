package j$.util.function;

import java.util.function.DoublePredicate;

public final /* synthetic */ class r implements C0394t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoublePredicate f18546a;

    private /* synthetic */ r(DoublePredicate doublePredicate) {
        this.f18546a = doublePredicate;
    }

    public static /* synthetic */ C0394t b(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return doublePredicate instanceof C0393s ? ((C0393s) doublePredicate).f18548a : new r(doublePredicate);
    }

    public final /* synthetic */ C0394t a(C0394t tVar) {
        return b(this.f18546a.and(C0393s.a(tVar)));
    }

    public final /* synthetic */ C0394t c() {
        return b(this.f18546a.negate());
    }

    public final /* synthetic */ C0394t d(C0394t tVar) {
        return b(this.f18546a.or(C0393s.a(tVar)));
    }

    public final /* synthetic */ boolean e(double d10) {
        return this.f18546a.test(d10);
    }
}
