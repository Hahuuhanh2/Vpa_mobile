package com.vpa.daugia.module.auction.ui;

import al.d0;
import al.r0;
import com.vpa.daugia.module.auction.data.api.AuctionApiHelper;
import com.vpa.daugia.module.auction.data.model.AuctionResult;
import com.vpa.daugia.module.auction.data.model.DetailAuctionResult;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import com.vpa.daugia.module.common.data.api.CommonApiHelper;
import com.vpa.daugia.module.history.data.api.request.AuctionHistoryRequest;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import com.vpa.daugia.module.setting.data.model.SelectAddress;
import ef.n;
import ik.d;
import java.util.ArrayList;
import kg.c;
import kk.e;
import kk.i;
import lg.b;
import n0.l;
import p3.l0;
import r2.p;
import r2.v;
import sk.j;
import ze.f;

/* compiled from: AuctionViewModel.kt */
public final class AuctionViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final AuctionApiHelper f19383d;

    /* renamed from: e  reason: collision with root package name */
    public final CommonApiHelper f19384e;

    /* renamed from: f  reason: collision with root package name */
    public final SettingApiHelper f19385f;

    /* renamed from: g  reason: collision with root package name */
    public n<AuctionResult> f19386g = new n<>((Object) null);

    /* renamed from: h  reason: collision with root package name */
    public final p<f<ArrayList<AuctionResult>>> f19387h;

    /* renamed from: i  reason: collision with root package name */
    public final p f19388i;

    /* renamed from: j  reason: collision with root package name */
    public final p<f<ArrayList<DetailAuctionResult>>> f19389j;

    /* renamed from: k  reason: collision with root package name */
    public final p f19390k;

    /* renamed from: l  reason: collision with root package name */
    public final p<f<ArrayList<OrderWaitAuction>>> f19391l;

    /* renamed from: m  reason: collision with root package name */
    public final p f19392m;

    /* renamed from: n  reason: collision with root package name */
    public final p<f<Object>> f19393n;

    /* renamed from: o  reason: collision with root package name */
    public final p f19394o;

    /* renamed from: p  reason: collision with root package name */
    public final p<ArrayList<SelectAddress>> f19395p;

    /* renamed from: q  reason: collision with root package name */
    public int f19396q;

    /* renamed from: r  reason: collision with root package name */
    public int f19397r;

    @e(c = "com.vpa.daugia.module.auction.ui.AuctionViewModel$getAuctionHistoryList$1", f = "AuctionViewModel.kt", l = {90}, m = "invokeSuspend")
    /* compiled from: AuctionViewModel.kt */
    public static final class a extends i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19398a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AuctionViewModel f19399b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Long f19400c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f19401d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Long f19402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionViewModel auctionViewModel, Long l10, String str, Long l11, d<? super a> dVar) {
            super(2, dVar);
            this.f19399b = auctionViewModel;
            this.f19400c = l10;
            this.f19401d = str;
            this.f19402e = l11;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f19399b, this.f19400c, this.f19401d, this.f19402e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i10;
            int i11;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i12 = this.f19398a;
            if (i12 == 0) {
                l0.Q0(obj);
                AuctionViewModel auctionViewModel = this.f19399b;
                if (auctionViewModel.f19396q == auctionViewModel.f19397r) {
                    return ek.i.f20112a;
                }
                auctionViewModel.f19387h.k(f.b.f18005a);
                AuctionViewModel auctionViewModel2 = this.f19399b;
                int i13 = auctionViewModel2.f19396q;
                auctionViewModel2.f19396q = i13 + 1;
                AuctionHistoryRequest auctionHistoryRequest = new AuctionHistoryRequest(this.f19400c, new Integer(20), new Integer(i13), (String) null, this.f19401d, this.f19402e, (String) null, (Long) null, 200, (sk.e) null);
                AuctionApiHelper auctionApiHelper = this.f19399b.f19383d;
                this.f19398a = 1;
                obj2 = auctionApiHelper.getAuctionResult(auctionHistoryRequest, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i12 == 1) {
                try {
                    l0.Q0(obj);
                    obj2 = obj;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l.p(e10, this.f19399b.f19387h);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n nVar = (n) obj2;
            ArrayList a10 = nVar.a();
            if (a10 != null) {
                this.f19399b.f19387h.k(new f.c(a10));
            }
            AuctionViewModel auctionViewModel3 = this.f19399b;
            Integer c10 = nVar.c();
            if (c10 != null) {
                i10 = c10.intValue();
            } else {
                i10 = 0;
            }
            auctionViewModel3.getClass();
            if (i10 % 20 == 0) {
                i11 = i10 / 20;
            } else {
                i11 = (i10 / 20) + 1;
            }
            auctionViewModel3.f19397r = i11;
            return ek.i.f20112a;
        }
    }

    public AuctionViewModel(AuctionApiHelper auctionApiHelper, CommonApiHelper commonApiHelper, b bVar, c cVar, SettingApiHelper settingApiHelper) {
        j.f(auctionApiHelper, "apiHelper");
        j.f(commonApiHelper, "commonApiHelper");
        j.f(bVar, "sharedPrefsHelper");
        j.f(cVar, "serviceCache");
        j.f(settingApiHelper, "settingApiHelper");
        this.f19383d = auctionApiHelper;
        this.f19384e = commonApiHelper;
        this.f19385f = settingApiHelper;
        p<f<ArrayList<AuctionResult>>> pVar = new p<>();
        this.f19387h = pVar;
        this.f19388i = pVar;
        p<f<ArrayList<DetailAuctionResult>>> pVar2 = new p<>();
        this.f19389j = pVar2;
        this.f19390k = pVar2;
        p<f<ArrayList<OrderWaitAuction>>> pVar3 = new p<>();
        this.f19391l = pVar3;
        this.f19392m = pVar3;
        new p();
        p<f<Object>> pVar4 = new p<>();
        this.f19393n = pVar4;
        this.f19394o = pVar4;
        this.f19395p = new p<>();
        this.f19397r = 1;
        e(this, (String) null, 7);
    }

    public static /* synthetic */ void e(AuctionViewModel auctionViewModel, String str, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        auctionViewModel.d(str, (Long) null, (Long) null);
    }

    public final void d(String str, Long l10, Long l11) {
        l0.j0(l0.d0(this), r0.f19085b, new a(this, l10, str, l11, (d<? super a>) null), 2);
    }
}
