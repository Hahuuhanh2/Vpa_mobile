package j$.util.function;

import j$.util.function.IntFunction;
import java.util.function.IntFunction;

public final /* synthetic */ class M implements IntFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IntFunction f18502a;

    private /* synthetic */ M(IntFunction intFunction) {
        this.f18502a = intFunction;
    }

    public static /* synthetic */ IntFunction a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof IntFunction.VivifiedWrapper ? ((IntFunction.VivifiedWrapper) intFunction).f18497a : new M(intFunction);
    }

    public final /* synthetic */ Object apply(int i10) {
        return this.f18502a.apply(i10);
    }
}
