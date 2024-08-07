package mg;

import android.util.SparseIntArray;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import e2.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import n0.l;
import sk.j;
import ug.e;
import ze.b;

/* compiled from: ItemAwaitAuctionBindingImpl */
public final class f5 extends e5 {
    public static final SparseIntArray E;
    public final AppTextView C;
    public long D = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(C0533R$id.llInProgress, 6);
        sparseIntArray.put(C0533R$id.imv, 7);
        sparseIntArray.put(C0533R$id.llWaiting, 8);
        sparseIntArray.put(C0533R$id.imvClock, 9);
        sparseIntArray.put(C0533R$id.tvViewDetail, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f5(d2.e r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = E
            r1 = 11
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r12, r13, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 7
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 9
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 8
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            com.ots.core.utils.customview.textview.AppTitleTextView r8 = (com.ots.core.utils.customview.textview.AppTitleTextView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            com.ots.core.utils.customview.textview.AppTitleTextView r9 = (com.ots.core.utils.customview.textview.AppTitleTextView) r9
            r1 = 10
            r1 = r0[r1]
            r10 = r1
            com.ots.base.utils.customview.GradientTextView r10 = (com.ots.base.utils.customview.GradientTextView) r10
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = -1
            r11.D = r3
            com.google.android.material.button.MaterialButton r12 = r11.f21048w
            r12.setTag(r2)
            r12 = 0
            r12 = r0[r12]
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r12.setTag(r2)
            r12 = 4
            r12 = r0[r12]
            com.ots.core.utils.customview.textview.AppTextView r12 = (com.ots.core.utils.customview.textview.AppTextView) r12
            r11.C = r12
            r12.setTag(r2)
            android.widget.TextView r12 = r11.f21049x
            r12.setTag(r2)
            com.ots.core.utils.customview.textview.AppTitleTextView r12 = r11.f21050y
            r12.setTag(r2)
            com.ots.core.utils.customview.textview.AppTitleTextView r12 = r11.f21051z
            r12.setTag(r2)
            int r12 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r12, r11)
            r11.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.f5.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        CharSequence charSequence;
        String str5;
        OrderWaitAuction orderWaitAuction;
        Integer num;
        long j11;
        String str6;
        String str7;
        String str8;
        Integer num2;
        String str9;
        boolean z10;
        OrderWaitAuction orderWaitAuction2;
        long j12;
        synchronized (this) {
            j10 = this.D;
            this.D = 0;
        }
        e eVar = this.B;
        long j13 = 3;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        boolean z11 = false;
        if (i10 != 0) {
            if (eVar != null) {
                OrderWaitAuction orderWaitAuction3 = eVar.f23049a;
                StringBuilder sb2 = new StringBuilder();
                String plateNumber = eVar.f23049a.getPlateNumber();
                if (plateNumber != null) {
                    str6 = plateNumber.substring(0, 3);
                    j.e(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str6 = null;
                }
                sb2.append(str6);
                sb2.append(10);
                String plateNumber2 = eVar.f23049a.getPlateNumber();
                if (plateNumber2 != null) {
                    str7 = plateNumber2.substring(3, 6);
                    j.e(str7, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str7 = null;
                }
                sb2.append(str7);
                sb2.append('.');
                String plateNumber3 = eVar.f23049a.getPlateNumber();
                if (plateNumber3 != null) {
                    str8 = plateNumber3.substring(6);
                    j.e(str8, "this as java.lang.String).substring(startIndex)");
                } else {
                    str8 = null;
                }
                sb2.append(str8);
                str5 = sb2.toString();
                boolean a10 = eVar.a();
                String vehicleType = eVar.f23049a.getVehicleType();
                if (vehicleType != null) {
                    num2 = Integer.valueOf(Integer.parseInt(vehicleType));
                } else {
                    num2 = null;
                }
                String n10 = b.n(num2);
                Long auctionFromTime = eVar.f23049a.getAuctionFromTime();
                if (auctionFromTime != null) {
                    str = l.h(auctionFromTime.longValue(), new SimpleDateFormat("dd/MM/yyy HH:mm", Locale.getDefault()));
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                if (eVar.a()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Long auctionFromTime2 = eVar.f23049a.getAuctionFromTime();
                    if (auctionFromTime2 != null) {
                        j12 = auctionFromTime2.longValue();
                    } else {
                        j12 = 0;
                    }
                    long j14 = j12 - currentTimeMillis;
                    if (j14 > 0) {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long days = timeUnit.toDays(j14);
                        orderWaitAuction2 = orderWaitAuction3;
                        long hours = timeUnit.toHours(j14) - TimeUnit.DAYS.toHours(days);
                        z10 = a10;
                        str9 = n10;
                        long minutes = timeUnit.toMinutes(j14) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j14));
                        timeUnit.toSeconds(j14);
                        TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j14));
                        StringBuilder sb3 = new StringBuilder();
                        if (days > 0) {
                            sb3.append(days + " ngày ");
                        }
                        if (hours > 0) {
                            sb3.append(hours + " giờ ");
                        }
                        if (minutes > 0) {
                            sb3.append(minutes + " phút ");
                        }
                        charSequence = sb3.toString();
                        j.e(charSequence, "toString(...)");
                        orderWaitAuction = orderWaitAuction2;
                        z11 = z10;
                        str2 = str9;
                    }
                }
                orderWaitAuction2 = orderWaitAuction3;
                z10 = a10;
                str9 = n10;
                charSequence = "Tham gia đấu giá";
                orderWaitAuction = orderWaitAuction2;
                z11 = z10;
                str2 = str9;
            } else {
                charSequence = null;
                str = null;
                orderWaitAuction = null;
                str2 = null;
                str5 = null;
            }
            if (i10 != 0) {
                if (z11) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j10 |= j11;
            }
            if (orderWaitAuction != null) {
                num = orderWaitAuction.getWishlistCount();
            } else {
                num = null;
            }
            z11 = !z11;
            if (num != null) {
                str4 = num.toString();
            } else {
                str4 = null;
            }
            str3 = str5;
            j13 = 3;
        } else {
            str4 = null;
            str = null;
            str2 = null;
            str3 = null;
            charSequence = null;
        }
        if ((j10 & j13) != 0) {
            this.f21048w.setEnabled(z11);
            c.d(this.f21048w, charSequence);
            c.d(this.C, str);
            c.d(this.f21049x, str3);
            c.d(this.f21050y, str4);
            c.d(this.f21051z, str2);
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

    public final void v(e eVar) {
        this.B = eVar;
        synchronized (this) {
            this.D |= 1;
        }
        f(3);
        t();
    }
}
