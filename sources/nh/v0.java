package nh;

import al.d0;
import com.vpa.daugia.module.home.data.api.HomeApiHelper;
import com.vpa.daugia.module.home.data.model.AuctionPolicy;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getAuctionPolicy$1", f = "HomeViewModel.kt", l = {174}, m = "invokeSuspend")
/* compiled from: HomeViewModel.kt */
public final class v0 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f21695a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f21696b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f21697c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v0(HomeViewModel homeViewModel, String str, d<? super v0> dVar) {
        super(2, dVar);
        this.f21696b = homeViewModel;
        this.f21697c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new v0(this.f21696b, this.f21697c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        AuctionPolicy auctionPolicy;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f21695a;
        if (i10 == 0) {
            l0.Q0(obj);
            HomeApiHelper homeApiHelper = this.f21696b.f19706d;
            String str = this.f21697c;
            this.f21695a = 1;
            obj = homeApiHelper.getAuctionPolicy(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                l.p(e10, this.f21696b.f19720r);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        if (kVar.e() && (auctionPolicy = (AuctionPolicy) kVar.d()) != null) {
            this.f21696b.f19720r.k(new f.c(auctionPolicy));
        }
        return ek.i.f20112a;
    }
}
