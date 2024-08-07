package nh;

import android.view.View;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.register.data.model.RegisterAuction;
import ek.i;
import mg.g3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: HomeFragment.kt */
public final class f0 extends k implements l<f<? extends RegisterAuction>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21655a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(HomeFragment homeFragment) {
        super(1);
        this.f21655a = homeFragment;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((g3) this.f21655a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f21655a.f19682p0 = ((RegisterAuction) ((f.c) fVar).f18006a).getId();
        }
        return i.f20112a;
    }
}
