package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0535R$layout;
import d2.l;

/* compiled from: FragmentStepTwoBindingImpl */
public final class d4 extends c4 {
    public static final l.d B;
    public static final SparseIntArray C;
    public long A = -1;

    static {
        l.d dVar = new l.d(7);
        B = dVar;
        dVar.a(1, new int[]{2, 3}, new int[]{C0535R$layout.item_personal_info, C0535R$layout.item_organization_info}, new String[]{"item_personal_info", "item_organization_info"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131362720, 4);
        sparseIntArray.put(2131361926, 5);
        sparseIntArray.put(2131362022, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d4(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            d2.l$d r0 = B
            android.util.SparseIntArray r1 = C
            r2 = 7
            java.lang.Object[] r0 = d2.l.o(r10, r11, r2, r0, r1)
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r1 = 6
            r1 = r0[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 0
            r1 = r0[r1]
            r6 = r1
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            mg.k6 r7 = (mg.k6) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            mg.o6 r8 = (mg.o6) r8
            r1 = 4
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.A = r1
            android.widget.RelativeLayout r10 = r9.f21009x
            r1 = 0
            r10.setTag(r1)
            r10 = 1
            r10 = r0[r10]
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r10.setTag(r1)
            mg.k6 r10 = r9.f21010y
            if (r10 == 0) goto L_0x0049
            r10.f8560r = r9
        L_0x0049:
            mg.o6 r10 = r9.f21011z
            if (r10 == 0) goto L_0x004f
            r10.f8560r = r9
        L_0x004f:
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d4.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.A = 0;
        }
        this.f21011z.i();
        this.f21010y.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r4.f21010y.k() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.f21011z.k() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.A     // Catch:{ all -> 0x0021 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            mg.o6 r0 = r4.f21011z
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            mg.k6 r0 = r4.f21010y
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x001f
            return r1
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d4.k():boolean");
    }

    public final void m() {
        synchronized (this) {
            this.A = 4;
        }
        this.f21011z.m();
        this.f21010y.m();
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 == 0) {
            o6 o6Var = (o6) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.A |= 1;
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            k6 k6Var = (k6) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.A |= 2;
            }
            return true;
        }
    }
}
