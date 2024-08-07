package xg;

import al.d0;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$setPrice$1", f = "AuctionRoomViewModel.kt", l = {386}, m = "invokeSuspend")
/* compiled from: AuctionRoomViewModel.kt */
public final class h extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23471a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionRoomViewModel f23472b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(AuctionRoomViewModel auctionRoomViewModel, d<? super h> dVar) {
        super(2, dVar);
        this.f23472b = auctionRoomViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new h(this.f23472b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0193, code lost:
        if (r2.intValue() != 10001) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a0, code lost:
        if (r0.intValue() == 10001) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a2, code lost:
        com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel.e(r1.f23472b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r1 = r27
            java.lang.Class<com.vpa.daugia.module.auction.data.model.AccountResponse> r0 = com.vpa.daugia.module.auction.data.model.AccountResponse.class
            java.lang.String r2 = "DATA_USER_AUCTION"
            jk.a r3 = jk.a.COROUTINE_SUSPENDED
            int r4 = r1.f23471a
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001f
            if (r4 != r5) goto L_0x0017
            p3.l0.Q0(r28)     // Catch:{ Exception -> 0x01a8 }
            r0 = r28
            goto L_0x00fc
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001f:
            p3.l0.Q0(r28)
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPrice r7 = r4.I     // Catch:{ Exception -> 0x01a8 }
            r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r4 = r4.f19443r     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r4 = r4.d()     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.PriceTable r4 = (com.vpa.daugia.module.auction.data.model.PriceTable) r4     // Catch:{ Exception -> 0x01a8 }
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = r4.getAuctionCode()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0036
        L_0x0035:
            r4 = r6
        L_0x0036:
            r7.setAuctionCode(r4)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPrice r7 = r4.I     // Catch:{ Exception -> 0x01a8 }
            d2.i<java.lang.Long> r4 = r4.f19447v     // Catch:{ Exception -> 0x01a8 }
            T r4 = r4.f8545b     // Catch:{ Exception -> 0x01a8 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x01a8 }
            if (r4 != 0) goto L_0x004d
            r8 = 5000000(0x4c4b40, double:2.470328E-317)
            java.lang.Long r4 = new java.lang.Long     // Catch:{ Exception -> 0x01a8 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x01a8 }
        L_0x004d:
            long r8 = r4.longValue()     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r4 = r4.f19443r     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r4 = r4.d()     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.PriceTable r4 = (com.vpa.daugia.module.auction.data.model.PriceTable) r4     // Catch:{ Exception -> 0x01a8 }
            if (r4 == 0) goto L_0x0076
            java.util.ArrayList r4 = r4.getPrices()     // Catch:{ Exception -> 0x01a8 }
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = fk.p.N0(r4)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.BiddingPrice r4 = (com.vpa.daugia.module.auction.data.model.BiddingPrice) r4     // Catch:{ Exception -> 0x01a8 }
            if (r4 == 0) goto L_0x0076
            java.lang.Long r4 = r4.getPrice()     // Catch:{ Exception -> 0x01a8 }
            if (r4 == 0) goto L_0x0076
            long r10 = r4.longValue()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0079
        L_0x0076:
            r10 = 35000000(0x2160ec0, double:1.72922976E-316)
        L_0x0079:
            long r8 = r8 + r10
            java.lang.Long r4 = new java.lang.Long     // Catch:{ Exception -> 0x01a8 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x01a8 }
            r7.setPrice(r4)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPrice r7 = r4.I     // Catch:{ Exception -> 0x01a8 }
            r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r4 = r4.f19443r     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r4 = r4.d()     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.PriceTable r4 = (com.vpa.daugia.module.auction.data.model.PriceTable) r4     // Catch:{ Exception -> 0x01a8 }
            if (r4 == 0) goto L_0x0095
            java.lang.String r4 = r4.getBiddingRoomId()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0096
        L_0x0095:
            r4 = r6
        L_0x0096:
            r7.setRoomId(r4)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPrice r7 = r4.I     // Catch:{ Exception -> 0x01a8 }
            lg.b r4 = r4.f19430e     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r4 = r4.b(r0, r2)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.AccountResponse r4 = (com.vpa.daugia.module.auction.data.model.AccountResponse) r4     // Catch:{ Exception -> 0x01a8 }
            if (r4 == 0) goto L_0x00ac
            java.lang.String r4 = r4.getUsername()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x00ad
        L_0x00ac:
            r4 = r6
        L_0x00ad:
            r7.setUserName(r4)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPrice r7 = r4.I     // Catch:{ Exception -> 0x01a8 }
            lg.b r4 = r4.f19430e     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r0 = r4.b(r0, r2)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.AccountResponse r0 = (com.vpa.daugia.module.auction.data.model.AccountResponse) r0     // Catch:{ Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.getUserId()     // Catch:{ Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x00ce
            long r8 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x01a8 }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ Exception -> 0x01a8 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x00cf
        L_0x00ce:
            r0 = r6
        L_0x00cf:
            r7.setUserId(r0)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r0 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            r2.p<ze.f<com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse>> r0 = r0.f19441p     // Catch:{ Exception -> 0x01a8 }
            ze.f$b r2 = ze.f.b.f18005a     // Catch:{ Exception -> 0x01a8 }
            r0.k(r2)     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r0 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.api.AuctionApiHelper r2 = r0.f19429d     // Catch:{ Exception -> 0x01a8 }
            r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r0 = r0.f19443r     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r0 = r0.d()     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.PriceTable r0 = (com.vpa.daugia.module.auction.data.model.PriceTable) r0     // Catch:{ Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r0.getChannel()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x00ef
        L_0x00ee:
            r0 = r6
        L_0x00ef:
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPrice r4 = r4.I     // Catch:{ Exception -> 0x01a8 }
            r1.f23471a = r5     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r0 = r2.setPrice(r0, r4, r1)     // Catch:{ Exception -> 0x01a8 }
            if (r0 != r3) goto L_0x00fc
            return r3
        L_0x00fc:
            com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse r0 = (com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse) r0     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r2 = r0.getNextId()     // Catch:{ Exception -> 0x01a8 }
            if (r2 == 0) goto L_0x0115
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r3 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPrice r4 = r3.I     // Catch:{ Exception -> 0x01a8 }
            r4.setNextId(r2)     // Catch:{ Exception -> 0x01a8 }
            r2.p<ze.f<com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse>> r2 = r3.f19441p     // Catch:{ Exception -> 0x01a8 }
            ze.f$c r3 = new ze.f$c     // Catch:{ Exception -> 0x01a8 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01a8 }
            r2.k(r3)     // Catch:{ Exception -> 0x01a8 }
        L_0x0115:
            java.lang.Integer r2 = r0.getErrorCode()     // Catch:{ Exception -> 0x01a8 }
            r3 = 401(0x191, float:5.62E-43)
            if (r2 != 0) goto L_0x011e
            goto L_0x0160
        L_0x011e:
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x01a8 }
            if (r2 != r3) goto L_0x0160
            r0.getErrorCode()     // Catch:{ Exception -> 0x01a8 }
            int r2 = kf.h.f12560a     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r2 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            r2.p<ze.f<com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse>> r2 = r2.f19441p     // Catch:{ Exception -> 0x01a8 }
            ze.f$c r3 = new ze.f$c     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse r4 = new com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse     // Catch:{ Exception -> 0x01a8 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.Integer r23 = r0.getErrorCode()     // Catch:{ Exception -> 0x01a8 }
            java.util.List r24 = r0.getErrors()     // Catch:{ Exception -> 0x01a8 }
            r25 = 32767(0x7fff, float:4.5916E-41)
            r26 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x01a8 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01a8 }
            r2.k(r3)     // Catch:{ Exception -> 0x01a8 }
            ek.i r0 = ek.i.f20112a     // Catch:{ Exception -> 0x01a8 }
            return r0
        L_0x0160:
            java.lang.String r2 = r0.getNextId()     // Catch:{ Exception -> 0x01a8 }
            r3 = 0
            if (r2 == 0) goto L_0x016f
            int r2 = r2.length()     // Catch:{ Exception -> 0x01a8 }
            if (r2 != 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r5 = r3
        L_0x016f:
            if (r5 == 0) goto L_0x0186
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r2 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            r2.p<ze.f<com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse>> r2 = r2.f19441p     // Catch:{ Exception -> 0x01a8 }
            ze.f$a r3 = new ze.f$a     // Catch:{ Exception -> 0x01a8 }
            java.lang.Throwable r4 = new java.lang.Throwable     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r5 = r0.getMessage()     // Catch:{ Exception -> 0x01a8 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x01a8 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01a8 }
            r2.k(r3)     // Catch:{ Exception -> 0x01a8 }
        L_0x0186:
            java.lang.Integer r2 = r0.getErrorCode()     // Catch:{ Exception -> 0x01a8 }
            r3 = 10001(0x2711, float:1.4014E-41)
            if (r2 != 0) goto L_0x018f
            goto L_0x0195
        L_0x018f:
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x01a8 }
            if (r2 == r3) goto L_0x01a2
        L_0x0195:
            java.lang.Integer r0 = r0.getCode()     // Catch:{ Exception -> 0x01a8 }
            if (r0 != 0) goto L_0x019c
            goto L_0x01f0
        L_0x019c:
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01a8 }
            if (r0 != r3) goto L_0x01f0
        L_0x01a2:
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r0 = r1.f23472b     // Catch:{ Exception -> 0x01a8 }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel.e(r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01f0
        L_0x01a8:
            r0 = move-exception
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r2 = r1.f23472b
            r2.p<ze.f<com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse>> r2 = r2.f19441p
            ze.f$a r3 = new ze.f$a
            boolean r4 = r0 instanceof retrofit2.HttpException     // Catch:{ Exception -> 0x01e0 }
            if (r4 == 0) goto L_0x01de
            r4 = r0
            retrofit2.HttpException r4 = (retrofit2.HttpException) r4     // Catch:{ Exception -> 0x01e0 }
            ul.y<?> r4 = r4.f22764a     // Catch:{ Exception -> 0x01e0 }
            if (r4 == 0) goto L_0x01c2
            okhttp3.ResponseBody r4 = r4.f23248c     // Catch:{ Exception -> 0x01e0 }
            if (r4 == 0) goto L_0x01c2
            java.lang.String r6 = r4.q()     // Catch:{ Exception -> 0x01e0 }
        L_0x01c2:
            bc.l r4 = m9.b.P(r6)     // Catch:{ Exception -> 0x01e0 }
            bc.n r4 = r4.g()     // Catch:{ Exception -> 0x01e0 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r6 = "message"
            dc.p<java.lang.String, bc.l> r4 = r4.f4161a     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x01e0 }
            bc.l r4 = (bc.l) r4     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r4 = r4.l()     // Catch:{ Exception -> 0x01e0 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x01e0 }
            goto L_0x01e7
        L_0x01de:
            r5 = r0
            goto L_0x01e7
        L_0x01e0:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r4 = "Lỗi kết nối"
            r5.<init>(r4)
        L_0x01e7:
            r3.<init>(r5)
            r2.k(r3)
            r0.printStackTrace()
        L_0x01f0:
            ek.i r0 = ek.i.f20112a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
