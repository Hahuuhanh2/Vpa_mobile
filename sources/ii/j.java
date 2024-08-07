package ii;

import android.view.View;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import gi.b0;
import ji.d;
import lf.g;
import mg.d1;
import of.a;
import of.b;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20595a;

    public j(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        this.f20595a = listAwaitAuctionActivity;
    }

    public final void a() {
        View view = ((d1) this.f20595a.M()).f8554e;
        sk.j.e(view, "getRoot(...)");
        new a(view).a("Đăng kí biển số thành công", b.SUCCESS);
        if (sk.j.a(this.f20595a.T, "REGISTER_AUCTION")) {
            ListAwaitAuctionActivity listAwaitAuctionActivity = this.f20595a;
            b0 b0Var = new b0(listAwaitAuctionActivity, 2);
            listAwaitAuctionActivity.getClass();
            g.b.a(listAwaitAuctionActivity, b0Var, 1000);
        }
    }
}
