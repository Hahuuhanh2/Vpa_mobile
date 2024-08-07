package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityVerifyBindingImpl */
public final class z1 extends y1 {
    public static final SparseIntArray F;
    public long E = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(2131361926, 2);
        sparseIntArray.put(2131361936, 3);
        sparseIntArray.put(C0533R$id.lnFontFace, 4);
        sparseIntArray.put(C0533R$id.ivFront, 5);
        sparseIntArray.put(C0533R$id.btnFront, 6);
        sparseIntArray.put(C0533R$id.backSide, 7);
        sparseIntArray.put(C0533R$id.ivBack, 8);
        sparseIntArray.put(C0533R$id.btnBackSide, 9);
        sparseIntArray.put(C0533R$id.button, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z1(d2.e r15, android.view.View r16) {
        /*
            r14 = this;
            r11 = r14
            r12 = r16
            android.util.SparseIntArray r0 = F
            r1 = 11
            r13 = 0
            r2 = r15
            java.lang.Object[] r0 = d2.l.o(r15, r12, r1, r13, r0)
            r1 = 7
            r1 = r0[r1]
            r3 = r1
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r1 = 2
            r1 = r0[r1]
            r4 = r1
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r1 = 9
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 3
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r1 = 6
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 10
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 8
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r1 = 0
            r1 = r0[r1]
            r10 = r1
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r1 = 1
            r0 = r0[r1]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = r14
            r1 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r11.E = r0
            android.widget.RelativeLayout r0 = r11.D
            r0.setTag(r13)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r0, r14)
            r14.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z1.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.E = 0;
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
            this.E = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
