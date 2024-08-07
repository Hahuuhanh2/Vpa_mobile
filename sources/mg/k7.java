package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ItemVehicleTypeBindingImpl */
public final class k7 extends j7 {
    public static final SparseIntArray B;
    public long A = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(2131362339, 1);
        sparseIntArray.put(C0533R$id.imvIcon, 2);
        sparseIntArray.put(C0533R$id.tvName, 3);
        sparseIntArray.put(C0533R$id.indicator, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k7(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = B
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.A = r3
            r11 = 0
            r11 = r0[r11]
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.k7.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.A = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.A = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
