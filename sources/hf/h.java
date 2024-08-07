package hf;

import android.util.SparseIntArray;
import com.ots.core.R$id;

/* compiled from: EmptyStateLayoutBindingImpl */
public final class h extends g {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f10792z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R$id.emptyState, 1);
        sparseIntArray.put(R$id.emptyState_background, 2);
        sparseIntArray.put(R$id.txt_title, 3);
        sparseIntArray.put(R$id.txt_description, 4);
        sparseIntArray.put(R$id.btnActionOne, 5);
        sparseIntArray.put(R$id.btnActionTow, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = A
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1 = 6
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = -1
            r9.f10792z = r3
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r10.setTag(r2)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.h.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f10792z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f10792z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f10792z = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
