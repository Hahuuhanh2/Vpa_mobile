package j$.util.function;

import java.util.function.LongUnaryOperator;

public final /* synthetic */ class v0 implements LongUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f18555a;

    private /* synthetic */ v0(w0 w0Var) {
        this.f18555a = w0Var;
    }

    public static /* synthetic */ LongUnaryOperator a(w0 w0Var) {
        if (w0Var == null) {
            return null;
        }
        return w0Var instanceof u0 ? ((u0) w0Var).f18553a : new v0(w0Var);
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return a(this.f18555a.e(u0.a(longUnaryOperator)));
    }

    public final /* synthetic */ long applyAsLong(long j10) {
        return this.f18555a.applyAsLong(j10);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return a(this.f18555a.b(u0.a(longUnaryOperator)));
    }
}
