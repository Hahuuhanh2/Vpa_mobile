package j$.util.stream;

import j$.util.Comparator;
import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;
import java.util.Comparator;

final class A2 extends V1 {

    /* renamed from: t  reason: collision with root package name */
    private final boolean f18578t;

    /* renamed from: u  reason: collision with root package name */
    private final Comparator f18579u;

    A2(C0423c cVar) {
        super(cVar, T2.f18702q | T2.f18700o);
        this.f18578t = true;
        this.f18579u = Comparator.CC.a();
    }

    A2(C0423c cVar, java.util.Comparator comparator) {
        super(cVar, T2.f18702q | T2.f18701p);
        this.f18578t = false;
        comparator.getClass();
        this.f18579u = comparator;
    }

    public final E0 F1(Spliterator spliterator, IntFunction intFunction, C0423c cVar) {
        if (T2.SORTED.t(cVar.e1()) && this.f18578t) {
            return cVar.w1(spliterator, false, intFunction);
        }
        Object[] o10 = cVar.w1(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(o10, this.f18579u);
        return new H0(o10);
    }

    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        f2Var.getClass();
        return (!T2.SORTED.t(i10) || !this.f18578t) ? T2.SIZED.t(i10) ? new F2(f2Var, this.f18579u) : new B2(f2Var, this.f18579u) : f2Var;
    }
}
