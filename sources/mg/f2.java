package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: AddressSelectDialogBindingImpl */
public final class f2 extends e2 {
    public static final SparseIntArray C;
    public long B = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131362022, 1);
        sparseIntArray.put(2131362806, 2);
        sparseIntArray.put(C0533R$id.searchView, 3);
        sparseIntArray.put(2131362539, 4);
        sparseIntArray.put(C0533R$id.emptyView, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f2(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = C
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            com.ots.base.utils.customview.EmptyView r6 = (com.ots.base.utils.customview.EmptyView) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.SearchView r8 = (androidx.appcompat.widget.SearchView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.B = r3
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.f2.<init>(d2.e, android.view.View):void");
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
