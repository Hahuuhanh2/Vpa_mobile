package eh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.cart.data.model.Cart;
import ef.d;
import ek.i;
import gh.x;
import java.io.Serializable;
import mg.h7;
import rk.l;
import sk.j;

/* compiled from: UnpaidCartAdapter.kt */
public final class f extends d<Cart, h7> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Cart, i> f20066p;

    /* renamed from: q  reason: collision with root package name */
    public l<? super Cart, i> f20067q;

    /* renamed from: r  reason: collision with root package name */
    public l<? super Cart, i> f20068r;

    public f(x xVar) {
        super(xVar);
        this.f20066p = xVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        h7 h7Var = (h7) lVar;
        Cart cart = (Cart) serializable;
        j.f(h7Var, "binding");
        j.f(cart, "model");
        h7Var.v(new a(cart));
        h7Var.f21096x.setOnClickListener(new af.d(2, this, cart));
        h7Var.f21095w.setOnClickListener(new tg.d(2, this, cart));
    }

    public final int x() {
        return C0535R$layout.item_unpaid_cart;
    }

    public final void z(Serializable serializable) {
        Cart cart = (Cart) serializable;
        j.f(cart, "model");
        this.f20066p.invoke(cart);
    }
}
