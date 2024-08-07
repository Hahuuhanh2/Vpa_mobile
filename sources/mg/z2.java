package mg;

import android.util.SparseIntArray;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE;
import e2.c;

/* compiled from: DialogStopAuctionBindingImpl */
public final class z2 extends y2 {
    public static final SparseIntArray D;
    public final GradientTextView A;
    public final AppTextView B;
    public long C = -1;

    /* renamed from: z  reason: collision with root package name */
    public final GradientTextView f21511z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(C0533R$id.imvIcon, 4);
        sparseIntArray.put(2131361936, 5);
        sparseIntArray.put(2131362806, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z2(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = D
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r3 = 4
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 6
            r3 = r0[r3]
            com.ots.core.utils.customview.textview.AppTextView r3 = (com.ots.core.utils.customview.textview.AppTextView) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.C = r3
            r6 = 0
            r6 = r0[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6.setTag(r2)
            r6 = 1
            r6 = r0[r6]
            com.ots.base.utils.customview.GradientTextView r6 = (com.ots.base.utils.customview.GradientTextView) r6
            r5.f21511z = r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            com.ots.base.utils.customview.GradientTextView r6 = (com.ots.base.utils.customview.GradientTextView) r6
            r5.A = r6
            r6.setTag(r2)
            r6 = 3
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.B = r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.C;
            this.C = 0;
        }
        CancelRoomSSE cancelRoomSSE = this.f21493x;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || cancelRoomSSE == null) {
            str2 = null;
            str = null;
        } else {
            String plate = cancelRoomSSE.getPlate();
            String reasonCancel = cancelRoomSSE.getReasonCancel();
            str2 = plate;
            str3 = cancelRoomSSE.getRequesterName();
            str = reasonCancel;
        }
        if (i10 != 0) {
            c.d(this.f21511z, str3);
            c.d(this.A, str2);
            c.d(this.B, str);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.C = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(CancelRoomSSE cancelRoomSSE) {
        this.f21493x = cancelRoomSSE;
        synchronized (this) {
            this.C |= 1;
        }
        f(3);
        t();
    }
}
