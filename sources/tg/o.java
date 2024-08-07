package tg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: RoomAuctionAdapter.kt */
public final class o extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f23000a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PriceTable f23001b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(q qVar, PriceTable priceTable) {
        super(1);
        this.f23000a = qVar;
        this.f23001b = priceTable;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        l<? super PriceTable, i> lVar = this.f23000a.f23006q;
        if (lVar != null) {
            lVar.invoke(this.f23001b);
        }
        return i.f20112a;
    }
}
