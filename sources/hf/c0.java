package hf;

import android.util.SparseIntArray;
import com.ots.core.R$id;

/* compiled from: WidgetFormInputBindingImpl */
public final class c0 extends b0 {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f10777z;

    /* renamed from: y  reason: collision with root package name */
    public long f10778y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10777z = sparseIntArray;
        sparseIntArray.put(R$id.tvTitel, 1);
        sparseIntArray.put(R$id.edtForm, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c0(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f10777z
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.EditText r1 = (android.widget.EditText) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.f10778y = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.c0.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f10778y = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f10778y != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f10778y = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
