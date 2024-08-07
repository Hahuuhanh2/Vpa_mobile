package ii;

import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import ek.i;
import lg.b;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class f extends k implements p<AwaitAuction, String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20591a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        super(2);
        this.f20591a = listAwaitAuctionActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        AwaitAuction awaitAuction = (AwaitAuction) obj;
        String str = (String) obj2;
        j.f(awaitAuction, "item");
        j.f(str, "action");
        ListAwaitAuctionActivity listAwaitAuctionActivity = this.f20591a;
        listAwaitAuctionActivity.T = str;
        String id2 = awaitAuction.getId();
        b bVar = listAwaitAuctionActivity.S;
        if (bVar != null) {
            if (ze.b.l(listAwaitAuctionActivity, bVar)) {
                listAwaitAuctionActivity.U().j(id2);
            }
            return i.f20112a;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }
}
