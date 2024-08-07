package sg;

import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import ek.i;
import java.util.Calendar;
import kf.h;
import mg.n1;
import rk.a;
import sk.k;

/* compiled from: SessionAuctionActivity.kt */
public final class c0 extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f22872b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f22873c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(SessionAuctionActivity sessionAuctionActivity, long j10, long j11) {
        super(0);
        this.f22871a = sessionAuctionActivity;
        this.f22872b = j10;
        this.f22873c = j11;
    }

    public final Object invoke() {
        boolean z10;
        SessionAuctionActivity sessionAuctionActivity = this.f22871a;
        int i10 = SessionAuctionActivity.X;
        PriceTable d10 = sessionAuctionActivity.U().f19443r.d();
        if (d10 != null) {
            long j10 = this.f22872b;
            long j11 = this.f22873c;
            SessionAuctionActivity sessionAuctionActivity2 = this.f22871a;
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            if (j10 + 1 > timeInMillis || timeInMillis >= j11) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                int i11 = h.f12560a;
                sessionAuctionActivity2.U().h(d10, true);
            }
        }
        ((n1) this.f22871a.M()).G.setText("Vui lòng đợi");
        ((n1) this.f22871a.M()).f21241w.setEnabled(false);
        return i.f20112a;
    }
}
