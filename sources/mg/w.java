package mg;

import android.util.SparseIntArray;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.AuctionResult;
import e2.c;
import f0.b0;
import java.text.NumberFormat;
import java.util.Locale;
import ug.a;

/* compiled from: ActivityDetailAuctionResultBindingImpl */
public final class w extends v {
    public static final SparseIntArray I;
    public final AppTextView B;
    public final AppTextView C;
    public final AppTextView D;
    public final AppTextView E;
    public final AppTextView F;
    public final GradientTextView G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(2131362720, 8);
        sparseIntArray.put(C0533R$id.lnResult, 9);
        sparseIntArray.put(C0533R$id.searchView, 10);
        sparseIntArray.put(C0533R$id.rvAnnouncement, 11);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = I
            r1 = 12
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 9
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 0
            r1 = r0[r1]
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r1 = 11
            r1 = r0[r1]
            r7 = r1
            com.ots.core.base.BaseRecyclerView r7 = (com.ots.core.base.BaseRecyclerView) r7
            r1 = 10
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.SearchView r8 = (androidx.appcompat.widget.SearchView) r8
            r1 = 8
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0031
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            r9 = r1
            goto L_0x0032
        L_0x0031:
            r9 = r2
        L_0x0032:
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.H = r3
            android.widget.LinearLayout r11 = r10.f21393w
            r11.setTag(r2)
            r11 = 1
            r11 = r0[r11]
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r11.setTag(r2)
            r11 = 2
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.B = r11
            r11.setTag(r2)
            r11 = 3
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.C = r11
            r11.setTag(r2)
            r11 = 4
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.D = r11
            r11.setTag(r2)
            r11 = 5
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.E = r11
            r11.setTag(r2)
            r11 = 6
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.F = r11
            r11.setTag(r2)
            r11 = 7
            r11 = r0[r11]
            com.ots.base.utils.customview.GradientTextView r11 = (com.ots.base.utils.customview.GradientTextView) r11
            r10.G = r11
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.w.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AuctionResult auctionResult;
        String str6;
        Long l10;
        Long l11;
        Long l12;
        synchronized (this) {
            j10 = this.H;
            this.H = 0;
        }
        a aVar = this.A;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str7 = null;
        if (i10 != 0) {
            if (aVar != null) {
                StringBuilder q10 = android.support.v4.media.a.q("Kết quả phiên đấu giá ngày ");
                q10.append(aVar.c());
                q10.append("\nThời gian từ ");
                q10.append(aVar.b());
                q10.append(" đến ");
                q10.append(aVar.a());
                str6 = q10.toString();
                auctionResult = aVar.f23043a;
                Long minPrice = auctionResult.getMinPrice();
                if (minPrice != null) {
                    str3 = b0.t(NumberFormat.getNumberInstance(Locale.GERMANY), minPrice.longValue(), new StringBuilder(), " đ");
                } else {
                    str3 = null;
                }
                Long maxPrice = aVar.f23043a.getMaxPrice();
                if (maxPrice != null) {
                    str4 = b0.t(NumberFormat.getNumberInstance(Locale.GERMANY), maxPrice.longValue(), new StringBuilder(), " đ");
                } else {
                    str4 = null;
                }
            } else {
                str6 = null;
                auctionResult = null;
                str4 = null;
                str3 = null;
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
                str2 = l11.toString();
            } else {
                str2 = null;
            }
            if (l10 != null) {
                str = l10.toString();
            } else {
                str = null;
            }
            if (l12 != null) {
                str7 = l12.toString();
            }
            String str8 = str6;
            str5 = str7;
            str7 = str8;
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i10 != 0) {
            c.d(this.B, str7);
            c.d(this.C, str);
            c.d(this.D, str2);
            c.d(this.E, str5);
            c.d(this.F, str3);
            c.d(this.G, str4);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.H != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.H = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(a aVar) {
        this.A = aVar;
        synchronized (this) {
            this.H |= 1;
        }
        f(3);
        t();
    }
}
