package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import d2.l;

/* compiled from: FragmentAuctionBindingImpl */
public final class d3 extends c3 {
    public static final l.d C;
    public static final SparseIntArray D;
    public long B = -1;

    static {
        l.d dVar = new l.d(7);
        C = dVar;
        dVar.a(1, new int[]{2}, new int[]{2131558722}, new String[]{"view_login_auction"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(C0533R$id.ivLogo, 3);
        sparseIntArray.put(2131362711, 4);
        sparseIntArray.put(C0533R$id.llRcv, 5);
        sparseIntArray.put(C0533R$id.rcv, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d3(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            d2.l$d r0 = C
            android.util.SparseIntArray r1 = D
            r2 = 7
            java.lang.Object[] r0 = d2.l.o(r11, r12, r2, r0, r1)
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r0[r1]
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r1 = 0
            r1 = r0[r1]
            r7 = r1
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r1 = 6
            r1 = r0[r1]
            r8 = r1
            com.ots.core.base.BaseRecyclerView r8 = (com.ots.core.base.BaseRecyclerView) r8
            r1 = 4
            r1 = r0[r1]
            com.ots.core.utils.customview.textview.AppTextView r1 = (com.ots.core.utils.customview.textview.AppTextView) r1
            r1 = 2
            r0 = r0[r1]
            r9 = r0
            mg.t7 r9 = (mg.t7) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r10.B = r0
            android.widget.LinearLayout r11 = r10.f21004w
            r0 = 0
            r11.setTag(r0)
            android.widget.RelativeLayout r11 = r10.f21006y
            r11.setTag(r0)
            mg.t7 r11 = r10.A
            if (r11 == 0) goto L_0x004c
            r11.f8560r = r10
        L_0x004c:
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.B = 0;
        }
        this.A.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.A.k() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.B     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            mg.t7 r0 = r4.A
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d3.k():boolean");
    }

    public final void m() {
        synchronized (this) {
            this.B = 2;
        }
        this.A.m();
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 != 0) {
            return false;
        }
        t7 t7Var = (t7) obj;
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }
}
