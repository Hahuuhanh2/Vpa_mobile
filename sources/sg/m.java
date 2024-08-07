package sg;

import al.r0;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.auction.ui.activity.DetailAuctionResultActivity;
import ek.i;
import ik.d;
import p3.l0;
import rg.c;
import rk.a;
import sk.k;

/* compiled from: DetailAuctionResultActivity.kt */
public final class m extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DetailAuctionResultActivity f22886a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(DetailAuctionResultActivity detailAuctionResultActivity) {
        super(0);
        this.f22886a = detailAuctionResultActivity;
    }

    public final Object invoke() {
        DetailAuctionResultActivity detailAuctionResultActivity = this.f22886a;
        int i10 = DetailAuctionResultActivity.U;
        detailAuctionResultActivity.T();
        AuctionViewModel T = this.f22886a.T();
        l0.j0(l0.d0(T), r0.f19085b, new c(T, String.valueOf(this.f22886a.S.getSessionId()), (String) null, (d<? super c>) null), 2);
        return i.f20112a;
    }
}
