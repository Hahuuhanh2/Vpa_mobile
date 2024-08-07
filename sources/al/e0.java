package al;

import al.i1;
import fl.d;
import fl.r;
import ik.f;
import jk.a;
import p3.l0;
import rk.p;

/* compiled from: CoroutineScope.kt */
public final class e0 {
    public static final d a(f fVar) {
        if (fVar.get(i1.b.f19045a) == null) {
            fVar = fVar.plus(new k1((i1) null));
        }
        return new d(fVar);
    }

    public static final <R> Object b(p<? super d0, ? super ik.d<? super R>, ? extends Object> pVar, ik.d<? super R> dVar) {
        r rVar = new r(dVar, dVar.getContext());
        Object J0 = l0.J0(rVar, rVar, pVar);
        a aVar = a.COROUTINE_SUSPENDED;
        return J0;
    }
}
