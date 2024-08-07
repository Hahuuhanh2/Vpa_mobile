package gh;

import com.vpa.daugia.module.cart.data.model.Cart;
import ek.i;
import fh.a;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: UnpaidCartFragment.kt */
public final class v extends k implements l<Cart, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20342a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(t tVar) {
        super(1);
        this.f20342a = tVar;
    }

    public final Object invoke(Object obj) {
        Cart cart = (Cart) obj;
        j.f(cart, "it");
        a aVar = new a(this.f20342a.d0());
        aVar.f20168i = new u(this.f20342a, cart);
        aVar.h();
        return i.f20112a;
    }
}
