package sg;

import com.vpa.daugia.module.auction.ui.activity.Hilt_SessionAuctionActivity;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import e.b;

/* compiled from: Hilt_SessionAuctionActivity */
public final class u implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_SessionAuctionActivity f22896a;

    public u(Hilt_SessionAuctionActivity hilt_SessionAuctionActivity) {
        this.f22896a = hilt_SessionAuctionActivity;
    }

    public final void a() {
        Hilt_SessionAuctionActivity hilt_SessionAuctionActivity = this.f22896a;
        if (!hilt_SessionAuctionActivity.Q) {
            hilt_SessionAuctionActivity.Q = true;
            ((e0) hilt_SessionAuctionActivity.d()).t((SessionAuctionActivity) hilt_SessionAuctionActivity);
        }
    }
}
