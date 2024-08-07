package ii;

import android.view.View;
import com.vpa.daugia.module.home.data.model.AuctionPolicy;
import ek.i;
import ji.c;
import mg.r3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: RegisterAuctionFragment.kt */
public final class z extends k implements l<f<? extends AuctionPolicy>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20640a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(q qVar) {
        super(1);
        this.f20640a = qVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((r3) this.f20640a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            c cVar = new c(this.f20640a.d0(), ((AuctionPolicy) ((f.c) fVar).f18006a).getHtmlContent());
            cVar.f20784j = new y(this.f20640a);
            cVar.h();
        }
        return i.f20112a;
    }
}
