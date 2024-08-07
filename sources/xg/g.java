package xg;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auction.data.model.AccountRequest;
import com.vpa.daugia.module.auction.data.model.AccountResponse;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import lg.b;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$login$1", f = "AuctionRoomViewModel.kt", l = {160}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class g extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23470b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(AuctionRoomViewModel auctionRoomViewModel, d<? super g> dVar) {
        super(2, dVar);
        this.f23470b = auctionRoomViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new g(this.f23470b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23469a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f23470b.f19432g.k(f.b.f18005a);
            AuctionRoomViewModel auctionRoomViewModel = this.f23470b;
            this.f23469a = 1;
            obj = auctionRoomViewModel.f19429d.verifyAccount((AccountRequest) auctionRoomViewModel.F.f8545b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                r2.p<f<AccountResponse>> pVar = this.f23470b.f19432g;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (yVar == null || (responseBody = yVar.f23248c) == null) {
                            str = null;
                        } else {
                            str = responseBody.q();
                        }
                        try {
                            String str2 = (String) fk.p.N0(((k) new h().d(k.class, str)).c());
                            if (str2 == null) {
                                str2 = "Error";
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
            AccountResponse accountResponse = (AccountResponse) kVar.d();
            if (accountResponse != null) {
                AuctionRoomViewModel auctionRoomViewModel2 = this.f23470b;
                b bVar = auctionRoomViewModel2.f19430e;
                String accessToken = accountResponse.getAccessToken();
                if (accessToken == null) {
                    accessToken = "";
                }
                bVar.i(accessToken);
                auctionRoomViewModel2.f19430e.j(accountResponse, "DATA_USER_AUCTION");
                auctionRoomViewModel2.f19432g.k(new f.c(accountResponse));
            }
        } else {
            this.f23470b.f19432g.k(new f.a(new Throwable((String) fk.p.N0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
