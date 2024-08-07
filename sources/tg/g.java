package tg;

import ch.a;
import com.google.android.material.button.MaterialButton;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import ef.d;
import ek.i;
import java.io.Serializable;
import kf.b;
import mg.e5;
import rk.l;
import rk.p;
import sk.j;
import ug.e;

/* compiled from: AwaitAuctionAdapter.kt */
public final class g extends d<OrderWaitAuction, e5> {

    /* renamed from: p  reason: collision with root package name */
    public final l<OrderWaitAuction, i> f22981p;

    /* renamed from: q  reason: collision with root package name */
    public l<? super OrderWaitAuction, i> f22982q;

    /* renamed from: r  reason: collision with root package name */
    public p<? super Boolean, ? super OrderWaitAuction, i> f22983r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a aVar) {
        super(aVar);
        j.f(aVar, "listener");
        this.f22981p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        e5 e5Var = (e5) lVar;
        OrderWaitAuction orderWaitAuction = (OrderWaitAuction) serializable;
        j.f(e5Var, "binding");
        j.f(orderWaitAuction, "model");
        e5Var.v(new e(orderWaitAuction));
        e5Var.A.setOnClickListener(new d(0, this, orderWaitAuction));
        MaterialButton materialButton = e5Var.f21048w;
        j.e(materialButton, "btnJoin");
        materialButton.setOnClickListener(new b(500, materialButton, new f(this, orderWaitAuction)));
        e5Var.f21050y.setOnClickListener(new e(e5Var, this, orderWaitAuction, 0));
    }

    public final int x() {
        return C0535R$layout.item_await_auction;
    }
}
