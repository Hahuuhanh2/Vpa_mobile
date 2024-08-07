package j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0395u implements C0397w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DoubleToIntFunction f18552a;

    private /* synthetic */ C0395u(DoubleToIntFunction doubleToIntFunction) {
        this.f18552a = doubleToIntFunction;
    }

    public static /* synthetic */ C0397w b(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return doubleToIntFunction instanceof C0396v ? ((C0396v) doubleToIntFunction).f18554a : new C0395u(doubleToIntFunction);
    }

    public final /* synthetic */ int a(double d10) {
        return this.f18552a.applyAsInt(d10);
    }
}
