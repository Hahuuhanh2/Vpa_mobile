package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: FragmentStepFourBindingImpl */
public final class v3 extends u3 {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f21402z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(2131361926, 2);
        sparseIntArray.put(C0533R$id.tvPage, 3);
        sparseIntArray.put(C0533R$id.llButton, 4);
        sparseIntArray.put(C0533R$id.btnLater, 5);
        sparseIntArray.put(C0533R$id.btnVerify, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v3(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = A
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1 = 1
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 3
            r1 = r0[r1]
            com.ots.base.utils.customview.GradientTextView r1 = (com.ots.base.utils.customview.GradientTextView) r1
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = -1
            r9.f21402z = r3
            r10 = 0
            r10 = r0[r10]
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r10.setTag(r2)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21402z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21402z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21402z = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
