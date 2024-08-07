package j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.a0  reason: case insensitive filesystem */
public final /* synthetic */ class C0363a0 implements C0367c0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f18519a;

    private /* synthetic */ C0363a0(LongBinaryOperator longBinaryOperator) {
        this.f18519a = longBinaryOperator;
    }

    public static /* synthetic */ C0367c0 a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C0365b0 ? ((C0365b0) longBinaryOperator).f18521a : new C0363a0(longBinaryOperator);
    }

    public final /* synthetic */ long applyAsLong(long j10, long j11) {
        return this.f18519a.applyAsLong(j10, j11);
    }
}
