package ii;

import android.view.View;
import com.vpa.daugia.module.register.data.model.RegisterAuction;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import mg.d1;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class i extends k implements l<f<? extends RegisterAuction>, ek.i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20594a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        super(1);
        this.f20594a = listAwaitAuctionActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((d1) this.f20594a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f20594a.U = ((RegisterAuction) ((f.c) fVar).f18006a).getId();
        }
        return ek.i.f20112a;
    }
}
