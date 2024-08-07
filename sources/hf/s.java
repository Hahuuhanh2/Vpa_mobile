package hf;

import android.util.SparseIntArray;
import com.ots.core.R$id;

/* compiled from: ItemSelectionBindingImpl */
public final class s extends r {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f10812z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R$id.container, 1);
        sparseIntArray.put(R$id.radio, 2);
        sparseIntArray.put(R$id.checkBox, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = A
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            com.ots.core.utils.customview.textview.AppTextView r8 = (com.ots.core.utils.customview.textview.AppTextView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = -1
            r9.f10812z = r3
            r10 = 0
            r10 = r0[r10]
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r10.setTag(r2)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.s.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f10812z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f10812z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f10812z = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
