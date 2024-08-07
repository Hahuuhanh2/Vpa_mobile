package ii;

import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import ek.i;
import lg.b;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class g extends k implements p<Boolean, AwaitAuction, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20592a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        super(2);
        this.f20592a = listAwaitAuctionActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AwaitAuction awaitAuction = (AwaitAuction) obj2;
        j.f(awaitAuction, "item");
        ListAwaitAuctionActivity listAwaitAuctionActivity = this.f20592a;
        b bVar = listAwaitAuctionActivity.S;
        if (bVar != null) {
            if (ze.b.l(listAwaitAuctionActivity, bVar)) {
                HomeViewModel U = this.f20592a.U();
                String id2 = awaitAuction.getId();
                if (id2 == null) {
                    id2 = "";
                }
                U.d(id2, booleanValue);
            }
            return i.f20112a;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }
}
