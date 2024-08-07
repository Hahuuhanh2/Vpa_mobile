package ug;

import android.support.v4.media.a;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import sk.j;

/* compiled from: OrderWaitAuctionItemState.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final OrderWaitAuction f23049a;

    public e(OrderWaitAuction orderWaitAuction) {
        j.f(orderWaitAuction, "item");
        this.f23049a = orderWaitAuction;
    }

    public final boolean a() {
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        Long auctionFromTime = this.f23049a.getAuctionFromTime();
        if (auctionFromTime != null) {
            j10 = auctionFromTime.longValue();
        } else {
            j10 = 0;
        }
        if (j10 - currentTimeMillis > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f23049a, ((e) obj).f23049a);
    }

    public final int hashCode() {
        return this.f23049a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("OrderWaitAuctionItemState(item=");
        q10.append(this.f23049a);
        q10.append(')');
        return q10.toString();
    }
}
