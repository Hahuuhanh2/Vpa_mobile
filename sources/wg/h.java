package wg;

import android.widget.LinearLayout;
import com.vpa.daugia.module.auction.data.model.UserBiddingProfile;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ek.i;
import mg.c3;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AuctionFragment.kt */
public final class h extends k implements l<f<? extends UserBiddingProfile>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23399a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(b bVar) {
        super(1);
        this.f23399a = bVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            LinearLayout linearLayout = ((c3) this.f23399a.i0()).f21005x;
            j.e(linearLayout, "llRcv");
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = ((c3) this.f23399a.i0()).f21004w;
            j.e(linearLayout2, "llLogin");
            linearLayout2.setVisibility(0);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            b bVar = this.f23399a;
            int i10 = b.f23380q0;
            AuctionRoomViewModel.e(bVar.n0());
        }
        return i.f20112a;
    }
}
