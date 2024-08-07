package ug;

import android.support.v4.media.a;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import sk.j;

/* compiled from: AwaitPlateItemState.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AwaitAuction f23044a;

    public b(AwaitAuction awaitAuction) {
        j.f(awaitAuction, "item");
        this.f23044a = awaitAuction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f23044a, ((b) obj).f23044a);
    }

    public final int hashCode() {
        return this.f23044a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("AwaitPlateItemState(item=");
        q10.append(this.f23044a);
        q10.append(')');
        return q10.toString();
    }
}
