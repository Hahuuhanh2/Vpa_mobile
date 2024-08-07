package j$.util.function;

import java.util.function.IntUnaryOperator;

public final /* synthetic */ class Y implements IntUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Z f18517a;

    private /* synthetic */ Y(Z z10) {
        this.f18517a = z10;
    }

    public static /* synthetic */ IntUnaryOperator a(Z z10) {
        if (z10 == null) {
            return null;
        }
        return z10 instanceof X ? ((X) z10).f18516a : new Y(z10);
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return a(((X) this.f18517a).a(X.d(intUnaryOperator)));
    }

    public final /* synthetic */ int applyAsInt(int i10) {
        return ((X) this.f18517a).b(i10);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return a(((X) this.f18517a).c(X.d(intUnaryOperator)));
    }
}
