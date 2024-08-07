package j$.util.function;

import java.util.function.IntToDoubleFunction;

public final /* synthetic */ class Q implements T {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntToDoubleFunction f18508a;

    private /* synthetic */ Q(IntToDoubleFunction intToDoubleFunction) {
        this.f18508a = intToDoubleFunction;
    }

    public static /* synthetic */ T b(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return intToDoubleFunction instanceof S ? ((S) intToDoubleFunction).f18509a : new Q(intToDoubleFunction);
    }

    public final /* synthetic */ double a(int i10) {
        return this.f18508a.applyAsDouble(i10);
    }
}
