package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: FragmentStepOneBindingImpl */
public final class x3 extends w3 {
    public static final SparseIntArray C;
    public long B = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(2131361926, 2);
        sparseIntArray.put(C0533R$id.tvPage, 3);
        sparseIntArray.put(C0533R$id.tvQuestion, 4);
        sparseIntArray.put(C0533R$id.radioGroup, 5);
        sparseIntArray.put(C0533R$id.radioButton1, 6);
        sparseIntArray.put(C0533R$id.radioButton2, 7);
        sparseIntArray.put(C0533R$id.button, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x3(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = C
            r1 = 9
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r1 = 8
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 0
            r1 = r0[r1]
            r8 = r1
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r1 = 6
            r1 = r0[r1]
            r9 = r1
            android.widget.RadioButton r9 = (android.widget.RadioButton) r9
            r1 = 7
            r1 = r0[r1]
            r10 = r1
            android.widget.RadioButton r10 = (android.widget.RadioButton) r10
            r1 = 5
            r1 = r0[r1]
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 3
            r1 = r0[r1]
            com.ots.base.utils.customview.GradientTextView r1 = (com.ots.base.utils.customview.GradientTextView) r1
            r1 = 4
            r0 = r0[r1]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r11.B = r0
            android.widget.RelativeLayout r12 = r11.f21416y
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.x3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.B = 0;
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
            this.B = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
