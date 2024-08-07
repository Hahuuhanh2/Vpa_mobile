package nh;

import al.d0;
import com.vpa.daugia.module.home.data.api.HomeApiHelper;
import com.vpa.daugia.module.home.data.api.request.NotifyAuctionRequest;
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

@e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getNotifyAuction$1", f = "HomeViewModel.kt", l = {200}, m = "invokeSuspend")
/* compiled from: HomeViewModel.kt */
public final class a1 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f21637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f21638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Long f21639c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Long f21640d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f21641e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1(HomeViewModel homeViewModel, Long l10, Long l11, String str, d<? super a1> dVar) {
        super(2, dVar);
        this.f21638b = homeViewModel;
        this.f21639c = l10;
        this.f21640d = l11;
        this.f21641e = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a1(this.f21638b, this.f21639c, this.f21640d, this.f21641e, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f21637a;
        if (i10 == 0) {
            l0.Q0(obj);
            if (!this.f21638b.f19710h.hasMoreData()) {
                return ek.i.f20112a;
            }
            int nextPage = this.f21638b.f19710h.nextPage();
            NotifyAuctionRequest notifyAuctionRequest = new NotifyAuctionRequest(new Integer(nextPage), (Integer) null, this.f21639c, this.f21640d, this.f21641e, this.f21638b.f19710h.getTotalPages(), 2, (sk.e) null);
            HomeApiHelper homeApiHelper = this.f21638b.f19706d;
            this.f21637a = 1;
            obj = homeApiHelper.getNotifyAuction(notifyAuctionRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                l.p(e10, this.f21638b.f19722t);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        ArrayList arrayList = (ArrayList) kVar.d();
        if (arrayList != null) {
            HomeViewModel homeViewModel = this.f21638b;
            homeViewModel.f19722t.k(new f.c(arrayList));
            homeViewModel.f19710h.setTotalPages(kVar.f());
            NotifyAuctionRequest notifyAuctionRequest2 = homeViewModel.f19710h;
            notifyAuctionRequest2.setPage(new Integer(notifyAuctionRequest2.nextPage()));
        }
        return ek.i.f20112a;
    }
}
