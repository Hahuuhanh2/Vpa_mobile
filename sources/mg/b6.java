package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import e2.c;
import qh.d;

/* compiled from: ItemLicensePlateBindingImpl */
public final class b6 extends a6 {
    public static final SparseIntArray F;
    public long E = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(C0533R$id.tvTotalInterested, 3);
        sparseIntArray.put(C0533R$id.btnCart, 4);
        sparseIntArray.put(C0533R$id.btnRegister, 5);
        sparseIntArray.put(C0533R$id.tvMore, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b6(d2.e r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = F
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r14, r15, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r1 = 5
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 0
            r1 = r0[r1]
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1 = 6
            r1 = r0[r1]
            r9 = r1
            com.ots.base.utils.customview.GradientTextView r9 = (com.ots.base.utils.customview.GradientTextView) r9
            r1 = 1
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 3
            r1 = r0[r1]
            r11 = r1
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r1 = 2
            r0 = r0[r1]
            r12 = r0
            com.ots.core.utils.customview.textview.AppTextView r12 = (com.ots.core.utils.customview.textview.AppTextView) r12
            r3 = r13
            r4 = r14
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.E = r0
            android.widget.LinearLayout r14 = r13.f20958y
            r14.setTag(r2)
            android.widget.TextView r14 = r13.A
            r14.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r14 = r13.C
            r14.setTag(r2)
            int r14 = androidx.databinding.library.R$id.dataBinding
            r15.setTag(r14, r13)
            r13.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.b6.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.E;
            this.E = 0;
        }
        d dVar = this.D;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str2 = null;
        if (i10 == 0 || dVar == null) {
            str = null;
        } else {
            str2 = dVar.a();
            str = dVar.f22758b.getVehicleType() + " - " + dVar.f22758b.getProvinceName();
        }
        if (i10 != 0) {
            c.d(this.A, str2);
            c.d(this.C, str);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.E = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(d dVar) {
        this.D = dVar;
        synchronized (this) {
            this.E |= 1;
        }
        f(3);
        t();
    }
}
