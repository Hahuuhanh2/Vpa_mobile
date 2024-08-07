package sg;

import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import ek.i;
import kf.h;
import rk.l;
import sk.k;

/* compiled from: SessionAuctionActivity.kt */
public final class b0 extends k implements l<ExtendTimeSSE, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22869a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22869a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        long j10;
        Long startAuction;
        ExtendTimeSSE extendTimeSSE = (ExtendTimeSSE) obj;
        SessionAuctionActivity sessionAuctionActivity = this.f22869a;
        int i10 = SessionAuctionActivity.X;
        PriceTable d10 = sessionAuctionActivity.U().f19443r.d();
        long j11 = 0;
        if (d10 == null || (startAuction = d10.getStartAuction()) == null) {
            j10 = 0;
        } else {
            j10 = startAuction.longValue();
        }
        Long endTime = extendTimeSSE.getEndTime();
        if (endTime != null) {
            j11 = endTime.longValue();
        }
        SessionAuctionActivity.T(sessionAuctionActivity, j10, j11);
        extendTimeSSE.toString();
        int i11 = h.f12560a;
        return i.f20112a;
    }
}
