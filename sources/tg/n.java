package tg;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.DetailAuctionResult;
import com.vpa.daugia.module.auction.ui.activity.c;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.k5;
import rk.l;
import sk.j;

/* compiled from: DetailAuctionResultAdapter.kt */
public final class n extends d<DetailAuctionResult, k5> {

    /* renamed from: p  reason: collision with root package name */
    public final l<DetailAuctionResult, i> f22999p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(c cVar) {
        super(cVar);
        j.f(cVar, "listener");
        this.f22999p = cVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        k5 k5Var = (k5) lVar;
        DetailAuctionResult detailAuctionResult = (DetailAuctionResult) serializable;
        j.f(k5Var, "binding");
        j.f(detailAuctionResult, "model");
        k5Var.v(new ug.d(detailAuctionResult));
    }

    public final int x() {
        return C0535R$layout.item_detail_auction_result;
    }
}
