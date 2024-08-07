package mg;

import android.util.SparseIntArray;
import com.ots.base.utils.customview.GradientTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import e2.c;

/* compiled from: DialogLoseAuctionBindingImpl */
public final class t2 extends s2 {
    public static final SparseIntArray B;
    public long A = -1;

    /* renamed from: z  reason: collision with root package name */
    public final GradientTextView f21358z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(C0533R$id.imvIcon, 2);
        sparseIntArray.put(2131361936, 3);
        sparseIntArray.put(2131362806, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t2(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = B
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r3 = 2
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 4
            r3 = r0[r3]
            com.ots.core.utils.customview.textview.AppTextView r3 = (com.ots.core.utils.customview.textview.AppTextView) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.A = r3
            r6 = 0
            r6 = r0[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6.setTag(r2)
            r6 = 1
            r6 = r0[r6]
            com.ots.base.utils.customview.GradientTextView r6 = (com.ots.base.utils.customview.GradientTextView) r6
            r5.f21358z = r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.t2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        synchronized (this) {
            j10 = this.A;
            this.A = 0;
        }
        String str = null;
        BiddingRoomId biddingRoomId = this.f21348x;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (!(i10 == 0 || biddingRoomId == null)) {
            str = biddingRoomId.getPlateDash();
        }
        if (i10 != 0) {
            c.d(this.f21358z, str);
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
            this.A = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(BiddingRoomId biddingRoomId) {
        this.f21348x = biddingRoomId;
        synchronized (this) {
            this.A |= 1;
        }
        f(3);
        t();
    }
}
