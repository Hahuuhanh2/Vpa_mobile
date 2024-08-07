package j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.h0  reason: case insensitive filesystem */
public final /* synthetic */ class C0377h0 implements C0381j0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LongFunction f18532a;

    private /* synthetic */ C0377h0(LongFunction longFunction) {
        this.f18532a = longFunction;
    }

    public static /* synthetic */ C0381j0 a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C0379i0 ? ((C0379i0) longFunction).f18534a : new C0377h0(longFunction);
    }

    public final /* synthetic */ Object apply(long j10) {
        return this.f18532a.apply(j10);
    }
}
