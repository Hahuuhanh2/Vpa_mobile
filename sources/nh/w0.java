package nh;

import al.d0;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.api.request.AwaitAuctionRequest;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ef.n;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getListAwaitAuction$1", f = "HomeViewModel.kt", l = {223}, m = "invokeSuspend")
/* compiled from: HomeViewModel.kt */
public final class w0 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f21698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f21699b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f21700c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0(HomeViewModel homeViewModel, String str, d<? super w0> dVar) {
        super(2, dVar);
        this.f21699b = homeViewModel;
        this.f21700c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new w0(this.f21699b, this.f21700c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        int i10;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.f21698a;
        if (i11 == 0) {
            l0.Q0(obj);
            if (!this.f21699b.f19711i.d()) {
                return ek.i.f20112a;
            }
            this.f21699b.f19724v.k(f.b.f18005a);
            AwaitAuctionRequest awaitAuctionRequest = this.f21699b.I;
            Integer page = awaitAuctionRequest.getPage();
            if (page != null) {
                i10 = page.intValue();
            } else {
                i10 = 0;
            }
            awaitAuctionRequest.setPage(new Integer(i10 + 1));
            this.f21699b.I.setSearch(this.f21700c);
            HomeViewModel homeViewModel = this.f21699b;
            AuctionApiHelper auctionApiHelper = homeViewModel.f19707e;
            AwaitAuctionRequest awaitAuctionRequest2 = homeViewModel.I;
            this.f21698a = 1;
            obj = auctionApiHelper.getListAwaitAuction(awaitAuctionRequest2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i11 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f21699b.f19724v);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n<AwaitAuction> nVar = (n) obj;
        if (nVar.a() != null) {
            r2.p<f<ArrayList<AwaitAuction>>> pVar = this.f21699b.f19724v;
            ArrayList<AwaitAuction> a10 = nVar.a();
            if (a10 == null) {
                a10 = new ArrayList<>();
            }
            pVar.k(new f.c(a10));
        }
        HomeViewModel homeViewModel2 = this.f21699b;
        homeViewModel2.getClass();
        homeViewModel2.f19711i = nVar;
        return ek.i.f20112a;
    }
}
