package nh;

import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ek.i;
import rk.p;
import sk.j;
import sk.k;
import ze.b;

/* compiled from: HomeFragment.kt */
public final class p0 extends k implements p<Boolean, AwaitAuction, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21676a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(HomeFragment homeFragment) {
        super(2);
        this.f21676a = homeFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AwaitAuction awaitAuction = (AwaitAuction) obj2;
        j.f(awaitAuction, "item");
        if (b.l(this.f21676a.d0(), this.f21676a.m0())) {
            HomeViewModel n02 = this.f21676a.n0();
            String id2 = awaitAuction.getId();
            if (id2 == null) {
                id2 = "";
            }
            n02.d(id2, booleanValue);
        }
        return i.f20112a;
    }
}
