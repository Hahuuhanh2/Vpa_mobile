package tg;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.AuctionResult;
import com.vpa.daugia.module.auction.ui.activity.b;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.a5;
import rk.l;
import sk.j;
import ug.a;

/* compiled from: AuctionResultAdapter.kt */
public final class c extends d<AuctionResult, a5> {

    /* renamed from: p  reason: collision with root package name */
    public final l<AuctionResult, i> f22971p;

    public c(b bVar) {
        super(bVar);
        this.f22971p = bVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        a5 a5Var = (a5) lVar;
        AuctionResult auctionResult = (AuctionResult) serializable;
        j.f(a5Var, "binding");
        j.f(auctionResult, "model");
        a5Var.v(new a(auctionResult));
    }

    public final int x() {
        return C0535R$layout.item_auction_result;
    }

    public final void z(Serializable serializable) {
        AuctionResult auctionResult = (AuctionResult) serializable;
        j.f(auctionResult, "model");
        this.f22971p.invoke(auctionResult);
    }
}
