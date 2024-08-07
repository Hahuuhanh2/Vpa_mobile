package al;

import ek.i;
import ik.d;
import ik.e;
import ik.f;
import jk.a;

/* compiled from: Delay.kt */
public final class m0 {
    public static final Object a(long j10, d<? super i> dVar) {
        if (j10 <= 0) {
            return i.f20112a;
        }
        l lVar = new l(1, g0.b0(dVar));
        lVar.t();
        if (j10 < Long.MAX_VALUE) {
            b(lVar.f19051e).i(j10, lVar);
        }
        Object s10 = lVar.s();
        if (s10 == a.COROUTINE_SUSPENDED) {
            return s10;
        }
        return i.f20112a;
    }

    public static final l0 b(f fVar) {
        l0 l0Var;
        int i10 = e.f20650k;
        f.b bVar = fVar.get(e.a.f20651a);
        if (bVar instanceof l0) {
            l0Var = (l0) bVar;
        } else {
            l0Var = null;
        }
        if (l0Var == null) {
            return i0.f19043a;
        }
        return l0Var;
    }
}
