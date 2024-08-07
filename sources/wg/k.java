package wg;

import com.vpa.daugia.module.auction.data.model.JoinChannelRequest;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import ek.i;
import rk.l;
import sk.j;

/* compiled from: AuctionFragment.kt */
public final class k extends sk.k implements l<PriceTable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23402a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(b bVar) {
        super(1);
        this.f23402a = bVar;
    }

    public final Object invoke(Object obj) {
        PriceTable priceTable = (PriceTable) obj;
        j.f(priceTable, "it");
        b bVar = this.f23402a;
        bVar.f23383o0 = priceTable;
        bVar.n0().f(priceTable.getChannel(), new JoinChannelRequest(priceTable.getBiddingRoomId(), priceTable.getSessionId(), priceTable.getChannel(), priceTable.getId(), 0));
        return i.f20112a;
    }
}
