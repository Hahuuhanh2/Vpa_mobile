package j$.util.function;

import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.function.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0364b implements BiFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BiFunction f18520a;

    private /* synthetic */ C0364b(BiFunction biFunction) {
        this.f18520a = biFunction;
    }

    public static /* synthetic */ BiFunction a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof BiFunction.VivifiedWrapper ? ((BiFunction.VivifiedWrapper) biFunction).f18479a : new C0364b(biFunction);
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(Function function) {
        return a(this.f18520a.a(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f18520a.apply(obj, obj2);
    }
}
