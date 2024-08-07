package mg;

import android.util.SparseIntArray;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import com.vpa.daugia.C0533R$id;
import e2.c;
import f0.b0;
import qg.a;
import ze.d;

/* compiled from: ItemMenuBindingImpl */
public final class c6 extends g2 implements a.C0304a {
    public static final SparseIntArray C;
    public final a A;
    public long B = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(C0533R$id.btnAdd, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c6(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = C
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r3 = r0[r1]
            r7 = r3
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            r3 = 2
            r3 = r0[r3]
            r8 = r3
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r3 = 3
            r3 = r0[r3]
            r9 = r3
            com.ots.core.utils.customview.textview.AppTitleTextView r9 = (com.ots.core.utils.customview.textview.AppTitleTextView) r9
            r4 = r10
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r3 = -1
            r10.B = r3
            android.view.View r11 = r10.f21071w
            com.google.android.material.card.MaterialCardView r11 = (com.google.android.material.card.MaterialCardView) r11
            r11.setTag(r2)
            android.view.View r11 = r10.f21072x
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r11.setTag(r2)
            r11 = 0
            r11 = r0[r11]
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r11.setTag(r2)
            android.view.View r11 = r10.f21073y
            com.ots.core.utils.customview.textview.AppTitleTextView r11 = (com.ots.core.utils.customview.textview.AppTitleTextView) r11
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            qg.a r11 = new qg.a
            r11.<init>(r10, r1)
            r10.A = r11
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c6.<init>(d2.e, android.view.View):void");
    }

    public final void e(int i10) {
        b0.B(this.f21074z);
    }

    public final void h() {
        long j10;
        synchronized (this) {
            j10 = this.B;
            this.B = 0;
        }
        b0.B(this.f21074z);
        int i10 = ((3 & j10) > 0 ? 1 : ((3 & j10) == 0 ? 0 : -1));
        if ((j10 & 2) != 0) {
            ((MaterialCardView) this.f21071w).setOnClickListener(this.A);
        }
        if (i10 != 0) {
            d.a((ImageView) this.f21072x, (String) null, "NORMAL", false);
            c.d((AppTitleTextView) this.f21073y, (CharSequence) null);
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
}
