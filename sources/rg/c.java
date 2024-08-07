package rg;

import al.d0;
import al.q1;
import al.r0;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import com.vpa.daugia.module.setting.data.model.SelectAddress;
import ef.k;
import fl.m;
import ik.d;
import java.util.ArrayList;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.module.auction.ui.AuctionViewModel$getProvinces$1", f = "AuctionViewModel.kt", l = {121}, m = "invokeSuspend")
/* compiled from: AuctionViewModel.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22774a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionViewModel f22775b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f22776c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f22777d;

    @e(c = "com.vpa.daugia.module.auction.ui.AuctionViewModel$getProvinces$1$1", f = "AuctionViewModel.kt", l = {123}, m = "invokeSuspend")
    /* compiled from: AuctionViewModel.kt */
    public static final class a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f22778a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AuctionViewModel f22779b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f22780c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f22781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionViewModel auctionViewModel, String str, String str2, d<? super a> dVar) {
            super(2, dVar);
            this.f22779b = auctionViewModel;
            this.f22780c = str;
            this.f22781d = str2;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f22779b, this.f22780c, this.f22781d, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f22778a;
            if (i10 == 0) {
                l0.Q0(obj);
                SettingApiHelper settingApiHelper = this.f22779b.f19385f;
                this.f22778a = 1;
                obj = settingApiHelper.getProvinces(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f22779b.f19395p.k(new ArrayList());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                r2.p<ArrayList<SelectAddress>> pVar = this.f22779b.f19395p;
                ArrayList arrayList = (ArrayList) kVar.d();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                pVar.k(arrayList);
                AuctionViewModel auctionViewModel = this.f22779b;
                String str = this.f22780c;
                String str2 = this.f22781d;
                auctionViewModel.getClass();
                l0.j0(l0.d0(auctionViewModel), r0.f19085b, new b(auctionViewModel, str2, str, (d<? super b>) null), 2);
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(AuctionViewModel auctionViewModel, String str, String str2, d<? super c> dVar) {
        super(2, dVar);
        this.f22775b = auctionViewModel;
        this.f22776c = str;
        this.f22777d = str2;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f22775b, this.f22776c, this.f22777d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f22774a;
        if (i10 == 0) {
            l0.Q0(obj);
            gl.c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            a aVar2 = new a(this.f22775b, this.f22776c, this.f22777d, (d<? super a>) null);
            this.f22774a = 1;
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
