package gh;

import android.view.View;
import com.vpa.daugia.module.cart.data.model.Cart;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.g4;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: UnpaidCartFragment.kt */
public final class p extends k implements l<f<? extends ArrayList<Cart>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20325a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(t tVar) {
        super(1);
        this.f20325a = tVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20325a.k0().dismiss();
            View view = ((g4) this.f20325a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f20325a.k0().dismiss();
            this.f20325a.m0().A((List) ((f.c) fVar).f18006a);
            ((g4) this.f20325a.i0()).f21079w.b(this.f20325a.m0().f9444f);
        }
        return i.f20112a;
    }
}
