package j$.util.function;

import j$.util.function.ToDoubleFunction;
import java.util.function.ToDoubleFunction;

public final /* synthetic */ class L0 implements ToDoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ToDoubleFunction f18501a;

    private /* synthetic */ L0(ToDoubleFunction toDoubleFunction) {
        this.f18501a = toDoubleFunction;
    }

    public static /* synthetic */ ToDoubleFunction a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof ToDoubleFunction.VivifiedWrapper ? ((ToDoubleFunction.VivifiedWrapper) toDoubleFunction).f18510a : new L0(toDoubleFunction);
    }

    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f18501a.applyAsDouble(obj);
    }
}
