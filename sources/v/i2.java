package v;

import androidx.camera.core.d;
import c0.k0;
import c0.p0;
import f0.d0;
import f0.h;
import f0.i;
import f0.j;
import f0.k;
import m0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i2 implements d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l2 f15709a;

    public /* synthetic */ i2(l2 l2Var) {
        this.f15709a = l2Var;
    }

    public final void f(d0 d0Var) {
        k kVar;
        l2 l2Var = this.f15709a;
        l2Var.getClass();
        try {
            d d10 = d0Var.d();
            if (d10 != null) {
                b bVar = l2Var.f15737b;
                bVar.getClass();
                k0 f02 = d10.f0();
                if (f02 instanceof j0.b) {
                    kVar = ((j0.b) f02).f11451a;
                } else {
                    kVar = null;
                }
                boolean z10 = false;
                if (kVar.h() == i.LOCKED_FOCUSED || kVar.h() == i.PASSIVE_FOCUSED) {
                    if (kVar.f() == h.CONVERGED) {
                        if (kVar.d() == j.CONVERGED) {
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    bVar.a(d10);
                    return;
                }
                bVar.f13044c.getClass();
                d10.close();
            }
        } catch (IllegalStateException e10) {
            e10.getMessage();
            p0.b("ZslControlImpl");
        }
    }
}
