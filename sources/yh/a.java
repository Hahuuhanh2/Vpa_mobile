package yh;

import al.d0;
import al.q1;
import al.r0;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import com.vpa.daugia.module.setting.data.model.Bank;
import ef.k;
import fl.m;
import gf.b;
import gl.c;
import ik.d;
import java.util.ArrayList;
import java.util.Iterator;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.vpa.daugia.module.payment.ui.PaymentViewModel$getAllBank$1", f = "PaymentViewModel.kt", l = {89}, m = "invokeSuspend")
/* compiled from: PaymentViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PaymentViewModel f23562b;

    @e(c = "com.vpa.daugia.module.payment.ui.PaymentViewModel$getAllBank$1$1", f = "PaymentViewModel.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: yh.a$a  reason: collision with other inner class name */
    /* compiled from: PaymentViewModel.kt */
    public static final class C0318a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f23563a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PaymentViewModel f23564b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0318a(PaymentViewModel paymentViewModel, d<? super C0318a> dVar) {
            super(2, dVar);
            this.f23564b = paymentViewModel;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new C0318a(this.f23564b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0318a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f23563a;
            if (i10 == 0) {
                l0.Q0(obj);
                SettingApiHelper settingApiHelper = this.f23564b.f19790e;
                this.f23563a = 1;
                obj = settingApiHelper.getAllBank(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                try {
                    l0.Q0(obj);
                } catch (Exception unused) {
                    this.f23564b.f19793h.g(new ArrayList());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k kVar = (k) obj;
            if (kVar.e()) {
                d2.i<ArrayList<b>> iVar = this.f23564b.f19793h;
                ArrayList arrayList2 = (ArrayList) kVar.d();
                if (arrayList2 != null) {
                    this.f23564b.getClass();
                    arrayList = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Bank bank = (Bank) it.next();
                        j.c(bank);
                        arrayList.add(new b(bank.getFullName(), false, bank.getDeepLink(), (Integer) null, 54));
                    }
                } else {
                    arrayList = null;
                }
                iVar.g(arrayList);
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(PaymentViewModel paymentViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f23562b = paymentViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f23562b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f23561a;
        if (i10 == 0) {
            l0.Q0(obj);
            c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            C0318a aVar2 = new C0318a(this.f23562b, (d<? super C0318a>) null);
            this.f23561a = 1;
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
