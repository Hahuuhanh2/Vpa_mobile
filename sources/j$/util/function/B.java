package j$.util.function;

import java.util.function.DoubleUnaryOperator;

public final /* synthetic */ class B implements DoubleUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C f18476a;

    private /* synthetic */ B(C c10) {
        this.f18476a = c10;
    }

    public static /* synthetic */ DoubleUnaryOperator a(C c10) {
        if (c10 == null) {
            return null;
        }
        return c10 instanceof A ? ((A) c10).f18474a : new B(c10);
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        return a(((A) this.f18476a).a(A.d(doubleUnaryOperator)));
    }

    public final /* synthetic */ double applyAsDouble(double d10) {
        return ((A) this.f18476a).b(d10);
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        return a(((A) this.f18476a).c(A.d(doubleUnaryOperator)));
    }
}
