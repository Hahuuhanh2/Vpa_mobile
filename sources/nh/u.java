package nh;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.r;
import com.vpa.daugia.C0541R$style;
import com.vpa.daugia.module.home.ui.AuctionNotifyActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionNotifyActivity.kt */
public final class u extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionNotifyActivity f21690a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(AuctionNotifyActivity auctionNotifyActivity) {
        super(1);
        this.f21690a = auctionNotifyActivity;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        AuctionNotifyActivity auctionNotifyActivity = this.f21690a;
        int i10 = AuctionNotifyActivity.T;
        auctionNotifyActivity.getClass();
        CalendarConstraints.b bVar = new CalendarConstraints.b();
        bVar.f6088e = DateValidatorPointBackward.a();
        CalendarConstraints a10 = bVar.a();
        r.d dVar = new r.d(new RangeDateSelector());
        dVar.f6201c = a10;
        dVar.f6203e = "Chọn thời gian";
        dVar.f6202d = 0;
        dVar.f6205g = "Trở về";
        dVar.f6204f = "Chọn";
        dVar.f6200b = C0541R$style.CustomMaterialDatePicker;
        r a11 = dVar.a();
        a11.f6190u0.add(new n(new v(auctionNotifyActivity)));
        a11.n0(auctionNotifyActivity.G(), (String) null);
        return i.f20112a;
    }
}
