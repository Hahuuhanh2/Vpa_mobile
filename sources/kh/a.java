package kh;

import com.vpa.daugia.module.history.HistoryViewModel;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import ef.n;
import ek.i;
import sk.k;

/* compiled from: AuctionHistoryActivity.kt */
public final class a extends k implements rk.a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionHistoryActivity f20810a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(AuctionHistoryActivity auctionHistoryActivity) {
        super(0);
        this.f20810a = auctionHistoryActivity;
    }

    public final Object invoke() {
        AuctionHistoryActivity auctionHistoryActivity = this.f20810a;
        int i10 = AuctionHistoryActivity.U;
        auctionHistoryActivity.U().f19638f = new n<>((Object) null);
        HistoryViewModel.e(this.f20810a.U(), (String) null, 7);
        return i.f20112a;
    }
}
