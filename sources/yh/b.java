package yh;

import al.d0;
import com.vpa.daugia.module.payment.data.api.PaymentApiHelper;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import ef.k;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.module.payment.ui.PaymentViewModel$getBankQr$1", f = "PaymentViewModel.kt", l = {76}, m = "invokeSuspend")
/* compiled from: PaymentViewModel.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PaymentViewModel f23566b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23567c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(PaymentViewModel paymentViewModel, String str, d<? super b> dVar) {
        super(2, dVar);
        this.f23566b = paymentViewModel;
        this.f23567c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f23566b, this.f23567c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23565a;
        if (i10 == 0) {
            l0.Q0(obj);
            PaymentApiHelper paymentApiHelper = this.f23566b.f19789d;
            String str = this.f23567c;
            this.f23565a = 1;
            obj = paymentApiHelper.getBankQr(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f23566b.f19791f.k(new ArrayList());
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = (ArrayList) ((k) obj).d();
        if (arrayList != null) {
            this.f23566b.f19792g.k(fk.p.N0(arrayList));
        }
        return ek.i.f20112a;
    }
}
