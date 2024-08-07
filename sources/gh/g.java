package gh;

import al.r0;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.cart.ui.CartViewModel;
import dh.f;
import ek.i;
import ik.d;
import p3.l0;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: PaidCartFragment.kt */
public final class g extends k implements l<Cart, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f20298a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.f20298a = hVar;
    }

    public final Object invoke(Object obj) {
        Cart cart = (Cart) obj;
        j.f(cart, "it");
        h hVar = this.f20298a;
        int i10 = h.f20299o0;
        CartViewModel m02 = hVar.m0();
        String orderId = cart.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        l0.j0(l0.d0(m02), r0.f19085b, new f(m02, orderId, (d<? super f>) null), 2);
        return i.f20112a;
    }
}
