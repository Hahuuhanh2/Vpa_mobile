package mg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.library.R$id;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auction.data.model.DetailAuctionResult;
import com.vpa.daugia.module.common.data.model.VehicleType;
import d2.e;
import d2.l;
import e2.c;
import f0.b0;
import java.text.NumberFormat;
import java.util.Locale;
import sk.j;
import ug.d;

/* compiled from: ItemDetailAuctionResultBindingImpl */
public final class l5 extends k5 {
    public final AppTextView A;
    public long B = -1;

    /* renamed from: x  reason: collision with root package name */
    public final AppTextView f21167x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21168y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21169z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l5(e eVar, View view) {
        super(view, eVar);
        Object[] o10 = l.o(eVar, view, 5, (l.d) null, (SparseIntArray) null);
        ((MaterialCardView) o10[0]).setTag((Object) null);
        AppTextView appTextView = (AppTextView) o10[1];
        this.f21167x = appTextView;
        appTextView.setTag((Object) null);
        AppTextView appTextView2 = (AppTextView) o10[2];
        this.f21168y = appTextView2;
        appTextView2.setTag((Object) null);
        AppTextView appTextView3 = (AppTextView) o10[3];
        this.f21169z = appTextView3;
        appTextView3.setTag((Object) null);
        AppTextView appTextView4 = (AppTextView) o10[4];
        this.A = appTextView4;
        appTextView4.setTag((Object) null);
        view.setTag(R$id.dataBinding, this);
        m();
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        DetailAuctionResult detailAuctionResult;
        String str4;
        String str5;
        String str6;
        synchronized (this) {
            j10 = this.B;
            this.B = 0;
        }
        d dVar = this.f21155w;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str7 = null;
        if (i10 != 0) {
            if (dVar != null) {
                Long vehicleTypeId = dVar.f23048a.getVehicleTypeId();
                if (vehicleTypeId != null && vehicleTypeId.longValue() == 1) {
                    str3 = VehicleType.AUTOMOBILE.getText();
                } else if (vehicleTypeId != null && vehicleTypeId.longValue() == 2) {
                    str3 = VehicleType.BUS.getText();
                } else if (vehicleTypeId != null && vehicleTypeId.longValue() == 3) {
                    str3 = VehicleType.TRUCK.getText();
                } else {
                    str3 = VehicleType.VAN.getText();
                }
                detailAuctionResult = dVar.f23048a;
                StringBuilder sb2 = new StringBuilder();
                String licensePlate = dVar.f23048a.getLicensePlate();
                if (licensePlate != null) {
                    str4 = licensePlate.substring(0, 3);
                    j.e(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append(" - ");
                String licensePlate2 = dVar.f23048a.getLicensePlate();
                if (licensePlate2 != null) {
                    str5 = licensePlate2.substring(3, 6);
                    j.e(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str5 = null;
                }
                sb2.append(str5);
                sb2.append('.');
                String licensePlate3 = dVar.f23048a.getLicensePlate();
                if (licensePlate3 != null) {
                    str6 = licensePlate3.substring(6);
                    j.e(str6, "this as java.lang.String).substring(startIndex)");
                } else {
                    str6 = null;
                }
                sb2.append(str6);
                str = sb2.toString();
                Long auctionPrice = dVar.f23048a.getAuctionPrice();
                if (auctionPrice != null) {
                    str2 = b0.t(NumberFormat.getNumberInstance(Locale.GERMANY), auctionPrice.longValue(), new StringBuilder(), " đ");
                } else {
                    str2 = null;
                }
            } else {
                str3 = null;
                detailAuctionResult = null;
                str2 = null;
                str = null;
            }
            if (detailAuctionResult != null) {
                str7 = detailAuctionResult.getCityCode();
            }
        } else {
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i10 != 0) {
            c.d(this.f21167x, str7);
            c.d(this.f21168y, str3);
            c.d(this.f21169z, str);
            c.d(this.A, str2);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.B = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(d dVar) {
        this.f21155w = dVar;
        synchronized (this) {
            this.B |= 1;
        }
        f(3);
        t();
    }
}
