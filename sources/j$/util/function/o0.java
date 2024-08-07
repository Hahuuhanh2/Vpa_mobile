package j$.util.function;

import java.util.function.LongToDoubleFunction;

public final /* synthetic */ class o0 implements LongToDoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f18543a;

    private /* synthetic */ o0(p0 p0Var) {
        this.f18543a = p0Var;
    }

    public static /* synthetic */ LongToDoubleFunction a(p0 p0Var) {
        if (p0Var == null) {
            return null;
        }
        return p0Var instanceof C0389n0 ? ((C0389n0) p0Var).f18541a : new o0(p0Var);
    }

    public final /* synthetic */ double applyAsDouble(long j10) {
        return ((C0389n0) this.f18543a).a(j10);
    }
}
