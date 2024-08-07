package com.vpa.daugia.module.auction.ui.viewmodel;

import al.a0;
import al.d0;
import al.g0;
import al.i1;
import al.r0;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import bc.h;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.model.AccountRequest;
import com.vpa.daugia.module.auction.data.model.AccountResponse;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import com.vpa.daugia.module.auction.data.model.BiddingResult;
import com.vpa.daugia.module.auction.data.model.JoinChannelRequest;
import com.vpa.daugia.module.auction.data.model.JoinChannelResponse;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.UserBiddingPrice;
import com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse;
import com.vpa.daugia.module.auction.data.model.UserBiddingProfile;
import com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE;
import com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE;
import com.vpa.daugia.module.auction.data.model.sse.PriceSSE;
import com.vpa.daugia.module.auction.data.model.sse.ResultRoomSSE;
import com.vpa.daugia.module.auction.data.model.sse.StartSSE;
import com.vpa.daugia.module.auction.data.model.sse.WaitingTimeSSE;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.sse.data.api.SSERepository;
import com.vpa.daugia.module.sse.data.model.SSEEventData;
import com.vpa.daugia.module.sse.data.model.STATUS;
import d2.i;
import ef.k;
import f0.b0;
import ik.d;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kk.e;
import okhttp3.ResponseBody;
import p3.l0;
import r2.p;
import r2.v;
import retrofit2.HttpException;
import rk.q;
import sk.j;
import ul.y;
import yk.l;
import ze.f;

/* compiled from: AuctionRoomViewModel.kt */
public final class AuctionRoomViewModel extends v {
    public final p<CancelRoomSSE> A;
    public final p<ResultRoomSSE> B;
    public final p<WaitingTimeSSE> C;
    public final p<ExtendTimeSSE> D;
    public final p<Boolean> E;
    public i<AccountRequest> F;
    public Integer G;
    public final String H;
    public UserBiddingPrice I;
    public i1 J;

    /* renamed from: d  reason: collision with root package name */
    public final AuctionApiHelper f19429d;

    /* renamed from: e  reason: collision with root package name */
    public final lg.b f19430e;

    /* renamed from: f  reason: collision with root package name */
    public p<SSEEventData> f19431f = new p<>();

    /* renamed from: g  reason: collision with root package name */
    public final p<f<AccountResponse>> f19432g;

    /* renamed from: h  reason: collision with root package name */
    public final p f19433h;

    /* renamed from: i  reason: collision with root package name */
    public final p<f<UserBiddingProfile>> f19434i;

    /* renamed from: j  reason: collision with root package name */
    public final p f19435j;

    /* renamed from: k  reason: collision with root package name */
    public final p<f<JoinChannelResponse>> f19436k;

    /* renamed from: l  reason: collision with root package name */
    public final p f19437l;

    /* renamed from: m  reason: collision with root package name */
    public final p<ArrayList<PriceTable>> f19438m;

    /* renamed from: n  reason: collision with root package name */
    public final p f19439n;

    /* renamed from: o  reason: collision with root package name */
    public final p<ArrayList<BiddingResult>> f19440o;

    /* renamed from: p  reason: collision with root package name */
    public final p<f<UserBiddingPriceResponse>> f19441p;

    /* renamed from: q  reason: collision with root package name */
    public final p f19442q;

    /* renamed from: r  reason: collision with root package name */
    public final p<PriceTable> f19443r;

    /* renamed from: s  reason: collision with root package name */
    public final i<Long> f19444s;

    /* renamed from: t  reason: collision with root package name */
    public final i<Integer> f19445t;

    /* renamed from: u  reason: collision with root package name */
    public final i<String> f19446u;

    /* renamed from: v  reason: collision with root package name */
    public final i<Long> f19447v;

    /* renamed from: w  reason: collision with root package name */
    public final i<String> f19448w;

    /* renamed from: x  reason: collision with root package name */
    public final i<String> f19449x;

    /* renamed from: y  reason: collision with root package name */
    public xg.i f19450y;

    /* renamed from: z  reason: collision with root package name */
    public final i<String> f19451z;

