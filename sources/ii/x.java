package ii;

import android.view.View;
import com.vpa.daugia.module.register.data.model.RegisterAuction;
import ek.i;
import mg.r3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: RegisterAuctionFragment.kt */
public final class x extends k implements l<f<? extends RegisterAuction>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20638a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(q qVar) {
        super(1);
        this.f20638a = qVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((r3) this.f20638a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f20638a.f20607o0 = ((RegisterAuction) ((f.c) fVar).f18006a).getId();
        }
        return i.f20112a;
    }
}
