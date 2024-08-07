package fl;

import al.a0;
import al.a2;
import al.g0;
import al.p0;
import al.u;
import al.v;
import al.x0;
import android.support.v4.media.a;
import ek.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kk.d;
import sk.j;

/* compiled from: DispatchedContinuation.kt */
public final class f<T> extends p0<T> implements d, ik.d<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20227o = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f20228d;

    /* renamed from: e  reason: collision with root package name */
    public final ik.d<T> f20229e;

    /* renamed from: f  reason: collision with root package name */
    public Object f20230f = g0.f19022e;

    /* renamed from: n  reason: collision with root package name */
    public final Object f20231n;

    public f(a0 a0Var, ik.d<? super T> dVar) {
        super(-1);
        this.f20228d = a0Var;
        this.f20229e = dVar;
        Object fold = getContext().fold(0, v.f20265b);
        j.c(fold);
        this.f20231n = fold;
    }

    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof v) {
            ((v) obj).f19097b.invoke(cancellationException);
        }
    }

    public final ik.d<T> c() {
        return this;
    }

    public final d getCallerFrame() {
        ik.d<T> dVar = this.f20229e;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final ik.f getContext() {
        return this.f20229e.getContext();
    }

    public final Object h() {
        Object obj = this.f20230f;
        this.f20230f = g0.f19022e;
        return obj;
    }

    public final void resumeWith(Object obj) {
        Object obj2;
        ik.f context;
        Object b10;
        ik.f context2 = this.f20229e.getContext();
        Throwable a10 = ek.f.a(obj);
        if (a10 == null) {
            obj2 = obj;
        } else {
            obj2 = new u(a10, false);
        }
        if (this.f20228d.W(context2)) {
            this.f20230f = obj2;
            this.f19082c = 0;
            this.f20228d.s(context2, this);
            return;
        }
        x0 a11 = a2.a();
        if (a11.e0()) {
            this.f20230f = obj2;
            this.f19082c = 0;
            a11.c0(this);
            return;
        }
        a11.d0(true);
        try {
            context = getContext();
            b10 = v.b(context, this.f20231n);
            this.f20229e.resumeWith(obj);
            i iVar = i.f20112a;
            v.a(context, b10);
            do {
            } while (a11.j0());
        } catch (Throwable th2) {
            try {
                g(th2, (Throwable) null);
            } catch (Throwable th3) {
                a11.a0(true);
                throw th3;
            }
        }
        a11.a0(true);
    }

    public final String toString() {
        StringBuilder q10 = a.q("DispatchedContinuation[");
        q10.append(this.f20228d);
        q10.append(", ");
        q10.append(g0.j0(this.f20229e));
        q10.append(']');
        return q10.toString();
    }
}
