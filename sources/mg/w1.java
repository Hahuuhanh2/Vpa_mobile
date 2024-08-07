package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivitySurveyBindingImpl */
public final class w1 extends v1 {

    /* renamed from: y  reason: collision with root package name */
    public static final SparseIntArray f21412y;

    /* renamed from: x  reason: collision with root package name */
    public long f21413x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21412y = sparseIntArray;
        sparseIntArray.put(2131362720, 1);
        sparseIntArray.put(C0533R$id.webView, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w1(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f21412y
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0014
            android.view.View r1 = (android.view.View) r1
            h1.a r1 = h1.a.a(r1)
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 2
            r3 = r0[r3]
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.f21413x = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.w1.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21413x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21413x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21413x = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
