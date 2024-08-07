package sg;

import com.vpa.daugia.module.auction.data.model.AuctionResult;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.m;
import rk.l;
import sk.k;
import ze.f;

/* compiled from: AuctionResultActivity.kt */
public final class j extends k implements l<f<? extends ArrayList<AuctionResult>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionResultActivity f22884a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(AuctionResultActivity auctionResultActivity) {
        super(1);
        this.f22884a = auctionResultActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f22884a.O().dismiss();
        } else if (!sk.j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f22884a.O().dismiss();
            if (((m) this.f22884a.M()).f21181y.getOnLoadMore()) {
                this.f22884a.T().t((List) ((f.c) fVar).f18006a);
                ((m) this.f22884a.M()).f21181y.setOnLoadMore(false);
            } else {
                this.f22884a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((m) this.f22884a.M()).f21181y.b(this.f22884a.T().f9444f);
        }
        return i.f20112a;
    }
}
