package gh;

import al.a0;
import al.e0;
import al.r0;
import android.view.View;
import ek.i;
import ik.d;
import mg.g4;
import of.a;
import of.b;
import p3.l0;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: UnpaidCartFragment.kt */
public final class r extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20327a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(t tVar) {
        super(1);
        this.f20327a = tVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((g4) this.f20327a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            View view2 = ((g4) this.f20327a.i0()).f8554e;
            j.e(view2, "getRoot(...)");
            new a(view2).a("Đã xoá đơn hàng", b.SUCCESS);
            l0.j0(e0.a(r0.f19085b), (a0) null, new q((d<? super q>) null), 3);
        }
        return i.f20112a;
    }
}
