package eh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.cart.data.model.Cart;
import ef.d;
import ek.i;
import gh.m;
import java.io.Serializable;
import mg.w6;
import rk.l;
import sk.j;

/* compiled from: RefundCartAdapter.kt */
public final class e extends d<Cart, w6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Cart, i> f20065p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(m mVar) {
        super(mVar);
        j.f(mVar, "listener");
        this.f20065p = mVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        w6 w6Var = (w6) lVar;
        Cart cart = (Cart) serializable;
        j.f(w6Var, "binding");
        j.f(cart, "model");
        w6Var.v(new a(cart));
    }

    public final int x() {
        return C0535R$layout.item_refund_cart;
    }

    public final void z(Serializable serializable) {
        Cart cart = (Cart) serializable;
        j.f(cart, "model");
        this.f20065p.invoke(cart);
    }
}
