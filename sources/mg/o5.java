package mg;

import android.util.SparseIntArray;
import e2.c;
import qg.a;
import ze.d;

/* compiled from: ItemFavoriteMenuBindingImpl */
public final class o5 extends n5 implements a.C0304a {
    public static final SparseIntArray C;
    public final a A;
    public long B = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(2131361936, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o5(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = C
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r3 = r0[r1]
            r7 = r3
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            r3 = 0
            r3 = r0[r3]
            r8 = r3
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r3 = 2
            r3 = r0[r3]
            r9 = r3
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r3 = 3
            r0 = r0[r3]
            r10 = r0
            com.ots.core.utils.customview.textview.AppTitleTextView r10 = (com.ots.core.utils.customview.textview.AppTitleTextView) r10
            r4 = r11
            r5 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = -1
            r11.B = r3
            com.google.android.material.card.MaterialCardView r12 = r11.f21250w
            r12.setTag(r2)
            android.widget.RelativeLayout r12 = r11.f21251x
            r12.setTag(r2)
            android.widget.ImageView r12 = r11.f21252y
            r12.setTag(r2)
            com.ots.core.utils.customview.textview.AppTitleTextView r12 = r11.f21253z
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            qg.a r12 = new qg.a
            r12.<init>(r11, r1)
            r11.A = r12
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.o5.<init>(d2.e, android.view.View):void");
    }

    public final void e(int i10) {
    }

    public final void h() {
        long j10;
        synchronized (this) {
            j10 = this.B;
            this.B = 0;
        }
        int i10 = ((3 & j10) > 0 ? 1 : ((3 & j10) == 0 ? 0 : -1));
        if ((j10 & 2) != 0) {
            this.f21250w.setOnClickListener(this.A);
        }
        if (i10 != 0) {
            d.a(this.f21252y, (String) null, "NORMAL", false);
            c.d(this.f21253z, (CharSequence) null);
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
