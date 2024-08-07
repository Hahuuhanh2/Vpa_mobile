package mg;

import android.util.SparseIntArray;
import com.ots.core.R$color;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import f0.b0;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import k1.a;
import n0.l;
import sk.j;
import ug.c;

/* compiled from: ItemAuctionDevelopmentBindingImpl */
public final class t4 extends s4 {
    public static final SparseIntArray I;
    public final AppTextView E;
    public final AppTextView F;
    public final AppTextView G;
    public long H = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(C0533R$id.rlStartIcon, 9);
        sparseIntArray.put(C0533R$id.rlEndIcon, 10);
        sparseIntArray.put(C0533R$id.rlDate, 11);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t4(d2.e r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = I
            r1 = 12
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r14, r15, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 8
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 11
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1 = 10
            r1 = r0[r1]
            r8 = r1
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r1 = 9
            r1 = r0[r1]
            r9 = r1
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            com.ots.core.utils.customview.textview.AppTextView r10 = (com.ots.core.utils.customview.textview.AppTextView) r10
            r1 = 2
            r1 = r0[r1]
            r11 = r1
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r1 = 1
            r1 = r0[r1]
            r12 = r1
            com.ots.core.utils.customview.textview.AppTextView r12 = (com.ots.core.utils.customview.textview.AppTextView) r12
            r3 = r13
            r4 = r14
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = -1
            r13.H = r3
            android.widget.ImageView r14 = r13.f21349w
            r14.setTag(r2)
            android.widget.ImageView r14 = r13.f21350x
            r14.setTag(r2)
            r14 = 0
            r14 = r0[r14]
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r14.setTag(r2)
            r14 = 5
            r14 = r0[r14]
            com.ots.core.utils.customview.textview.AppTextView r14 = (com.ots.core.utils.customview.textview.AppTextView) r14
            r13.E = r14
            r14.setTag(r2)
            r14 = 6
            r14 = r0[r14]
            com.ots.core.utils.customview.textview.AppTextView r14 = (com.ots.core.utils.customview.textview.AppTextView) r14
            r13.F = r14
            r14.setTag(r2)
            r14 = 7
            r14 = r0[r14]
            com.ots.core.utils.customview.textview.AppTextView r14 = (com.ots.core.utils.customview.textview.AppTextView) r14
            r13.G = r14
            r14.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r14 = r13.A
            r14.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r14 = r13.B
            r14.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r14 = r13.C
            r14.setTag(r2)
            int r14 = androidx.databinding.library.R$id.dataBinding
            r15.setTag(r14, r13)
            r13.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.t4.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        BiddingPrice biddingPrice;
        boolean z10;
        int i15;
        long j11;
        String str4;
        synchronized (this) {
            j10 = this.H;
            this.H = 0;
        }
        c cVar = this.D;
        int i16 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i16 != 0) {
            if (cVar != null) {
                int i17 = cVar.f23046b;
                if (i17 == 0) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                if (i17 == 0) {
                    i15 = C0529R$color.max_price_red;
                } else if (j.a(cVar.f23045a.getUserId(), cVar.f23047c)) {
                    i15 = 2131100275;
                } else {
                    i15 = R$color.dark_500;
                }
                StringBuilder sb2 = new StringBuilder();
                Long updateTime = cVar.f23045a.getUpdateTime();
                String str5 = "";
                if (updateTime != null) {
                    str4 = l.h(updateTime.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
                    if (str4 == null) {
                        str4 = str5;
                    }
                } else {
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append(" • ");
                Long updateTime2 = cVar.f23045a.getUpdateTime();
                if (updateTime2 != null) {
                    String h10 = l.h(updateTime2.longValue(), new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()));
                    if (h10 != null) {
                        str5 = h10;
                    }
                } else {
                    str5 = null;
                }
                sb2.append(str5);
                str3 = sb2.toString();
                biddingPrice = cVar.f23045a;
                Long price = biddingPrice.getPrice();
                if (price != null) {
                    str = b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), price.longValue(), new StringBuilder(), " đ");
                } else {
                    str = null;
                }
                if (cVar.f23046b == 0) {
                    i14 = C0529R$color.max_price_red;
                } else {
                    i14 = R$color.white_100;
                }
                z10 = j.a(cVar.f23045a.getUserId(), cVar.f23047c);
            } else {
                z10 = false;
                str3 = null;
                biddingPrice = null;
                str = null;
                i15 = 0;
                i10 = 0;
                i14 = 0;
            }
            if (i16 != 0) {
                if (z10) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j10 |= j11;
            }
            i13 = a.getColor(this.f8554e.getContext(), i15);
            i12 = a.getColor(this.f8554e.getContext(), i14);
            if (z10) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            if (biddingPrice != null) {
                str2 = biddingPrice.getAuctionCode();
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
            str3 = null;
            i12 = 0;
            i13 = 0;
            str = null;
            i11 = 0;
            i10 = 0;
        }
        if ((j10 & 3) != 0) {
            this.f21349w.setVisibility(i11);
            this.f21350x.setVisibility(i11);
            e2.c.d(this.E, str);
            e2.c.b(this.E, i12);
            float f10 = (float) i10;
            e2.c.c(this.E, f10);
            e2.c.d(this.F, str2);
            this.F.setTextColor(i13);
            e2.c.d(this.G, str3);
            e2.c.d(this.A, str2);
            this.A.setTextColor(i13);
            e2.c.d(this.B, str3);
            e2.c.c(this.C, f10);
            e2.c.b(this.C, i12);
            e2.c.d(this.C, str);
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

    public final void v(c cVar) {
        this.D = cVar;
        synchronized (this) {
            this.H |= 1;
        }
        f(3);
        t();
    }
}
