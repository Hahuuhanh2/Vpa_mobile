package j$.util.function;

import java.util.function.LongToIntFunction;

public final /* synthetic */ class q0 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongToIntFunction f18545a;

    private /* synthetic */ q0(LongToIntFunction longToIntFunction) {
        this.f18545a = longToIntFunction;
    }

    public static /* synthetic */ s0 b(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return longToIntFunction instanceof r0 ? ((r0) longToIntFunction).f18547a : new q0(longToIntFunction);
    }

    public final /* synthetic */ int a(long j10) {
        return this.f18545a.applyAsInt(j10);
    }
}
