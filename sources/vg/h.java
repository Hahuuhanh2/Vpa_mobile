package vg;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.databinding.DataBinderMapperImpl;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import d2.l;
import ef.f;
import ff.a;
import kf.b;
import mg.a3;
import sk.j;

/* compiled from: WinAuctionDialog.kt */
public final class h extends f.a<h> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(SessionAuctionActivity sessionAuctionActivity, BiddingRoomId biddingRoomId) {
        super(sessionAuctionActivity);
        j.f(biddingRoomId, "data");
        LayoutInflater from = LayoutInflater.from(sessionAuctionActivity);
        int i10 = a3.f20940z;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        a3 a3Var = (a3) l.l(from, C0535R$layout.dialog_win_auction, (ViewGroup) null, (Object) null);
        j.e(a3Var, "inflate(...)");
        a3Var.v(biddingRoomId);
        a3Var.f20941w.setOnClickListener(new com.google.android.material.search.h(this, 9));
        Button button = a3Var.f20942x;
        j.e(button, "btnConfirm");
        button.setOnClickListener(new b(500, button, new g(sessionAuctionActivity, biddingRoomId, this)));
        a.f10210a.getClass();
        a.C0107a aVar = a.C0107a.f10211a;
        c();
        e(a3Var.f8554e);
    }
}
