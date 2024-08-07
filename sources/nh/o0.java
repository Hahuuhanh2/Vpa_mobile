package nh;

import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import rk.p;
import sk.j;
import sk.k;
import ze.b;

/* compiled from: HomeFragment.kt */
public final class o0 extends k implements p<AwaitAuction, String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21674a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(HomeFragment homeFragment) {
        super(2);
        this.f21674a = homeFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        AwaitAuction awaitAuction = (AwaitAuction) obj;
        String str = (String) obj2;
        j.f(awaitAuction, "item");
        j.f(str, "action");
        HomeFragment homeFragment = this.f21674a;
        homeFragment.f19681o0 = str;
        String id2 = awaitAuction.getId();
        if (b.l(homeFragment.d0(), homeFragment.m0())) {
            homeFragment.n0().j(id2);
        }
        return i.f20112a;
    }
}
