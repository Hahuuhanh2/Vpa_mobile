package kh;

import android.view.View;
import com.vpa.daugia.module.history.data.model.AuctionHistory;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.e;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AuctionHistoryActivity.kt */
public final class c extends k implements l<f<? extends ArrayList<AuctionHistory>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionHistoryActivity f20812a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(AuctionHistoryActivity auctionHistoryActivity) {
        super(1);
        this.f20812a = auctionHistoryActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20812a.O().dismiss();
            View view = ((e) this.f20812a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f20812a.O().dismiss();
            if (((e) this.f20812a.M()).f21032y.getOnLoadMore()) {
                this.f20812a.T().t((List) ((f.c) fVar).f18006a);
                ((e) this.f20812a.M()).f21032y.setOnLoadMore(false);
            } else {
                this.f20812a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((e) this.f20812a.M()).f21032y.b(this.f20812a.T().f9444f);
        }
        return i.f20112a;
    }
}
