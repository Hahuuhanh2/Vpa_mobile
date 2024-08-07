package oh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.history.data.model.NotifyAuction;
import com.vpa.daugia.module.home.ui.b;
import ek.i;
import java.io.Serializable;
import mg.u4;
import qh.c;
import rk.l;
import sk.j;

/* compiled from: AuctionDocumentAdapter.kt */
public final class d extends ef.d<NotifyAuction, u4> {

    /* renamed from: p  reason: collision with root package name */
    public final l<NotifyAuction, i> f21797p;

    public d(b bVar) {
        super(bVar);
        this.f21797p = bVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        u4 u4Var = (u4) lVar;
        NotifyAuction notifyAuction = (NotifyAuction) serializable;
        j.f(u4Var, "binding");
        j.f(notifyAuction, "model");
        u4Var.v(new c(notifyAuction));
    }

    public final int x() {
        return C0535R$layout.item_auction_document;
    }

    public final void z(Serializable serializable) {
        NotifyAuction notifyAuction = (NotifyAuction) serializable;
        j.f(notifyAuction, "model");
        this.f21797p.invoke(notifyAuction);
    }
}
