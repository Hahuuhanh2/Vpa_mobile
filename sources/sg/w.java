package sg;

import android.support.v4.media.a;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import ek.i;
import f0.b0;
import fk.p;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import mg.n1;
import rk.l;
import sk.j;
import sk.k;
import ug.f;

/* compiled from: SessionAuctionActivity.kt */
public final class w extends k implements l<PriceTable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f22898a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f22898a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        long j10;
        long j11;
        BiddingPrice biddingPrice;
        Long price;
        PriceTable priceTable = (PriceTable) obj;
        j.c(priceTable);
        ((n1) this.f22898a.M()).v(new f(priceTable, (Long) null));
        d2.i<String> iVar = this.f22898a.U().f19449x;
        StringBuilder q10 = a.q("Trả giá ");
        Long l10 = (Long) this.f22898a.U().f19447v.f8545b;
        long j12 = 0;
        if (l10 == null) {
            l10 = 0L;
        }
        long longValue = l10.longValue();
        ArrayList<BiddingPrice> prices = priceTable.getPrices();
        if (prices == null || (biddingPrice = (BiddingPrice) p.N0(prices)) == null || (price = biddingPrice.getPrice()) == null) {
            j10 = 35000000;
        } else {
            j10 = price.longValue();
        }
        q10.append(b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), longValue + j10, new StringBuilder(), " đ"));
        iVar.g(q10.toString());
        ((tg.a) this.f22898a.V.getValue()).A(priceTable.getPrices());
        SessionAuctionActivity sessionAuctionActivity = this.f22898a;
        Long startAuction = priceTable.getStartAuction();
        if (startAuction != null) {
            j11 = startAuction.longValue();
        } else {
            j11 = 0;
        }
        Long endRegistTime = priceTable.getEndRegistTime();
        if (endRegistTime != null) {
            j12 = endRegistTime.longValue();
        }
        SessionAuctionActivity.T(sessionAuctionActivity, j11, j12);
        return i.f20112a;
    }
}
