package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: FragmentAwaitAuctionBindingImpl */
public final class f3 extends e3 {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f21059z;

    /* renamed from: y  reason: collision with root package name */
    public long f21060y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21059z = sparseIntArray;
        sparseIntArray.put(2131362806, 1);
        sparseIntArray.put(C0533R$id.rcv, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f3(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f21059z
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = 2
            r3 = r0[r3]
            com.ots.core.base.BaseRecyclerView r3 = (com.ots.core.base.BaseRecyclerView) r3
            r4 = 1
            r0 = r0[r4]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r5.<init>(r6, r7, r1, r3)
            r0 = -1
            r5.f21060y = r0
            android.widget.LinearLayout r6 = r5.f21042w
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.f3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21060y = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21060y != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21060y = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
