package hf;

import android.util.SparseIntArray;
import com.ots.core.R$id;

/* compiled from: TimeDialogBindingImpl */
public final class y extends x {
    public static final SparseIntArray D;
    public long C = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R$id.yearView, 1);
        sparseIntArray.put(R$id.monthView, 2);
        sparseIntArray.put(R$id.dayView, 3);
        sparseIntArray.put(R$id.llConfirm, 4);
        sparseIntArray.put(R$id.tvCancel, 5);
        sparseIntArray.put(R$id.v_ui_line, 6);
        sparseIntArray.put(R$id.tvConfirm, 7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = D
            r1 = 8
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r1 = 4
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 7
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 6
            r1 = r0[r1]
            android.view.View r1 = (android.view.View) r1
            r1 = 1
            r1 = r0[r1]
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = -1
            r11.C = r3
            r12 = 0
            r12 = r0[r12]
            com.google.android.material.card.MaterialCardView r12 = (com.google.android.material.card.MaterialCardView) r12
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.y.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.C = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.C = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
