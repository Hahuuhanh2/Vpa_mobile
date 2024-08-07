package mg;

import android.util.SparseIntArray;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import e2.c;

/* compiled from: DialogWinAuctionBindingImpl */
public final class b3 extends a3 {
    public static final SparseIntArray E;
    public final GradientTextView A;
    public final GradientTextView B;
    public final AppTextView C;
    public long D = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(C0533R$id.imvIcon, 4);
        sparseIntArray.put(2131361936, 5);
        sparseIntArray.put(2131362806, 6);
        sparseIntArray.put(2131361937, 7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b3(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = E
            r1 = 8
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r3 = 7
            r3 = r0[r3]
            android.widget.Button r3 = (android.widget.Button) r3
            r4 = 4
            r4 = r0[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4 = 6
            r4 = r0[r4]
            com.ots.core.utils.customview.textview.AppTextView r4 = (com.ots.core.utils.customview.textview.AppTextView) r4
            r5.<init>(r6, r7, r1, r3)
            r3 = -1
            r5.D = r3
            r6 = 0
            r6 = r0[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6.setTag(r2)
            r6 = 1
            r6 = r0[r6]
            com.ots.base.utils.customview.GradientTextView r6 = (com.ots.base.utils.customview.GradientTextView) r6
            r5.A = r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            com.ots.base.utils.customview.GradientTextView r6 = (com.ots.base.utils.customview.GradientTextView) r6
            r5.B = r6
            r6.setTag(r2)
            r6 = 3
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.C = r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.b3.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.D;
            this.D = 0;
        }
        BiddingRoomId biddingRoomId = this.f20943y;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || biddingRoomId == null) {
            str2 = null;
            str = null;
        } else {
            String maxPriceWord = biddingRoomId.getMaxPriceWord();
            str2 = biddingRoomId.getMaxPrice();
            str = maxPriceWord;
            str3 = biddingRoomId.getPlateDash();
        }
        if (i10 != 0) {
            c.d(this.A, str3);
            c.d(this.B, str2);
            c.d(this.C, str);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.D = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(BiddingRoomId biddingRoomId) {
        this.f20943y = biddingRoomId;
        synchronized (this) {
            this.D |= 1;
        }
        f(3);
        t();
    }
}
