package nh;

import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ek.i;
import rk.p;
import sk.j;
import sk.k;
import ze.b;

/* compiled from: HomeFragment.kt */
public final class r0 extends k implements p<Boolean, Plate, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21683a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(HomeFragment homeFragment) {
        super(2);
        this.f21683a = homeFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Plate plate = (Plate) obj2;
        j.f(plate, "item");
        if (b.l(this.f21683a.d0(), this.f21683a.m0())) {
            HomeViewModel n02 = this.f21683a.n0();
            String bksId = plate.getBksId();
            if (bksId == null) {
                bksId = "";
            }
            n02.d(bksId, booleanValue);
        }
        return i.f20112a;
    }
}
