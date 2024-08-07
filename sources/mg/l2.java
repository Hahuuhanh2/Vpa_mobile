package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: DialogAuctionProgressBindingImpl */
public final class l2 extends k2 {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f21163z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(C0533R$id.lnTitle, 1);
        sparseIntArray.put(2131361936, 2);
        sparseIntArray.put(2131362284, 3);
        sparseIntArray.put(C0533R$id.rcv, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l2(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = A
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r3 = 3
            r3 = r0[r3]
            com.google.android.material.divider.MaterialDivider r3 = (com.google.android.material.divider.MaterialDivider) r3
            r3 = 1
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3 = 4
            r3 = r0[r3]
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.f21163z = r3
            r6 = 0
            r6 = r0[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.l2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21163z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21163z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21163z = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
