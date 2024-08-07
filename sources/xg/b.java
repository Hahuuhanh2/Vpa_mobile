package xg;

import al.d0;
import bc.h;
import bc.n;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.model.BiddingResult;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import com.vpa.daugia.module.auction.data.model.sse.ResultRoomSSE;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ik.d;
import java.util.ArrayList;
import java.util.List;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$getBiddingResult$1", f = "AuctionRoomViewModel.kt", l = {270}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23450a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23451b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList<PriceTable> f23452c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f23453d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AuctionRoomViewModel auctionRoomViewModel, ArrayList<PriceTable> arrayList, n nVar, d<? super b> dVar) {
        super(2, dVar);
        this.f23451b = auctionRoomViewModel;
        this.f23452c = arrayList;
        this.f23453d = nVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f23451b, this.f23452c, this.f23453d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        int i10;
        int i11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.f23450a;
        if (i12 == 0) {
            l0.Q0(obj);
            AuctionApiHelper auctionApiHelper = this.f23451b.f19429d;
            this.f23450a = 1;
            obj = auctionApiHelper.getBiddingResult(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i12 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f23451b.f19440o.k(new ArrayList());
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f23451b.f19440o.k((ArrayList) obj);
        ArrayList<BiddingResult> d10 = this.f23451b.f19440o.d();
        if (d10 != null) {
            ArrayList<PriceTable> arrayList = this.f23452c;
            for (BiddingResult biddingResult : d10) {
                for (PriceTable priceTable : arrayList) {
                    if (j.a(biddingResult.getBiddingRoom(), priceTable.getBiddingRoomId())) {
                        Integer result = biddingResult.getResult();
                        if (result != null) {
                            i11 = result.intValue();
                        } else {
                            i11 = 0;
                        }
                        priceTable.setResult(i11);
                    }
                }
            }
        }
        this.f23451b.f19438m.k(this.f23452c);
        n nVar = this.f23453d;
        if (nVar != null) {
            AuctionRoomViewModel auctionRoomViewModel = this.f23451b;
            ResultRoomSSE resultRoomSSE = (ResultRoomSSE) new h().b(nVar, ResultRoomSSE.class);
            ArrayList<BiddingResult> d11 = auctionRoomViewModel.f19440o.d();
            if (d11 != null) {
                for (BiddingResult biddingResult2 : d11) {
                    List<BiddingRoomId> biddingRoomIds = resultRoomSSE.getBiddingRoomIds();
                    if (biddingRoomIds != null) {
                        for (BiddingRoomId biddingRoomId : biddingRoomIds) {
                            if (biddingRoomId != null) {
                                str = biddingRoomId.getRoomId();
                            } else {
                                str = null;
                            }
                            if (j.a(str, biddingResult2.getBiddingRoom())) {
                                if (biddingRoomId != null) {
                                    Integer result2 = biddingResult2.getResult();
                                    if (result2 != null) {
                                        i10 = result2.intValue();
                                    } else {
                                        i10 = 0;
                                    }
                                    biddingRoomId.setResult(i10);
                                }
                            }
                        }
                    }
                }
            }
            auctionRoomViewModel.B.k(resultRoomSSE);
        }
        return ek.i.f20112a;
    }
}
