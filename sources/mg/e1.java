package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityRegisterAuctionListBindingImpl */
public final class e1 extends d1 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.searchView, 2);
        sparseIntArray.put(C0533R$id.btnFilter, 3);
        sparseIntArray.put(C0533R$id.tvProvince, 4);
        sparseIntArray.put(C0533R$id.rcvPlate, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e1(d2.e r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = D
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r13, r14, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r1 = 0
            r1 = r0[r1]
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            com.ots.core.base.BaseRecyclerView r8 = (com.ots.core.base.BaseRecyclerView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.SearchView r9 = (androidx.appcompat.widget.SearchView) r9
            r1 = 1
            r1 = r0[r1]
            if (r1 == 0) goto L_0x002d
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            r10 = r1
            goto L_0x002e
        L_0x002d:
            r10 = r2
        L_0x002e:
            r1 = 4
            r0 = r0[r1]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r12.C = r0
            android.widget.LinearLayout r13 = r12.f21020x
            r13.setTag(r2)
            int r13 = androidx.databinding.library.R$id.dataBinding
            r14.setTag(r13, r12)
            r12.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.e1.<init>(d2.e, android.view.View):void");
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
