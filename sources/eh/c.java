package eh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.cart.data.model.Cart;
import ef.d;
import ek.i;
import gh.g;
import java.io.Serializable;
import mg.m6;
import rk.l;
import sk.j;

/* compiled from: PaidCartAdapter.kt */
public final class c extends d<Cart, m6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Cart, i> f20062p;

    public c(g gVar) {
        super(gVar);
        this.f20062p = gVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        m6 m6Var = (m6) lVar;
        Cart cart = (Cart) serializable;
        j.f(m6Var, "binding");
        j.f(cart, "model");
        m6Var.v(new a(cart));
    }

    public final int x() {
        return C0535R$layout.item_paid_cart;
    }

    public final void z(Serializable serializable) {
        Cart cart = (Cart) serializable;
        j.f(cart, "model");
        this.f20062p.invoke(cart);
    }
}
