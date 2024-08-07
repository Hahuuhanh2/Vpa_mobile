package ug;

import android.support.v4.media.a;
import com.vpa.daugia.module.auction.data.model.DetailAuctionResult;
import sk.j;

/* compiled from: DetailAuctionResultItemState.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final DetailAuctionResult f23048a;

    public d(DetailAuctionResult detailAuctionResult) {
        j.f(detailAuctionResult, "item");
        this.f23048a = detailAuctionResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f23048a, ((d) obj).f23048a);
    }

    public final int hashCode() {
        return this.f23048a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("DetailAuctionResultItemState(item=");
        q10.append(this.f23048a);
        q10.append(')');
        return q10.toString();
    }
}
