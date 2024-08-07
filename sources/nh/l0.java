package nh;

import android.view.View;
import com.vpa.daugia.module.home.data.model.News;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.g3;
import of.a;
import of.b;
import oh.e;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: HomeFragment.kt */
public final class l0 extends k implements l<f<? extends ArrayList<News>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21668a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l0(HomeFragment homeFragment) {
        super(1);
        this.f21668a = homeFragment;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((g3) this.f21668a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            HomeFragment homeFragment = this.f21668a;
            int i10 = HomeFragment.f19678z0;
            ((e) homeFragment.f19690x0.getValue()).A((List) ((f.c) fVar).f18006a);
        }
        return i.f20112a;
    }
}
