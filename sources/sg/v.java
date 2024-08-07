package sg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import ek.i;
import java.util.ArrayList;
import kf.h;
import lf.g;
import mg.n1;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import tg.s;

/* compiled from: SessionAuctionActivity.kt */
public final class v extends k implements l<ArrayList<PriceTable>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22897a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22897a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        int i10;
        ArrayList arrayList = (ArrayList) obj;
        SessionAuctionActivity sessionAuctionActivity = this.f22897a;
        int i11 = SessionAuctionActivity.X;
        ((s) sessionAuctionActivity.W.getValue()).A(arrayList);
        RecyclerView recyclerView = ((n1) this.f22897a.M()).C;
        Integer num = this.f22897a.U().G;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        recyclerView.k0(i10);
        SessionAuctionActivity sessionAuctionActivity2 = this.f22897a;
        if (sessionAuctionActivity2.U) {
            PriceTable d10 = sessionAuctionActivity2.U().f19443r.d();
            if (d10 != null) {
                SessionAuctionActivity sessionAuctionActivity3 = this.f22897a;
                d10.getChannel();
                int i12 = h.f12560a;
                sessionAuctionActivity3.U().h(d10, false);
            }
            this.f22897a.U = false;
        }
        if (arrayList.isEmpty()) {
            View view = ((n1) this.f22897a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a("Không có phòng đấu giá. Rất tiếc! Hiện tại chưa có phòng đấu giá nào diễn ra", b.ERROR);
            SessionAuctionActivity sessionAuctionActivity4 = this.f22897a;
            fb.l lVar = new fb.l(sessionAuctionActivity4, 4);
            sessionAuctionActivity4.getClass();
            g.b.a(sessionAuctionActivity4, lVar, 2000);
        }
        return i.f20112a;
    }
}
