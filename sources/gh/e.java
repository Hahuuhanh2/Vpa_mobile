package gh;

import android.view.View;
import com.vpa.daugia.module.cart.data.model.Cart;
import eh.c;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.p3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: PaidCartFragment.kt */
public final class e extends k implements l<f<? extends ArrayList<Cart>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f20296a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(1);
        this.f20296a = hVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20296a.k0().dismiss();
            View view = ((p3) this.f20296a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f20296a.k0().dismiss();
            ((c) this.f20296a.f20301n0.getValue()).A((List) ((f.c) fVar).f18006a);
            ((p3) this.f20296a.i0()).f21287w.b(((c) this.f20296a.f20301n0.getValue()).f9444f);
        }
        return i.f20112a;
    }
}
