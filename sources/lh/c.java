package lh;

import android.support.v4.media.a;
import com.vpa.daugia.module.history.data.model.DetailAuctionHistory;
import sk.j;

/* compiled from: DetailAuctionHistoryItemState.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final DetailAuctionHistory f20853a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20854b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f20855c;

    public c(DetailAuctionHistory detailAuctionHistory, int i10, Long l10) {
        j.f(detailAuctionHistory, "item");
        this.f20853a = detailAuctionHistory;
        this.f20854b = i10;
        this.f20855c = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f20853a, cVar.f20853a) && this.f20854b == cVar.f20854b && j.a(this.f20855c, cVar.f20855c);
    }

    public final int hashCode() {
        int hashCode = ((this.f20853a.hashCode() * 31) + this.f20854b) * 31;
        Long l10 = this.f20855c;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        StringBuilder q10 = a.q("DetailAuctionHistoryItemState(item=");
        q10.append(this.f20853a);
        q10.append(", position=");
        q10.append(this.f20854b);
        q10.append(", userId=");
        q10.append(this.f20855c);
        q10.append(')');
        return q10.toString();
    }
}
