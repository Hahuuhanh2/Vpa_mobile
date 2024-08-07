package j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.i0  reason: case insensitive filesystem */
public final /* synthetic */ class C0379i0 implements LongFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0381j0 f18534a;

    private /* synthetic */ C0379i0(C0381j0 j0Var) {
        this.f18534a = j0Var;
    }

    public static /* synthetic */ LongFunction a(C0381j0 j0Var) {
        if (j0Var == null) {
            return null;
        }
        return j0Var instanceof C0377h0 ? ((C0377h0) j0Var).f18532a : new C0379i0(j0Var);
    }

    public final /* synthetic */ Object apply(long j10) {
        return this.f18534a.apply(j10);
    }
}
