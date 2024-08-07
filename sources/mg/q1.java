package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivitySettingBindingImpl */
public final class q1 extends p1 {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f21304z;

    /* renamed from: y  reason: collision with root package name */
    public long f21305y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21304z = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(2131361986, 2);
        sparseIntArray.put(2131362370, 3);
        sparseIntArray.put(2131362832, 4);
        sparseIntArray.put(C0533R$id.cbFinger, 5);
        sparseIntArray.put(2131362198, 6);
        sparseIntArray.put(C0533R$id.tvContent, 7);
        sparseIntArray.put(C0533R$id.f18007cb, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q1(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f21304z
            r1 = 9
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            com.google.android.material.card.MaterialCardView r1 = (com.google.android.material.card.MaterialCardView) r1
            r1 = 8
            r1 = r0[r1]
            com.google.android.material.materialswitch.MaterialSwitch r1 = (com.google.android.material.materialswitch.MaterialSwitch) r1
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.materialswitch.MaterialSwitch r1 = (com.google.android.material.materialswitch.MaterialSwitch) r1
            r3 = 6
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 3
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 1
            r3 = r0[r3]
            if (r3 == 0) goto L_0x002f
            android.view.View r3 = (android.view.View) r3
            h1.a r3 = h1.a.a(r3)
            goto L_0x0030
        L_0x002f:
            r3 = r2
        L_0x0030:
            r4 = 7
            r4 = r0[r4]
            com.ots.core.utils.customview.textview.AppTextView r4 = (com.ots.core.utils.customview.textview.AppTextView) r4
            r4 = 4
            r4 = r0[r4]
            com.ots.core.utils.customview.textview.AppTextView r4 = (com.ots.core.utils.customview.textview.AppTextView) r4
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.f21305y = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.q1.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21305y = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21305y != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21305y = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
