package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ItemPlateSelectionBindingImpl */
public final class t6 extends s6 {

    /* renamed from: y  reason: collision with root package name */
    public static final SparseIntArray f21363y;

    /* renamed from: x  reason: collision with root package name */
    public long f21364x = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21363y = sparseIntArray;
        sparseIntArray.put(C0533R$id.tvPlate, 1);
        sparseIntArray.put(C0533R$id.tvVehicleType, 2);
        sparseIntArray.put(C0533R$id.tvTotalInterested, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t6(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = f21363y
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 3
            r3 = r0[r3]
            com.ots.core.utils.customview.textview.AppTitleTextView r3 = (com.ots.core.utils.customview.textview.AppTitleTextView) r3
            r3 = 2
            r0 = r0[r3]
            com.ots.core.utils.customview.textview.AppTitleTextView r0 = (com.ots.core.utils.customview.textview.AppTitleTextView) r0
            r4.<init>(r5, r6, r1)
            r0 = -1
            r4.f21364x = r0
            android.widget.LinearLayout r5 = r4.f21353w
            r5.setTag(r2)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.t6.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21364x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21364x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21364x = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
