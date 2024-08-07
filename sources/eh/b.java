package eh;

import android.support.v4.media.a;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.data.model.Order;
import sk.j;

/* compiled from: OrderItemState.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Order f20060a;

    /* renamed from: b  reason: collision with root package name */
    public final CartStatus f20061b;

    public b(Order order, CartStatus cartStatus) {
        j.f(order, "item");
        j.f(cartStatus, "status");
        this.f20060a = order;
        this.f20061b = cartStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f20060a, bVar.f20060a) && this.f20061b == bVar.f20061b;
    }

    public final int hashCode() {
        return this.f20061b.hashCode() + (this.f20060a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("OrderItemState(item=");
        q10.append(this.f20060a);
        q10.append(", status=");
        q10.append(this.f20061b);
        q10.append(')');
        return q10.toString();
    }
}
