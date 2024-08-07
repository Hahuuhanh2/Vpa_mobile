package j$.util.function;

import java.util.function.DoubleUnaryOperator;

public final /* synthetic */ class A implements C {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleUnaryOperator f18474a;

    private /* synthetic */ A(DoubleUnaryOperator doubleUnaryOperator) {
        this.f18474a = doubleUnaryOperator;
    }

    public static /* synthetic */ C d(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return doubleUnaryOperator instanceof B ? ((B) doubleUnaryOperator).f18476a : new A(doubleUnaryOperator);
    }

    public final /* synthetic */ C a(C c10) {
        return d(this.f18474a.andThen(B.a(c10)));
    }

    public final /* synthetic */ double b(double d10) {
        return this.f18474a.applyAsDouble(d10);
    }

    public final /* synthetic */ C c(C c10) {
        return d(this.f18474a.compose(B.a(c10)));
    }
}
