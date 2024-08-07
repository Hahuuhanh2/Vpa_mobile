package zh;

import com.vpa.daugia.module.payment.ui.activity.Hilt_PaymentActivity;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import e.b;

/* compiled from: Hilt_PaymentActivity */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_PaymentActivity f23777a;

    public a(Hilt_PaymentActivity hilt_PaymentActivity) {
        this.f23777a = hilt_PaymentActivity;
    }

    public final void a() {
        Hilt_PaymentActivity hilt_PaymentActivity = this.f23777a;
        if (!hilt_PaymentActivity.Q) {
            hilt_PaymentActivity.Q = true;
            PaymentActivity paymentActivity = (PaymentActivity) hilt_PaymentActivity;
            ((c) hilt_PaymentActivity.d()).G();
        }
    }
}
