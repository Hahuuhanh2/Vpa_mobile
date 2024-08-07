package xg;

import al.d0;
import al.q1;
import al.r0;
import com.vpa.daugia.module.auction.data.model.AccountRequest;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import fl.m;
import gl.c;
import ik.d;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$cancelLogin$1", f = "AuctionRoomViewModel.kt", l = {653}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23447a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23448b;

    @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$cancelLogin$1$1", f = "AuctionRoomViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: xg.a$a  reason: collision with other inner class name */
    /* compiled from: AuctionRoomViewModel.kt */
    public static final class C0316a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionRoomViewModel f23449a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0316a(AuctionRoomViewModel auctionRoomViewModel, d<? super C0316a> dVar) {
            super(2, dVar);
            this.f23449a = auctionRoomViewModel;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new C0316a(this.f23449a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0316a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            this.f23449a.F.g(new AccountRequest((String) null, (String) null, (String) null, (String) null, (Integer) null, 31, (sk.e) null));
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(AuctionRoomViewModel auctionRoomViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f23448b = auctionRoomViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f23448b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f23447a;
        if (i10 == 0) {
            l0.Q0(obj);
            c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            C0316a aVar2 = new C0316a(this.f23448b, (d<? super C0316a>) null);
            this.f23447a = 1;
            if (l0.V0(this, q1Var, aVar2) == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ek.i.f20112a;
    }
}
