package kk;

import ik.d;
import ik.f;

/* compiled from: ContinuationImpl.kt */
public abstract class g extends a {
    public g(d<Object> dVar) {
        super(dVar);
        boolean z10;
        if (dVar != null) {
            if (dVar.getContext() == ik.g.f20653a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public final f getContext() {
        return ik.g.f20653a;
    }
}
