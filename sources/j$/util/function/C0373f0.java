package j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.f0  reason: case insensitive filesystem */
public final /* synthetic */ class C0373f0 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0375g0 f18529a;

    private /* synthetic */ C0373f0(C0375g0 g0Var) {
        this.f18529a = g0Var;
    }

    public static /* synthetic */ LongConsumer a(C0375g0 g0Var) {
        if (g0Var == null) {
            return null;
        }
        return g0Var instanceof C0371e0 ? ((C0371e0) g0Var).f18528a : new C0373f0(g0Var);
    }

    public final /* synthetic */ void accept(long j10) {
        this.f18529a.accept(j10);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return a(this.f18529a.i(C0371e0.a(longConsumer)));
    }
}
