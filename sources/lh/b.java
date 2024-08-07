package lh;

import android.support.v4.media.a;
import com.vpa.daugia.module.history.data.model.AuctionHistory;
import f0.b0;
import java.text.NumberFormat;
import java.util.Locale;
import sk.j;

/* compiled from: AuctionHistoryItemState.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AuctionHistory f20852a;

    public b(AuctionHistory auctionHistory) {
        j.f(auctionHistory, "item");
        this.f20852a = auctionHistory;
    }

    public static String a(Long l10) {
        long j10;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.GERMANY);
        StringBuilder sb2 = new StringBuilder();
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        return b0.t(numberInstance, j10, sb2, " đ");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f20852a, ((b) obj).f20852a);
    }

    public final int hashCode() {
        return this.f20852a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("AuctionHistoryItemState(item=");
        q10.append(this.f20852a);
        q10.append(')');
        return q10.toString();
    }
}
