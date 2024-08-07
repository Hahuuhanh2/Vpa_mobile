package gh;

import al.r0;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.cart.ui.CartViewModel;
import dh.g;
import ek.i;
import ik.d;
import p3.l0;
import rk.a;
import sk.k;

/* compiled from: UnpaidCartFragment.kt */
public final class u extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20340a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Cart f20341b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(t tVar, Cart cart) {
        super(0);
        this.f20340a = tVar;
        this.f20341b = cart;
    }

    public final Object invoke() {
        t tVar = this.f20340a;
        int i10 = t.f20329o0;
        CartViewModel n02 = tVar.n0();
        String orderId = this.f20341b.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        l0.j0(l0.d0(n02), r0.f19085b, new g(n02, orderId, (d<? super g>) null), 2);
        return i.f20112a;
    }
}
