package j$.util.function;

import j$.util.function.ToLongFunction;
import java.util.function.ToLongFunction;

public final /* synthetic */ class N0 implements ToLongFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ToLongFunction f18505a;

    private /* synthetic */ N0(ToLongFunction toLongFunction) {
        this.f18505a = toLongFunction;
    }

    public static /* synthetic */ ToLongFunction a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof ToLongFunction.VivifiedWrapper ? ((ToLongFunction.VivifiedWrapper) toLongFunction).f18512a : new N0(toLongFunction);
    }

    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f18505a.applyAsLong(obj);
    }
}
