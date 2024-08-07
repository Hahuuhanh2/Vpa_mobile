package j$.util.function;

import java.util.function.LongUnaryOperator;

public final /* synthetic */ class u0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongUnaryOperator f18553a;

    private /* synthetic */ u0(LongUnaryOperator longUnaryOperator) {
        this.f18553a = longUnaryOperator;
    }

    public static /* synthetic */ w0 a(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof v0 ? ((v0) longUnaryOperator).f18555a : new u0(longUnaryOperator);
    }

    public final /* synthetic */ long applyAsLong(long j10) {
        return this.f18553a.applyAsLong(j10);
    }

    public final /* synthetic */ w0 b(w0 w0Var) {
        return a(this.f18553a.compose(v0.a(w0Var)));
    }

    public final /* synthetic */ w0 e(w0 w0Var) {
        return a(this.f18553a.andThen(v0.a(w0Var)));
    }
}
