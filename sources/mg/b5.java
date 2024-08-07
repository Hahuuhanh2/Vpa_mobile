package mg;

import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auction.data.model.AuctionResult;
import e2.c;
import f0.b0;
import java.text.NumberFormat;
import java.util.Locale;
import ug.a;

/* compiled from: ItemAuctionResultBindingImpl */
public final class b5 extends a5 {
    public final AppTextView A;
    public final AppTextView B;
    public final AppTextView C;
    public final AppTextView D;
    public long E = -1;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f20994z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b5(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 8
            r1 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r0, r1, r1)
            r2 = 2
            r2 = r0[r2]
            com.ots.core.utils.customview.textview.AppTextView r2 = (com.ots.core.utils.customview.textview.AppTextView) r2
            r3 = 1
            r3 = r0[r3]
            com.ots.core.utils.customview.textview.AppTextView r3 = (com.ots.core.utils.customview.textview.AppTextView) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.E = r2
            r5 = 0
            r5 = r0[r5]
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            r5.setTag(r1)
            r5 = 3
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.f20994z = r5
            r5.setTag(r1)
            r5 = 4
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.A = r5
            r5.setTag(r1)
            r5 = 5
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.B = r5
            r5.setTag(r1)
            r5 = 6
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.C = r5
            r5.setTag(r1)
            r5 = 7
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.D = r5
            r5.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r5 = r4.f20953w
            r5.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r5 = r4.f20954x
            r5.setTag(r1)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.b5.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AuctionResult auctionResult;
        Long l10;
        Long l11;
        Long l12;
        String str7;
        synchronized (this) {
            j10 = this.E;
            this.E = 0;
        }
        a aVar = this.f20955y;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str8 = null;
        if (i10 != 0) {
            if (aVar != null) {
                auctionResult = aVar.f23043a;
                Long minPrice = auctionResult.getMinPrice();
                if (minPrice != null) {
                    str5 = b0.t(NumberFormat.getNumberInstance(Locale.GERMANY), minPrice.longValue(), new StringBuilder(), " đ");
                } else {
                    str5 = null;
                }
                str3 = aVar.c();
                str2 = aVar.b() + " - " + aVar.a();
                Long maxPrice = aVar.f23043a.getMaxPrice();
                if (maxPrice != null) {
                    str4 = b0.t(NumberFormat.getNumberInstance(Locale.GERMANY), maxPrice.longValue(), new StringBuilder(), " đ");
                } else {
                    str4 = null;
                }
            } else {
                auctionResult = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
            }
            if (auctionResult != null) {
                l11 = auctionResult.getTotalFailedPlate();
                l10 = auctionResult.getTotalPlate();
                l12 = auctionResult.getTotalSuccessPlate();
            } else {
                l12 = null;
                l11 = null;
                l10 = null;
            }
            if (l11 != null) {
                str = l11.toString();
            } else {
                str = null;
            }
            if (l10 != null) {
                str7 = l10.toString();
            } else {
                str7 = null;
            }
            if (l12 != null) {
                str8 = l12.toString();
            }
            str6 = str8;
            str8 = str7;
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i10 != 0) {
            c.d(this.f20994z, str8);
            c.d(this.A, str);
            c.d(this.B, str6);
            c.d(this.C, str5);
            c.d(this.D, str4);
            c.d(this.f20953w, str3);
            c.d(this.f20954x, str2);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.E = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(a aVar) {
        this.f20955y = aVar;
        synchronized (this) {
            this.E |= 1;
        }
        f(3);
        t();
    }
}
