package mg;

import android.util.SparseIntArray;
import com.ots.core.R$color;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.history.data.model.DetailAuctionHistory;
import f0.b0;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import k1.a;
import lh.c;
import n0.l;
import sk.j;

/* compiled from: ItemAuctionProgressBindingImpl */
public final class z4 extends y4 {
    public static final SparseIntArray C;
    public long B = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(C0533R$id.rlDate, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z4(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = C
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 5
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.ots.core.utils.customview.textview.AppTextView r7 = (com.ots.core.utils.customview.textview.AppTextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            com.ots.core.utils.customview.textview.AppTextView r8 = (com.ots.core.utils.customview.textview.AppTextView) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.B = r3
            android.widget.ImageView r11 = r10.f21498w
            r11.setTag(r2)
            r11 = 0
            r11 = r0[r11]
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r11.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r11 = r10.f21499x
            r11.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r11 = r10.f21500y
            r11.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r11 = r10.f21501z
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z4.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        CharSequence charSequence;
        String str2;
        int i14;
        boolean z10;
        int i15;
        int i16;
        String str3;
        DetailAuctionHistory detailAuctionHistory;
        int i17;
        long j11;
        int i18;
        int i19;
        DetailAuctionHistory detailAuctionHistory2;
        String str4;
        synchronized (this) {
            j10 = this.B;
            this.B = 0;
        }
        c cVar = this.A;
        long j12 = 3;
        int i20 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i20 != 0) {
            if (cVar != null) {
                DetailAuctionHistory detailAuctionHistory3 = cVar.f20853a;
                int i21 = cVar.f20854b;
                if (i21 == 0) {
                    i18 = 10;
                } else {
                    i18 = 0;
                }
                int i22 = C0529R$color.max_price_red;
                if (i21 == 0) {
                    i19 = 2131100442;
                } else if (j.a(detailAuctionHistory3.getUserId(), cVar.f20855c)) {
                    i19 = 2131100275;
                } else {
                    i19 = R$color.dark_500;
                }
                if (cVar.f20854b != 0) {
                    i22 = R$color.white_100;
                }
                z10 = j.a(cVar.f20853a.getUserId(), cVar.f20855c);
                StringBuilder sb2 = new StringBuilder();
                Long auctionDate = cVar.f20853a.getAuctionDate();
                String str5 = "";
                if (auctionDate != null) {
                    detailAuctionHistory2 = detailAuctionHistory3;
                    str4 = l.h(auctionDate.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
                    if (str4 == null) {
                        str4 = str5;
                    }
                } else {
                    detailAuctionHistory2 = detailAuctionHistory3;
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append(" • ");
                Long auctionDate2 = cVar.f20853a.getAuctionDate();
                if (auctionDate2 != null) {
                    String h10 = l.h(auctionDate2.longValue(), new SimpleDateFormat("HH:mm:ss", Locale.getDefault()));
                    if (h10 != null) {
                        str5 = h10;
                    }
                } else {
                    str5 = null;
                }
                sb2.append(str5);
                String sb3 = sb2.toString();
                Long auctionPrice = cVar.f20853a.getAuctionPrice();
                if (auctionPrice != null) {
                    str2 = b0.t(NumberFormat.getNumberInstance(Locale.GERMANY), auctionPrice.longValue(), new StringBuilder(), " đ");
                } else {
                    str2 = null;
                }
                i14 = i22;
                i15 = i18;
                i16 = i19;
                str3 = sb3;
                detailAuctionHistory = detailAuctionHistory2;
            } else {
                str2 = null;
                z10 = false;
                i16 = 0;
                i15 = 0;
                i14 = 0;
                str3 = null;
                detailAuctionHistory = null;
            }
            if (i20 != 0) {
                if (z10) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j10 |= j11;
            }
            if (detailAuctionHistory != null) {
                charSequence = detailAuctionHistory.getAuctionCode();
            } else {
                charSequence = null;
            }
            i13 = a.getColor(this.f8554e.getContext(), i16);
            int color = a.getColor(this.f8554e.getContext(), i14);
            if (z10) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            int i23 = i15;
            str = str3;
            int i24 = i17;
            i12 = color;
            j12 = 3;
            i10 = i23;
            i11 = i24;
        } else {
            str2 = null;
            i13 = 0;
            i10 = 0;
            str = null;
            charSequence = null;
            i11 = 0;
            i12 = 0;
        }
        if ((j10 & j12) != 0) {
            this.f21498w.setVisibility(i11);
            e2.c.d(this.f21499x, charSequence);
            this.f21499x.setTextColor(i13);
            e2.c.d(this.f21500y, str);
            e2.c.d(this.f21501z, str2);
            e2.c.b(this.f21501z, i12);
            e2.c.c(this.f21501z, (float) i10);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.B = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(c cVar) {
        this.A = cVar;
        synchronized (this) {
            this.B |= 1;
        }
        f(3);
        t();
    }
}
