package j$.util.function;

import java.util.function.IntUnaryOperator;

public final /* synthetic */ class X implements Z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntUnaryOperator f18516a;

    private /* synthetic */ X(IntUnaryOperator intUnaryOperator) {
        this.f18516a = intUnaryOperator;
    }

    public static /* synthetic */ Z d(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return intUnaryOperator instanceof Y ? ((Y) intUnaryOperator).f18517a : new X(intUnaryOperator);
    }

    public final /* synthetic */ Z a(Z z10) {
        return d(this.f18516a.andThen(Y.a(z10)));
    }

    public final /* synthetic */ int b(int i10) {
        return this.f18516a.applyAsInt(i10);
    }

    public final /* synthetic */ Z c(Z z10) {
        return d(this.f18516a.compose(Y.a(z10)));
    }
}
