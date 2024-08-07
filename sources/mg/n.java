package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityAuctionResultBindingImpl */
public final class n extends m {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.rlFilter, 2);
        sparseIntArray.put(C0533R$id.searchView, 3);
        sparseIntArray.put(C0533R$id.btnFilter, 4);
        sparseIntArray.put(C0533R$id.rvAnnouncement, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = C
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r1 = 0
            r1 = r0[r1]
            r7 = r1
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r1 = 2
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            com.ots.core.base.BaseRecyclerView r8 = (com.ots.core.base.BaseRecyclerView) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.SearchView r9 = (androidx.appcompat.widget.SearchView) r9
            r1 = 1
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0032
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            r10 = r0
            goto L_0x0033
        L_0x0032:
            r10 = r2
        L_0x0033:
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r11.B = r0
            android.widget.RelativeLayout r12 = r11.f21180x
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.n.<init>(d2.e, android.view.View):void");
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
