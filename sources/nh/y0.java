package nh;

import al.d0;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.api.request.AwaitAuctionRequest;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ef.k;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getListAwaitAuctionHCM$1", f = "HomeViewModel.kt", l = {296}, m = "invokeSuspend")
/* compiled from: HomeViewModel.kt */
public final class y0 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f21706a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f21707b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f21708c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(HomeViewModel homeViewModel, String str, d<? super y0> dVar) {
        super(2, dVar);
        this.f21707b = homeViewModel;
        this.f21708c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new y0(this.f21707b, this.f21708c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f21706a;
        if (i10 == 0) {
            l0.Q0(obj);
            if (!this.f21707b.f19711i.d()) {
                return ek.i.f20112a;
            }
            AuctionApiHelper auctionApiHelper = this.f21707b.f19707e;
            AwaitAuctionRequest awaitAuctionRequest = new AwaitAuctionRequest((Integer) null, new Integer(0), "79", (Integer) null, (Integer) null, this.f21708c, 25, (sk.e) null);
            this.f21706a = 1;
            obj = auctionApiHelper.getRegisterAuction(awaitAuctionRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f21707b.f19728z);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        if (kVar.a() != null) {
            r2.p<f<ArrayList<AwaitAuction>>> pVar = this.f21707b.f19728z;
            ArrayList arrayList = (ArrayList) kVar.a();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            pVar.k(new f.c(arrayList));
        }
        this.f21707b.f19711i.g(kVar.g());
        return ek.i.f20112a;
    }
}
