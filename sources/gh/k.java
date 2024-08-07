package gh;

import android.view.View;
import com.vpa.daugia.module.cart.data.model.Cart;
import eh.e;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.g4;
import of.a;
import of.b;
import rk.l;
import sk.j;
import ze.f;

/* compiled from: RefundCartFragment.kt */
public final class k extends sk.k implements l<f<? extends ArrayList<Cart>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f20311a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(1);
        this.f20311a = lVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20311a.k0().dismiss();
            View view = ((g4) this.f20311a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f20311a.k0().dismiss();
            ((e) this.f20311a.f20314n0.getValue()).A((List) ((f.c) fVar).f18006a);
            ((g4) this.f20311a.i0()).f21079w.b(((e) this.f20311a.f20314n0.getValue()).f9444f);
        }
        return i.f20112a;
    }
}
