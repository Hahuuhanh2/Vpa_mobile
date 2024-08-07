package tg;

import android.widget.RelativeLayout;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.AccountResponse;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import ef.d;
import ek.i;
import java.io.Serializable;
import lg.b;
import mg.s4;
import rk.l;
import sk.j;
import ug.c;

/* compiled from: AuctionDevelopmentAdapter.kt */
public final class a extends d<BiddingPrice, s4> {

    /* renamed from: p  reason: collision with root package name */
    public final l<BiddingPrice, i> f22965p;

    /* renamed from: q  reason: collision with root package name */
    public final long f22966q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f22967r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f22968s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, l<? super BiddingPrice, i> lVar) {
        super(lVar);
        long j10;
        String userId;
        j.f(bVar, "sharedPrefsHelper");
        j.f(lVar, "listener");
        this.f22965p = lVar;
        AccountResponse accountResponse = (AccountResponse) bVar.b(AccountResponse.class, "DATA_USER_AUCTION");
        if (accountResponse == null || (userId = accountResponse.getUserId()) == null) {
            j10 = 0;
        } else {
            j10 = Long.parseLong(userId);
        }
        this.f22966q = j10;
        this.f22968s = true;
    }

    public final int c() {
        if (this.f9444f.size() > 3 && !this.f22967r) {
            return 3;
        }
        if (!this.f22967r || this.f9444f.size() <= 100) {
            return super.c();
        }
        return 100;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        int i11;
        s4 s4Var = (s4) lVar;
        BiddingPrice biddingPrice = (BiddingPrice) serializable;
        j.f(s4Var, "binding");
        j.f(biddingPrice, "model");
        s4Var.v(new c(biddingPrice, i10, Long.valueOf(this.f22966q)));
        if (i10 == 0) {
            s4Var.f21349w.setImageResource(C0531R$drawable.ic_user_polygon_red);
        } else {
            s4Var.f21349w.setImageResource(C0531R$drawable.ic_user_polygon_green);
        }
        if (i10 == 0) {
            s4Var.f21350x.setImageResource(C0531R$drawable.ic_user_polygon_red);
        } else {
            s4Var.f21350x.setImageResource(C0531R$drawable.ic_user_polygon_green);
        }
        RelativeLayout relativeLayout = s4Var.f21352z;
        j.e(relativeLayout, "rlStartIcon");
        int i12 = 0;
        if (this.f22968s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        relativeLayout.setVisibility(i11);
        RelativeLayout relativeLayout2 = s4Var.f21351y;
        j.e(relativeLayout2, "rlEndIcon");
        if (!(!this.f22968s)) {
            i12 = 8;
        }
        relativeLayout2.setVisibility(i12);
    }

    public final int x() {
        return C0535R$layout.item_auction_development;
    }
}
