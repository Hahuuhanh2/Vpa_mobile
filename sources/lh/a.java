package lh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.history.data.model.AuctionHistory;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.w4;
import rk.l;
import sk.j;

/* compiled from: AuctionHistoryAdapter.kt */
public final class a extends d<AuctionHistory, w4> {

    /* renamed from: p  reason: collision with root package name */
    public final l<AuctionHistory, i> f20851p;

    public a(com.vpa.daugia.module.history.ui.activity.a aVar) {
        super(aVar);
        this.f20851p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        w4 w4Var = (w4) lVar;
        AuctionHistory auctionHistory = (AuctionHistory) serializable;
        j.f(w4Var, "binding");
        j.f(auctionHistory, "model");
        w4Var.v(new b(auctionHistory));
    }

    public final int x() {
        return C0535R$layout.item_auction_history;
    }

    public final void z(Serializable serializable) {
        AuctionHistory auctionHistory = (AuctionHistory) serializable;
        j.f(auctionHistory, "model");
        this.f20851p.invoke(auctionHistory);
    }
}
