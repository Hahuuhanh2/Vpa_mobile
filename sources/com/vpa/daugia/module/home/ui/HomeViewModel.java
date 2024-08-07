package com.vpa.daugia.module.home.ui;

import al.a0;
import al.d0;
import al.r0;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.api.request.AwaitAuctionRequest;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.common.data.api.CommonApiHelper;
import com.vpa.daugia.module.history.data.model.NotifyAuction;
import com.vpa.daugia.module.home.data.api.HomeApiHelper;
import com.vpa.daugia.module.home.data.api.request.AnnouncementPlanRequest;
import com.vpa.daugia.module.home.data.api.request.NotifyAuctionRequest;
import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.data.model.AuctionPolicy;
import com.vpa.daugia.module.home.data.model.NewDetail;
import com.vpa.daugia.module.home.data.model.News;
import com.vpa.daugia.module.register.data.api.request.RegisterAuctionRequest;
import com.vpa.daugia.module.register.data.model.RegisterAuction;
import ef.k;
import ef.n;
import java.util.ArrayList;
import kf.h;
import kk.i;
import n0.l;
import nh.a1;
import nh.t0;
import nh.v0;
import okhttp3.ResponseBody;
import p3.l0;
import r2.p;
import r2.v;
import retrofit2.HttpException;
import sk.j;
import ul.y;
import ze.f;

/* compiled from: HomeViewModel.kt */
public final class HomeViewModel extends v {
    public final p A;
    public final p<f<ArrayList<News>>> B;
    public final p C;
    public final p<f<Object>> D;
    public final p E;
    public final p<f<NewDetail>> F;
    public final p G;
    public AnnouncementPlanRequest H;
    public AwaitAuctionRequest I;

    /* renamed from: d  reason: collision with root package name */
    public final HomeApiHelper f19706d;

    /* renamed from: e  reason: collision with root package name */
    public final AuctionApiHelper f19707e;

    /* renamed from: f  reason: collision with root package name */
    public final CommonApiHelper f19708f;

    /* renamed from: g  reason: collision with root package name */
    public n<Plate> f19709g = new n<>((Object) null);

