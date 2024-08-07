package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityPlateSelectionBindingImpl */
public final class t0 extends s0 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.rvPlate, 2);
        sparseIntArray.put(C0533R$id.llFunction, 3);
        sparseIntArray.put(2131361937, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t0(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = B
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 3
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 0
            r1 = r0[r1]
            r7 = r1
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r1 = 1
            r0 = r0[r1]
            if (r0 == 0) goto L_0x002c
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            r9 = r0
            goto L_0x002d
        L_0x002c:
            r9 = r2
        L_0x002d:
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = -1
            r10.A = r0
            android.widget.RelativeLayout r11 = r10.f21341x
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.t0.<init>(d2.e, android.view.View):void");
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
