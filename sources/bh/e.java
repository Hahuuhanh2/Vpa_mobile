package bh;

import al.d0;
import al.q1;
import al.r0;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import ef.k;
import fl.m;
import gf.b;
import gl.c;
import ik.d;
import java.util.ArrayList;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@kk.e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getProvinces$1", f = "LoginViewModel.kt", l = {353}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class e extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19131b;

    @kk.e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getProvinces$1$1", f = "LoginViewModel.kt", l = {355}, m = "invokeSuspend")
    /* compiled from: LoginViewModel.kt */
    public static final class a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19132a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LoginViewModel f19133b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LoginViewModel loginViewModel, d<? super a> dVar) {
            super(2, dVar);
            this.f19133b = loginViewModel;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f19133b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            String str;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19132a;
            if (i10 == 0) {
                l0.Q0(obj);
                SettingApiHelper settingApiHelper = this.f19133b.f19547f;
                this.f19132a = 1;
                obj = settingApiHelper.getProvinces(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f19133b.E.g(new ArrayList());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                d2.i<ArrayList<b>> iVar = this.f19133b.E;
                ArrayList arrayList2 = (ArrayList) kVar.d();
                if (arrayList2 != null) {
                    arrayList = LoginViewModel.e(this.f19133b, arrayList2);
                } else {
                    arrayList = null;
                }
                iVar.g(arrayList);
                LoginViewModel loginViewModel = this.f19133b;
                ArrayList<b> arrayList3 = (ArrayList) loginViewModel.E.f8545b;
                if (arrayList3 != null) {
                    for (b bVar : arrayList3) {
                        String b10 = bVar.b();
                        User user = (User) loginViewModel.L.f8545b;
                        if (user != null) {
                            str = user.getProvinceId();
                        } else {
                            str = null;
                        }
                        if (j.a(b10, str)) {
                            bVar.f10499c = true;
                        }
                    }
                }
                ArrayList arrayList4 = (ArrayList) kVar.d();
                if (arrayList4 != null) {
                    new Long(this.f19133b.f19549h.a(arrayList4));
                }
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(LoginViewModel loginViewModel, d<? super e> dVar) {
        super(2, dVar);
        this.f19131b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new e(this.f19131b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f19130a;
        if (i10 == 0) {
            l0.Q0(obj);
            c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            a aVar2 = new a(this.f19131b, (d<? super a>) null);
            this.f19130a = 1;
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
