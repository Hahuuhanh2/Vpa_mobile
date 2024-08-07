package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import e2.c;

/* compiled from: DialogCongratulationBindingImpl */
public final class o2 extends n2 {
    public static final SparseIntArray A;

    /* renamed from: z  reason: collision with root package name */
    public long f21270z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(2131362806, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o2(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = A
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 2
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.f21270z = r3
            r6 = 0
            r6 = r0[r6]
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r6.setTag(r2)
            android.widget.TextView r6 = r5.f21246w
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.o2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        synchronized (this) {
            j10 = this.f21270z;
            this.f21270z = 0;
        }
        String str = null;
        BiddingRoomId biddingRoomId = this.f21247x;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (!(i10 == 0 || biddingRoomId == null)) {
            str = biddingRoomId.getPlate();
        }
        if (i10 != 0) {
            c.d(this.f21246w, str);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21270z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21270z = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(BiddingRoomId biddingRoomId) {
        this.f21247x = biddingRoomId;
        synchronized (this) {
            this.f21270z |= 1;
        }
        f(3);
        t();
    }
}
