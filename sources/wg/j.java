package wg;

import android.content.Intent;
import android.view.View;
import bc.h;
import com.vpa.daugia.module.auction.data.model.JoinChannelResponse;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import ek.i;
import mg.c3;
import of.a;
import of.b;
import rk.l;
import sk.k;
import ze.f;

/* compiled from: AuctionFragment.kt */
public final class j extends k implements l<f<? extends JoinChannelResponse>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23401a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(b bVar) {
        super(1);
        this.f23401a = bVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((c3) this.f23401a.i0()).f8554e;
            sk.j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
            this.f23401a.k0().dismiss();
        } else if (!sk.j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            Intent intent = new Intent(this.f23401a.d0(), SessionAuctionActivity.class);
            intent.putExtra("DATA_PRICE_TABLE", new h().i(this.f23401a.f23383o0));
            this.f23401a.h0(intent);
        }
        return i.f20112a;
    }
}
