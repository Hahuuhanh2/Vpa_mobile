package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import d2.g;
import d2.i;
import e2.c;

/* compiled from: ActivityFeedBackBindingImpl */
public final class y extends x {
    public static final SparseIntArray B;
    public long A = -1;

    /* renamed from: y  reason: collision with root package name */
    public a f21459y = new a();

    /* renamed from: z  reason: collision with root package name */
    public b f21460z = new b();

    /* compiled from: ActivityFeedBackBindingImpl */
    public class a implements g {
        public a() {
        }

        public final void b() {
            c.a(y.this.f21427w);
            y.this.getClass();
        }
    }

    /* compiled from: ActivityFeedBackBindingImpl */
    public class b implements g {
        public b() {
        }

        public final void b() {
            c.a(y.this.f21428x);
            y.this.getClass();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(2131362720, 3);
        sparseIntArray.put(2131362803, 4);
        sparseIntArray.put(C0533R$id.tvContent, 5);
        sparseIntArray.put(2131362780, 6);
        sparseIntArray.put(C0533R$id.btnSend, 7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = B
            r1 = 8
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 7
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1 = 2
            r1 = r0[r1]
            com.ots.core.utils.customview.edit.AppEditText r1 = (com.ots.core.utils.customview.edit.AppEditText) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.EditText r3 = (android.widget.EditText) r3
            r4 = 3
            r4 = r0[r4]
            com.google.android.material.appbar.MaterialToolbar r4 = (com.google.android.material.appbar.MaterialToolbar) r4
            r4 = 5
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 6
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 4
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5.<init>(r6, r7, r1, r3)
            mg.y$a r6 = new mg.y$a
            r6.<init>()
            r5.f21459y = r6
            mg.y$b r6 = new mg.y$b
            r6.<init>()
            r5.f21460z = r6
            r3 = -1
            r5.A = r3
            com.ots.core.utils.customview.edit.AppEditText r6 = r5.f21427w
            r6.setTag(r2)
            android.widget.EditText r6 = r5.f21428x
            r6.setTag(r2)
            r6 = 0
            r6 = r0[r6]
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.y.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        synchronized (this) {
            j10 = this.A;
            this.A = 0;
        }
        if ((15 & j10) != 0) {
            if ((j10 & 13) != 0) {
                u(0, (i) null);
            }
            if ((j10 & 14) != 0) {
                u(1, (i) null);
            }
        }
        if ((14 & j10) != 0) {
            c.d(this.f21427w, (CharSequence) null);
        }
        if ((8 & j10) != 0) {
            c.e(this.f21427w, this.f21459y);
            c.e(this.f21428x, this.f21460z);
        }
        if ((j10 & 13) != 0) {
            c.d(this.f21428x, (CharSequence) null);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.A = 8;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 == 0) {
            i iVar = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.A |= 1;
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            i iVar2 = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.A |= 2;
            }
            return true;
        }
    }
}
