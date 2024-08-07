package gh;

import android.content.Intent;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: UnpaidCartFragment.kt */
public final class w extends k implements l<Cart, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20343a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(t tVar) {
        super(1);
        this.f20343a = tVar;
    }

    public final Object invoke(Object obj) {
        Cart cart = (Cart) obj;
        j.f(cart, "it");
        Intent intent = new Intent(this.f20343a.d0(), PaymentActivity.class);
        intent.putExtra("DATA_CART", cart.getOrderId());
        this.f20343a.h0(intent);
        return i.f20112a;
    }
}
