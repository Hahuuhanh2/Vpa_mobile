package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;

/* compiled from: DemoInputViewBindingImpl */
public final class j2 extends i2 {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f21126z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(C0533R$id.rcv, 1);
        sparseIntArray.put(C0533R$id.btn, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j2(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = A
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 0
            r1 = r0[r1]
            r7 = r1
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r1 = 1
            r0 = r0[r1]
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = -1
            r9.f21126z = r0
            android.widget.RelativeLayout r10 = r9.f21109x
            r10.setTag(r2)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21126z = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21126z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21126z = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(LoginViewModel loginViewModel) {
    }
}
