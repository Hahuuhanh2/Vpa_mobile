package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityDemoSseactivityBindingImpl */
public final class u extends t {

    /* renamed from: y  reason: collision with root package name */
    public static final SparseIntArray f21369y;

    /* renamed from: x  reason: collision with root package name */
    public long f21370x = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21369y = sparseIntArray;
        sparseIntArray.put(C0533R$id.imvPhoto, 1);
        sparseIntArray.put(C0533R$id.btnRecaptcha, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = f21369y
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.Button r1 = (android.widget.Button) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 0
            r0 = r0[r3]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r4.<init>(r5, r6, r1, r0)
            r0 = -1
            r4.f21370x = r0
            android.widget.RelativeLayout r5 = r4.f21354w
            r5.setTag(r2)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.u.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21370x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21370x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21370x = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
