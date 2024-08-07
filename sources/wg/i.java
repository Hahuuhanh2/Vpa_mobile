package wg;

import android.view.View;
import android.widget.LinearLayout;
import com.vpa.daugia.module.auction.data.model.AccountResponse;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import mg.c3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AuctionFragment.kt */
public final class i extends k implements l<f<? extends AccountResponse>, ek.i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23400a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(b bVar) {
        super(1);
        this.f23400a = bVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23400a.k0().dismiss();
            View view = ((c3) this.f23400a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23400a.k0().show();
        } else if (fVar instanceof f.c) {
            this.f23400a.k0().dismiss();
            LinearLayout linearLayout = ((c3) this.f23400a.i0()).f21005x;
            j.e(linearLayout, "llRcv");
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = ((c3) this.f23400a.i0()).f21004w;
            j.e(linearLayout2, "llLogin");
            linearLayout2.setVisibility(8);
            AuctionRoomViewModel.e(this.f23400a.n0());
        }
        return ek.i.f20112a;
    }
}
