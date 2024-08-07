package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: TimePickerBindingImpl */
public final class s7 extends r7 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(C0533R$id.legendLayout, 2);
        sparseIntArray.put(C0533R$id.ivClose, 3);
        sparseIntArray.put(C0533R$id.ivBack, 4);
        sparseIntArray.put(C0533R$id.tvDate, 5);
        sparseIntArray.put(C0533R$id.ivNext, 6);
        sparseIntArray.put(C0533R$id.exOneCalendar, 7);
        sparseIntArray.put(C0533R$id.button, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s7(d2.e r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = F
            r1 = 9
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r14, r15, r1, r2, r0)
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            com.kizitonwose.calendar.view.CalendarView r7 = (com.kizitonwose.calendar.view.CalendarView) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r1 = 6
            r1 = r0[r1]
            r10 = r1
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r1 = 2
            r1 = r0[r1]
            if (r1 == 0) goto L_0x003a
            android.view.View r1 = (android.view.View) r1
            z.j r3 = new z.j
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r4 = 17
            r3.<init>(r1, r4)
            r11 = r3
            goto L_0x003b
        L_0x003a:
            r11 = r2
        L_0x003b:
            r1 = 5
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r3 = r13
            r4 = r14
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = -1
            r13.E = r3
            r14 = 0
            r14 = r0[r14]
            com.google.android.material.card.MaterialCardView r14 = (com.google.android.material.card.MaterialCardView) r14
            r14.setTag(r2)
            r14 = 1
            r14 = r0[r14]
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r14.setTag(r2)
            int r14 = androidx.databinding.library.R$id.dataBinding
            r15.setTag(r14, r13)
            r13.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.s7.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.E = 0;
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
            this.E = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
