package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* renamed from: j$.util.stream.z2  reason: case insensitive filesystem */
final class C0519z2 extends C0446h0 {
    C0519z2(C0423c cVar) {
        super(cVar, T2.f18702q | T2.f18700o);
    }

    public final E0 F1(Spliterator spliterator, IntFunction intFunction, C0423c cVar) {
        if (T2.SORTED.t(cVar.e1())) {
            return cVar.w1(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((C0) cVar.w1(spliterator, true, intFunction)).b();
        Arrays.sort(jArr);
        return new C0455j1(jArr);
    }

    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        f2Var.getClass();
        return T2.SORTED.t(i10) ? f2Var : T2.SIZED.t(i10) ? new E2(f2Var) : new C0507w2(f2Var);
    }
}
