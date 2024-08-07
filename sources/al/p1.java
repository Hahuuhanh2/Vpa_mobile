package al;

import ek.i;
import ik.d;
import ik.f;
import p3.l0;
import rk.l;
import rk.p;

/* compiled from: Builders.common.kt */
public final class p1 extends x1 {

    /* renamed from: d  reason: collision with root package name */
    public final d<i> f19083d;

    public p1(f fVar, p<? super d0, ? super d<? super i>, ? extends Object> pVar) {
        super(fVar, false);
        this.f19083d = g0.K(this, this, pVar);
    }

    public final void a0() {
        try {
            g0.g0(g0.b0(this.f19083d), i.f20112a, (l) null);
        } catch (Throwable th2) {
            resumeWith(l0.A(th2));
            throw th2;
        }
    }
}
