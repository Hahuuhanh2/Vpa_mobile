package al;

import hl.c;
import ik.d;
import jk.a;
import sk.u;

/* compiled from: CompletableDeferred.kt */
public final class s<T> extends m1 implements r<T> {
    public s(i1 i1Var) {
        super(true);
        Q(i1Var);
    }

    public final boolean B(T t10) {
        return U(t10);
    }

    public final Object await(d<? super T> dVar) {
        Object q10 = q(dVar);
        a aVar = a.COROUTINE_SUSPENDED;
        return q10;
    }

    public final T getCompleted() {
        return F();
    }

    public final c<T> getOnAwait() {
        n1 n1Var = n1.f19078p;
        u.a(3, n1Var);
        o1 o1Var = o1.f19080p;
        u.a(3, o1Var);
        return new hl.d(this, n1Var, o1Var);
    }

    public final boolean z(Throwable th2) {
        return U(new u(th2, false));
    }
}
