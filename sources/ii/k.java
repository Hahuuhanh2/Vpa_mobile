package ii;

import android.view.View;
import com.vpa.daugia.module.home.data.model.AuctionPolicy;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import ek.i;
import ji.c;
import mg.d1;
import of.a;
import of.b;
import rk.l;
import sk.j;
import ze.f;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class k extends sk.k implements l<f<? extends AuctionPolicy>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20596a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        super(1);
        this.f20596a = listAwaitAuctionActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((d1) this.f20596a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            c cVar = new c(this.f20596a, ((AuctionPolicy) ((f.c) fVar).f18006a).getHtmlContent());
            cVar.f20784j = new j(this.f20596a);
            cVar.h();
        }
        return i.f20112a;
    }
}
