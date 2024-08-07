package xg;

import al.d0;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ik.d;
import java.util.ArrayList;
import java.util.Iterator;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@kk.e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$getRoomAuction$1", f = "AuctionRoomViewModel.kt", l = {207, 209}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class e extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f23461a;

    /* renamed from: b  reason: collision with root package name */
    public int f23462b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23463c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f23464d;

    @kk.e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$getRoomAuction$1$1", f = "AuctionRoomViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: AuctionRoomViewModel.kt */
    public static final class a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionRoomViewModel f23465a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList<PriceTable> f23466b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionRoomViewModel auctionRoomViewModel, ArrayList<PriceTable> arrayList, d<? super a> dVar) {
            super(2, dVar);
            this.f23465a = auctionRoomViewModel;
            this.f23466b = arrayList;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f23465a, this.f23466b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            T t10;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            PriceTable d10 = this.f23465a.f19443r.d();
            if (d10 == null) {
                return null;
            }
            Iterator<T> it = this.f23466b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (j.a(((PriceTable) t10).getBiddingRoomId(), d10.getBiddingRoomId())) {
                    break;
                }
            }
            PriceTable priceTable = (PriceTable) t10;
            if (priceTable == null) {
                return null;
            }
            priceTable.setSelected(true);
            d10.setPrices(priceTable.getPrices());
            d10.setChannel(priceTable.getChannel());
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(AuctionRoomViewModel auctionRoomViewModel, boolean z10, d<? super e> dVar) {
        super(2, dVar);
        this.f23463c = auctionRoomViewModel;
        this.f23464d = z10;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new e(this.f23463c, this.f23464d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c A[Catch:{ Exception -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r6.f23462b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 == r4) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.util.ArrayList r0 = r6.f23461a
            p3.l0.Q0(r7)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0048
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001b:
            p3.l0.Q0(r7)     // Catch:{ Exception -> 0x0060 }
            goto L_0x002f
        L_0x001f:
            p3.l0.Q0(r7)
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r7 = r6.f23463c     // Catch:{ Exception -> 0x0060 }
            com.vpa.daugia.module.auction.data.api.AuctionApiHelper r7 = r7.f19429d     // Catch:{ Exception -> 0x0060 }
            r6.f23462b = r4     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r7 = r7.getRoomAuction(r6)     // Catch:{ Exception -> 0x0060 }
            if (r7 != r0) goto L_0x002f
            return r0
        L_0x002f:
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x0060 }
            gl.c r1 = al.r0.f19084a     // Catch:{ Exception -> 0x0060 }
            al.q1 r1 = fl.m.f20254a     // Catch:{ Exception -> 0x0060 }
            xg.e$a r4 = new xg.e$a     // Catch:{ Exception -> 0x0060 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r5 = r6.f23463c     // Catch:{ Exception -> 0x0060 }
            r4.<init>(r5, r7, r3)     // Catch:{ Exception -> 0x0060 }
            r6.f23461a = r7     // Catch:{ Exception -> 0x0060 }
            r6.f23462b = r2     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r1 = p3.l0.V0(r6, r1, r4)     // Catch:{ Exception -> 0x0060 }
            if (r1 != r0) goto L_0x0047
            return r0
        L_0x0047:
            r0 = r7
        L_0x0048:
            boolean r7 = r6.f23464d     // Catch:{ Exception -> 0x0060 }
            if (r7 == 0) goto L_0x0070
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r7 = r6.f23463c     // Catch:{ Exception -> 0x0060 }
            r7.getClass()     // Catch:{ Exception -> 0x0060 }
            al.d0 r1 = p3.l0.d0(r7)     // Catch:{ Exception -> 0x0060 }
            gl.b r4 = al.r0.f19085b     // Catch:{ Exception -> 0x0060 }
            xg.c r5 = new xg.c     // Catch:{ Exception -> 0x0060 }
            r5.<init>(r7, r0, r3)     // Catch:{ Exception -> 0x0060 }
            p3.l0.j0(r1, r4, r5, r2)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0070
        L_0x0060:
            r7 = move-exception
            r7.printStackTrace()
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r7 = r6.f23463c
            r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r7 = r7.f19438m
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.k(r0)
        L_0x0070:
            ek.i r7 = ek.i.f20112a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
