package nh;

import android.view.View;
import com.vpa.daugia.module.home.data.model.AuctionPolicy;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import ji.c;
import mg.g3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: HomeFragment.kt */
public final class i0 extends k implements l<f<? extends AuctionPolicy>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21662a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(HomeFragment homeFragment) {
        super(1);
        this.f21662a = homeFragment;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((g3) this.f21662a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            c cVar = new c(this.f21662a.d0(), ((AuctionPolicy) ((f.c) fVar).f18006a).getHtmlContent());
            cVar.f20784j = new h0(this.f21662a);
            cVar.h();
            this.f21662a.n0().h();
        }
        return i.f20112a;
    }
}
