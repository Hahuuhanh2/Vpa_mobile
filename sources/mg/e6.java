package mg;

import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.common.data.model.WinningAnnounce;
import e2.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import jh.a;
import n0.l;

/* compiled from: ItemMyDocumentBindingImpl */
public final class e6 extends d6 {
    public long A = -1;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21052z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e6(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r0, r1, r1)
            r2 = 2
            r2 = r0[r2]
            com.ots.core.utils.customview.textview.AppTextView r2 = (com.ots.core.utils.customview.textview.AppTextView) r2
            r3 = 1
            r3 = r0[r3]
            com.ots.core.utils.customview.textview.AppTextView r3 = (com.ots.core.utils.customview.textview.AppTextView) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.A = r2
            r5 = 0
            r5 = r0[r5]
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            r5.setTag(r1)
            r5 = 3
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.f21052z = r5
            r5.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r5 = r4.f21025w
            r5.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r5 = r4.f21026x
            r5.setTag(r1)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.e6.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Long biddingEndTime;
        Long biddingEndTime2;
        synchronized (this) {
            j10 = this.A;
            this.A = 0;
        }
        a aVar = this.f21027y;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str4 = null;
        if (i10 == 0 || aVar == null) {
            str2 = null;
            str = null;
        } else {
            WinningAnnounce winningAnnounce = aVar.f20779a.getWinningAnnounce();
            if (winningAnnounce == null || (biddingEndTime2 = winningAnnounce.getBiddingEndTime()) == null) {
                str3 = null;
            } else {
                str3 = l.h(biddingEndTime2.longValue(), new SimpleDateFormat("HH:mm", Locale.getDefault()));
                if (str3 == null) {
                    str3 = "";
                }
            }
            StringBuilder sb2 = new StringBuilder();
            String licensePlate = aVar.f20779a.getLicensePlate();
            if (licensePlate != null) {
                charSequence = licensePlate.subSequence(0, 3);
            } else {
                charSequence = null;
            }
            sb2.append(charSequence);
            sb2.append(" - ");
            String licensePlate2 = aVar.f20779a.getLicensePlate();
            if (licensePlate2 != null) {
                charSequence2 = licensePlate2.subSequence(3, 6);
            } else {
                charSequence2 = null;
            }
            sb2.append(charSequence2);
            sb2.append('.');
            String licensePlate3 = aVar.f20779a.getLicensePlate();
            if (licensePlate3 != null) {
                charSequence3 = licensePlate3.subSequence(6, 8);
            } else {
                charSequence3 = null;
            }
            sb2.append(charSequence3);
            String sb3 = sb2.toString();
            WinningAnnounce winningAnnounce2 = aVar.f20779a.getWinningAnnounce();
            if (!(winningAnnounce2 == null || (biddingEndTime = winningAnnounce2.getBiddingEndTime()) == null || (str4 = l.h(biddingEndTime.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()))) != null)) {
                str4 = "";
            }
            String str5 = str3;
            str2 = str4;
            str4 = sb3;
            str = str5;
        }
        if (i10 != 0) {
            c.d(this.f21052z, str4);
            c.d(this.f21025w, str2);
            c.d(this.f21026x, str);
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

    public final void v(a aVar) {
        this.f21027y = aVar;
        synchronized (this) {
            this.A |= 1;
        }
        f(3);
        t();
    }
}
