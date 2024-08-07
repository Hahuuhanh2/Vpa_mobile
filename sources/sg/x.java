package sg;

import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import ek.i;
import java.util.ArrayList;
import java.util.Iterator;
import mg.n1;
import rk.l;
import sk.j;
import sk.k;
import vg.f;

/* compiled from: SessionAuctionActivity.kt */
public final class x extends k implements l<CancelRoomSSE, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22899a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22899a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        CancelRoomSSE cancelRoomSSE = (CancelRoomSSE) obj;
        SessionAuctionActivity sessionAuctionActivity = this.f22899a;
        int i10 = SessionAuctionActivity.X;
        ArrayList arrayList = (ArrayList) sessionAuctionActivity.U().f19439n.d();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (j.a(((PriceTable) obj2).getBiddingRoomId(), cancelRoomSSE.getRoomId())) {
                    break;
                }
            }
            if (((PriceTable) obj2) != null) {
                SessionAuctionActivity sessionAuctionActivity2 = this.f22899a;
                ((n1) sessionAuctionActivity2.M()).f21241w.setEnabled(false);
                xg.i iVar = sessionAuctionActivity2.U().f19450y;
                if (iVar != null) {
                    iVar.cancel();
                }
                sessionAuctionActivity2.U().f19449x.g("Dừng đấu giá");
                j.c(cancelRoomSSE);
                new f(sessionAuctionActivity2, cancelRoomSSE).h();
            }
        }
        return i.f20112a;
    }
}
