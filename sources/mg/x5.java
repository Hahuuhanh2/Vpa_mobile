package mg;

import android.util.SparseIntArray;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import e2.c;
import rh.f;

/* compiled from: ItemInfoLoginBindingImpl */
public final class x5 extends w5 {
    public static final SparseIntArray C;
    public final AppTextView A;
    public long B = -1;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21453z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(C0533R$id.ivChangeAccount, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x5(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = C
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = 3
            r3 = r0[r3]
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.B = r3
            android.widget.LinearLayout r6 = r5.f21421w
            r6.setTag(r2)
            r6 = 1
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.f21453z = r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.A = r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.x5.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        User user;
        synchronized (this) {
            j10 = this.B;
            this.B = 0;
        }
        f fVar = this.f21423y;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str2 = null;
        if (i10 != 0) {
            if (fVar != null) {
                str = fVar.a();
                user = fVar.f22793b;
            } else {
                str = null;
                user = null;
            }
            if (user != null) {
                str2 = user.getPhone();
            }
        } else {
            str = null;
        }
        if (i10 != 0) {
            c.d(this.f21453z, str2);
            c.d(this.A, str);
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
            this.B = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(f fVar) {
        this.f21423y = fVar;
        synchronized (this) {
            this.B |= 1;
        }
        f(2);
        t();
    }
}
