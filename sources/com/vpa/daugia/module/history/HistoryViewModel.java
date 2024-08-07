package com.vpa.daugia.module.history;

import al.d0;
import al.r0;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.history.data.api.HistoryApiHelper;
import com.vpa.daugia.module.history.data.api.request.AuctionHistoryRequest;
import com.vpa.daugia.module.history.data.model.AuctionHistory;
import com.vpa.daugia.module.history.data.model.DetailAuctionHistory;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import r2.p;
import r2.v;
import sk.j;
import ze.f;

/* compiled from: HistoryViewModel.kt */
public final class HistoryViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final HistoryApiHelper f19636d;

    /* renamed from: e  reason: collision with root package name */
    public final lg.b f19637e;

    /* renamed from: f  reason: collision with root package name */
    public n<AuctionHistory> f19638f = new n<>((Object) null);

    /* renamed from: g  reason: collision with root package name */
    public n<DetailAuctionHistory> f19639g = new n<>((Object) null);

    /* renamed from: h  reason: collision with root package name */
    public final p<f<ArrayList<AuctionHistory>>> f19640h;

    /* renamed from: i  reason: collision with root package name */
    public final p f19641i;

    /* renamed from: j  reason: collision with root package name */
    public final p<f<ArrayList<DetailAuctionHistory>>> f19642j;

    /* renamed from: k  reason: collision with root package name */
    public final p f19643k;

    @e(c = "com.vpa.daugia.module.history.HistoryViewModel$getAuctionHistoryList$1", f = "HistoryViewModel.kt", l = {58}, m = "invokeSuspend")
    /* compiled from: HistoryViewModel.kt */
    public static final class a extends i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19644a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HistoryViewModel f19645b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Long f19646c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f19647d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Long f19648e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HistoryViewModel historyViewModel, Long l10, String str, Long l11, d<? super a> dVar) {
            super(2, dVar);
            this.f19645b = historyViewModel;
            this.f19646c = l10;
            this.f19647d = str;
            this.f19648e = l11;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f19645b, this.f19646c, this.f19647d, this.f19648e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ArrayList a10;
            String str;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19644a;
            if (i10 == 0) {
                l0.Q0(obj);
                if (!this.f19645b.f19638f.d()) {
                    return ek.i.f20112a;
                }
                this.f19645b.f19640h.k(f.b.f18005a);
                int b10 = this.f19645b.f19638f.b();
                int f10 = this.f19645b.f19638f.f() + 1;
                User e10 = this.f19645b.f19637e.e();
                if (e10 != null) {
                    str = e10.getId();
                } else {
                    str = null;
                }
                AuctionHistoryRequest auctionHistoryRequest = new AuctionHistoryRequest(this.f19646c, new Integer(b10), new Integer(f10), this.f19647d, (String) null, this.f19648e, str, (Long) null, 144, (sk.e) null);
                HistoryApiHelper historyApiHelper = this.f19645b.f19636d;
                this.f19644a = 1;
                obj2 = historyApiHelper.getAuctionHistoryList(auctionHistoryRequest, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                    obj2 = obj;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    l.p(e11, this.f19645b.f19640h);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj2;
            n nVar = (n) kVar.d();
            if (!(nVar == null || (a10 = nVar.a()) == null)) {
                this.f19645b.f19640h.k(new f.c(a10));
            }
            HistoryViewModel historyViewModel = this.f19645b;
            Object d10 = kVar.d();
            j.c(d10);
            historyViewModel.getClass();
            historyViewModel.f19638f = (n) d10;
            return ek.i.f20112a;
        }
    }

    @e(c = "com.vpa.daugia.module.history.HistoryViewModel$getDetailAuctionHistoryList$1", f = "HistoryViewModel.kt", l = {83}, m = "invokeSuspend")
    /* compiled from: HistoryViewModel.kt */
    public static final class b extends i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19649a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HistoryViewModel f19650b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Long f19651c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(HistoryViewModel historyViewModel, Long l10, d<? super b> dVar) {
            super(2, dVar);
            this.f19650b = historyViewModel;
            this.f19651c = l10;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new b(this.f19650b, this.f19651c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList a10;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19649a;
            if (i10 == 0) {
                l0.Q0(obj);
                if (!this.f19650b.f19639g.d()) {
                    return ek.i.f20112a;
                }
                this.f19650b.f19642j.k(f.b.f18005a);
                AuctionHistoryRequest auctionHistoryRequest = new AuctionHistoryRequest((Long) null, new Integer(20), new Integer(this.f19650b.f19639g.f()), (String) null, (String) null, (Long) null, (String) null, this.f19651c, 121, (sk.e) null);
                HistoryApiHelper historyApiHelper = this.f19650b.f19636d;
                this.f19649a = 1;
                obj = historyApiHelper.getDetailAuctionHistoryList(auctionHistoryRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l.p(e10, this.f19650b.f19642j);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            n nVar = (n) kVar.d();
            if (!(nVar == null || (a10 = nVar.a()) == null)) {
                this.f19650b.f19642j.k(new f.c(a10));
            }
            HistoryViewModel historyViewModel = this.f19650b;
            Object d10 = kVar.d();
            j.c(d10);
            historyViewModel.getClass();
            historyViewModel.f19639g = (n) d10;
            return ek.i.f20112a;
        }
    }

    public HistoryViewModel(HistoryApiHelper historyApiHelper, lg.b bVar) {
        j.f(historyApiHelper, "apiHelper");
        j.f(bVar, "sharedPrefsHelper");
        this.f19636d = historyApiHelper;
        this.f19637e = bVar;
        p<f<ArrayList<AuctionHistory>>> pVar = new p<>();
        this.f19640h = pVar;
        this.f19641i = pVar;
        p<f<ArrayList<DetailAuctionHistory>>> pVar2 = new p<>();
        this.f19642j = pVar2;
        this.f19643k = pVar2;
    }

    public static /* synthetic */ void e(HistoryViewModel historyViewModel, String str, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        historyViewModel.d(str, (Long) null, (Long) null);
    }

    public final void d(String str, Long l10, Long l11) {
        l0.j0(l0.d0(this), r0.f19085b, new a(this, l10, str, l11, (d<? super a>) null), 2);
    }

    public final void f(Long l10) {
        l0.j0(l0.d0(this), r0.f19085b, new b(this, l10, (d<? super b>) null), 2);
    }
}
