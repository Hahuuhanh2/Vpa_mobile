package xg;

import al.d0;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$getTimeInfo$1", f = "AuctionRoomViewModel.kt", l = {594}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class f extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23467a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23468b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(AuctionRoomViewModel auctionRoomViewModel, d<? super f> dVar) {
        super(2, dVar);
        this.f23468b = auctionRoomViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new f(this.f23468b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23467a;
        if (i10 == 0) {
            l0.Q0(obj);
            AuctionApiHelper auctionApiHelper = this.f23468b.f19429d;
            this.f23467a = 1;
            obj = auctionApiHelper.getTimeInfo(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((Number) obj).longValue();
        return ek.i.f20112a;
    }
}
