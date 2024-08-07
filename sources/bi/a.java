package bi;

import com.vpa.daugia.module.payment.data.model.Fee;
import sk.j;

/* compiled from: InfoPaymentState.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Fee f19165a;

    public a(Fee fee) {
        j.f(fee, "item");
        this.f19165a = fee;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f19165a, ((a) obj).f19165a);
    }

    public final int hashCode() {
        return this.f19165a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("InfoPaymentState(item=");
        q10.append(this.f19165a);
        q10.append(')');
        return q10.toString();
    }
}
