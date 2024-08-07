package j$.util.function;

import j$.util.function.Function;
import java.util.function.Function;

public final /* synthetic */ class E implements Function {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Function f18485a;

    private /* synthetic */ E(Function function) {
        this.f18485a = function;
    }

    public static /* synthetic */ Function a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f18488a : new E(function);
    }

    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return a(this.f18485a.a(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f18485a.apply(obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return a(this.f18485a.d(Function.VivifiedWrapper.convert(function)));
    }
}
