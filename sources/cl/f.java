package cl;

import al.a;
import al.m1;
import ek.i;
import el.f;
import fk.u;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* compiled from: ChannelCoroutine.kt */
public class f<E> extends a<i> implements e<E> {

    /* renamed from: d  reason: collision with root package name */
    public final e<E> f19254d;

    public f(ik.f fVar, a aVar) {
        super(fVar, true);
        this.f19254d = aVar;
    }

    public final Object a(el.f fVar) {
        Object a10 = this.f19254d.a(fVar);
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        return a10;
    }

    public final Object b() {
        return this.f19254d.b();
    }

    public final boolean c(Throwable th2) {
        return this.f19254d.c(th2);
    }

    public final void cancel(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(w(), (Throwable) null, this);
            }
            t(cancellationException);
        }
    }

    public final Object e(u uVar, f.a.C0280a.C0281a aVar) {
        return this.f19254d.e(uVar, aVar);
    }

    public final void g(m mVar) {
        this.f19254d.g(mVar);
    }

    public final g<E> iterator() {
        return this.f19254d.iterator();
    }

    public final Object l(E e10) {
        return this.f19254d.l(e10);
    }

    public final boolean m() {
        return this.f19254d.m();
    }

    public final void t(CancellationException cancellationException) {
        CancellationException e02 = m1.e0(this, cancellationException);
        this.f19254d.cancel(e02);
        r(e02);
    }
}
