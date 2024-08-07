package sg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.JoinChannelRequest;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ek.i;
import fk.p;
import kf.e;
import kf.h;
import lf.g;
import mg.n1;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: SessionAuctionActivity.kt */
public final class z extends k implements l<f<? extends UserBiddingPriceResponse>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22901a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22901a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f22901a.O().dismiss();
            View view = ((n1) this.f22901a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
            AuctionRoomViewModel U = this.f22901a.U();
            PriceTable d10 = this.f22901a.U().f19443r.d();
            String str5 = null;
            if (d10 != null) {
                str = d10.getChannel();
            } else {
                str = null;
            }
            PriceTable d11 = this.f22901a.U().f19443r.d();
            if (d11 != null) {
                str2 = d11.getBiddingRoomId();
            } else {
                str2 = null;
            }
            PriceTable d12 = this.f22901a.U().f19443r.d();
            if (d12 != null) {
                str3 = d12.getSessionId();
            } else {
                str3 = null;
            }
            PriceTable d13 = this.f22901a.U().f19443r.d();
            if (d13 != null) {
                str4 = d13.getChannel();
            } else {
                str4 = null;
            }
            PriceTable d14 = this.f22901a.U().f19443r.d();
            if (d14 != null) {
                str5 = d14.getId();
            }
            U.f(str, new JoinChannelRequest(str2, str3, str4, str5, 0));
            AuctionRoomViewModel.e(this.f22901a.U());
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f22901a.O().dismiss();
            e.h(this.f22901a);
            int i10 = h.f12560a;
            f.c cVar = (f.c) fVar;
            Integer errorCode = ((UserBiddingPriceResponse) cVar.f18006a).getErrorCode();
            if (errorCode != null && errorCode.intValue() == 401) {
                View view2 = ((n1) this.f22901a.M()).f8554e;
                j.e(view2, "getRoot(...)");
                new a(view2).a((String) p.N0(((UserBiddingPriceResponse) cVar.f18006a).getErrors()), b.ERROR);
                SessionAuctionActivity sessionAuctionActivity = this.f22901a;
                d.i iVar = new d.i(sessionAuctionActivity, 27);
                sessionAuctionActivity.getClass();
                g.b.a(sessionAuctionActivity, iVar, 2000);
            } else {
                View view3 = ((n1) this.f22901a.M()).f8554e;
                j.e(view3, "getRoot(...)");
                new a(view3).a("Bạn đã trả giá thành công", b.SUCCESS);
            }
        }
        return i.f20112a;
    }
}
