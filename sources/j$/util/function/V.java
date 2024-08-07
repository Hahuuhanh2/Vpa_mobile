package j$.util.function;

import java.util.function.IntToLongFunction;

public final /* synthetic */ class V implements IntToLongFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ W f18515a;

    private /* synthetic */ V(W w9) {
        this.f18515a = w9;
    }

    public static /* synthetic */ IntToLongFunction a(W w9) {
        if (w9 == null) {
            return null;
        }
        return w9 instanceof U ? ((U) w9).f18513a : new V(w9);
    }

    public final /* synthetic */ long applyAsLong(int i10) {
        return this.f18515a.applyAsLong(i10);
    }
}
