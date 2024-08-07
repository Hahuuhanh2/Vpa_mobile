package hf;

import android.util.SparseIntArray;
import com.ots.core.R$id;

/* compiled from: WidgetBaseRecyclerViewBindingImpl */
public final class a0 extends z {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R$id.recyclerView, 11);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(d2.e r11, android.view.View[] r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r6 = B
            r0 = 12
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r8 = 0
            r9 = r8
        L_0x0008:
            int r0 = r12.length
            if (r9 >= r0) goto L_0x0018
            r1 = r12[r9]
            r5 = 1
            r3 = 0
            r0 = r11
            r2 = r7
            r4 = r6
            d2.l.n(r0, r1, r2, r3, r4, r5)
            int r9 = r9 + 1
            goto L_0x0008
        L_0x0018:
            r2 = r12[r8]
            r0 = 3
            r0 = r7[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 11
            r0 = r7[r0]
            r4 = r0
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = r7[r8]
            r5 = r0
            com.facebook.shimmer.ShimmerFrameLayout r5 = (com.facebook.shimmer.ShimmerFrameLayout) r5
            r0 = 2
            r0 = r7[r0]
            r6 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r10.A = r0
            android.widget.LinearLayout r0 = r10.f10823w
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            r0 = 4
            r0 = r7[r0]
            if (r0 == 0) goto L_0x0053
            android.view.View r0 = (android.view.View) r0
            a1.c.b(r0)
        L_0x0053:
            r0 = 5
            r0 = r7[r0]
            if (r0 == 0) goto L_0x005d
            android.view.View r0 = (android.view.View) r0
            a1.c.b(r0)
        L_0x005d:
            r0 = 6
            r0 = r7[r0]
            if (r0 == 0) goto L_0x0067
            android.view.View r0 = (android.view.View) r0
            a1.c.b(r0)
        L_0x0067:
            r0 = 7
            r0 = r7[r0]
            if (r0 == 0) goto L_0x0071
            android.view.View r0 = (android.view.View) r0
            a1.c.b(r0)
        L_0x0071:
            r0 = 8
            r0 = r7[r0]
            if (r0 == 0) goto L_0x007c
            android.view.View r0 = (android.view.View) r0
            a1.c.b(r0)
        L_0x007c:
            r0 = 9
            r0 = r7[r0]
            if (r0 == 0) goto L_0x0087
            android.view.View r0 = (android.view.View) r0
            a1.c.b(r0)
        L_0x0087:
            r0 = 10
            r0 = r7[r0]
            if (r0 == 0) goto L_0x0092
            android.view.View r0 = (android.view.View) r0
            a1.c.b(r0)
        L_0x0092:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r10.f10825y
            r0.setTag(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r10.f10826z
            r0.setTag(r1)
            int r0 = r12.length
        L_0x009d:
            if (r8 >= r0) goto L_0x00a9
            r1 = r12[r8]
            int r2 = androidx.databinding.library.R$id.dataBinding
            r1.setTag(r2, r10)
            int r8 = r8 + 1
            goto L_0x009d
        L_0x00a9:
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.a0.<init>(d2.e, android.view.View[]):void");
    }

    public final void h() {
        synchronized (this) {
            this.A = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.A = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