    /* renamed from: h  reason: collision with root package name */
    public NotifyAuctionRequest f19710h = new NotifyAuctionRequest((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (Integer) null, 63, (sk.e) null);

    /* renamed from: i  reason: collision with root package name */
    public n<AwaitAuction> f19711i = new n<>((Object) null);

    /* renamed from: j  reason: collision with root package name */
    public final p<f<ArrayList<Plate>>> f19712j;

    /* renamed from: k  reason: collision with root package name */
    public final p f19713k;

    /* renamed from: l  reason: collision with root package name */
    public final p<Integer> f19714l;

    /* renamed from: m  reason: collision with root package name */
    public final p f19715m;

    /* renamed from: n  reason: collision with root package name */
    public final p<Integer> f19716n;

    /* renamed from: o  reason: collision with root package name */
    public final p f19717o;

    /* renamed from: p  reason: collision with root package name */
    public final p<f<RegisterAuction>> f19718p;

    /* renamed from: q  reason: collision with root package name */
    public final p f19719q;

    /* renamed from: r  reason: collision with root package name */
    public final p<f<AuctionPolicy>> f19720r;

    /* renamed from: s  reason: collision with root package name */
    public final p f19721s;

    /* renamed from: t  reason: collision with root package name */
    public final p<f<ArrayList<NotifyAuction>>> f19722t;

    /* renamed from: u  reason: collision with root package name */
    public final p f19723u;

    /* renamed from: v  reason: collision with root package name */
    public final p<f<ArrayList<AwaitAuction>>> f19724v;

    /* renamed from: w  reason: collision with root package name */
    public final p f19725w;

    /* renamed from: x  reason: collision with root package name */
    public final p<f<ArrayList<AwaitAuction>>> f19726x;

    /* renamed from: y  reason: collision with root package name */
    public final p f19727y;

    /* renamed from: z  reason: collision with root package name */
    public final p<f<ArrayList<AwaitAuction>>> f19728z;

    @kk.e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getAnnouncementPlan$1", f = "HomeViewModel.kt", l = {109}, m = "invokeSuspend")
    /* compiled from: HomeViewModel.kt */
    public static final class a extends i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19729a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeViewModel f19730b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f19731c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HomeViewModel homeViewModel, String str, ik.d<? super a> dVar) {
            super(2, dVar);
            this.f19730b = homeViewModel;
            this.f19731c = str;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new a(this.f19730b, this.f19731c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            Integer num;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19729a;
            if (i10 == 0) {
                l0.Q0(obj);
                if (!this.f19730b.f19709g.d()) {
                    return ek.i.f20112a;
                }
                this.f19730b.f19712j.k(f.b.f18005a);
                this.f19730b.H.setLicensePlate(this.f19731c);
                HomeViewModel homeViewModel = this.f19730b;
                homeViewModel.H.setOffset(new Integer(homeViewModel.f19709g.e()));
                HomeViewModel homeViewModel2 = this.f19730b;
                HomeApiHelper homeApiHelper = homeViewModel2.f19706d;
                AnnouncementPlanRequest announcementPlanRequest = homeViewModel2.H;
                this.f19729a = 1;
                obj = homeApiHelper.getAnnouncementPlan(announcementPlanRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l.p(e10, this.f19730b.f19712j);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n<Plate> nVar = (n) obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getAnnouncementPlan: ");
            ArrayList<Plate> a10 = nVar.a();
            if (a10 != null) {
                num = new Integer(a10.size());
            } else {
                num = null;
            }
            sb2.append(num);
            int i11 = h.f12560a;
            if (nVar.a() != null) {
                p<f<ArrayList<Plate>>> pVar = this.f19730b.f19712j;
                ArrayList<Plate> a11 = nVar.a();
                j.c(a11);
                pVar.k(new f.c(a11));
            }
            HomeViewModel homeViewModel3 = this.f19730b;
            homeViewModel3.getClass();
            homeViewModel3.f19709g = nVar;
            return ek.i.f20112a;
        }
    }

    @kk.e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getRegisterAuction$1", f = "HomeViewModel.kt", l = {247}, m = "invokeSuspend")
    /* compiled from: HomeViewModel.kt */
    public static final class b extends i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19732a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeViewModel f19733b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f19734c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(HomeViewModel homeViewModel, String str, ik.d<? super b> dVar) {
            super(2, dVar);
            this.f19733b = homeViewModel;
            this.f19734c = str;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new b(this.f19733b, this.f19734c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i11 = this.f19732a;
            if (i11 == 0) {
                l0.Q0(obj);
                if (!this.f19733b.f19711i.d()) {
                    return ek.i.f20112a;
                }
                this.f19733b.f19724v.k(f.b.f18005a);
                AwaitAuctionRequest awaitAuctionRequest = this.f19733b.I;
                Integer page = awaitAuctionRequest.getPage();
                if (page != null) {
                    i10 = page.intValue();
                } else {
                    i10 = 0;
                }
                awaitAuctionRequest.setPage(new Integer(i10 + 1));
                this.f19733b.I.setSearch(this.f19734c);
                HomeViewModel homeViewModel = this.f19733b;
                AuctionApiHelper auctionApiHelper = homeViewModel.f19707e;
                AwaitAuctionRequest awaitAuctionRequest2 = homeViewModel.I;
                this.f19732a = 1;
                obj = auctionApiHelper.getRegisterAuction(awaitAuctionRequest2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i11 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l.p(e10, this.f19733b.f19724v);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.a() != null) {
                p<f<ArrayList<AwaitAuction>>> pVar = this.f19733b.f19724v;
                ArrayList arrayList = (ArrayList) kVar.a();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                pVar.k(new f.c(arrayList));
            }
            this.f19733b.f19711i.g(kVar.g());
            return ek.i.f20112a;
        }
    }

    @kk.e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getUnpaidOrderCount$1", f = "HomeViewModel.kt", l = {141}, m = "invokeSuspend")
    /* compiled from: HomeViewModel.kt */
    public static final class c extends i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19735a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeViewModel f19736b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(HomeViewModel homeViewModel, ik.d<? super c> dVar) {
            super(2, dVar);
            this.f19736b = homeViewModel;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new c(this.f19736b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i11 = this.f19735a;
            if (i11 == 0) {
                l0.Q0(obj);
                HomeApiHelper homeApiHelper = this.f19736b.f19706d;
                this.f19735a = 1;
                obj = homeApiHelper.getUnpaidOrderCount(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i11 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f19736b.f19716n.k(new Integer(0));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                p<Integer> pVar = this.f19736b.f19716n;
                Integer num = (Integer) kVar.d();
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                pVar.k(new Integer(i10));
            } else {
                this.f19736b.f19716n.k(new Integer(0));
            }
            return ek.i.f20112a;
        }
    }

    @kk.e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getUnreadNotificationCount$1", f = "HomeViewModel.kt", l = {126}, m = "invokeSuspend")
    /* compiled from: HomeViewModel.kt */
    public static final class d extends i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19737a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeViewModel f19738b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(HomeViewModel homeViewModel, ik.d<? super d> dVar) {
            super(2, dVar);
            this.f19738b = homeViewModel;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new d(this.f19738b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i11 = this.f19737a;
            if (i11 == 0) {
                l0.Q0(obj);
                HomeApiHelper homeApiHelper = this.f19738b.f19706d;
                this.f19737a = 1;
                obj = homeApiHelper.getUnreadNotification(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i11 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f19738b.f19714l.k(new Integer(0));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                p<Integer> pVar = this.f19738b.f19714l;
                Integer num = (Integer) kVar.d();
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                pVar.k(new Integer(i10));
            } else {
                this.f19738b.f19714l.k(new Integer(0));
            }
            return ek.i.f20112a;
        }
    }

    @kk.e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$registerAuction$1", f = "HomeViewModel.kt", l = {155}, m = "invokeSuspend")
    /* compiled from: HomeViewModel.kt */
    public static final class e extends i implements rk.p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19739a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeViewModel f19740b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f19741c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(HomeViewModel homeViewModel, String str, ik.d<? super e> dVar) {
            super(2, dVar);
            this.f19740b = homeViewModel;
            this.f19741c = str;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new e(this.f19740b, this.f19741c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ResponseBody responseBody;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19739a;
            String str = null;
            if (i10 == 0) {
                l0.Q0(obj);
                HomeApiHelper homeApiHelper = this.f19740b.f19706d;
                RegisterAuctionRequest registerAuctionRequest = new RegisterAuctionRequest(j7.a.c0(this.f19741c));
                this.f19739a = 1;
                obj = homeApiHelper.registerAuction(registerAuctionRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e = e10;
                    p<f<RegisterAuction>> pVar = this.f19740b.f19718p;
                    try {
                        if (e instanceof HttpException) {
                            y<?> yVar = ((HttpException) e).f22764a;
                            if (!(yVar == null || (responseBody = yVar.f23248c) == null)) {
                                str = responseBody.q();
                            }
                            try {
                                String str2 = (String) fk.p.N0(((k) new bc.h().d(k.class, str)).c());
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
                RegisterAuction registerAuction = (RegisterAuction) kVar.d();
                if (registerAuction != null) {
                    HomeViewModel homeViewModel = this.f19740b;
                    homeViewModel.f19718p.k(new f.c(registerAuction));
                    l0.j0(l0.d0(homeViewModel), (a0) null, new v0(homeViewModel, registerAuction.getId(), (ik.d<? super v0>) null), 3);
                }
            } else {
                this.f19740b.f19718p.k(new f.a(new Exception((String) fk.p.M0(kVar.c()))));
            }
            return ek.i.f20112a;
        }
    }

    public HomeViewModel(HomeApiHelper homeApiHelper, AuctionApiHelper auctionApiHelper, CommonApiHelper commonApiHelper) {
        HomeApiHelper homeApiHelper2 = homeApiHelper;
        AuctionApiHelper auctionApiHelper2 = auctionApiHelper;
        CommonApiHelper commonApiHelper2 = commonApiHelper;
        j.f(homeApiHelper2, "apiHelper");
        j.f(auctionApiHelper2, "auctionApiHelper");
        j.f(commonApiHelper2, "commonApiHelper");
        this.f19706d = homeApiHelper2;
        this.f19707e = auctionApiHelper2;
        this.f19708f = commonApiHelper2;
        p<f<ArrayList<Plate>>> pVar = new p<>();
        this.f19712j = pVar;
        this.f19713k = pVar;
        p<Integer> pVar2 = new p<>();
        this.f19714l = pVar2;
        this.f19715m = pVar2;
        p<Integer> pVar3 = new p<>();
        this.f19716n = pVar3;
        this.f19717o = pVar3;
        p<f<RegisterAuction>> pVar4 = new p<>();
        this.f19718p = pVar4;
        this.f19719q = pVar4;
        p<f<AuctionPolicy>> pVar5 = new p<>();
        this.f19720r = pVar5;
        this.f19721s = pVar5;
        p<f<ArrayList<NotifyAuction>>> pVar6 = new p<>();
        this.f19722t = pVar6;
        this.f19723u = pVar6;
        p<f<ArrayList<AwaitAuction>>> pVar7 = new p<>();
        this.f19724v = pVar7;
        this.f19725w = pVar7;
        p<f<ArrayList<AwaitAuction>>> pVar8 = new p<>();
        this.f19726x = pVar8;
        this.f19727y = pVar8;
        p<f<ArrayList<AwaitAuction>>> pVar9 = new p<>();
        this.f19728z = pVar9;
        this.A = pVar9;
        p<f<ArrayList<News>>> pVar10 = new p<>();
        this.B = pVar10;
        this.C = pVar10;
        p<f<Object>> pVar11 = new p<>();
        this.D = pVar11;
        this.E = pVar11;
        p<f<NewDetail>> pVar12 = new p<>();
        this.F = pVar12;
        this.G = pVar12;
        this.H = new AnnouncementPlanRequest((String) null, Integer.valueOf(this.f19709g.b()), (Integer) null, (String) null, (Integer) null, 29, (sk.e) null);
        this.I = new AwaitAuctionRequest(Integer.valueOf(this.f19709g.b()), (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, 62, (sk.e) null);
    }

    public static void f(HomeViewModel homeViewModel, String str, int i10) {
        String str2;
        if ((i10 & 1) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        homeViewModel.getClass();
        l0.j0(l0.d0(homeViewModel), (a0) null, new a1(homeViewModel, (Long) null, (Long) null, str2, (ik.d<? super a1>) null), 3);
    }

    public final void d(String str, boolean z10) {
        l0.j0(l0.d0(this), r0.f19085b, new t0(z10, this, str, (ik.d<? super t0>) null), 2);
    }

    public final void e(String str) {
        l0.j0(l0.d0(this), r0.f19085b, new a(this, str, (ik.d<? super a>) null), 2);
    }

    public final void g(String str) {
        l0.j0(l0.d0(this), r0.f19085b, new b(this, str, (ik.d<? super b>) null), 2);
    }

    public final void h() {
        l0.j0(l0.d0(this), (a0) null, new c(this, (ik.d<? super c>) null), 3);
    }

    public final void i() {
        l0.j0(l0.d0(this), (a0) null, new d(this, (ik.d<? super d>) null), 3);
    }

    public final void j(String str) {
        l0.j0(l0.d0(this), (a0) null, new e(this, str, (ik.d<? super e>) null), 3);
    }
}
