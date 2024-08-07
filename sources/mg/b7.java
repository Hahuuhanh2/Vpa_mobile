package mg;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.p003enum.StatusRoomAuction;
import e2.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import sk.j;
import ug.f;
import yk.l;
import ze.b;

/* compiled from: ItemRoomAuctionBindingImpl */
public final class b7 extends a7 {
    public static final SparseIntArray I;
    public final AppTextView D;
    public final AppTextView E;
    public final AppTextView F;
    public final LinearLayout G;
    public long H = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(C0533R$id.tvTotalInterested, 9);
        sparseIntArray.put(C0533R$id.llInProgress, 10);
        sparseIntArray.put(C0533R$id.imv, 11);
        sparseIntArray.put(C0533R$id.imvClock, 12);
        sparseIntArray.put(C0533R$id.tvViewDetail, 13);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b7(d2.e r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = I
            r1 = 14
            r2 = 0
            java.lang.Object[] r0 = d2.l.o(r13, r14, r1, r2, r0)
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 11
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 12
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 10
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            com.ots.base.utils.customview.TimeCounterView r8 = (com.ots.base.utils.customview.TimeCounterView) r8
            r1 = 9
            r1 = r0[r1]
            r9 = r1
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r1 = 2
            r1 = r0[r1]
            r10 = r1
            com.ots.core.utils.customview.textview.AppTextView r10 = (com.ots.core.utils.customview.textview.AppTextView) r10
            r1 = 13
            r1 = r0[r1]
            r11 = r1
            com.ots.base.utils.customview.GradientTextView r11 = (com.ots.base.utils.customview.GradientTextView) r11
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = -1
            r12.H = r3
            com.google.android.material.button.MaterialButton r13 = r12.f20960w
            r13.setTag(r2)
            r13 = 0
            r13 = r0[r13]
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r13.setTag(r2)
            r13 = 3
            r13 = r0[r13]
            com.ots.core.utils.customview.textview.AppTextView r13 = (com.ots.core.utils.customview.textview.AppTextView) r13
            r12.D = r13
            r13.setTag(r2)
            r13 = 4
            r13 = r0[r13]
            com.ots.core.utils.customview.textview.AppTextView r13 = (com.ots.core.utils.customview.textview.AppTextView) r13
            r12.E = r13
            r13.setTag(r2)
            r13 = 5
            r13 = r0[r13]
            com.ots.core.utils.customview.textview.AppTextView r13 = (com.ots.core.utils.customview.textview.AppTextView) r13
            r12.F = r13
            r13.setTag(r2)
            r13 = 6
            r13 = r0[r13]
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.G = r13
            r13.setTag(r2)
            android.widget.TextView r13 = r12.f20961x
            r13.setTag(r2)
            com.ots.base.utils.customview.TimeCounterView r13 = r12.f20962y
            r13.setTag(r2)
            com.ots.core.utils.customview.textview.AppTextView r13 = r12.A
            r13.setTag(r2)
            int r13 = androidx.databinding.library.R$id.dataBinding
            r14.setTag(r13, r12)
            r12.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.b7.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z10;
        String str6;
        String str7;
        boolean z11;
        long j11;
        synchronized (this) {
            j10 = this.H;
            this.H = 0;
        }
        f fVar = this.C;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i10 == 0 || fVar == null) {
            str6 = null;
            z10 = false;
            str = null;
            str5 = null;
            str4 = null;
            str2 = null;
            str3 = null;
        } else {
            Integer status = fVar.f23050a.getStatus();
            StatusRoomAuction statusRoomAuction = StatusRoomAuction.PROGRESSING;
            int value = statusRoomAuction.getValue();
            if (status != null && status.intValue() == value) {
                z10 = true;
            } else {
                z10 = false;
            }
            String b10 = fVar.b();
            Integer status2 = fVar.f23050a.getStatus();
            StatusRoomAuction statusRoomAuction2 = StatusRoomAuction.WAITING;
            int value2 = statusRoomAuction2.getValue();
            if (status2 != null && status2.intValue() == value2) {
                Long startAuction = fVar.f23050a.getStartAuction();
                if (startAuction != null) {
                    j11 = startAuction.longValue();
                } else {
                    j11 = 0;
                }
                long currentTimeMillis = j11 - System.currentTimeMillis();
                if (currentTimeMillis > 0) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long days = timeUnit.toDays(currentTimeMillis);
                    long hours = timeUnit.toHours(currentTimeMillis) - TimeUnit.DAYS.toHours(days);
                    str7 = b10;
                    long minutes = timeUnit.toMinutes(currentTimeMillis) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(currentTimeMillis));
                    long seconds = timeUnit.toSeconds(currentTimeMillis) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(currentTimeMillis));
                    StringBuilder sb2 = new StringBuilder();
                    if (days > 0) {
                        sb2.append(days + " ngày ");
                    }
                    if (hours > 0) {
                        sb2.append(hours + " giờ ");
                    }
                    if (minutes > 0) {
                        sb2.append(minutes + " phút ");
                    }
                    if (seconds > 0) {
                        sb2.append(String.valueOf(seconds));
                    }
                    String sb3 = sb2.toString();
                    j.e(sb3, "toString(...)");
                    str5 = l.k1(sb3).toString();
                } else {
                    str7 = b10;
                    str5 = "Tham gia đấu giá";
                }
            } else {
                str7 = b10;
                int value3 = statusRoomAuction.getValue();
                if (status2 != null && status2.intValue() == value3) {
                    str5 = "Tham giá đấu giá";
                } else {
                    int value4 = StatusRoomAuction.END.getValue();
                    if (status2 != null && status2.intValue() == value4) {
                        str5 = "Xem kết quả đấu giá";
                    } else {
                        str5 = "";
                    }
                }
            }
            str4 = b.n(fVar.f23050a.getVehicleType()) + " - " + fVar.f23050a.getProvince();
            Long startAuction2 = fVar.f23050a.getStartAuction();
            if (startAuction2 != null) {
                str2 = n0.l.h(startAuction2.longValue(), new SimpleDateFormat("dd/MM/yyy HH:mm", Locale.getDefault()));
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = null;
            }
            Integer status3 = fVar.f23050a.getStatus();
            int value5 = statusRoomAuction.getValue();
            if (status3 != null && status3.intValue() == value5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str = "Cuộc đấu giá đang diễn ra";
            } else {
                str = "Thời gian đến cuộc đấu giá:";
            }
            Integer status4 = fVar.f23050a.getStatus();
            int value6 = statusRoomAuction2.getValue();
            if (status4 != null && status4.intValue() == value6) {
                str6 = statusRoomAuction2.getText();
            } else {
                int value7 = statusRoomAuction.getValue();
                if (status4 != null && status4.intValue() == value7) {
                    str6 = statusRoomAuction.getText();
                } else {
                    int value8 = StatusRoomAuction.END.getValue();
                    if (status4 != null && status4.intValue() == value8) {
                        str6 = "Cuộc đấu giá đã kết thúc";
                    } else {
                        str6 = "";
                    }
                }
            }
            str3 = str7;
        }
        if (i10 != 0) {
            this.f20960w.setEnabled(z10);
            c.d(this.f20960w, str5);
            c.d(this.D, str6);
            c.d(this.E, str2);
            c.d(this.F, str);
            this.G.setEnabled(z10);
            c.d(this.f20961x, str3);
            this.f20962y.setEnabled(z10);
            c.d(this.A, str4);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.H != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.H = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(f fVar) {
        this.C = fVar;
        synchronized (this) {
            this.H |= 1;
        }
        f(3);
        t();
    }
}
