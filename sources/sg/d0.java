package sg;

import al.r0;
import android.view.View;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ek.i;
import ik.d;
import p3.l0;
import rk.l;
import sk.j;
import sk.k;
import xg.h;

/* compiled from: SessionAuctionActivity.kt */
public final class d0 extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22874a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22874a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        SessionAuctionActivity sessionAuctionActivity = this.f22874a;
        int i10 = SessionAuctionActivity.X;
        AuctionRoomViewModel U = sessionAuctionActivity.U();
        l0.j0(l0.d0(U), r0.f19085b, new h(U, (d<? super h>) null), 2);
        return i.f20112a;
    }
}
