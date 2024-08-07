package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityReadQrCodeBindingImpl */
public final class a1 extends z0 {

    /* renamed from: y  reason: collision with root package name */
    public static final SparseIntArray f20934y;

    /* renamed from: x  reason: collision with root package name */
    public long f20935x = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20934y = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(2131361926, 2);
        sparseIntArray.put(C0533R$id.tvQuestion, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a1(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f20934y
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3 = 3
            r3 = r0[r3]
            com.ots.core.utils.customview.textview.AppTextView r3 = (com.ots.core.utils.customview.textview.AppTextView) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.f20935x = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.a1.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f20935x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f20935x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f20935x = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
