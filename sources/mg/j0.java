package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityMyDocumentBindingImpl */
public final class j0 extends i0 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.rlFilter, 2);
        sparseIntArray.put(C0533R$id.searchView, 3);
        sparseIntArray.put(C0533R$id.btnFilter, 4);
        sparseIntArray.put(C0533R$id.tvFilter, 5);
        sparseIntArray.put(C0533R$id.rvDocument, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j0(d2.e r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = D
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r13, r14, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r1 = 0
            r1 = r0[r1]
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r1 = 2
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1 = 6
            r1 = r0[r1]
            r9 = r1
            com.ots.core.base.BaseRecyclerView r9 = (com.ots.core.base.BaseRecyclerView) r9
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            androidx.appcompat.widget.SearchView r7 = (androidx.appcompat.widget.SearchView) r7
            r1 = 1
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0032
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            r8 = r1
            goto L_0x0033
        L_0x0032:
            r8 = r2
        L_0x0033:
            r1 = 5
            r0 = r0[r1]
            r10 = r0
            com.ots.core.utils.customview.textview.AppTextView r10 = (com.ots.core.utils.customview.textview.AppTextView) r10
            r3 = r12
            r4 = r14
            r11 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r12.C = r0
            android.widget.LinearLayout r13 = r12.f21103x
            r13.setTag(r2)
            int r13 = androidx.databinding.library.R$id.dataBinding
            r14.setTag(r13, r12)
            r12.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j0.<init>(d2.e, android.view.View):void");
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
