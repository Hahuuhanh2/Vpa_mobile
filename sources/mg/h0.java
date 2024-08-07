package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityMainBindingImpl */
public final class h0 extends g0 {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f21091z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(C0533R$id.content_view, 1);
        sparseIntArray.put(2131361903, 2);
        sparseIntArray.put(2131361905, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = A
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            com.google.android.material.card.MaterialCardView r1 = (com.google.android.material.card.MaterialCardView) r1
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.bottomnavigation.BottomNavigationView r6 = (com.google.android.material.bottomnavigation.BottomNavigationView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            androidx.viewpager2.widget.ViewPager2 r7 = (androidx.viewpager2.widget.ViewPager2) r7
            r1 = 0
            r0 = r0[r1]
            r8 = r0
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = -1
            r9.f21091z = r0
            android.widget.RelativeLayout r10 = r9.f21070y
            r10.setTag(r2)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h0.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21091z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21091z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21091z = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
