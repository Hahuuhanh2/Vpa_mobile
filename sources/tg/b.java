package tg;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.history.data.model.DetailAuctionHistory;
import ef.d;
import ek.i;
import java.io.Serializable;
import lh.c;
import mg.y4;
import rk.l;
import sk.j;

/* compiled from: AuctionProgressAdapter.kt */
public final class b extends d<DetailAuctionHistory, y4> {

    /* renamed from: p  reason: collision with root package name */
    public final l<DetailAuctionHistory, i> f22969p;

    /* renamed from: q  reason: collision with root package name */
    public final long f22970q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r2 = r2.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(lg.b r2, com.vpa.daugia.module.auction.ui.activity.a r3) {
        /*
            r1 = this;
            java.lang.String r0 = "listener"
            sk.j.f(r3, r0)
            r1.<init>(r3)
            r1.f22969p = r3
            com.vpa.daugia.module.auth.data.model.User r2 = r2.e()
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = r2.getId()
            if (r2 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r2 = "0"
        L_0x0018:
            long r2 = java.lang.Long.parseLong(r2)
            r1.f22970q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.<init>(lg.b, com.vpa.daugia.module.auction.ui.activity.a):void");
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        y4 y4Var = (y4) lVar;
        DetailAuctionHistory detailAuctionHistory = (DetailAuctionHistory) serializable;
        j.f(y4Var, "binding");
        j.f(detailAuctionHistory, "model");
        y4Var.v(new c(detailAuctionHistory, i10, Long.valueOf(this.f22970q)));
    }

    public final int x() {
        return C0535R$layout.item_auction_progress;
    }
}
