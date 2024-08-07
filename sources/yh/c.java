package yh;

import al.d0;
import com.vpa.daugia.module.payment.data.api.PaymentApiHelper;
import com.vpa.daugia.module.payment.data.model.Fee;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.payment.ui.PaymentViewModel$getFee$1", f = "PaymentViewModel.kt", l = {61}, m = "invokeSuspend")
/* compiled from: PaymentViewModel.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23568a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PaymentViewModel f23569b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23570c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(PaymentViewModel paymentViewModel, String str, d<? super c> dVar) {
        super(2, dVar);
        this.f23569b = paymentViewModel;
        this.f23570c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f23569b, this.f23570c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23568a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f23569b.f19794i.k(f.b.f18005a);
            PaymentApiHelper paymentApiHelper = this.f23569b.f19789d;
            String str = this.f23570c;
            this.f23568a = 1;
            obj = paymentApiHelper.getFee(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f23569b.f19794i);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Fee fee = (Fee) ((k) obj).d();
        if (fee != null) {
            this.f23569b.f19794i.k(new f.c(fee));
        }
        return ek.i.f20112a;
    }
}
