package sg;

import com.vpa.daugia.module.auction.ui.activity.AuctionProgressActivity;
import com.vpa.daugia.module.history.data.model.DetailAuctionHistory;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.g;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AuctionProgressActivity.kt */
public final class c extends k implements l<f<? extends ArrayList<DetailAuctionHistory>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionProgressActivity f22870a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(AuctionProgressActivity auctionProgressActivity) {
        super(1);
        this.f22870a = auctionProgressActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f22870a.O().dismiss();
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f22870a.O().dismiss();
            if (((g) this.f22870a.M()).f21066x.getOnLoadMore()) {
                this.f22870a.T().t((List) ((f.c) fVar).f18006a);
                ((g) this.f22870a.M()).f21066x.setOnLoadMore(false);
            } else {
                this.f22870a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((g) this.f22870a.M()).f21066x.b(this.f22870a.T().f9444f);
        }
        return i.f20112a;
    }
}
