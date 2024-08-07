package tg;

import com.vpa.daugia.module.auction.data.model.PriceTable;
import ek.i;
import mg.a7;
import rk.a;
import rk.l;
import sk.k;

/* compiled from: RoomAuctionAdapter.kt */
public final class p extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a7 f23002a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f23003b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PriceTable f23004c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(a7 a7Var, q qVar, PriceTable priceTable) {
        super(0);
        this.f23002a = a7Var;
        this.f23003b = qVar;
        this.f23004c = priceTable;
    }

    public final Object invoke() {
        this.f23002a.f20962y.setText("Tham gia đấu giá");
        l<? super PriceTable, i> lVar = this.f23003b.f23007r;
        if (lVar != null) {
            lVar.invoke(this.f23004c);
        }
        return i.f20112a;
    }
}
