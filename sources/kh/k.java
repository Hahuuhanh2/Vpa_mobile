package kh;

import android.widget.Toast;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import sk.j;
import x5.e;
import x5.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements e, g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionReportActivity f20824a;

    public /* synthetic */ k(AuctionReportActivity auctionReportActivity) {
        this.f20824a = auctionReportActivity;
    }

    public final void a() {
        AuctionReportActivity auctionReportActivity = this.f20824a;
        int i10 = AuctionReportActivity.V;
        j.f(auctionReportActivity, "this$0");
        ((mg.k) auctionReportActivity.M()).f21141z.r();
    }

    public final void h(int i10) {
        AuctionReportActivity auctionReportActivity = this.f20824a;
        int i11 = AuctionReportActivity.V;
        j.f(auctionReportActivity, "this$0");
        Toast.makeText(auctionReportActivity, "Error while opening page" + i10, 1).show();
    }
}
