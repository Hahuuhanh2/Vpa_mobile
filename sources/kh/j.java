package kh;

import al.r0;
import android.view.View;
import com.vpa.daugia.module.common.ui.CommonViewModel;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import hh.a;
import ik.d;
import p3.l0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20822a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionReportActivity f20823b;

    public /* synthetic */ j(AuctionReportActivity auctionReportActivity, int i10) {
        this.f20822a = i10;
        this.f20823b = auctionReportActivity;
    }

    public final void onClick(View view) {
        switch (this.f20822a) {
            case 0:
                AuctionReportActivity auctionReportActivity = this.f20823b;
                int i10 = AuctionReportActivity.V;
                sk.j.f(auctionReportActivity, "this$0");
                auctionReportActivity.finish();
                return;
            default:
                AuctionReportActivity auctionReportActivity2 = this.f20823b;
                int i11 = AuctionReportActivity.V;
                sk.j.f(auctionReportActivity2, "this$0");
                CommonViewModel commonViewModel = (CommonViewModel) auctionReportActivity2.R.getValue();
                String str = auctionReportActivity2.S;
                sk.j.f(str, "orderId");
                l0.j0(l0.d0(commonViewModel), r0.f19085b, new a(commonViewModel, str, (d<? super a>) null), 2);
                auctionReportActivity2.finish();
                return;
        }
    }
}
