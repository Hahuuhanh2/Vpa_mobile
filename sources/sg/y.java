package sg;

import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.ResultAuctionEnum;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE;
import com.vpa.daugia.module.auction.data.model.sse.ResultRoomSSE;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import ek.i;
import fk.p;
import java.util.List;
import kf.e;
import kf.h;
import lf.g;
import mb.b;
import mg.n1;
import rk.l;
import sk.j;
import sk.k;
import vg.a;
import vg.f;

/* compiled from: SessionAuctionActivity.kt */
public final class y extends k implements l<ResultRoomSSE, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22900a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22900a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        BiddingRoomId biddingRoomId;
        BiddingRoomId biddingRoomId2;
        BiddingRoomId biddingRoomId3;
        ResultRoomSSE resultRoomSSE = (ResultRoomSSE) obj;
        e.h(this.f22900a);
        List<BiddingRoomId> biddingRoomIds = resultRoomSSE.getBiddingRoomIds();
        if (biddingRoomIds != null) {
            SessionAuctionActivity sessionAuctionActivity = this.f22900a;
            for (BiddingRoomId biddingRoomId4 : biddingRoomIds) {
                String str6 = null;
                if (biddingRoomId4 != null) {
                    str = biddingRoomId4.getRoomId();
                } else {
                    str = null;
                }
                int i10 = SessionAuctionActivity.X;
                PriceTable d10 = sessionAuctionActivity.U().f19443r.d();
                if (d10 != null) {
                    str2 = d10.getBiddingRoomId();
                } else {
                    str2 = null;
                }
                if (j.a(str, str2)) {
                    if (biddingRoomId4 != null) {
                        num = Integer.valueOf(biddingRoomId4.getResult());
                    } else {
                        num = null;
                    }
                    int value = ResultAuctionEnum.WIN.getValue();
                    if (num != null && num.intValue() == value) {
                        int i11 = h.f12560a;
                        a aVar = new a(sessionAuctionActivity, biddingRoomId4);
                        sessionAuctionActivity.T = aVar;
                        aVar.h();
                        g.b.a(sessionAuctionActivity, new b(3, sessionAuctionActivity, biddingRoomId4), 3000);
                    } else {
                        int value2 = ResultAuctionEnum.SLIP.getValue();
                        if (num != null && num.intValue() == value2) {
                            int i12 = h.f12560a;
                            new vg.b(sessionAuctionActivity, biddingRoomId4).h();
                        } else {
                            int value3 = ResultAuctionEnum.CANCEL.getValue();
                            if (num != null && num.intValue() == value3) {
                                ((n1) sessionAuctionActivity.M()).f21241w.setEnabled(false);
                                xg.i iVar = sessionAuctionActivity.U().f19450y;
                                if (iVar != null) {
                                    iVar.cancel();
                                }
                                int i13 = h.f12560a;
                                PriceTable d11 = sessionAuctionActivity.U().f19443r.d();
                                if (d11 != null) {
                                    str3 = d11.getMoniterName();
                                } else {
                                    str3 = null;
                                }
                                List<BiddingRoomId> biddingRoomIds2 = resultRoomSSE.getBiddingRoomIds();
                                if (biddingRoomIds2 == null || (biddingRoomId3 = (BiddingRoomId) p.N0(biddingRoomIds2)) == null) {
                                    str4 = null;
                                } else {
                                    str4 = biddingRoomId3.getLocalSymbol();
                                }
                                List<BiddingRoomId> biddingRoomIds3 = resultRoomSSE.getBiddingRoomIds();
                                if (biddingRoomIds3 == null || (biddingRoomId2 = (BiddingRoomId) p.N0(biddingRoomIds3)) == null) {
                                    str5 = null;
                                } else {
                                    str5 = biddingRoomId2.getSeriDangKy();
                                }
                                List<BiddingRoomId> biddingRoomIds4 = resultRoomSSE.getBiddingRoomIds();
                                if (!(biddingRoomIds4 == null || (biddingRoomId = (BiddingRoomId) p.N0(biddingRoomIds4)) == null)) {
                                    str6 = biddingRoomId.getSoThuTu();
                                }
                                new f(sessionAuctionActivity, new CancelRoomSSE((Boolean) null, str4, (String) null, str5, str3, (String) null, (String) null, str6, (String) null, 357, (sk.e) null)).h();
                            }
                        }
                    }
                }
                resultRoomSSE.toString();
                int i14 = h.f12560a;
            }
        }
        return i.f20112a;
    }
}
