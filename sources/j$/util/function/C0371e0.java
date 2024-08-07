package j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.e0  reason: case insensitive filesystem */
public final /* synthetic */ class C0371e0 implements C0375g0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongConsumer f18528a;

    private /* synthetic */ C0371e0(LongConsumer longConsumer) {
        this.f18528a = longConsumer;
    }

    public static /* synthetic */ C0375g0 a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C0373f0 ? ((C0373f0) longConsumer).f18529a : new C0371e0(longConsumer);
    }

    public final /* synthetic */ void accept(long j10) {
        this.f18528a.accept(j10);
    }

    public final /* synthetic */ C0375g0 i(C0375g0 g0Var) {
        return a(this.f18528a.andThen(C0373f0.a(g0Var)));
    }
}
