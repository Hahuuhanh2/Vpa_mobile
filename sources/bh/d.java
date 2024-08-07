package bh;

import al.d0;
import al.q1;
import al.r0;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import com.vpa.daugia.module.setting.data.model.Bank;
import ef.k;
import fl.m;
import gf.b;
import gl.c;
import java.util.ArrayList;
import java.util.Iterator;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;
import yk.h;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getAllBank$1", f = "LoginViewModel.kt", l = {331}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class d extends i implements p<d0, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19127b;

    @e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getAllBank$1$1", f = "LoginViewModel.kt", l = {333}, m = "invokeSuspend")
    /* compiled from: LoginViewModel.kt */
    public static final class a extends i implements p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19128a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LoginViewModel f19129b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LoginViewModel loginViewModel, ik.d<? super a> dVar) {
            super(2, dVar);
            this.f19129b = loginViewModel;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new a(this.f19129b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            String str;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f19128a;
            if (i10 == 0) {
                l0.Q0(obj);
                SettingApiHelper settingApiHelper = this.f19129b.f19547f;
                this.f19128a = 1;
                obj = settingApiHelper.getAllBank(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f19129b.D.g(new ArrayList());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                d2.i<ArrayList<b>> iVar = this.f19129b.D;
                ArrayList arrayList2 = (ArrayList) kVar.d();
                if (arrayList2 != null) {
                    this.f19129b.getClass();
                    arrayList = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Bank bank = (Bank) it.next();
                        j.c(bank);
                        arrayList.add(new b(bank.getFullName(), false, bank.getCode(), (Integer) null, 54));
                    }
                } else {
                    arrayList = null;
                }
                iVar.g(arrayList);
                LoginViewModel loginViewModel = this.f19129b;
                ArrayList<b> arrayList3 = (ArrayList) loginViewModel.D.f8545b;
                if (arrayList3 != null) {
                    for (b bVar : arrayList3) {
                        String b10 = bVar.b();
                        User user = (User) loginViewModel.L.f8545b;
                        if (user != null) {
                            str = user.getBank();
                        } else {
                            str = null;
                        }
                        if (h.G0(b10, str)) {
                            bVar.f10499c = true;
                        }
                    }
                }
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(LoginViewModel loginViewModel, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f19127b = loginViewModel;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        return new d(this.f19127b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f19126a;
        if (i10 == 0) {
            l0.Q0(obj);
            c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            a aVar2 = new a(this.f19127b, (ik.d<? super a>) null);
            this.f19126a = 1;
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
