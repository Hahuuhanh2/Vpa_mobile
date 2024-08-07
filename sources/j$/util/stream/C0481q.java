package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
final class C0481q extends V1 {
    C0481q(C0423c cVar, int i10) {
        super(cVar, i10);
    }

    static I0 O1(C0423c cVar, Spliterator spliterator) {
        J0 j02 = new J0(19);
        return new I0((Collection) new C0502v1(1, new J0(21), new J0(20), j02, 3).w(cVar, spliterator));
    }

    /* access modifiers changed from: package-private */
    public final E0 F1(Spliterator spliterator, IntFunction intFunction, C0423c cVar) {
        if (T2.DISTINCT.t(cVar.e1())) {
            return cVar.w1(spliterator, false, intFunction);
        }
        if (T2.ORDERED.t(cVar.e1())) {
            return O1(cVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new S(new C0469n(0, atomicBoolean, concurrentHashMap), false).a(cVar, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add((Object) null);
            keySet = hashSet;
        }
        return new I0(keySet);
    }

    /* access modifiers changed from: package-private */
    public final Spliterator G1(C0423c cVar, Spliterator spliterator) {
        return T2.DISTINCT.t(cVar.e1()) ? cVar.M1(spliterator) : T2.ORDERED.t(cVar.e1()) ? O1(cVar, spliterator).spliterator() : new C0422b3(cVar.M1(spliterator));
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        f2Var.getClass();
        return T2.DISTINCT.t(i10) ? f2Var : T2.SORTED.t(i10) ? new C0473o(f2Var) : new C0477p(this, f2Var);
    }
}
