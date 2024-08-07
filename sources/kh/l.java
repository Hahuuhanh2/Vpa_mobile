package kh;

import android.view.View;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import ek.i;
import of.a;
import of.b;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AuctionReportActivity.kt */
public final class l extends k implements rk.l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionReportActivity f20825a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(AuctionReportActivity auctionReportActivity) {
        super(1);
        this.f20825a = auctionReportActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20825a.O().dismiss();
            View view = ((mg.k) this.f20825a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f20825a.O().show();
        } else if (fVar instanceof f.c) {
            this.f20825a.O().dismiss();
        }
        return i.f20112a;
    }
}
