package fl;

import al.a;
import al.g0;
import ik.f;
import kk.d;
import p3.l0;
import rk.l;

/* compiled from: Scopes.kt */
public class r<T> extends a<T> implements d {

    /* renamed from: d  reason: collision with root package name */
    public final ik.d<T> f20259d;

    public r(ik.d dVar, f fVar) {
        super(fVar, true);
        this.f20259d = dVar;
    }

    public final boolean T() {
        return true;
    }

    public final d getCallerFrame() {
        ik.d<T> dVar = this.f20259d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public void h0(Object obj) {
        this.f20259d.resumeWith(l0.x0(obj));
    }

    public void p(Object obj) {
        g0.g0(g0.b0(this.f20259d), l0.x0(obj), (l) null);
    }
}
