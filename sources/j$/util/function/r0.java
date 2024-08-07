package j$.util.function;

import java.util.function.LongToIntFunction;

public final /* synthetic */ class r0 implements LongToIntFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s0 f18547a;

    private /* synthetic */ r0(s0 s0Var) {
        this.f18547a = s0Var;
    }

    public static /* synthetic */ LongToIntFunction a(s0 s0Var) {
        if (s0Var == null) {
            return null;
        }
        return s0Var instanceof q0 ? ((q0) s0Var).f18545a : new r0(s0Var);
    }

    public final /* synthetic */ int applyAsInt(long j10) {
        return ((q0) this.f18547a).a(j10);
    }
}
