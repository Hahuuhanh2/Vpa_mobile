package rg;

import al.d0;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.api.request.AuctionResultRequest;
import com.vpa.daugia.module.auction.data.model.DetailAuctionResult;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.setting.data.model.SelectAddress;
import ef.n;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import sk.j;
import ze.f;

@e(c = "com.vpa.daugia.module.auction.ui.AuctionViewModel$getActionResultApi$1", f = "AuctionViewModel.kt", l = {155}, m = "invokeSuspend")
/* compiled from: AuctionViewModel.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionViewModel f22771b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f22772c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f22773d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AuctionViewModel auctionViewModel, String str, String str2, d<? super b> dVar) {
        super(2, dVar);
        this.f22771b = auctionViewModel;
        this.f22772c = str;
        this.f22773d = str2;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f22771b, this.f22772c, this.f22773d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f22770a;
        if (i10 == 0) {
            l0.Q0(obj);
            if (!this.f22771b.f19386g.d()) {
                return ek.i.f20112a;
            }
            this.f22771b.f19389j.k(f.b.f18005a);
            AuctionResultRequest auctionResultRequest = new AuctionResultRequest(new Integer(this.f22771b.f19386g.b()), new Integer(this.f22771b.f19386g.e()), this.f22772c, this.f22773d);
            AuctionApiHelper auctionApiHelper = this.f22771b.f19383d;
            this.f22770a = 1;
            obj = auctionApiHelper.getDetailAuctionResult(auctionResultRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f22771b.f19389j);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList<DetailAuctionResult> a10 = ((n) obj).a();
        if (a10 != null) {
            AuctionViewModel auctionViewModel = this.f22771b;
            for (DetailAuctionResult detailAuctionResult : a10) {
                ArrayList<SelectAddress> d10 = auctionViewModel.f19395p.d();
                if (d10 != null) {
                    for (SelectAddress selectAddress : d10) {
                        if (j.a(selectAddress.getCode(), detailAuctionResult.getCityCode())) {
                            detailAuctionResult.setCityCode(selectAddress.getFullName());
                        }
                    }
                }
            }
            auctionViewModel.f19389j.k(new f.c(a10));
        }
        this.f22771b.getClass();
        return ek.i.f20112a;
    }
}
