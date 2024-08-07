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

/* compiled from: UnpaidCartFragment.kt */
public final class x extends k implements l<Cart, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20344a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(t tVar) {
        super(1);
        this.f20344a = tVar;
    }

    public final Object invoke(Object obj) {
        Cart cart = (Cart) obj;
        j.f(cart, "it");
        t tVar = this.f20344a;
        int i10 = t.f20329o0;
        CartViewModel n02 = tVar.n0();
        String orderId = cart.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        l0.j0(l0.d0(n02), r0.f19085b, new f(n02, orderId, (d<? super f>) null), 2);
        return i.f20112a;
    }
}
