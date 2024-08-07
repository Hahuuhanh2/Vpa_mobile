package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityNotificationManagerBindingImpl */
public final class l0 extends k0 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.lnBody, 2);
        sparseIntArray.put(C0533R$id.tvReadAll, 3);
        sparseIntArray.put(C0533R$id.ivMore, 4);
        sparseIntArray.put(C0533R$id.rcv, 5);
        sparseIntArray.put(C0533R$id.lnEmpty, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = B
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 2
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 5
            r1 = r0[r1]
            r7 = r1
            com.ots.core.base.BaseRecyclerView r7 = (com.ots.core.base.BaseRecyclerView) r7
            r1 = 1
            r1 = r0[r1]
            if (r1 == 0) goto L_0x002b
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            r8 = r1
            goto L_0x002c
        L_0x002b:
            r8 = r2
        L_0x002c:
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            com.ots.base.utils.customview.GradientTextView r9 = (com.ots.base.utils.customview.GradientTextView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.A = r3
            r11 = 0
            r11 = r0[r11]
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.l0.<init>(d2.e, android.view.View):void");
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
            this.A = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
