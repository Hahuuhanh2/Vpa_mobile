package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: WidgetSearchViewBindingImpl */
public final class z7 extends y7 {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f21542z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(C0533R$id.ivSearch, 1);
        sparseIntArray.put(2131362101, 2);
        sparseIntArray.put(C0533R$id.ivClose, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z7(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = A
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.EditText r6 = (android.widget.EditText) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = -1
            r9.f21542z = r3
            r10 = 0
            r10 = r0[r10]
            com.google.android.material.card.MaterialCardView r10 = (com.google.android.material.card.MaterialCardView) r10
            r10.setTag(r2)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z7.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21542z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21542z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21542z = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
