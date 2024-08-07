package xg;

import al.d0;
import al.q1;
import al.r0;
import bc.n;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.model.BiddingTimeout;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import fl.m;
import ik.d;
import java.util.ArrayList;
import java.util.Iterator;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$getBiddingTimeout$1", f = "AuctionRoomViewModel.kt", l = {237, 247}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23455b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList<PriceTable> f23456c;

    @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$getBiddingTimeout$1$2", f = "AuctionRoomViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: AuctionRoomViewModel.kt */
    public static final class a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList<BiddingTimeout> f23457a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AuctionRoomViewModel f23458b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionRoomViewModel auctionRoomViewModel, ArrayList arrayList, d dVar) {
            super(2, dVar);
            this.f23457a = arrayList;
            this.f23458b = auctionRoomViewModel;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f23458b, this.f23457a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            T t10;
            String str;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            ArrayList<BiddingTimeout> arrayList = this.f23457a;
            AuctionRoomViewModel auctionRoomViewModel = this.f23458b;
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                String roomId = ((BiddingTimeout) t10).getRoomId();
                PriceTable d10 = auctionRoomViewModel.f19443r.d();
                if (d10 != null) {
                    str = d10.getBiddingRoomId();
                } else {
                    str = null;
                }
                if (j.a(roomId, str)) {
                    break;
                }
            }
            BiddingTimeout biddingTimeout = (BiddingTimeout) t10;
            if (biddingTimeout == null) {
                return null;
            }
            AuctionRoomViewModel auctionRoomViewModel2 = this.f23458b;
            PriceTable d11 = auctionRoomViewModel2.f19443r.d();
            if (d11 != null) {
                d11.setStartAuction(biddingTimeout.getStartTime());
            }
            PriceTable d12 = auctionRoomViewModel2.f19443r.d();
            if (d12 != null) {
                d12.setEndRegistTime(biddingTimeout.getEndTime());
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(AuctionRoomViewModel auctionRoomViewModel, ArrayList<PriceTable> arrayList, d<? super c> dVar) {
        super(2, dVar);
        this.f23455b = auctionRoomViewModel;
        this.f23456c = arrayList;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f23455b, this.f23456c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f23454a;
        if (i10 == 0) {
            l0.Q0(obj);
            AuctionApiHelper auctionApiHelper = this.f23455b.f19429d;
            this.f23454a = 1;
            obj = auctionApiHelper.getBiddingTimeout(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else if (i10 == 2) {
            try {
                l0.Q0(obj);
                AuctionRoomViewModel auctionRoomViewModel = this.f23455b;
                ArrayList<PriceTable> arrayList = this.f23456c;
                auctionRoomViewModel.getClass();
                l0.j0(l0.d0(auctionRoomViewModel), r0.f19085b, new b(auctionRoomViewModel, arrayList, (n) null, (d<? super b>) null), 2);
                r2.p<PriceTable> pVar = this.f23455b.f19443r;
                pVar.k(pVar.d());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return ek.i.f20112a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList2 = (ArrayList) obj;
        for (PriceTable priceTable : this.f23456c) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (j.a(((BiddingTimeout) obj2).getRoomId(), priceTable.getBiddingRoomId())) {
                    break;
                }
            }
            BiddingTimeout biddingTimeout = (BiddingTimeout) obj2;
            if (biddingTimeout != null) {
                priceTable.setStartAuction(biddingTimeout.getStartTime());
                priceTable.setEndRegistTime(biddingTimeout.getEndTime());
            }
        }
        gl.c cVar = r0.f19084a;
        q1 q1Var = m.f20254a;
        a aVar2 = new a(this.f23455b, arrayList2, (d) null);
        this.f23454a = 2;
        if (l0.V0(this, q1Var, aVar2) == aVar) {
            return aVar;
        }
        AuctionRoomViewModel auctionRoomViewModel2 = this.f23455b;
        ArrayList<PriceTable> arrayList3 = this.f23456c;
        auctionRoomViewModel2.getClass();
        l0.j0(l0.d0(auctionRoomViewModel2), r0.f19085b, new b(auctionRoomViewModel2, arrayList3, (n) null, (d<? super b>) null), 2);
        r2.p<PriceTable> pVar2 = this.f23455b.f19443r;
        pVar2.k(pVar2.d());
        return ek.i.f20112a;
    }
}
