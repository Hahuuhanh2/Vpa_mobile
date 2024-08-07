package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityWelcomeBindingImpl */
public final class d2 extends c2 {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f21023z;

    /* renamed from: y  reason: collision with root package name */
    public long f21024y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21023z = sparseIntArray;
        sparseIntArray.put(2131362806, 1);
        sparseIntArray.put(2131362781, 2);
        sparseIntArray.put(C0533R$id.btnGoTo, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d2(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f21023z
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r3 = 0
            r3 = r0[r3]
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r4 = 2
            r4 = r0[r4]
            com.ots.core.utils.customview.textview.AppTextView r4 = (com.ots.core.utils.customview.textview.AppTextView) r4
            r4 = 1
            r0 = r0[r4]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r5.<init>(r6, r7, r1, r3)
            r0 = -1
            r5.f21024y = r0
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.f21003x
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21024y = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21024y != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21024y = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
