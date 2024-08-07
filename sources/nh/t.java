package nh;

import com.vpa.daugia.module.history.data.model.NotifyAuction;
import com.vpa.daugia.module.home.ui.AuctionNotifyActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.c;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AuctionNotifyActivity.kt */
public final class t extends k implements l<f<? extends ArrayList<NotifyAuction>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionNotifyActivity f21685a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(AuctionNotifyActivity auctionNotifyActivity) {
        super(1);
        this.f21685a = auctionNotifyActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f21685a.O().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f21685a.O().show();
        } else if (fVar instanceof f.c) {
            this.f21685a.O().dismiss();
            if (((c) this.f21685a.M()).f20997y.getOnLoadMore()) {
                this.f21685a.T().t((List) ((f.c) fVar).f18006a);
                ((c) this.f21685a.M()).f20997y.setOnLoadMore(false);
            } else {
                this.f21685a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((c) this.f21685a.M()).f20997y.b((List) ((f.c) fVar).f18006a);
        }
        return i.f20112a;
    }
}
