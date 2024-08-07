package sg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.DetailAuctionResult;
import com.vpa.daugia.module.auction.ui.activity.DetailAuctionResultActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.v;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import tg.n;
import ze.f;

/* compiled from: DetailAuctionResultActivity.kt */
public final class p extends k implements l<f<? extends ArrayList<DetailAuctionResult>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DetailAuctionResultActivity f22892a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(DetailAuctionResultActivity detailAuctionResultActivity) {
        super(1);
        this.f22892a = detailAuctionResultActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((v) this.f22892a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
            this.f22892a.O().dismiss();
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f22892a.O().dismiss();
            ((n) this.f22892a.T.getValue()).A((List) ((f.c) fVar).f18006a);
            ((v) this.f22892a.M()).f21394x.b(((n) this.f22892a.T.getValue()).f9444f);
        }
        return i.f20112a;
    }
}
