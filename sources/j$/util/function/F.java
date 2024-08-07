package j$.util.function;

import java.util.function.IntBinaryOperator;

public final /* synthetic */ class F implements H {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f18487a;

    private /* synthetic */ F(IntBinaryOperator intBinaryOperator) {
        this.f18487a = intBinaryOperator;
    }

    public static /* synthetic */ H a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof G ? ((G) intBinaryOperator).f18489a : new F(intBinaryOperator);
    }

    public final /* synthetic */ int applyAsInt(int i10, int i11) {
        return this.f18487a.applyAsInt(i10, i11);
    }
}
