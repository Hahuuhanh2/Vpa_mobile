package j$.util.function;

import java.util.function.IntToDoubleFunction;

public final /* synthetic */ class S implements IntToDoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ T f18509a;

    private /* synthetic */ S(T t10) {
        this.f18509a = t10;
    }

    public static /* synthetic */ IntToDoubleFunction a(T t10) {
        if (t10 == null) {
            return null;
        }
        return t10 instanceof Q ? ((Q) t10).f18508a : new S(t10);
    }

    public final /* synthetic */ double applyAsDouble(int i10) {
        return ((Q) this.f18509a).a(i10);
    }
}
