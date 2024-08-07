package vg;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import d2.l;
import ef.f;
import ff.a;
import mg.n2;
import sk.j;

/* compiled from: CongratulationDialog.kt */
public final class a extends f.a<a> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(SessionAuctionActivity sessionAuctionActivity, BiddingRoomId biddingRoomId) {
        super(sessionAuctionActivity);
        j.f(biddingRoomId, "data");
        LayoutInflater from = LayoutInflater.from(sessionAuctionActivity);
        int i10 = n2.f21245y;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        n2 n2Var = (n2) l.l(from, C0535R$layout.dialog_congratulation, (ViewGroup) null, (Object) null);
        j.e(n2Var, "inflate(...)");
        n2Var.v(biddingRoomId);
        ff.a.f10210a.getClass();
        a.C0107a aVar = a.C0107a.f10211a;
        c();
        e(n2Var.f8554e);
    }
}
