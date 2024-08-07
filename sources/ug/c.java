package ug;

import android.support.v4.media.a;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import sk.j;

/* compiled from: BiddingPriceItemState.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final BiddingPrice f23045a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23046b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f23047c;

    public c(BiddingPrice biddingPrice, int i10, Long l10) {
        j.f(biddingPrice, "item");
        this.f23045a = biddingPrice;
        this.f23046b = i10;
        this.f23047c = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f23045a, cVar.f23045a) && this.f23046b == cVar.f23046b && j.a(this.f23047c, cVar.f23047c);
    }

    public final int hashCode() {
        int hashCode = ((this.f23045a.hashCode() * 31) + this.f23046b) * 31;
        Long l10 = this.f23047c;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        StringBuilder q10 = a.q("BiddingPriceItemState(item=");
        q10.append(this.f23045a);
        q10.append(", position=");
        q10.append(this.f23046b);
        q10.append(", userId=");
        q10.append(this.f23047c);
        q10.append(')');
        return q10.toString();
    }
}
