package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivitySearchingBindingImpl */
public final class m1 extends l1 {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f21213z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.rlFilter, 2);
        sparseIntArray.put(C0533R$id.searchView, 3);
        sparseIntArray.put(C0533R$id.btnFilter, 4);
        sparseIntArray.put(C0533R$id.rvSearching, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m1(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = A
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r1 = 0
            r1 = r0[r1]
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r1 = 2
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1 = 5
            r1 = r0[r1]
            com.ots.core.base.BaseRecyclerView r1 = (com.ots.core.base.BaseRecyclerView) r1
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r1 = 1
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0030
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            r8 = r0
            goto L_0x0031
        L_0x0030:
            r8 = r2
        L_0x0031:
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = -1
            r9.f21213z = r0
            android.widget.LinearLayout r10 = r9.f21161x
            r10.setTag(r2)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.m1.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21213z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21213z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21213z = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
