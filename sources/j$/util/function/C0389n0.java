package j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.n0  reason: case insensitive filesystem */
public final /* synthetic */ class C0389n0 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongToDoubleFunction f18541a;

    private /* synthetic */ C0389n0(LongToDoubleFunction longToDoubleFunction) {
        this.f18541a = longToDoubleFunction;
    }

    public static /* synthetic */ p0 b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return longToDoubleFunction instanceof o0 ? ((o0) longToDoubleFunction).f18543a : new C0389n0(longToDoubleFunction);
    }

    public final /* synthetic */ double a(long j10) {
        return this.f18541a.applyAsDouble(j10);
    }
}
