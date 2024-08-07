package ii;

import android.view.View;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import ek.i;
import mg.d1;
import of.a;
import of.b;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class l extends k implements rk.l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20597a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        super(1);
        this.f20597a = listAwaitAuctionActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((d1) this.f20597a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        }
        return i.f20112a;
    }
}
