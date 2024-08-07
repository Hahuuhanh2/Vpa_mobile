package gh;

import android.view.View;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.data.model.Order;
import ek.i;
import fh.c;
import java.util.ArrayList;
import mg.p3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: PaidCartFragment.kt */
public final class f extends k implements l<ze.f<? extends ArrayList<Order>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f20297a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(1);
        this.f20297a = hVar;
    }

    public final Object invoke(Object obj) {
        ze.f fVar = (ze.f) obj;
        if (fVar instanceof f.a) {
            View view = ((p3) this.f20297a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            new c(this.f20297a.d0(), (ArrayList) ((f.c) fVar).f18006a, CartStatus.PAID).h();
        }
        return i.f20112a;
    }
}
