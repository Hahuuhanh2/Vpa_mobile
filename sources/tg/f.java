package tg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AwaitAuctionAdapter.kt */
public final class f extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f22979a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OrderWaitAuction f22980b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar, OrderWaitAuction orderWaitAuction) {
        super(1);
        this.f22979a = gVar;
        this.f22980b = orderWaitAuction;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        l<? super OrderWaitAuction, i> lVar = this.f22979a.f22982q;
        if (lVar != null) {
            lVar.invoke(this.f22980b);
        }
        return i.f20112a;
    }
}
