package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0376h implements C0380j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f18531a;

    private /* synthetic */ C0376h(DoubleBinaryOperator doubleBinaryOperator) {
        this.f18531a = doubleBinaryOperator;
    }

    public static /* synthetic */ C0380j a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C0378i ? ((C0378i) doubleBinaryOperator).f18533a : new C0376h(doubleBinaryOperator);
    }

    public final /* synthetic */ double applyAsDouble(double d10, double d11) {
        return this.f18531a.applyAsDouble(d10, d11);
    }
}
