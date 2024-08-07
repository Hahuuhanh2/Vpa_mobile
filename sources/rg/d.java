package rg;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import ef.k;
import ef.n;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.auction.ui.AuctionViewModel$getWaitingPlateAuction$1", f = "AuctionViewModel.kt", l = {183}, m = "invokeSuspend")
/* compiled from: AuctionViewModel.kt */
public final class d extends i implements p<d0, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22782a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionViewModel f22783b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(AuctionViewModel auctionViewModel, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f22783b = auctionViewModel;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        return new d(this.f22783b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String str;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f22782a;
        String str2 = "Error";
        if (i10 == 0) {
            l0.Q0(obj);
            AuctionApiHelper auctionApiHelper = this.f22783b.f19383d;
            this.f22782a = 1;
            obj = auctionApiHelper.getWaitingPlateAuction(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                r2.p<f<ArrayList<OrderWaitAuction>>> pVar = this.f22783b.f19391l;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (yVar == null || (responseBody = yVar.f23248c) == null) {
                            str = null;
                        } else {
                            str = responseBody.q();
                        }
                        try {
                            String str3 = (String) fk.p.N0(((k) new h().d(k.class, str)).c());
                            if (str3 != null) {
                                str2 = str3;
                            }
                            e = new Exception(str2);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                pVar.k(new f.a(e));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        if (kVar.e()) {
            r2.p<f<ArrayList<OrderWaitAuction>>> pVar2 = this.f22783b.f19391l;
            n nVar = (n) kVar.d();
            if (nVar == null || (arrayList = nVar.a()) == null) {
                arrayList = new ArrayList();
            }
            pVar2.k(new f.c(arrayList));
        } else {
            this.f22783b.f19391l.k(new f.a(new Throwable(str2)));
        }
        return ek.i.f20112a;
    }
}
