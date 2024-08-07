package vg;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: WinAuctionDialog.kt */
public final class g extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f23317a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiddingRoomId f23318b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f23319c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(SessionAuctionActivity sessionAuctionActivity, BiddingRoomId biddingRoomId, h hVar) {
        super(1);
        this.f23317a = sessionAuctionActivity;
        this.f23318b = biddingRoomId;
        this.f23319c = hVar;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        Intent intent = new Intent(this.f23317a, MyDocumentActivity.class);
        intent.putExtra("DATA_PLATE", this.f23318b.getLocalSymbol() + this.f23318b.getSeriDangKy() + this.f23318b.getSoThuTu());
        this.f23317a.startActivity(intent);
        this.f23319c.a();
        return i.f20112a;
    }
}
