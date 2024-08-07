package nh;

import com.vpa.daugia.module.home.data.api.request.NotifyAuctionRequest;
import com.vpa.daugia.module.home.ui.AuctionNotifyActivity;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ek.i;
import rk.a;
import sk.e;
import sk.k;

/* compiled from: AuctionNotifyActivity.kt */
public final class o extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionNotifyActivity f21673a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(AuctionNotifyActivity auctionNotifyActivity) {
        super(0);
        this.f21673a = auctionNotifyActivity;
    }

    public final Object invoke() {
        AuctionNotifyActivity auctionNotifyActivity = this.f21673a;
        int i10 = AuctionNotifyActivity.T;
        auctionNotifyActivity.U().f19710h = new NotifyAuctionRequest((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (Integer) null, 63, (e) null);
        HomeViewModel.f(this.f21673a.U(), (String) null, 7);
        return i.f20112a;
    }
}
