package mg;

import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import e2.c;
import eh.b;
import sk.j;

/* compiled from: ItemPlateInfoBindingImpl */
public final class r6 extends q6 {

    /* renamed from: z  reason: collision with root package name */
    public long f21332z = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r6(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r0, r1, r1)
            r2 = 1
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.f21332z = r2
            r5 = 0
            r5 = r0[r5]
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r5.setTag(r1)
            android.widget.TextView r5 = r4.f21315w
            r5.setTag(r1)
            android.widget.TextView r5 = r4.f21316x
            r5.setTag(r1)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.r6.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        long j11;
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        String str5;
        long j12;
        synchronized (this) {
            j10 = this.f21332z;
            j11 = 0;
            this.f21332z = 0;
        }
        b bVar = this.f21317y;
        int i11 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        int i12 = 0;
        String str6 = null;
        if (i11 != 0) {
            if (bVar != null) {
                CartStatus cartStatus = bVar.f20061b;
                CartStatus cartStatus2 = CartStatus.PAID;
                if (cartStatus == cartStatus2) {
                    str3 = "Đã thanh toán";
                } else if (bVar.f20060a.getRegisterToDate() == null) {
                    str3 = "Chưa có kế hoạch đấu giá";
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    Long registerToDate = bVar.f20060a.getRegisterToDate();
                    if (registerToDate != null) {
                        j12 = registerToDate.longValue();
                    } else {
                        j12 = 0;
                    }
                    if (currentTimeMillis > j12) {
                        str3 = "Quá hạn thanh toán";
                    } else {
                        str3 = "Chưa thanh toán";
                    }
                }
                if (bVar.f20061b == cartStatus2) {
                    i10 = 2131100275;
                } else {
                    if (bVar.f20060a.getRegisterToDate() != null) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Long registerToDate2 = bVar.f20060a.getRegisterToDate();
                        if (registerToDate2 != null) {
                            j11 = registerToDate2.longValue();
                        }
                        if (currentTimeMillis2 > j11) {
                            i10 = C0529R$color.expired;
                        }
                    }
                    i10 = 2131100624;
                }
                StringBuilder sb2 = new StringBuilder();
                String plateNumber = bVar.f20060a.getPlateNumber();
                if (plateNumber != null) {
                    str4 = plateNumber.substring(0, 3);
                    j.e(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append(" - ");
                String plateNumber2 = bVar.f20060a.getPlateNumber();
                if (plateNumber2 != null) {
                    str5 = plateNumber2.substring(3, 6);
                    j.e(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str5 = null;
                }
                sb2.append(str5);
                sb2.append('.');
                String plateNumber3 = bVar.f20060a.getPlateNumber();
                if (plateNumber3 != null) {
                    str6 = plateNumber3.substring(6);
                    j.e(str6, "this as java.lang.String).substring(startIndex)");
                }
                sb2.append(str6);
                str6 = str3;
                int i13 = i10;
                str2 = sb2.toString();
                i12 = i13;
            } else {
                str2 = null;
            }
            i12 = this.f8554e.getContext().getColor(i12);
            String str7 = str6;
            str6 = str2;
            str = str7;
        } else {
            str = null;
        }
        if (i11 != 0) {
            c.d(this.f21315w, str6);
            c.d(this.f21316x, str);
            this.f21316x.setTextColor(i12);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21332z != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21332z = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(b bVar) {
        this.f21317y = bVar;
        synchronized (this) {
            this.f21332z |= 1;
        }
        f(3);
        t();
    }
}
