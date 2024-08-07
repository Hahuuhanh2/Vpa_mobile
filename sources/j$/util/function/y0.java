package j$.util.function;

import java.util.function.ObjDoubleConsumer;

public final /* synthetic */ class y0 implements ObjDoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f18559a;

    private /* synthetic */ y0(z0 z0Var) {
        this.f18559a = z0Var;
    }

    public static /* synthetic */ ObjDoubleConsumer a(z0 z0Var) {
        if (z0Var == null) {
            return null;
        }
        return z0Var instanceof x0 ? ((x0) z0Var).f18557a : new y0(z0Var);
    }

    public final /* synthetic */ void accept(Object obj, double d10) {
        this.f18559a.accept(obj, d10);
    }
}
