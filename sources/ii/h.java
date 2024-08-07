package ii;

import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.d1;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class h extends k implements l<f<? extends ArrayList<AwaitAuction>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20593a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        super(1);
        this.f20593a = listAwaitAuctionActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            if (((d1) this.f20593a.M()).f21021y.getOnLoadMore()) {
                this.f20593a.T().t((List) ((f.c) fVar).f18006a);
                ((d1) this.f20593a.M()).f21021y.setOnLoadMore(false);
            } else {
                this.f20593a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((d1) this.f20593a.M()).f21021y.b(this.f20593a.T().f9444f);
        }
        return i.f20112a;
    }
}
