package el;

import fl.r;
import ik.d;
import ik.f;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* compiled from: FlowCoroutine.kt */
public final class h<T> extends r<T> {
    public h(d dVar, f fVar) {
        super(dVar, fVar);
    }

    public final boolean y(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return r(th2);
    }
}
