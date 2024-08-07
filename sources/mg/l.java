package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityAuctionReportBindingImpl */
public final class l extends k {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.lnPdf, 2);
        sparseIntArray.put(C0533R$id.pdfView, 3);
        sparseIntArray.put(C0533R$id.llAgree, 4);
        sparseIntArray.put(C0533R$id.lnCb, 5);
        sparseIntArray.put(2131361999, 6);
        sparseIntArray.put(C0533R$id.tvPolicy, 7);
        sparseIntArray.put(C0533R$id.btnAgree, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = C
            r1 = 9
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            android.widget.CheckBox r7 = (android.widget.CheckBox) r7
            r1 = 4
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 0
            r1 = r0[r1]
            r8 = r1
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            com.github.barteksc.pdfviewer.PDFView r9 = (com.github.barteksc.pdfviewer.PDFView) r9
            r1 = 1
            r1 = r0[r1]
            if (r1 == 0) goto L_0x003e
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            r10 = r1
            goto L_0x003f
        L_0x003e:
            r10 = r2
        L_0x003f:
            r1 = 7
            r0 = r0[r1]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r11.B = r0
            android.widget.RelativeLayout r12 = r11.f21140y
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.l.<init>(d2.e, android.view.View):void");
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
