package nh;

import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import rk.p;
import sk.j;
import sk.k;
import ze.b;

/* compiled from: HomeFragment.kt */
public final class q0 extends k implements p<Plate, String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21678a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(HomeFragment homeFragment) {
        super(2);
        this.f21678a = homeFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        Plate plate = (Plate) obj;
        String str = (String) obj2;
        j.f(plate, "item");
        j.f(str, "action");
        HomeFragment homeFragment = this.f21678a;
        homeFragment.f19681o0 = str;
        String bksId = plate.getBksId();
        if (b.l(homeFragment.d0(), homeFragment.m0())) {
            homeFragment.n0().j(bksId);
        }
        return i.f20112a;
    }
}
