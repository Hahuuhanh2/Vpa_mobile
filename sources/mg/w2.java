package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: DialogRegulationBindingImpl */
public final class w2 extends v2 {
    public static final SparseIntArray C;
    public long B = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(C0533R$id.lnTitle, 1);
        sparseIntArray.put(2131361936, 2);
        sparseIntArray.put(2131362284, 3);
        sparseIntArray.put(C0533R$id.lnPdf, 4);
        sparseIntArray.put(C0533R$id.webView, 5);
        sparseIntArray.put(C0533R$id.lnCb, 6);
        sparseIntArray.put(2131361999, 7);
        sparseIntArray.put(C0533R$id.tvPolicy, 8);
        sparseIntArray.put(2131361937, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w2(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = C
            r1 = 10
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r1 = 9
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.checkbox.MaterialCheckBox r8 = (com.google.android.material.checkbox.MaterialCheckBox) r8
            r1 = 3
            r1 = r0[r1]
            com.google.android.material.divider.MaterialDivider r1 = (com.google.android.material.divider.MaterialDivider) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 8
            r1 = r0[r1]
            com.ots.core.utils.customview.textview.AppTextView r1 = (com.ots.core.utils.customview.textview.AppTextView) r1
            r1 = 5
            r1 = r0[r1]
            r9 = r1
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.B = r3
            r11 = 0
            r11 = r0[r11]
            com.google.android.material.card.MaterialCardView r11 = (com.google.android.material.card.MaterialCardView) r11
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.w2.<init>(d2.e, android.view.View):void");
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
