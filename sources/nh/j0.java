package nh;

import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import rk.l;
import sk.j;
import sk.k;
import tg.m;
import ze.f;

/* compiled from: HomeFragment.kt */
public final class j0 extends k implements l<f<? extends ArrayList<AwaitAuction>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21664a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(HomeFragment homeFragment) {
        super(1);
        this.f21664a = homeFragment;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            HomeFragment homeFragment = this.f21664a;
            int i10 = HomeFragment.f19678z0;
            ((m) homeFragment.f19689w0.getValue()).A((List) ((f.c) fVar).f18006a);
        }
        return i.f20112a;
    }
}
