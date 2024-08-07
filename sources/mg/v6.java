package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import ui.h;

/* compiled from: ItemQuestionBindingImpl */
public final class v6 extends u6 {
    public static final SparseIntArray C;
    public long B = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131362244, 3);
        sparseIntArray.put(C0533R$id.ivArrow, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v6(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = C
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            com.ots.core.utils.customview.textview.AppTextView r8 = (com.ots.core.utils.customview.textview.AppTextView) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.B = r3
            r11 = 0
            r11 = r0[r11]
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r11.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r11 = r10.f21388y
            r11.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r11 = r10.f21389z
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v6.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.B     // Catch:{ all -> 0x0031 }
            r2 = 0
            r7.B = r2     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)     // Catch:{ all -> 0x0031 }
            ui.h r4 = r7.A
            r5 = 3
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0017
            com.vpa.daugia.module.support.data.model.FAQ r2 = r4.f23081a
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            if (r2 == 0) goto L_0x0023
            java.lang.String r1 = r2.getAnswer()
            java.lang.String r2 = r2.getQuestion()
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0030
            com.ots.core.utils.customview.textview.AppTextView r0 = r7.f21388y
            e2.c.d(r0, r1)
            com.ots.core.utils.customview.textview.AppTextView r0 = r7.f21389z
            e2.c.d(r0, r2)
        L_0x0030:
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v6.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.B = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(h hVar) {
        this.A = hVar;
        synchronized (this) {
            this.B |= 1;
        }
        f(3);
        t();
    }
}
