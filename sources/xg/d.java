package xg;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.model.UserBiddingProfile;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ef.k;
import jk.a;
import kk.e;
import kk.i;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$getProfile$1", f = "AuctionRoomViewModel.kt", l = {183}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class d extends i implements p<d0, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23460b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(AuctionRoomViewModel auctionRoomViewModel, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f23460b = auctionRoomViewModel;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        return new d(this.f23460b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23459a;
        if (i10 == 0) {
            l0.Q0(obj);
            AuctionApiHelper auctionApiHelper = this.f23460b.f19429d;
            this.f23459a = 1;
            obj = auctionApiHelper.getProfile(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                r2.p<f<UserBiddingProfile>> pVar = this.f23460b.f19434i;
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
        Integer b10 = kVar.b();
        if (b10 != null) {
            if (b10.intValue() == 401) {
                this.f23460b.f19434i.k(new f.a(new Throwable((String) fk.p.N0(kVar.c()))));
                return ek.i.f20112a;
            }
        }
        UserBiddingProfile userBiddingProfile = (UserBiddingProfile) kVar.d();
        if (userBiddingProfile != null) {
            AuctionRoomViewModel auctionRoomViewModel = this.f23460b;
            auctionRoomViewModel.f19434i.k(new f.c(userBiddingProfile));
            auctionRoomViewModel.f19430e.j(userBiddingProfile, "DATA_PROFILE_AUCTION");
        }
        return ek.i.f20112a;
    }
}
