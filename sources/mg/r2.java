package mg;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import e2.c;
import kf.e;
import sk.j;
import ug.b;

/* compiled from: DialogInfoAuctionBindingImpl */
public final class r2 extends q2 {
    public static final SparseIntArray H;
    public final AppTextView A;
    public final AppTextView B;
    public final LinearLayout C;
    public final AppTextView D;
    public final LinearLayout E;
    public final AppTextView F;
    public long G = -1;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21325z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(C0533R$id.lnTitle, 8);
        sparseIntArray.put(2131361936, 9);
        sparseIntArray.put(2131362284, 10);
        sparseIntArray.put(C0533R$id.lnBody, 11);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r2(d2.e r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = H
            r1 = 12
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r6, r7, r1, r2, r0)
            r1 = 9
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r3 = 10
            r3 = r0[r3]
            com.google.android.material.divider.MaterialDivider r3 = (com.google.android.material.divider.MaterialDivider) r3
            r3 = 11
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3 = 8
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r5.<init>(r6, r7, r1)
            r3 = -1
            r5.G = r3
            r6 = 0
            r6 = r0[r6]
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r6.setTag(r2)
            r6 = 1
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.f21325z = r6
            r6.setTag(r2)
            r6 = 2
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.A = r6
            r6.setTag(r2)
            r6 = 3
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.B = r6
            r6.setTag(r2)
            r6 = 4
            r6 = r0[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r5.C = r6
            r6.setTag(r2)
            r6 = 5
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.D = r6
            r6.setTag(r2)
            r6 = 6
            r6 = r0[r6]
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r5.E = r6
            r6.setTag(r2)
            r6 = 7
            r6 = r0[r6]
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r5.F = r6
            r6.setTag(r2)
            int r6 = androidx.databinding.library.R$id.dataBinding
            r7.setTag(r6, r5)
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.r2.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        String str5;
        String str6;
        boolean z10;
        String str7;
        long j11;
        String str8;
        boolean z11;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        synchronized (this) {
            j10 = this.G;
            this.G = 0;
        }
        b bVar = this.f21308x;
        int i11 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i11 != 0) {
            if (bVar != null) {
                String auctionToTime = bVar.f23044a.getAuctionToTime();
                if (auctionToTime != null) {
                    str8 = e.e(auctionToTime);
                } else {
                    str8 = null;
                }
                if (str8 == null || str8.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z10 = !z11;
                String registerToDate = bVar.f23044a.getRegisterToDate();
                if (registerToDate != null) {
                    str2 = e.e(registerToDate);
                } else {
                    str2 = null;
                }
                StringBuilder sb2 = new StringBuilder();
                String plateNumber = bVar.f23044a.getPlateNumber();
                if (plateNumber != null) {
                    str9 = plateNumber.substring(0, 3);
                    j.e(str9, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str9 = null;
                }
                sb2.append(str9);
                sb2.append(" - ");
                String plateNumber2 = bVar.f23044a.getPlateNumber();
                if (plateNumber2 != null) {
                    str10 = plateNumber2.substring(3, 6);
                    j.e(str10, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str10 = null;
                }
                sb2.append(str10);
                sb2.append('.');
                String plateNumber3 = bVar.f23044a.getPlateNumber();
                if (plateNumber3 != null) {
                    str11 = plateNumber3.substring(6);
                    j.e(str11, "this as java.lang.String).substring(startIndex)");
                } else {
                    str11 = null;
                }
                sb2.append(str11);
                String sb3 = sb2.toString();
                String registerFromDate = bVar.f23044a.getRegisterFromDate();
                if (registerFromDate != null) {
                    str12 = e.e(registerFromDate);
                } else {
                    str12 = null;
                }
                String auctionFromTime = bVar.f23044a.getAuctionFromTime();
                if (auctionFromTime != null) {
                    str = e.e(auctionFromTime);
                } else {
                    str = null;
                }
                String auctionToTime2 = bVar.f23044a.getAuctionToTime();
                if (auctionToTime2 != null) {
                    str13 = e.e(auctionToTime2);
                } else {
                    str13 = null;
                }
                str7 = str13;
                str6 = str12;
                str3 = sb3;
            } else {
                str7 = null;
                str3 = null;
                z10 = false;
                str2 = null;
                str = null;
                str6 = null;
            }
            if (i11 != 0) {
                if (z10) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j10 |= j11;
            }
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            str4 = str7;
            str5 = str6;
        } else {
            str5 = null;
            str4 = null;
            i10 = 0;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j10 & 3) != 0) {
            c.d(this.f21325z, str3);
            c.d(this.A, str5);
            c.d(this.B, str2);
            this.C.setVisibility(i10);
            c.d(this.D, str);
            this.E.setVisibility(i10);
            c.d(this.F, str4);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.G != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.G = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(b bVar) {
        this.f21308x = bVar;
        synchronized (this) {
            this.G |= 1;
        }
        f(3);
        t();
    }
}
