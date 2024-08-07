package j$.util.function;

import j$.util.function.ToIntFunction;
import java.util.function.ToIntFunction;

public final /* synthetic */ class M0 implements ToIntFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ToIntFunction f18503a;

    private /* synthetic */ M0(ToIntFunction toIntFunction) {
        this.f18503a = toIntFunction;
    }

    public static /* synthetic */ ToIntFunction a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof ToIntFunction.VivifiedWrapper ? ((ToIntFunction.VivifiedWrapper) toIntFunction).f18511a : new M0(toIntFunction);
    }

    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f18503a.applyAsInt(obj);
    }
}
