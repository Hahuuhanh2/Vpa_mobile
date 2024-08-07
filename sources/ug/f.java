package ug;

import android.support.v4.media.a;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import f0.b0;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import sk.j;

/* compiled from: RoomAuctionItemState.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final PriceTable f23050a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f23051b;

    public /* synthetic */ f() {
        throw null;
    }

    public f(PriceTable priceTable, Long l10) {
        j.f(priceTable, "item");
        this.f23050a = priceTable;
        this.f23051b = l10;
    }

    public final String a() {
        Long l10;
        long j10;
        long j11;
        ArrayList<BiddingPrice> prices = this.f23050a.getPrices();
        long j12 = 0;
        if (prices != null) {
            Iterator<T> it = prices.iterator();
            if (!it.hasNext()) {
                l10 = null;
            } else {
                Long price = ((BiddingPrice) it.next()).getPrice();
                if (price != null) {
                    j10 = price.longValue();
                } else {
                    j10 = 0;
                }
                Long valueOf = Long.valueOf(j10);
                while (it.hasNext()) {
                    Long price2 = ((BiddingPrice) it.next()).getPrice();
                    if (price2 != null) {
                        j11 = price2.longValue();
                    } else {
                        j11 = 0;
                    }
                    Long valueOf2 = Long.valueOf(j11);
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                l10 = valueOf;
            }
            if (l10 != null) {
                j12 = l10.longValue();
            }
        }
        return b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), j12, new StringBuilder(), " đ");
    }

    public final String b() {
        CharSequence charSequence;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23050a.getKyHieuDiaPhuong());
        sb2.append(this.f23050a.getSeriDangKy());
        sb2.append(10);
        String soThuTu = this.f23050a.getSoThuTu();
        CharSequence charSequence2 = null;
        if (soThuTu != null) {
            charSequence = soThuTu.subSequence(0, 3);
        } else {
            charSequence = null;
        }
        sb2.append(charSequence);
        sb2.append('.');
        String soThuTu2 = this.f23050a.getSoThuTu();
        if (soThuTu2 != null) {
            charSequence2 = soThuTu2.subSequence(3, 5);
        }
        sb2.append(charSequence2);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f23050a, fVar.f23050a) && j.a(this.f23051b, fVar.f23051b);
    }

    public final int hashCode() {
        int hashCode = this.f23050a.hashCode() * 31;
        Long l10 = this.f23051b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        StringBuilder q10 = a.q("RoomAuctionItemState(item=");
        q10.append(this.f23050a);
        q10.append(", userId=");
        q10.append(this.f23051b);
        q10.append(')');
        return q10.toString();
    }
}
