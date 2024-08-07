package qi;

import al.d0;
import al.q1;
import al.r0;
import com.vpa.daugia.module.searching.ui.viewmodel.FilterViewModel;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import com.vpa.daugia.module.setting.data.model.SelectAddress;
import ef.k;
import fl.m;
import gf.b;
import gl.c;
import ik.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.vpa.daugia.module.searching.ui.viewmodel.FilterViewModel$getProvinces$1", f = "FilterViewModel.kt", l = {67}, m = "invokeSuspend")
/* compiled from: FilterViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22760a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FilterViewModel f22761b;

    @e(c = "com.vpa.daugia.module.searching.ui.viewmodel.FilterViewModel$getProvinces$1$1", f = "FilterViewModel.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: qi.a$a  reason: collision with other inner class name */
    /* compiled from: FilterViewModel.kt */
    public static final class C0305a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f22762a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FilterViewModel f22763b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0305a(FilterViewModel filterViewModel, d<? super C0305a> dVar) {
            super(2, dVar);
            this.f22763b = filterViewModel;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new C0305a(this.f22763b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0305a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f22762a;
            if (i10 == 0) {
                l0.Q0(obj);
                SettingApiHelper settingApiHelper = this.f22763b.f19878d;
                this.f22762a = 1;
                obj = settingApiHelper.getProvinces(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f22763b.f19880f.k(new ArrayList());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                r2.p<List<b>> pVar = this.f22763b.f19880f;
                ArrayList arrayList2 = (ArrayList) kVar.d();
                if (arrayList2 != null) {
                    this.f22763b.getClass();
                    arrayList = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        SelectAddress selectAddress = (SelectAddress) it.next();
                        j.c(selectAddress);
                        arrayList.add(new b(selectAddress.getFullName(), false, selectAddress.getCode(), (Integer) null, 54));
                    }
                } else {
                    arrayList = null;
                }
                pVar.k(arrayList);
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(FilterViewModel filterViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f22761b = filterViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f22761b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f22760a;
        if (i10 == 0) {
            l0.Q0(obj);
            c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            C0305a aVar2 = new C0305a(this.f22761b, (d<? super C0305a>) null);
            this.f22760a = 1;
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
