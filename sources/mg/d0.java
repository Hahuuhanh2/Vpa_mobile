package mg;

import android.util.SparseIntArray;
import hf.n;

/* compiled from: ActivityGuidelineBindingImpl */
public final class d0 extends n {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f21017z;

    /* renamed from: y  reason: collision with root package name */
    public long f21018y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21017z = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d0(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = f21017z
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = 1
            r0 = r0[r3]
            if (r0 == 0) goto L_0x0019
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            r4.<init>(r5, r6, r1, r0)
            r0 = -1
            r4.f21018y = r0
            android.view.View r5 = r4.f10801w
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r5.setTag(r2)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d0.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21018y = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21018y != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21018y = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
