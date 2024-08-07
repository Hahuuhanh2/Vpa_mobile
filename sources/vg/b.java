package vg;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.search.h;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import d2.l;
import ef.f;
import ff.a;
import mg.s2;
import sk.j;

/* compiled from: LoseAuctionDialog.kt */
public final class b extends f.a<b> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(SessionAuctionActivity sessionAuctionActivity, BiddingRoomId biddingRoomId) {
        super(sessionAuctionActivity);
        j.f(biddingRoomId, "data");
        LayoutInflater from = LayoutInflater.from(sessionAuctionActivity);
        int i10 = s2.f21346y;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        s2 s2Var = (s2) l.l(from, C0535R$layout.dialog_lose_auction, (ViewGroup) null, (Object) null);
        j.e(s2Var, "inflate(...)");
        s2Var.v(biddingRoomId);
        s2Var.f21347w.setOnClickListener(new h(this, 8));
        a.f10210a.getClass();
        a.C0107a aVar = a.C0107a.f10211a;
        c();
        e(s2Var.f8554e);
    }
}
