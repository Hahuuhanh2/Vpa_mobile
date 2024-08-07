package kh;

import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import com.vpa.daugia.module.history.ui.activity.Hilt_AuctionHistoryActivity;
import e.b;

/* compiled from: Hilt_AuctionHistoryActivity */
public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_AuctionHistoryActivity f20826a;

    public n(Hilt_AuctionHistoryActivity hilt_AuctionHistoryActivity) {
        this.f20826a = hilt_AuctionHistoryActivity;
    }

    public final void a() {
        Hilt_AuctionHistoryActivity hilt_AuctionHistoryActivity = this.f20826a;
        if (!hilt_AuctionHistoryActivity.Q) {
            hilt_AuctionHistoryActivity.Q = true;
            AuctionHistoryActivity auctionHistoryActivity = (AuctionHistoryActivity) hilt_AuctionHistoryActivity;
            ((g) hilt_AuctionHistoryActivity.d()).D();
        }
    }
}
