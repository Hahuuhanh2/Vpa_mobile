package j$.util.function;

import java.util.function.IntToLongFunction;

public final /* synthetic */ class U implements W {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntToLongFunction f18513a;

    private /* synthetic */ U(IntToLongFunction intToLongFunction) {
        this.f18513a = intToLongFunction;
    }

    public static /* synthetic */ W a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof V ? ((V) intToLongFunction).f18515a : new U(intToLongFunction);
    }

    public final /* synthetic */ long applyAsLong(int i10) {
        return this.f18513a.applyAsLong(i10);
    }
}
