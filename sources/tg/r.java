package tg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: RoomOtherAuctionAdapter.kt */
public final class r extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f23008a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PriceTable f23009b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(s sVar, PriceTable priceTable) {
        super(1);
        this.f23008a = sVar;
        this.f23009b = priceTable;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        this.f23008a.f23010p.invoke(this.f23009b);
        return i.f20112a;
    }
}
