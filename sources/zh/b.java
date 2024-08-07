package zh;

import bi.a;
import com.vpa.daugia.module.payment.data.model.Fee;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import ek.i;
import mg.q0;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: PaymentActivity.kt */
public final class b extends k implements l<f<? extends Fee>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentActivity f23778a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(PaymentActivity paymentActivity) {
        super(1);
        this.f23778a = paymentActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23778a.O().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23778a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23778a.O().dismiss();
            ((q0) this.f23778a.M()).v(new a((Fee) ((f.c) fVar).f18006a));
        }
        return i.f20112a;
    }
}
