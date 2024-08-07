package eh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.data.model.Order;
import ek.i;
import fh.b;
import java.io.Serializable;
import mg.q6;
import rk.l;
import sk.j;

/* compiled from: PlateInfoAdapter.kt */
public final class d extends ef.d<Order, q6> {

    /* renamed from: p  reason: collision with root package name */
    public final CartStatus f20063p;

    /* renamed from: q  reason: collision with root package name */
    public final l<Order, i> f20064q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(CartStatus cartStatus, b bVar) {
        super(bVar);
        j.f(cartStatus, "status");
        j.f(bVar, "listener");
        this.f20063p = cartStatus;
        this.f20064q = bVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        q6 q6Var = (q6) lVar;
        Order order = (Order) serializable;
        j.f(q6Var, "binding");
        j.f(order, "model");
        q6Var.v(new b(order, this.f20063p));
    }

    public final int x() {
        return C0535R$layout.item_plate_info;
    }
}
