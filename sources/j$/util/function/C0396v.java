package j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.v  reason: case insensitive filesystem */
public final /* synthetic */ class C0396v implements DoubleToIntFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0397w f18554a;

    private /* synthetic */ C0396v(C0397w wVar) {
        this.f18554a = wVar;
    }

    public static /* synthetic */ DoubleToIntFunction a(C0397w wVar) {
        if (wVar == null) {
            return null;
        }
        return wVar instanceof C0395u ? ((C0395u) wVar).f18552a : new C0396v(wVar);
    }

    public final /* synthetic */ int applyAsInt(double d10) {
        return ((C0395u) this.f18554a).a(d10);
    }
}
