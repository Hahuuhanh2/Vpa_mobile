package mg;

import android.util.SparseIntArray;
import bi.a;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import e2.c;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: ActivityPaymentBindingImpl */
public final class r0 extends q0 {
    public static final SparseIntArray F;
    public final AppTextView B;
    public final AppTextView C;
    public final GradientTextView D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(2131362720, 4);
        sparseIntArray.put(C0533R$id.tabLayout, 5);
        sparseIntArray.put(C0533R$id.viewPager, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r0(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = F
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r1 = 5
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.tabs.TabLayout r7 = (com.google.android.material.tabs.TabLayout) r7
            r1 = 4
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0021
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            r8 = r1
            goto L_0x0022
        L_0x0021:
            r8 = r2
        L_0x0022:
            r1 = 6
            r1 = r0[r1]
            r9 = r1
            androidx.viewpager2.widget.ViewPager2 r9 = (androidx.viewpager2.widget.ViewPager2) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.E = r3
            android.widget.LinearLayout r11 = r10.f21300w
            r11.setTag(r2)
            r11 = 1
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.B = r11
            r11.setTag(r2)
            r11 = 2
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.C = r11
            r11.setTag(r2)
            r11 = 3
            r11 = r0[r11]
            com.ots.base.utils.customview.GradientTextView r11 = (com.ots.base.utils.customview.GradientTextView) r11
            r10.D = r11
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.r0.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j10 = this.E;
            this.E = 0;
        }
        a aVar = this.A;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str5 = null;
        if (i10 == 0 || aVar == null) {
            str2 = null;
            str = null;
        } else {
            Double totalAmount = aVar.f19165a.getTotalAmount();
            if (totalAmount != null) {
                double doubleValue = totalAmount.doubleValue();
                NumberFormat numberInstance = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
                str3 = numberInstance.format(doubleValue) + " đ";
            } else {
                str3 = null;
            }
            Double deposit = aVar.f19165a.getDeposit();
            if (deposit != null) {
                double doubleValue2 = deposit.doubleValue();
                NumberFormat numberInstance2 = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
                str4 = numberInstance2.format(doubleValue2) + " đ";
            } else {
                str4 = null;
            }
            Double fee = aVar.f19165a.getFee();
            if (fee != null) {
                double doubleValue3 = fee.doubleValue();
                NumberFormat numberInstance3 = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
                str5 = numberInstance3.format(doubleValue3) + " đ";
            }
            String str6 = str3;
            str2 = str5;
            str5 = str4;
            str = str6;
        }
        if (i10 != 0) {
            c.d(this.B, str5);
            c.d(this.C, str2);
            c.d(this.D, str);
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
        this.A = aVar;
        synchronized (this) {
            this.E |= 1;
        }
        f(3);
        t();
    }
}
