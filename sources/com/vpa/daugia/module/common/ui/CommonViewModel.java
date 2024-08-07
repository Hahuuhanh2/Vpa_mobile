package com.vpa.daugia.module.common.ui;

import al.d0;
import al.r0;
import com.vpa.daugia.module.common.data.model.MyDocument;
import com.vpa.daugia.module.history.data.api.request.AuctionHistoryRequest;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import kk.e;
import kk.i;
import lg.b;
import n0.l;
import p3.l0;
import r2.p;
import r2.v;
import sk.j;
import ze.f;

/* compiled from: CommonViewModel.kt */
public final class CommonViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final SettingApiHelper f19617d;

    /* renamed from: e  reason: collision with root package name */
    public n<MyDocument> f19618e = new n<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public final p<f<ArrayList<MyDocument>>> f19619f;

    /* renamed from: g  reason: collision with root package name */
    public final p f19620g;

    /* renamed from: h  reason: collision with root package name */
    public final p<f<Object>> f19621h;

    /* renamed from: i  reason: collision with root package name */
    public final p f19622i;

    @e(c = "com.vpa.daugia.module.common.ui.CommonViewModel$getDocumentList$1", f = "CommonViewModel.kt", l = {54}, m = "invokeSuspend")
    /* compiled from: CommonViewModel.kt */
    public static final class a extends i implements rk.p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19623a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CommonViewModel f19624b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Long f19625c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f19626d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Long f19627e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(CommonViewModel commonViewModel, Long l10, String str, Long l11, d<? super a> dVar) {
            super(2, dVar);
            this.f19624b = commonViewModel;
            this.f19625c = l10;
            this.f19626d = str;
            this.f19627e = l11;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f19624b, this.f19625c, this.f19626d, this.f19627e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ArrayList a10;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19623a;
            if (i10 == 0) {
                l0.Q0(obj);
                if (!this.f19624b.f19618e.d()) {
                    return ek.i.f20112a;
                }
                this.f19624b.f19619f.k(f.b.f18005a);
                AuctionHistoryRequest auctionHistoryRequest = r5;
                AuctionHistoryRequest auctionHistoryRequest2 = new AuctionHistoryRequest(this.f19625c, new Integer(this.f19624b.f19618e.b()), new Integer(this.f19624b.f19618e.f()), this.f19626d, (String) null, this.f19627e, (String) null, (Long) null, 208, (sk.e) null);
                SettingApiHelper settingApiHelper = this.f19624b.f19617d;
                this.f19623a = 1;
                obj2 = settingApiHelper.getDocumentList(auctionHistoryRequest, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                    obj2 = obj;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l.p(e10, this.f19624b.f19619f);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj2;
            n nVar = (n) kVar.d();
            if (!(nVar == null || (a10 = nVar.a()) == null)) {
                this.f19624b.f19619f.k(new f.c(a10));
            }
            CommonViewModel commonViewModel = this.f19624b;
            Object d10 = kVar.d();
            j.c(d10);
            commonViewModel.getClass();
            commonViewModel.f19618e = (n) d10;
            return ek.i.f20112a;
        }
    }

    public CommonViewModel(SettingApiHelper settingApiHelper, b bVar) {
        j.f(settingApiHelper, "apiHelper");
        j.f(bVar, "sharedPrefsHelper");
        this.f19617d = settingApiHelper;
        p<f<ArrayList<MyDocument>>> pVar = new p<>();
        this.f19619f = pVar;
        this.f19620g = pVar;
        p<f<Object>> pVar2 = new p<>();
        this.f19621h = pVar2;
        this.f19622i = pVar2;
    }

    public static /* synthetic */ void e(CommonViewModel commonViewModel, String str, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        commonViewModel.d(str, (Long) null, (Long) null);
    }

    public final void d(String str, Long l10, Long l11) {
        l0.j0(l0.d0(this), r0.f19085b, new a(this, l10, str, l11, (d<? super a>) null), 2);
    }
}
