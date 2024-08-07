package ug;

import com.vpa.daugia.module.auction.data.model.AuctionResult;
import java.text.SimpleDateFormat;
import java.util.Locale;
import n0.l;
import sk.j;

/* compiled from: AuctionResultItemState.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AuctionResult f23043a;

    public a(AuctionResult auctionResult) {
        j.f(auctionResult, "item");
        this.f23043a = auctionResult;
    }

    public final String a() {
        Long endTime = this.f23043a.getEndTime();
        if (endTime == null) {
            return null;
        }
        String h10 = l.h(endTime.longValue(), new SimpleDateFormat("HH:mm", Locale.getDefault()));
        if (h10 == null) {
            return "";
        }
        return h10;
    }

    public final String b() {
        Long startTime = this.f23043a.getStartTime();
        if (startTime == null) {
            return null;
        }
        String h10 = l.h(startTime.longValue(), new SimpleDateFormat("HH:mm", Locale.getDefault()));
        if (h10 == null) {
            return "";
        }
        return h10;
    }

    public final String c() {
        Long endTime = this.f23043a.getEndTime();
        if (endTime == null) {
            return null;
        }
        String h10 = l.h(endTime.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
        if (h10 == null) {
            return "";
        }
        return h10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f23043a, ((a) obj).f23043a);
    }

    public final int hashCode() {
        return this.f23043a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("AuctionResultItemState(item=");
        q10.append(this.f23043a);
        q10.append(')');
        return q10.toString();
    }
}
