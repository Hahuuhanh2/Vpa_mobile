package al;

import java.util.concurrent.locks.LockSupport;
import sk.j;

/* compiled from: Builders.kt */
public final class f<T> extends a<T> {

    /* renamed from: d  reason: collision with root package name */
    public final Thread f19014d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f19015e;

    public f(ik.f fVar, Thread thread, x0 x0Var) {
        super(fVar, true);
        this.f19014d = thread;
        this.f19015e = x0Var;
    }

    public final void p(Object obj) {
        if (!j.a(Thread.currentThread(), this.f19014d)) {
            LockSupport.unpark(this.f19014d);
        }
    }
}
