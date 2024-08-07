package nh;

import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: HomeFragment.kt */
public final class c0 extends k implements l<f<? extends ArrayList<Plate>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21646a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(HomeFragment homeFragment) {
        super(1);
        this.f21646a = homeFragment;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            HomeFragment homeFragment = this.f21646a;
            int i10 = HomeFragment.f19678z0;
            ((oh.i) homeFragment.f19691y0.getValue()).A((List) ((f.c) fVar).f18006a);
        }
        return i.f20112a;
    }
}
