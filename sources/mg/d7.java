package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ItemScopeBindingImpl */
public final class d7 extends c7 {

    /* renamed from: y  reason: collision with root package name */
    public static final SparseIntArray f21028y;

    /* renamed from: x  reason: collision with root package name */
    public long f21029x = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21028y = sparseIntArray;
        sparseIntArray.put(C0533R$id.rcvInfo, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d7(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f21028y
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.f21029x = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d7.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21029x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21029x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21029x = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
