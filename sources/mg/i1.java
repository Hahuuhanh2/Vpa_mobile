package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: ActivityScanQrBindingImpl */
public final class i1 extends h1 {

    /* renamed from: y  reason: collision with root package name */
    public static final SparseIntArray f21106y;

    /* renamed from: x  reason: collision with root package name */
    public long f21107x = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21106y = sparseIntArray;
        sparseIntArray.put(C0533R$id.previewView, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i1(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = f21106y
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r3 = 1
            r0 = r0[r3]
            androidx.camera.view.PreviewView r0 = (androidx.camera.view.PreviewView) r0
            r4.<init>(r5, r6, r1)
            r0 = -1
            r4.f21107x = r0
            android.widget.RelativeLayout r5 = r4.f21092w
            r5.setTag(r2)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.i1.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.f21107x = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21107x != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21107x = 1;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
