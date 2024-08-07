package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import d2.l;

/* compiled from: ActivityOtpBindingImpl */
public final class p0 extends o0 {
    public static final l.d H;
    public static final SparseIntArray I;
    public final s5 F;
    public long G;

    static {
        l.d dVar = new l.d(10);
        H = dVar;
        dVar.a(2, new int[]{4}, new int[]{2131558583}, new String[]{"item_forgot_step_2"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(2131362720, 3);
        sparseIntArray.put(C0533R$id.otvOTP, 5);
        sparseIntArray.put(C0533R$id.emptyOTP, 6);
        sparseIntArray.put(C0533R$id.tvContent, 7);
        sparseIntArray.put(C0533R$id.tvCountInput, 8);
        sparseIntArray.put(C0533R$id.button, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p0(d2.e r18, android.view.View r19) {
        /*
            r17 = this;
            r12 = r17
            r13 = r19
            d2.l$d r0 = H
            android.util.SparseIntArray r1 = I
            r2 = 10
            r3 = r18
            java.lang.Object[] r14 = d2.l.o(r3, r13, r2, r0, r1)
            r0 = 9
            r0 = r14[r0]
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0 = 6
            r0 = r14[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 1
            r0 = r14[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 2
            r0 = r14[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 0
            r0 = r14[r0]
            r8 = r0
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r0 = 5
            r0 = r14[r0]
            r9 = r0
            com.ots.base.utils.customview.otp.helpers.OtpTextView r9 = (com.ots.base.utils.customview.otp.helpers.OtpTextView) r9
            r0 = 3
            r0 = r14[r0]
            r15 = 0
            if (r0 == 0) goto L_0x0043
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            r10 = r0
            goto L_0x0044
        L_0x0043:
            r10 = r15
        L_0x0044:
            r0 = 7
            r0 = r14[r0]
            r11 = r0
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r0 = 8
            r0 = r14[r0]
            r16 = r0
            com.ots.core.utils.customview.textview.AppTextView r16 = (com.ots.core.utils.customview.textview.AppTextView) r16
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r12.G = r0
            android.widget.LinearLayout r0 = r12.f21264y
            r0.setTag(r15)
            android.widget.LinearLayout r0 = r12.f21265z
            r0.setTag(r15)
            android.widget.RelativeLayout r0 = r12.A
            r0.setTag(r15)
            r0 = 4
            r0 = r14[r0]
            mg.s5 r0 = (mg.s5) r0
            r12.F = r0
            if (r0 == 0) goto L_0x0083
            r0.f8560r = r12
        L_0x0083:
            int r0 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r0, r12)
            r17.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.p0.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.G = 0;
        }
        this.F.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.F.k() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.G     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            mg.s5 r0 = r4.F
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
        throw new UnsupportedOperationException("Method not decompiled: mg.p0.k():boolean");
    }

    public final void m() {
        synchronized (this) {
            this.G = 1;
        }
        this.F.m();
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
