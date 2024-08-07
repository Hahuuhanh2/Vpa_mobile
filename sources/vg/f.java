package vg;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.datepicker.q;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import d2.l;
import ef.f;
import ff.a;
import mg.y2;
import sk.j;

/* compiled from: StopAuctionDialog.kt */
public final class f extends f.a<h> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(SessionAuctionActivity sessionAuctionActivity, CancelRoomSSE cancelRoomSSE) {
        super(sessionAuctionActivity);
        j.f(cancelRoomSSE, "data");
        LayoutInflater from = LayoutInflater.from(sessionAuctionActivity);
        int i10 = y2.f21491y;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        y2 y2Var = (y2) l.l(from, C0535R$layout.dialog_stop_auction, (ViewGroup) null, (Object) null);
        j.e(y2Var, "inflate(...)");
        y2Var.v(cancelRoomSSE);
        y2Var.f21492w.setOnClickListener(new q(this, 9));
        a.f10210a.getClass();
        a.C0107a aVar = a.C0107a.f10211a;
        c();
        e(y2Var.f8554e);
    }
}
