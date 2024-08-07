package nh;

import android.view.View;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ji.d;
import lf.g;
import mg.g3;
import of.a;
import of.b;
import sk.j;

/* compiled from: HomeFragment.kt */
public final class h0 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21660a;

    public h0(HomeFragment homeFragment) {
        this.f21660a = homeFragment;
    }

    public final void a() {
        View view = ((g3) this.f21660a.i0()).f8554e;
        j.e(view, "getRoot(...)");
        new a(view).a("Đã thêm vào thành công", b.SUCCESS);
        if (j.a(this.f21660a.f19681o0, "REGISTER_AUCTION")) {
            HomeFragment homeFragment = this.f21660a;
            g0 g0Var = new g0(homeFragment, 0);
            homeFragment.getClass();
            g.b.a(homeFragment, g0Var, 1000);
        }
    }
}
