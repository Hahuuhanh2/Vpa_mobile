package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityWebViewBindingImpl */
public final class b2 extends a2 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(C0533R$id.viewToolbar, 2);
        sparseIntArray.put(2131362803, 3);
        sparseIntArray.put(C0533R$id.webView, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b2(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = C
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            r6 = r1
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 2
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0027
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            r9 = r1
            goto L_0x0028
        L_0x0027:
            r9 = r2
        L_0x0028:
            r1 = 4
            r0 = r0[r1]
            r10 = r0
            android.webkit.WebView r10 = (android.webkit.WebView) r10
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r11.B = r0
            android.widget.RelativeLayout r12 = r11.f20936w
            r12.setTag(r2)
            android.widget.LinearLayout r12 = r11.f20937x
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.b2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.B = 0;
        }
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
            this.B = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
