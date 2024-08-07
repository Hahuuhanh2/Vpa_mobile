package nh;

import android.view.View;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import mg.g3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: HomeFragment.kt */
public final class k0 extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21666a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(HomeFragment homeFragment) {
        super(1);
        this.f21666a = homeFragment;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((g3) this.f21666a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        }
        return i.f20112a;
    }
}
