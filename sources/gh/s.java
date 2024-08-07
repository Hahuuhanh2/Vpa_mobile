package gh;

import android.view.View;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.data.model.Order;
import ek.i;
import fh.c;
import java.util.ArrayList;
import mg.g4;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: UnpaidCartFragment.kt */
public final class s extends k implements l<f<? extends ArrayList<Order>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20328a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(t tVar) {
        super(1);
        this.f20328a = tVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((g4) this.f20328a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            new c(this.f20328a.d0(), (ArrayList) ((f.c) fVar).f18006a, CartStatus.NOT_PAID).h();
        }
        return i.f20112a;
    }
}
