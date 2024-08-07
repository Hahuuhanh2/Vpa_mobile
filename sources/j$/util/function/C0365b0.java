package j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.b0  reason: case insensitive filesystem */
public final /* synthetic */ class C0365b0 implements LongBinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0367c0 f18521a;

    private /* synthetic */ C0365b0(C0367c0 c0Var) {
        this.f18521a = c0Var;
    }

    public static /* synthetic */ LongBinaryOperator a(C0367c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        return c0Var instanceof C0363a0 ? ((C0363a0) c0Var).f18519a : new C0365b0(c0Var);
    }

    public final /* synthetic */ long applyAsLong(long j10, long j11) {
        return this.f18521a.applyAsLong(j10, j11);
    }
}