    @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$joinChannel$1", f = "AuctionRoomViewModel.kt", l = {353}, m = "invokeSuspend")
    /* compiled from: AuctionRoomViewModel.kt */
    public static final class a extends kk.i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19452a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AuctionRoomViewModel f19453b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f19454c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ JoinChannelRequest f19455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionRoomViewModel auctionRoomViewModel, String str, JoinChannelRequest joinChannelRequest, d<? super a> dVar) {
            super(2, dVar);
            this.f19453b = auctionRoomViewModel;
            this.f19454c = str;
            this.f19455d = joinChannelRequest;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f19453b, this.f19454c, this.f19455d, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            ResponseBody responseBody;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19452a;
            if (i10 == 0) {
                l0.Q0(obj);
                this.f19453b.f19436k.k(f.b.f18005a);
                AuctionApiHelper auctionApiHelper = this.f19453b.f19429d;
                String str2 = this.f19454c;
                JoinChannelRequest joinChannelRequest = this.f19455d;
                this.f19452a = 1;
                obj = auctionApiHelper.joinChannel(str2, joinChannelRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e = e10;
                    p<f<JoinChannelResponse>> pVar = this.f19453b.f19436k;
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
                                if (str3 == null) {
                                    str3 = "Error";
                                }
                                e = new Exception(str3);
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
            JoinChannelResponse joinChannelResponse = (JoinChannelResponse) obj;
            this.f19453b.f19436k.k(new f.c(joinChannelResponse));
            String nextId = joinChannelResponse.getNextId();
            if (nextId != null) {
                this.f19453b.I.setNextId(nextId);
            }
            return ek.i.f20112a;
        }
    }

    @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$listenBiddingEvent$1", f = "AuctionRoomViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: AuctionRoomViewModel.kt */
    public static final class b extends kk.i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionRoomViewModel f19456a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f19457b;

        @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$listenBiddingEvent$1$1", f = "AuctionRoomViewModel.kt", l = {450, 507}, m = "invokeSuspend")
        /* compiled from: AuctionRoomViewModel.kt */
        public static final class a extends kk.i implements rk.p<SSEEventData, d<? super ek.i>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public ExtendTimeSSE f19458a;

            /* renamed from: b  reason: collision with root package name */
            public int f19459b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f19460c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ AuctionRoomViewModel f19461d;

            @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$listenBiddingEvent$1$1$1$1", f = "AuctionRoomViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$a  reason: collision with other inner class name */
            /* compiled from: AuctionRoomViewModel.kt */
            public static final class C0261a extends kk.i implements rk.p<d0, d<? super ek.i>, Object> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AuctionRoomViewModel f19462a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ StartSSE f19463b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0261a(AuctionRoomViewModel auctionRoomViewModel, StartSSE startSSE, d<? super C0261a> dVar) {
                    super(2, dVar);
                    this.f19462a = auctionRoomViewModel;
                    this.f19463b = startSSE;
                }

                public final d<ek.i> create(Object obj, d<?> dVar) {
                    return new C0261a(this.f19462a, this.f19463b, dVar);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C0261a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
                }

                public final Object invokeSuspend(Object obj) {
                    String str;
                    PriceTable priceTable;
                    jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                    l0.Q0(obj);
                    PriceTable d10 = this.f19462a.f19443r.d();
                    Integer num = null;
                    if (d10 != null) {
                        str = d10.getBiddingRoomId();
                    } else {
                        str = null;
                    }
                    if (j.a(str, this.f19463b.getRoomId())) {
                        PriceTable d11 = this.f19462a.f19443r.d();
                        if (d11 != null) {
                            d11.setStartAuction(this.f19463b.getStartTime());
                        }
                        PriceTable d12 = this.f19462a.f19443r.d();
                        if (d12 != null) {
                            d12.setEndRegistTime(this.f19463b.getEndTime());
                        }
                        PriceTable d13 = this.f19462a.f19443r.d();
                        if (d13 != null) {
                            d13.setStatus(this.f19463b.getStatus());
                        }
                        p<PriceTable> pVar = this.f19462a.f19443r;
                        pVar.k(pVar.d());
                        AuctionRoomViewModel auctionRoomViewModel = this.f19462a;
                        Integer num2 = auctionRoomViewModel.G;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            ArrayList d14 = auctionRoomViewModel.f19438m.d();
                            if (d14 != null) {
                                priceTable = (PriceTable) d14.get(intValue);
                            } else {
                                priceTable = null;
                            }
                            if (priceTable != null) {
                                PriceTable d15 = auctionRoomViewModel.f19443r.d();
                                if (d15 != null) {
                                    num = d15.getStatus();
                                }
                                priceTable.setStatus(num);
                            }
                        }
                    }
                    p<ArrayList<PriceTable>> pVar2 = this.f19462a.f19438m;
                    pVar2.k(pVar2.d());
                    return ek.i.f20112a;
                }
            }

            @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$listenBiddingEvent$1$1$1$2", f = "AuctionRoomViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$b  reason: collision with other inner class name */
            /* compiled from: AuctionRoomViewModel.kt */
            public static final class C0262b extends kk.i implements rk.p<d0, d<? super ek.i>, Object> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AuctionRoomViewModel f19464a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ExtendTimeSSE f19465b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0262b(AuctionRoomViewModel auctionRoomViewModel, ExtendTimeSSE extendTimeSSE, d<? super C0262b> dVar) {
                    super(2, dVar);
                    this.f19464a = auctionRoomViewModel;
                    this.f19465b = extendTimeSSE;
                }

                public final d<ek.i> create(Object obj, d<?> dVar) {
                    return new C0262b(this.f19464a, this.f19465b, dVar);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C0262b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
                }

                public final Object invokeSuspend(Object obj) {
                    jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                    l0.Q0(obj);
                    PriceTable d10 = this.f19464a.f19443r.d();
                    if (d10 != null) {
                        d10.setEndRegistTime(this.f19465b.getEndTime());
                    }
                    p<PriceTable> pVar = this.f19464a.f19443r;
                    pVar.k(pVar.d());
                    return ek.i.f20112a;
                }
            }

            /* compiled from: AuctionRoomViewModel.kt */
            public static final class c extends gc.a<List<? extends PriceSSE>> {
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(AuctionRoomViewModel auctionRoomViewModel, d<? super a> dVar) {
                super(2, dVar);
                this.f19461d = auctionRoomViewModel;
            }

            public final d<ek.i> create(Object obj, d<?> dVar) {
                a aVar = new a(this.f19461d, dVar);
                aVar.f19460c = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((SSEEventData) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.vpa.daugia.module.auction.data.model.PriceTable} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.vpa.daugia.module.auction.data.model.PriceTable} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: com.vpa.daugia.module.auction.data.model.PriceTable} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.vpa.daugia.module.auction.data.model.PriceTable} */
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:120:0x034c, code lost:
                if (r6.equals("END_ROOM") == false) goto L_0x0398;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:121:0x034f, code lost:
                r1 = (bc.n) r2.f4161a.get("data");
                r2 = r5.f19438m.d();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:122:0x035f, code lost:
                if (r2 != null) goto L_0x0366;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:123:0x0361, code lost:
                r2 = new java.util.ArrayList();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:124:0x0366, code lost:
                p3.l0.j0(p3.l0.d0(r5), al.r0.f19085b, new xg.b(r5, r2, r1, (ik.d<? super xg.b>) null), 2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
                if (r6.equals("RESULT_ROOM") == false) goto L_0x0398;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r28) {
                /*
                    r27 = this;
                    r0 = r27
                    jk.a r1 = jk.a.COROUTINE_SUSPENDED
                    int r2 = r0.f19459b
                    r3 = 1
                    r4 = 2
                    if (r2 == 0) goto L_0x0026
                    if (r2 == r3) goto L_0x0021
                    if (r2 != r4) goto L_0x0019
                    com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE r1 = r0.f19458a
                    java.lang.Object r2 = r0.f19460c
                    com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r2 = (com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel) r2
                    p3.l0.Q0(r28)
                    goto L_0x00aa
                L_0x0019:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0021:
                    p3.l0.Q0(r28)
                    goto L_0x0398
                L_0x0026:
                    p3.l0.Q0(r28)
                    java.lang.Object r2 = r0.f19460c
                    com.vpa.daugia.module.sse.data.model.SSEEventData r2 = (com.vpa.daugia.module.sse.data.model.SSEEventData) r2
                    com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r5 = r0.f19461d
                    r2.p<com.vpa.daugia.module.sse.data.model.SSEEventData> r5 = r5.f19431f
                    r5.k(r2)
                    r2.getData()
                    int r5 = kf.h.f12560a
                    java.lang.String r5 = r2.getData()
                    if (r5 == 0) goto L_0x0398
                    com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r5 = r0.f19461d
                    java.lang.String r2 = r2.getData()
                    bc.l r2 = m9.b.P(r2)
                    bc.n r2 = r2.g()
                    dc.p<java.lang.String, bc.l> r6 = r2.f4161a
                    java.lang.String r7 = "type"
                    java.lang.Object r6 = r6.get(r7)
                    bc.l r6 = (bc.l) r6
                    java.lang.String r6 = r6.l()
                    if (r6 == 0) goto L_0x0398
                    int r7 = r6.hashCode()
                    r8 = 0
                    java.lang.String r9 = "data"
                    switch(r7) {
                        case -2108905559: goto L_0x0375;
                        case -1757290017: goto L_0x0346;
                        case 79219778: goto L_0x0315;
                        case 337027820: goto L_0x0117;
                        case 610831232: goto L_0x00b1;
                        case 1486500050: goto L_0x0073;
                        case 1645379517: goto L_0x0069;
                        default: goto L_0x0067;
                    }
                L_0x0067:
                    goto L_0x0398
                L_0x0069:
                    java.lang.String r1 = "RESULT_ROOM"
                    boolean r1 = r6.equals(r1)
                    if (r1 != 0) goto L_0x034f
                    goto L_0x0398
                L_0x0073:
                    java.lang.String r3 = "EXTEND_TIME"
                    boolean r3 = r6.equals(r3)
                    if (r3 != 0) goto L_0x007d
                    goto L_0x0398
                L_0x007d:
                    dc.p<java.lang.String, bc.l> r2 = r2.f4161a
                    java.lang.Object r2 = r2.get(r9)
                    bc.n r2 = (bc.n) r2
                    bc.h r3 = new bc.h
                    r3.<init>()
                    java.lang.Class<com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE> r6 = com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE.class
                    java.lang.Object r2 = r3.b(r2, r6)
                    com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE r2 = (com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE) r2
                    gl.c r3 = al.r0.f19084a
                    al.q1 r3 = fl.m.f20254a
                    com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$b r6 = new com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$b
                    r6.<init>(r5, r2, r8)
                    r0.f19460c = r5
                    r0.f19458a = r2
                    r0.f19459b = r4
                    java.lang.Object r3 = p3.l0.V0(r0, r3, r6)
                    if (r3 != r1) goto L_0x00a8
                    return r1
                L_0x00a8:
                    r1 = r2
                    r2 = r5
                L_0x00aa:
                    r2.p<com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE> r2 = r2.D
                    r2.k(r1)
                    goto L_0x0398
                L_0x00b1:
                    java.lang.String r1 = "CANCEL_ROOM"
                    boolean r1 = r6.equals(r1)
                    if (r1 != 0) goto L_0x00bb
                    goto L_0x0398
                L_0x00bb:
                    dc.p<java.lang.String, bc.l> r1 = r2.f4161a
                    java.lang.Object r1 = r1.get(r9)
                    bc.l r1 = (bc.l) r1
                    bc.h r2 = new bc.h
                    r2.<init>()
                    java.lang.Class<com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE> r3 = com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE.class
                    java.lang.Object r1 = r2.b(r1, r3)
                    com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE r1 = (com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE) r1
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r2 = r5.f19438m
                    java.lang.Object r2 = r2.d()
                    java.util.ArrayList r2 = (java.util.ArrayList) r2
                    if (r2 == 0) goto L_0x0107
                    java.util.Iterator r2 = r2.iterator()
                L_0x00de:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x00fa
                    java.lang.Object r3 = r2.next()
                    r4 = r3
                    com.vpa.daugia.module.auction.data.model.PriceTable r4 = (com.vpa.daugia.module.auction.data.model.PriceTable) r4
                    java.lang.String r4 = r4.getBiddingRoomId()
                    java.lang.String r6 = r1.getRoomId()
                    boolean r4 = sk.j.a(r4, r6)
                    if (r4 == 0) goto L_0x00de
                    r8 = r3
                L_0x00fa:
                    com.vpa.daugia.module.auction.data.model.PriceTable r8 = (com.vpa.daugia.module.auction.data.model.PriceTable) r8
                    if (r8 == 0) goto L_0x0107
                    com.vpa.daugia.module.auction.data.model.ResultAuctionEnum r2 = com.vpa.daugia.module.auction.data.model.ResultAuctionEnum.CANCEL
                    int r2 = r2.getValue()
                    r8.setResult(r2)
                L_0x0107:
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r2 = r5.f19438m
                    java.lang.Object r3 = r2.d()
                    r2.k(r3)
                    r2.p<com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE> r2 = r5.A
                    r2.k(r1)
                    goto L_0x0398
                L_0x0117:
                    java.lang.String r1 = "SET_PRICE"
                    boolean r1 = r6.equals(r1)
                    if (r1 != 0) goto L_0x0121
                    goto L_0x0398
                L_0x0121:
                    dc.p<java.lang.String, bc.l> r1 = r2.f4161a
                    java.lang.Object r1 = r1.get(r9)
                    bc.j r1 = (bc.j) r1
                    java.lang.String r2 = "getAsJsonArray(...)"
                    sk.j.e(r1, r2)
                    com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$c r2 = new com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$c
                    r2.<init>()
                    java.lang.reflect.Type r2 = r2.f10438b
                    bc.h r4 = new bc.h
                    r4.<init>()
                    gc.a r6 = new gc.a
                    r6.<init>(r2)
                    com.google.gson.internal.bind.b r2 = new com.google.gson.internal.bind.b
                    r2.<init>(r1)
                    java.lang.Object r1 = r4.c(r2, r6)
                    java.lang.String r2 = "fromJson(...)"
                    sk.j.e(r1, r2)
                    java.util.List r1 = (java.util.List) r1
                    r5.getClass()
                    fk.v r2 = new fk.v
                    fk.o r4 = new fk.o
                    r4.<init>(r1)
                    r2.<init>(r4)
                    boolean r1 = r2 instanceof java.util.Collection
                    if (r1 == 0) goto L_0x016e
                    r1 = r2
                    java.util.Collection r1 = (java.util.Collection) r1
                    int r1 = r1.size()
                    if (r1 > r3) goto L_0x016e
                    java.util.List r1 = fk.p.Z0(r2)
                    goto L_0x0175
                L_0x016e:
                    java.util.List r1 = fk.p.c1(r2)
                    java.util.Collections.reverse(r1)
                L_0x0175:
                    java.util.Iterator r1 = r1.iterator()
                L_0x0179:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x030a
                    java.lang.Object r2 = r1.next()
                    fk.u r2 = (fk.u) r2
                    T r4 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r4 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r4
                    java.lang.String r4 = r4.getUserId()
                    if (r4 == 0) goto L_0x019a
                    long r6 = java.lang.Long.parseLong(r4)
                    java.lang.Long r4 = java.lang.Long.valueOf(r6)
                    r23 = r4
                    goto L_0x019c
                L_0x019a:
                    r23 = r8
                L_0x019c:
                    T r4 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r4 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r4
                    java.lang.Long r17 = r4.getPrice()
                    T r4 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r4 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r4
                    java.lang.String r18 = r4.getRoomId()
                    T r4 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r4 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r4
                    java.lang.String r10 = r4.getAuctionCode()
                    T r4 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r4 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r4
                    java.lang.Long r22 = r4.getBiddingRequestTime()
                    com.vpa.daugia.module.auction.data.model.BiddingPrice r4 = new com.vpa.daugia.module.auction.data.model.BiddingPrice
                    r9 = r4
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    r24 = 0
                    r25 = 20094(0x4e7e, float:2.8158E-41)
                    r26 = 0
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r6 = r5.f19443r
                    java.lang.Object r6 = r6.d()
                    com.vpa.daugia.module.auction.data.model.PriceTable r6 = (com.vpa.daugia.module.auction.data.model.PriceTable) r6
                    if (r6 == 0) goto L_0x01e4
                    java.lang.String r6 = r6.getBiddingRoomId()
                    goto L_0x01e5
                L_0x01e4:
                    r6 = r8
                L_0x01e5:
                    T r7 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r7 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r7
                    java.lang.String r7 = r7.getRoomId()
                    boolean r6 = sk.j.a(r6, r7)
                    r7 = 0
                    if (r6 == 0) goto L_0x0263
                    r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r6 = r5.f19443r
                    java.lang.Object r6 = r6.d()
                    com.vpa.daugia.module.auction.data.model.PriceTable r6 = (com.vpa.daugia.module.auction.data.model.PriceTable) r6
                    if (r6 == 0) goto L_0x0207
                    java.util.ArrayList r6 = r6.getPrices()
                    if (r6 == 0) goto L_0x0207
                    r6.add(r7, r4)
                L_0x0207:
                    r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r4 = r5.f19443r
                    java.lang.Object r6 = r4.d()
                    r4.k(r6)
                    java.lang.Integer r4 = r5.G
                    if (r4 == 0) goto L_0x02d0
                    int r4 = r4.intValue()
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r6 = r5.f19438m
                    java.lang.Object r6 = r6.d()
                    java.util.ArrayList r6 = (java.util.ArrayList) r6
                    if (r6 == 0) goto L_0x0229
                    java.lang.Object r6 = r6.get(r4)
                    com.vpa.daugia.module.auction.data.model.PriceTable r6 = (com.vpa.daugia.module.auction.data.model.PriceTable) r6
                    goto L_0x022a
                L_0x0229:
                    r6 = r8
                L_0x022a:
                    if (r6 != 0) goto L_0x022d
                    goto L_0x0240
                L_0x022d:
                    r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r9 = r5.f19443r
                    java.lang.Object r9 = r9.d()
                    com.vpa.daugia.module.auction.data.model.PriceTable r9 = (com.vpa.daugia.module.auction.data.model.PriceTable) r9
                    if (r9 == 0) goto L_0x023c
                    java.util.ArrayList r9 = r9.getPrices()
                    goto L_0x023d
                L_0x023c:
                    r9 = r8
                L_0x023d:
                    r6.setPrices(r9)
                L_0x0240:
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r6 = r5.f19438m
                    java.lang.Object r6 = r6.d()
                    java.util.ArrayList r6 = (java.util.ArrayList) r6
                    if (r6 == 0) goto L_0x0251
                    java.lang.Object r4 = r6.get(r4)
                    com.vpa.daugia.module.auction.data.model.PriceTable r4 = (com.vpa.daugia.module.auction.data.model.PriceTable) r4
                    goto L_0x0252
                L_0x0251:
                    r4 = r8
                L_0x0252:
                    if (r4 != 0) goto L_0x0256
                    goto L_0x02d0
                L_0x0256:
                    T r6 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r6 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r6
                    java.lang.Integer r6 = r6.getPayCount()
                    r4.setPayCount(r6)
                    goto L_0x02d0
                L_0x0263:
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r6 = r5.f19438m
                    java.lang.Object r6 = r6.d()
                    java.util.ArrayList r6 = (java.util.ArrayList) r6
                    if (r6 == 0) goto L_0x02d0
                    java.util.Iterator r6 = r6.iterator()
                    r9 = r7
                L_0x0272:
                    boolean r10 = r6.hasNext()
                    if (r10 == 0) goto L_0x0294
                    java.lang.Object r10 = r6.next()
                    com.vpa.daugia.module.auction.data.model.PriceTable r10 = (com.vpa.daugia.module.auction.data.model.PriceTable) r10
                    java.lang.String r10 = r10.getBiddingRoomId()
                    T r11 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r11 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r11
                    java.lang.String r11 = r11.getRoomId()
                    boolean r10 = sk.j.a(r10, r11)
                    if (r10 == 0) goto L_0x0291
                    goto L_0x0295
                L_0x0291:
                    int r9 = r9 + 1
                    goto L_0x0272
                L_0x0294:
                    r9 = -1
                L_0x0295:
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r6 = r5.f19438m
                    java.lang.Object r6 = r6.d()
                    java.util.ArrayList r6 = (java.util.ArrayList) r6
                    if (r6 == 0) goto L_0x02b0
                    java.lang.Object r6 = r6.get(r9)
                    com.vpa.daugia.module.auction.data.model.PriceTable r6 = (com.vpa.daugia.module.auction.data.model.PriceTable) r6
                    if (r6 == 0) goto L_0x02b0
                    java.util.ArrayList r6 = r6.getPrices()
                    if (r6 == 0) goto L_0x02b0
                    r6.add(r4)
                L_0x02b0:
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r4 = r5.f19438m
                    java.lang.Object r4 = r4.d()
                    java.util.ArrayList r4 = (java.util.ArrayList) r4
                    if (r4 == 0) goto L_0x02c1
                    java.lang.Object r4 = r4.get(r9)
                    com.vpa.daugia.module.auction.data.model.PriceTable r4 = (com.vpa.daugia.module.auction.data.model.PriceTable) r4
                    goto L_0x02c2
                L_0x02c1:
                    r4 = r8
                L_0x02c2:
                    if (r4 != 0) goto L_0x02c5
                    goto L_0x02d0
                L_0x02c5:
                    T r6 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r6 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r6
                    java.lang.Integer r6 = r6.getPayCount()
                    r4.setPayCount(r6)
                L_0x02d0:
                    r2.p<java.lang.Boolean> r4 = r5.E
                    T r6 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r6 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r6
                    java.lang.String r6 = r6.getUserId()
                    java.lang.String r9 = r5.H
                    boolean r6 = sk.j.a(r6, r9)
                    if (r6 != 0) goto L_0x0301
                    T r2 = r2.f20217b
                    com.vpa.daugia.module.auction.data.model.sse.PriceSSE r2 = (com.vpa.daugia.module.auction.data.model.sse.PriceSSE) r2
                    java.lang.String r2 = r2.getRoomId()
                    r2.p<com.vpa.daugia.module.auction.data.model.PriceTable> r6 = r5.f19443r
                    java.lang.Object r6 = r6.d()
                    com.vpa.daugia.module.auction.data.model.PriceTable r6 = (com.vpa.daugia.module.auction.data.model.PriceTable) r6
                    if (r6 == 0) goto L_0x02f9
                    java.lang.String r6 = r6.getBiddingRoomId()
                    goto L_0x02fa
                L_0x02f9:
                    r6 = r8
                L_0x02fa:
                    boolean r2 = sk.j.a(r2, r6)
                    if (r2 == 0) goto L_0x0301
                    r7 = r3
                L_0x0301:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                    r4.k(r2)
                    goto L_0x0179
                L_0x030a:
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r1 = r5.f19438m
                    java.lang.Object r2 = r1.d()
                    r1.k(r2)
                    goto L_0x0398
                L_0x0315:
                    java.lang.String r4 = "START"
                    boolean r4 = r6.equals(r4)
                    if (r4 != 0) goto L_0x031f
                    goto L_0x0398
                L_0x031f:
                    dc.p<java.lang.String, bc.l> r2 = r2.f4161a
                    java.lang.Object r2 = r2.get(r9)
                    bc.n r2 = (bc.n) r2
                    bc.h r4 = new bc.h
                    r4.<init>()
                    java.lang.Class<com.vpa.daugia.module.auction.data.model.sse.StartSSE> r6 = com.vpa.daugia.module.auction.data.model.sse.StartSSE.class
                    java.lang.Object r2 = r4.b(r2, r6)
                    com.vpa.daugia.module.auction.data.model.sse.StartSSE r2 = (com.vpa.daugia.module.auction.data.model.sse.StartSSE) r2
                    gl.c r4 = al.r0.f19084a
                    al.q1 r4 = fl.m.f20254a
                    com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$a r6 = new com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$a$a
                    r6.<init>(r5, r2, r8)
                    r0.f19459b = r3
                    java.lang.Object r2 = p3.l0.V0(r0, r4, r6)
                    if (r2 != r1) goto L_0x0398
                    return r1
                L_0x0346:
                    java.lang.String r1 = "END_ROOM"
                    boolean r1 = r6.equals(r1)
                    if (r1 != 0) goto L_0x034f
                    goto L_0x0398
                L_0x034f:
                    dc.p<java.lang.String, bc.l> r1 = r2.f4161a
                    java.lang.Object r1 = r1.get(r9)
                    bc.n r1 = (bc.n) r1
                    r2.p<java.util.ArrayList<com.vpa.daugia.module.auction.data.model.PriceTable>> r2 = r5.f19438m
                    java.lang.Object r2 = r2.d()
                    java.util.ArrayList r2 = (java.util.ArrayList) r2
                    if (r2 != 0) goto L_0x0366
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                L_0x0366:
                    al.d0 r3 = p3.l0.d0(r5)
                    gl.b r6 = al.r0.f19085b
                    xg.b r7 = new xg.b
                    r7.<init>(r5, r2, r1, r8)
                    p3.l0.j0(r3, r6, r7, r4)
                    goto L_0x0398
                L_0x0375:
                    java.lang.String r1 = "WAITTING_TIME"
                    boolean r1 = r6.equals(r1)
                    if (r1 != 0) goto L_0x037e
                    goto L_0x0398
                L_0x037e:
                    dc.p<java.lang.String, bc.l> r1 = r2.f4161a
                    java.lang.Object r1 = r1.get(r9)
                    bc.n r1 = (bc.n) r1
                    bc.h r2 = new bc.h
                    r2.<init>()
                    java.lang.Class<com.vpa.daugia.module.auction.data.model.sse.WaitingTimeSSE> r3 = com.vpa.daugia.module.auction.data.model.sse.WaitingTimeSSE.class
                    java.lang.Object r1 = r2.b(r1, r3)
                    com.vpa.daugia.module.auction.data.model.sse.WaitingTimeSSE r1 = (com.vpa.daugia.module.auction.data.model.sse.WaitingTimeSSE) r1
                    r2.p<com.vpa.daugia.module.auction.data.model.sse.WaitingTimeSSE> r2 = r5.C
                    r2.k(r1)
                L_0x0398:
                    ek.i r1 = ek.i.f20112a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @e(c = "com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$listenBiddingEvent$1$2", f = "AuctionRoomViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel$b$b  reason: collision with other inner class name */
        /* compiled from: AuctionRoomViewModel.kt */
        public static final class C0263b extends kk.i implements q<dl.f<? super SSEEventData>, Throwable, d<? super ek.i>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AuctionRoomViewModel f19466a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0263b(AuctionRoomViewModel auctionRoomViewModel, d<? super C0263b> dVar) {
                super(3, dVar);
                this.f19466a = auctionRoomViewModel;
            }

            public final Object d(dl.f fVar, Object obj, Object obj2) {
                Throwable th2 = (Throwable) obj;
                return new C0263b(this.f19466a, (d) obj2).invokeSuspend(ek.i.f20112a);
            }

            public final Object invokeSuspend(Object obj) {
                jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                l0.Q0(obj);
                this.f19466a.f19431f.k(new SSEEventData(STATUS.ERROR, (String) null, 2, (sk.e) null));
                return ek.i.f20112a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AuctionRoomViewModel auctionRoomViewModel, String str, d<? super b> dVar) {
            super(2, dVar);
            this.f19456a = auctionRoomViewModel;
            this.f19457b = str;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new b(this.f19456a, this.f19457b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            i1 i1Var = this.f19456a.J;
            if (i1Var != null) {
                i1Var.cancel((CancellationException) null);
            }
            try {
                String d10 = this.f19456a.f19430e.d("PREF_KEY_AUCTION_ACCESS_TOKEN");
                if (d10 == null) {
                    return ek.i.f20112a;
                }
                SSERepository sSERepository = new SSERepository(this.f19457b, d10);
                this.f19456a.J = l0.j0(l0.d0(this.f19456a), (a0) null, new dl.h(new dl.j(new dl.p(sSERepository.getSseEventsFlow(), new a(this.f19456a, (d<? super a>) null)), new C0263b(this.f19456a, (d<? super C0263b>) null)), (d<? super dl.h>) null), 3);
                return ek.i.f20112a;
            } catch (Exception e10) {
                kf.h.a(e10);
                e10.printStackTrace();
                ek.i iVar = ek.i.f20112a;
            }
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return g0.H(((BiddingPrice) t11).getPrice(), ((BiddingPrice) t10).getPrice());
        }
    }

    public AuctionRoomViewModel(AuctionApiHelper auctionApiHelper, lg.b bVar) {
        String str;
        String str2;
        String str3;
        Long l10;
        long j10;
        ArrayList<BiddingPrice> prices;
        BiddingPrice biddingPrice;
        Long price;
        AuctionApiHelper auctionApiHelper2 = auctionApiHelper;
        lg.b bVar2 = bVar;
        j.f(auctionApiHelper2, "apiHelper");
        j.f(bVar2, "sharedPrefs");
        this.f19429d = auctionApiHelper2;
        this.f19430e = bVar2;
        p<f<AccountResponse>> pVar = new p<>();
        this.f19432g = pVar;
        this.f19433h = pVar;
        p<f<UserBiddingProfile>> pVar2 = new p<>();
        this.f19434i = pVar2;
        this.f19435j = pVar2;
        p<f<JoinChannelResponse>> pVar3 = new p<>();
        this.f19436k = pVar3;
        this.f19437l = pVar3;
        p<ArrayList<PriceTable>> pVar4 = new p<>();
        this.f19438m = pVar4;
        this.f19439n = pVar4;
        this.f19440o = new p<>();
        p<f<UserBiddingPriceResponse>> pVar5 = new p<>();
        this.f19441p = pVar5;
        this.f19442q = pVar5;
        String str4 = null;
        PriceTable priceTable = r3;
        PriceTable priceTable2 = new PriceTable((String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, false, false, false, (Long) null, (Long) null, (String) null, (String) null, (Integer) null, (ArrayList) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Long) null, false, (Long) null, 0, -1, (sk.e) null);
        p<PriceTable> pVar6 = new p<>(priceTable);
        this.f19443r = pVar6;
        i<Long> iVar = new i<>(5000000L);
        this.f19444s = iVar;
        i<Integer> iVar2 = new i<>(1);
        this.f19445t = iVar2;
        this.f19446u = new i<>("1");
        i<Long> iVar3 = new i<>(0L);
        this.f19447v = iVar3;
        this.f19448w = new i<>("");
        this.f19449x = new i<>("");
        this.f19451z = new i<>("");
        this.A = new p<>();
        this.B = new p<>();
        this.C = new p<>();
        this.D = new p<>();
        this.E = new p<>();
        User e10 = bVar.e();
        if (e10 != null) {
            str = e10.getPhone();
        } else {
            str = null;
        }
        AccountRequest accountRequest = r8;
        AccountRequest accountRequest2 = new AccountRequest((String) null, (String) null, (String) null, str, (Integer) null, 23, (sk.e) null);
        this.F = new i<>(accountRequest);
        AccountResponse accountResponse = (AccountResponse) bVar2.b(AccountResponse.class, "DATA_USER_AUCTION");
        if (accountResponse != null) {
            str2 = accountResponse.getUserId();
        } else {
            str2 = null;
        }
        this.H = str2;
        T t10 = iVar.f8545b;
        j.c(t10);
        long longValue = ((Number) t10).longValue();
        T t11 = iVar2.f8545b;
        j.c(t11);
        iVar3.g(Long.valueOf(((Number) t11).longValue() * longValue));
        l0.j0(l0.d0(this), r0.f19085b, new xg.f(this, (d<? super xg.f>) null), 2);
        PriceTable d10 = pVar6.d();
        if (d10 != null) {
            str3 = d10.getAuctionCode();
        } else {
            str3 = null;
        }
        Long l11 = (Long) iVar3.f8545b;
        if (l11 == null) {
            l10 = null;
        } else {
            l10 = l11;
        }
        long longValue2 = l10.longValue();
        PriceTable d11 = pVar6.d();
        if (d11 == null || (prices = d11.getPrices()) == null || (biddingPrice = (BiddingPrice) fk.p.N0(prices)) == null || (price = biddingPrice.getPrice()) == null) {
            j10 = 35000000;
        } else {
            j10 = price.longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + j10);
        PriceTable d12 = pVar6.d();
        this.I = new UserBiddingPrice(str3, (String) null, valueOf, d12 != null ? d12.getBiddingRoomId() : str4, (Long) null, (String) null, 50, (sk.e) null);
    }

    public static Spanned d(long j10) {
        int i10 = (int) (j10 / ((long) 1000));
        int i11 = (i10 % 3600) / 60;
        int i12 = i10 % 60;
        int i13 = (i10 % 86400) / 3600;
        int i14 = i10 / 86400;
        StringBuilder sb2 = new StringBuilder();
        if (i14 > 0) {
            sb2.append(i14 + " ngày ");
        }
        if (i13 > 0) {
            sb2.append(i13 + "giờ ");
        }
        if (i11 > 0) {
            sb2.append(i11 + "phút ");
        }
        if (i12 > 0) {
            sb2.append(i12 + "giây");
        }
        String sb3 = sb2.toString();
        j.e(sb3, "toString(...)");
        String obj = l.k1(sb3).toString();
        j.f(obj, "string");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned l10 = Html.fromHtml(obj, 0);
            j.c(l10);
            return l10;
        }
        Spanned fromHtml = Html.fromHtml(obj);
        j.c(fromHtml);
        return fromHtml;
    }

    public static void e(AuctionRoomViewModel auctionRoomViewModel) {
        auctionRoomViewModel.getClass();
        l0.j0(l0.d0(auctionRoomViewModel), r0.f19085b, new xg.e(auctionRoomViewModel, true, (d<? super xg.e>) null), 2);
    }

    public final void f(String str, JoinChannelRequest joinChannelRequest) {
        l0.j0(l0.d0(this), r0.f19085b, new a(this, str, joinChannelRequest, (d<? super a>) null), 2);
    }

    public final void g(String str) {
        int i10 = kf.h.f12560a;
        l0.j0(l0.d0(this), (a0) null, new b(this, str, (d<? super b>) null), 3);
    }

    public final void h(PriceTable priceTable, boolean z10) {
        Integer num;
        PriceTable priceTable2;
        PriceTable priceTable3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        PriceTable priceTable4;
        PriceTable priceTable5;
        PriceTable priceTable6;
        PriceTable priceTable7;
        PriceTable priceTable8;
        String channel;
        PriceTable priceTable9;
        ArrayList<BiddingPrice> prices;
        j.f(priceTable, "room");
        ArrayList d10 = this.f19438m.d();
        String str6 = null;
        if (d10 != null) {
            Iterator it = d10.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (j.a(priceTable.getBiddingRoomId(), ((PriceTable) it.next()).getBiddingRoomId())) {
                    break;
                } else {
                    i10++;
                }
            }
            num = Integer.valueOf(i10);
        } else {
            num = null;
        }
        if ((num == null || num.intValue() != -1) && num != null) {
            ArrayList d11 = this.f19438m.d();
            if (d11 != null) {
                priceTable2 = (PriceTable) d11.get(num.intValue());
            } else {
                priceTable2 = null;
            }
            if (priceTable2 != null) {
                priceTable2.setSelected(true);
            }
            ArrayList d12 = this.f19438m.d();
            if (!(d12 == null || (priceTable9 = (PriceTable) d12.get(num.intValue())) == null || (prices = priceTable9.getPrices()) == null || prices.size() <= 1)) {
                c cVar = new c();
                if (prices.size() > 1) {
                    Collections.sort(prices, cVar);
                }
            }
            p<PriceTable> pVar = this.f19443r;
            ArrayList d13 = this.f19438m.d();
            if (d13 != null) {
                priceTable3 = (PriceTable) d13.get(num.intValue());
            } else {
                priceTable3 = null;
            }
            pVar.k(priceTable3);
            i<Long> iVar = this.f19447v;
            T t10 = this.f19444s.f8545b;
            j.c(t10);
            long longValue = ((Number) t10).longValue();
            T t11 = this.f19445t.f8545b;
            j.c(t11);
            iVar.g(Long.valueOf(((Number) t11).longValue() * longValue));
            i<String> iVar2 = this.f19448w;
            Long l10 = (Long) this.f19447v.f8545b;
            if (l10 != null) {
                str = b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), l10.longValue(), new StringBuilder(), " đ");
            } else {
                str = null;
            }
            iVar2.g(str);
            ArrayList d14 = this.f19438m.d();
            if (d14 != null) {
                int i11 = 0;
                for (Object next : d14) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        PriceTable priceTable10 = (PriceTable) next;
                        if (i11 != num.intValue()) {
                            priceTable10.setSelected(false);
                        }
                        i11 = i12;
                    } else {
                        j7.a.x0();
                        throw null;
                    }
                }
            }
            p<ArrayList<PriceTable>> pVar2 = this.f19438m;
            pVar2.k(pVar2.d());
            PriceTable d15 = this.f19443r.d();
            if (!(d15 == null || (channel = d15.getChannel()) == null)) {
                g(channel);
            }
            if (!j.a(num, this.G) || z10) {
                ArrayList d16 = this.f19438m.d();
                if (d16 == null || (priceTable8 = (PriceTable) d16.get(num.intValue())) == null) {
                    str2 = null;
                } else {
                    str2 = priceTable8.getChannel();
                }
                ArrayList d17 = this.f19438m.d();
                if (d17 == null || (priceTable7 = (PriceTable) d17.get(num.intValue())) == null) {
                    str3 = null;
                } else {
                    str3 = priceTable7.getBiddingRoomId();
                }
                ArrayList d18 = this.f19438m.d();
                if (d18 == null || (priceTable6 = (PriceTable) d18.get(num.intValue())) == null) {
                    str4 = null;
                } else {
                    str4 = priceTable6.getSessionId();
                }
                ArrayList d19 = this.f19438m.d();
                if (d19 == null || (priceTable5 = (PriceTable) d19.get(num.intValue())) == null) {
                    str5 = null;
                } else {
                    str5 = priceTable5.getChannel();
                }
                ArrayList d20 = this.f19438m.d();
                if (!(d20 == null || (priceTable4 = (PriceTable) d20.get(num.intValue())) == null)) {
                    str6 = priceTable4.getId();
                }
                f(str2, new JoinChannelRequest(str3, str4, str5, str6, (Integer) null, 16, (sk.e) null));
                e(this);
                this.G = num;
            }
        }
    }
}
