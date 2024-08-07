package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.home.data.api.response.Plate;
import e2.c;
import qh.d;

/* compiled from: ItemAnnouncementPlateBindingImpl */
public final class r4 extends q4 {
    public static final SparseIntArray D;
    public long C = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(C0533R$id.btnRegister, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r4(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = D
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.ots.core.utils.customview.textview.AppTitleTextView r8 = (com.ots.core.utils.customview.textview.AppTitleTextView) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r1 = 2
            r1 = r0[r1]
            r10 = r1
            com.ots.core.utils.customview.textview.AppTextView r10 = (com.ots.core.utils.customview.textview.AppTextView) r10
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = -1
            r11.C = r3
            r12 = 0
            r12 = r0[r12]
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r12.setTag(r2)
            android.widget.TextView r12 = r11.f21312x
            r12.setTag(r2)
            com.ots.core.utils.customview.textview.AppTitleTextView r12 = r11.f21313y
            r12.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r12 = r11.f21314z
            r12.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r12 = r11.A
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.r4.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        Plate plate;
        Integer num;
        synchronized (this) {
            j10 = this.C;
            this.C = 0;
        }
        d dVar = this.B;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str5 = null;
        if (i10 != 0) {
            if (dVar != null) {
                plate = dVar.f22758b;
                str4 = dVar.a();
            } else {
                plate = null;
                str4 = null;
            }
            if (plate != null) {
                str2 = plate.getProvinceName();
                str = plate.getVehicleType();
                num = plate.getTotalInterested();
            } else {
                num = null;
                str2 = null;
                str = null;
            }
            if (num != null) {
                str5 = num.toString();
            }
            str3 = str5;
            str5 = str4;
        } else {
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i10 != 0) {
            c.d(this.f21312x, str5);
            c.d(this.f21313y, str2);
            c.d(this.f21314z, str3);
            c.d(this.A, str);
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
            this.C = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(d dVar) {
        this.B = dVar;
        synchronized (this) {
            this.C |= 1;
        }
        f(3);
        t();
    }
}
