package al;

import ik.d;
import ik.f;
import jk.a;

/* compiled from: Builders.common.kt */
public class k0<T> extends a<T> implements j0<T> {
    public k0(f fVar, boolean z10) {
        super(fVar, z10);
    }

    public final Object await(d<? super T> dVar) {
        Object q10 = q(dVar);
        a aVar = a.COROUTINE_SUSPENDED;
        return q10;
    }

    public final T getCompleted() {
        return F();
    }
}
