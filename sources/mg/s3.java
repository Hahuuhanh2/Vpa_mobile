package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;

/* compiled from: FragmentRegisterAuctionBindingImpl */
public final class s3 extends r3 {
    public static final SparseIntArray K;
    public long J = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(2131362339, 1);
        sparseIntArray.put(C0533R$id.ivLogo, 2);
        sparseIntArray.put(C0533R$id.btnCart, 3);
        sparseIntArray.put(C0533R$id.btnNotify, 4);
        sparseIntArray.put(C0533R$id.searchView, 5);
        sparseIntArray.put(C0533R$id.btnFilter, 6);
        sparseIntArray.put(C0533R$id.tvAnnouncementList, 7);
        sparseIntArray.put(C0533R$id.rcv, 8);
        sparseIntArray.put(C0533R$id.epvAll, 9);
        sparseIntArray.put(C0533R$id.tvCapital, 10);
        sparseIntArray.put(C0533R$id.rcvPlate, 11);
        sparseIntArray.put(C0533R$id.epvCapital, 12);
        sparseIntArray.put(C0533R$id.tvHcm, 13);
        sparseIntArray.put(C0533R$id.rcvHcm, 14);
        sparseIntArray.put(C0533R$id.epvHcm, 15);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s3(d2.e r21, android.view.View r22) {
        /*
            r20 = this;
            r15 = r20
            r14 = r22
            android.util.SparseIntArray r0 = K
            r1 = 16
            r13 = 0
            r2 = r21
            java.lang.Object[] r16 = d2.l.o(r2, r14, r1, r13, r0)
            r0 = 3
            r0 = r16[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 6
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 4
            r0 = r16[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 9
            r0 = r16[r0]
            r6 = r0
            com.ots.base.utils.customview.EmptyView r6 = (com.ots.base.utils.customview.EmptyView) r6
            r0 = 12
            r0 = r16[r0]
            r7 = r0
            com.ots.base.utils.customview.EmptyView r7 = (com.ots.base.utils.customview.EmptyView) r7
            r0 = 15
            r0 = r16[r0]
            r8 = r0
            com.ots.base.utils.customview.EmptyView r8 = (com.ots.base.utils.customview.EmptyView) r8
            r0 = 2
            r0 = r16[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 1
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r16[r0]
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r0 = 14
            r0 = r16[r0]
            r10 = r0
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r0 = 11
            r0 = r16[r0]
            r11 = r0
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r0 = 5
            r0 = r16[r0]
            r12 = r0
            com.ots.core.utils.customview.textview.AppTextView r12 = (com.ots.core.utils.customview.textview.AppTextView) r12
            r0 = 7
            r0 = r16[r0]
            r17 = r0
            com.ots.base.utils.customview.GradientTextView r17 = (com.ots.base.utils.customview.GradientTextView) r17
            r0 = 10
            r0 = r16[r0]
            r18 = r0
            com.ots.base.utils.customview.GradientTextView r18 = (com.ots.base.utils.customview.GradientTextView) r18
            r0 = 13
            r0 = r16[r0]
            r19 = r0
            com.ots.base.utils.customview.GradientTextView r19 = (com.ots.base.utils.customview.GradientTextView) r19
            r0 = r20
            r1 = r21
            r2 = r22
            r13 = r17
            r14 = r18
            r15 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r2 = r20
            r2.J = r0
            r0 = 0
            r0 = r16[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r1 = 0
            r0.setTag(r1)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r1 = r22
            r1.setTag(r0, r2)
            r20.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.s3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        synchronized (this) {
            this.J = 0;
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.J != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.J = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }
}
