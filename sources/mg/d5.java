package mg;

import android.util.SparseIntArray;
import android.widget.ImageView;
import com.ots.core.R$color;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.ResultAuctionEnum;
import e2.c;
import f0.b0;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import k1.a;
import sk.j;
import ug.f;

/* compiled from: ItemAuctionRoomBindingImpl */
public final class d5 extends c5 {
    public static final SparseIntArray H;
    public final AppTextView B;
    public final AppTextView C;
    public final AppTextView D;
    public final AppTextView E;
    public final ImageView F;
    public long G = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(C0533R$id.card, 9);
        sparseIntArray.put(C0533R$id.tvStopPriceLabel, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d5(d2.e r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = H
            r1 = 11
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r11, r12, r1, r2, r0)
            r1 = 9
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            com.ots.core.utils.customview.textview.AppTextView r8 = (com.ots.core.utils.customview.textview.AppTextView) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 10
            r1 = r0[r1]
            com.ots.core.utils.customview.textview.AppTextView r1 = (com.ots.core.utils.customview.textview.AppTextView) r1
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.G = r3
            android.widget.ImageView r11 = r10.f21013x
            r11.setTag(r2)
            r11 = 0
            r11 = r0[r11]
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r11.setTag(r2)
            r11 = 3
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.B = r11
            r11.setTag(r2)
            r11 = 4
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.C = r11
            r11.setTag(r2)
            r11 = 5
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.D = r11
            r11.setTag(r2)
            r11 = 7
            r11 = r0[r11]
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r10.E = r11
            r11.setTag(r2)
            r11 = 8
            r11 = r0[r11]
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.F = r11
            r11.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r11 = r10.f21014y
            r11.setTag(r2)
            android.widget.TextView r11 = r10.f21015z
            r11.setTag(r2)
            int r11 = androidx.databinding.library.R$id.dataBinding
            r12.setTag(r11, r10)
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d5.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        int i10;
        int i11;
        String str3;
        String str4;
        String str5;
        int i12;
        int i13;
        int i14;
        String str6;
        String str7;
        int i15;
        boolean z10;
        PriceTable priceTable;
        int i16;
        int i17;
        String str8;
        boolean z11;
        Integer num;
        long j11;
        long j12;
        int i18;
        boolean z12;
        int i19;
        boolean z13;
        ArrayList arrayList;
        boolean z14;
        String str9;
        String str10;
        int i20;
        ArrayList arrayList2;
        boolean z15;
        boolean z16;
        long j13;
        Long l10;
        long j14;
        long j15;
        synchronized (this) {
            j10 = this.G;
            this.G = 0;
        }
        f fVar = this.A;
        long j16 = 3;
        int i21 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i21 != 0) {
            if (fVar != null) {
                Integer payCount = fVar.f23050a.getPayCount();
                if (payCount != null) {
                    i18 = payCount.intValue();
                } else {
                    i18 = 0;
                }
                if (i18 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                String b10 = fVar.b();
                int result = fVar.f23050a.getResult();
                ResultAuctionEnum resultAuctionEnum = ResultAuctionEnum.CANCEL;
                if (result == resultAuctionEnum.getValue()) {
                    i19 = 10;
                } else {
                    i19 = 0;
                }
                int result2 = fVar.f23050a.getResult();
                str3 = "Giá hiện tại";
                if (result2 != ResultAuctionEnum.WIN.getValue()) {
                    ResultAuctionEnum resultAuctionEnum2 = ResultAuctionEnum.SLIP;
                    if (result2 == resultAuctionEnum2.getValue()) {
                        str3 = resultAuctionEnum2.getText();
                    } else if (result2 == resultAuctionEnum.getValue()) {
                        str3 = resultAuctionEnum.getText();
                    }
                }
                if (fVar.f23050a.getResult() == resultAuctionEnum.getValue()) {
                    i16 = C0529R$color.un_paid;
                } else {
                    i16 = R$color.dark_400;
                }
                priceTable = fVar.f23050a;
                str4 = fVar.a();
                ArrayList<BiddingPrice> prices = fVar.f23050a.getPrices();
                if (prices != null) {
                    arrayList = new ArrayList();
                    for (T next : prices) {
                        boolean z17 = z12;
                        if (j.a(((BiddingPrice) next).getUserId(), fVar.f23051b)) {
                            arrayList.add(next);
                        }
                        z12 = z17;
                    }
                    z13 = z12;
                } else {
                    z13 = z12;
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 && fVar.f23050a.isJoined()) {
                    str9 = "Đã tham gia";
                } else if (!fVar.f23050a.isJoined()) {
                    str9 = "Chưa tham gia";
                } else {
                    Long endRegistTime = fVar.f23050a.getEndRegistTime();
                    if (endRegistTime != null) {
                        long longValue = endRegistTime.longValue();
                        if (z14 && System.currentTimeMillis() > longValue) {
                            str9 = "Vi phạm đấu giá";
                        }
                    }
                    ArrayList<BiddingPrice> prices2 = fVar.f23050a.getPrices();
                    if (prices2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (T next2 : prices2) {
                            if (j.a(((BiddingPrice) next2).getUserId(), fVar.f23051b)) {
                                arrayList3.add(next2);
                            }
                        }
                        Iterator it = arrayList3.iterator();
                        if (!it.hasNext()) {
                            l10 = null;
                        } else {
                            Long price = ((BiddingPrice) it.next()).getPrice();
                            if (price != null) {
                                j14 = price.longValue();
                            } else {
                                j14 = 0;
                            }
                            Long valueOf = Long.valueOf(j14);
                            while (it.hasNext()) {
                                Long price2 = ((BiddingPrice) it.next()).getPrice();
                                if (price2 != null) {
                                    j15 = price2.longValue();
                                } else {
                                    j15 = 0;
                                }
                                Long valueOf2 = Long.valueOf(j15);
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            l10 = valueOf;
                        }
                        if (l10 != null) {
                            j13 = l10.longValue();
                            str9 = b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), j13, new StringBuilder(), " đ");
                        }
                    }
                    j13 = 0;
                    str9 = b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), j13, new StringBuilder(), " đ");
                }
                if (fVar.f23050a.getResult() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (fVar.f23050a.getResult() == ResultAuctionEnum.CANCEL.getValue()) {
                    i15 = C0529R$color.shadow_cancel;
                } else {
                    i15 = R$color.dark_400;
                }
                ArrayList<BiddingPrice> prices3 = fVar.f23050a.getPrices();
                if (prices3 != null) {
                    arrayList2 = new ArrayList();
                    for (T next3 : prices3) {
                        String str11 = str9;
                        String str12 = b10;
                        int i22 = i19;
                        if (j.a(((BiddingPrice) next3).getUserId(), fVar.f23051b)) {
                            arrayList2.add(next3);
                        }
                        str9 = str11;
                        i19 = i22;
                        b10 = str12;
                    }
                    str7 = str9;
                    str10 = b10;
                    i20 = i19;
                } else {
                    str7 = str9;
                    str10 = b10;
                    i20 = i19;
                    arrayList2 = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    z16 = true;
                    z15 = true;
                } else {
                    z16 = true;
                    z15 = false;
                }
                if (z16 ^ z15) {
                    str6 = "Giá cao nhất của tôi";
                } else {
                    str6 = "Trạng thái";
                }
                z11 = z13;
                i17 = i20;
                str8 = str10;
            } else {
                str6 = null;
                i16 = 0;
                priceTable = null;
                i15 = 0;
                i17 = 0;
                z10 = false;
                str7 = null;
                z11 = false;
                str8 = null;
                str4 = null;
                str3 = null;
            }
            if (i21 != 0) {
                if (z11) {
                    j12 = 8;
                } else {
                    j12 = 4;
                }
                j10 |= j12;
            }
            if ((3 & j10) != 0) {
                if (z10) {
                    j11 = 32;
                } else {
                    j11 = 16;
                }
                j10 |= j11;
            }
            i14 = 8;
            if (z11) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            int color = a.getColor(this.f8554e.getContext(), i16);
            if (z10) {
                i14 = 0;
            }
            i11 = a.getColor(this.f8554e.getContext(), i15);
            if (priceTable != null) {
                num = priceTable.getPayCount();
            } else {
                num = null;
            }
            if (num != null) {
                str5 = num.toString();
            } else {
                str5 = null;
            }
            str = str7;
            str2 = str8;
            i10 = color;
            i12 = i17;
            j16 = 3;
        } else {
            str6 = null;
            str5 = null;
            str3 = null;
            i14 = 0;
            i11 = 0;
            str4 = null;
            i13 = 0;
            i12 = 0;
            i10 = 0;
            str2 = null;
            str = null;
        }
        if ((j10 & j16) != 0) {
            this.f21013x.setVisibility(i13);
            c.d(this.B, str4);
            c.d(this.C, str6);
            c.d(this.D, str);
            c.d(this.E, str5);
            this.F.setVisibility(i14);
            c.d(this.f21014y, str3);
            c.b(this.f21014y, i11);
            c.c(this.f21014y, (float) i12);
            this.f21014y.setTextColor(i10);
            c.d(this.f21015z, str2);
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

    public final void v(f fVar) {
        this.A = fVar;
        synchronized (this) {
            this.G |= 1;
        }
        f(3);
        t();
    }
}
