package mg;

import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.module.auction.data.model.ResultAuctionEnum;
import e2.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import lh.b;
import n0.l;

/* compiled from: ItemAuctionHistoryBindingImpl */
public final class x4 extends w4 {
    public final AppTextView A;
    public final AppTextView B;
    public final AppTextView C;
    public long D = -1;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21452z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x4(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r0, r1, r1)
            r2 = 3
            r2 = r0[r2]
            com.ots.core.utils.customview.textview.AppTextView r2 = (com.ots.core.utils.customview.textview.AppTextView) r2
            r3 = 2
            r3 = r0[r3]
            com.ots.core.utils.customview.textview.AppTextView r3 = (com.ots.core.utils.customview.textview.AppTextView) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.D = r2
            r5 = 0
            r5 = r0[r5]
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            r5.setTag(r1)
            r5 = 1
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.f21452z = r5
            r5.setTag(r1)
            r5 = 4
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.A = r5
            r5.setTag(r1)
            r5 = 5
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.B = r5
            r5.setTag(r1)
            r5 = 6
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.C = r5
            r5.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r5 = r4.f21418w
            r5.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r5 = r4.f21419x
            r5.setTag(r1)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.x4.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i10;
        synchronized (this) {
            j10 = this.D;
            this.D = 0;
        }
        b bVar = this.f21420y;
        int i11 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        int i12 = 0;
        String str7 = null;
        if (i11 != 0) {
            if (bVar != null) {
                Integer status = bVar.f20852a.getStatus();
                ResultAuctionEnum resultAuctionEnum = ResultAuctionEnum.WIN;
                int value = resultAuctionEnum.getValue();
                if (status != null && status.intValue() == value) {
                    str6 = "Đã trúng đấu giá";
                } else {
                    ResultAuctionEnum resultAuctionEnum2 = ResultAuctionEnum.SLIP;
                    int value2 = resultAuctionEnum2.getValue();
                    if (status != null && status.intValue() == value2) {
                        str6 = resultAuctionEnum2.getText();
                    } else {
                        int value3 = ResultAuctionEnum.CANCEL.getValue();
                        if (status != null && status.intValue() == value3) {
                            str6 = "Vi phạm đấu giá";
                        } else {
                            str6 = "";
                        }
                    }
                }
                String str8 = bVar.f20852a.getVehicleSymbol() + bVar.f20852a.getRegistrationSeri() + " - " + bVar.f20852a.getSequenceNumber();
                str2 = b.a(bVar.f20852a.getWinningPrice());
                Integer status2 = bVar.f20852a.getStatus();
                int value4 = resultAuctionEnum.getValue();
                if (status2 != null && status2.intValue() == value4) {
                    i10 = 2131100275;
                } else {
                    int value5 = ResultAuctionEnum.SLIP.getValue();
                    if (status2 != null && status2.intValue() == value5) {
                        i10 = C0529R$color.un_paid;
                    } else {
                        i10 = C0529R$color.expired;
                    }
                }
                Long endDate = bVar.f20852a.getEndDate();
                if (endDate != null) {
                    str = l.h(endDate.longValue(), new SimpleDateFormat("HH:mm", Locale.getDefault()));
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                Long endDate2 = bVar.f20852a.getEndDate();
                if (endDate2 != null && (str7 = l.h(endDate2.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()))) == null) {
                    str7 = "";
                }
                String a10 = b.a(bVar.f20852a.getMaxPrice());
                str4 = str6;
                i12 = i10;
                str5 = str7;
                str7 = str8;
                str3 = a10;
            } else {
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            i12 = this.f8554e.getContext().getColor(i12);
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i11 != 0) {
            c.d(this.f21452z, str7);
            c.d(this.A, str3);
            c.d(this.B, str2);
            this.C.setTextColor(i12);
            c.d(this.C, str4);
            c.d(this.f21418w, str5);
            c.d(this.f21419x, str);
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

    public final void v(b bVar) {
        this.f21420y = bVar;
        synchronized (this) {
            this.D |= 1;
        }
        f(3);
        t();
    }
}
