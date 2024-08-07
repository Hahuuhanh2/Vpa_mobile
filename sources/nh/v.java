package nh;

import al.a0;
import com.vpa.daugia.module.home.data.api.request.NotifyAuctionRequest;
import com.vpa.daugia.module.home.ui.AuctionNotifyActivity;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ek.i;
import ik.d;
import java.util.Calendar;
import java.util.TimeZone;
import kf.h;
import p3.l0;
import rk.l;
import sk.e;
import sk.j;
import sk.k;
import v1.c;

/* compiled from: AuctionNotifyActivity.kt */
public final class v extends k implements l<c<Long, Long>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionNotifyActivity f21694a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(AuctionNotifyActivity auctionNotifyActivity) {
        super(1);
        this.f21694a = auctionNotifyActivity;
    }

    public final Object invoke(Object obj) {
        c cVar = (c) obj;
        AuctionNotifyActivity auctionNotifyActivity = this.f21694a;
        int i10 = AuctionNotifyActivity.T;
        auctionNotifyActivity.U().f19710h = new NotifyAuctionRequest((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (Integer) null, 63, (e) null);
        HomeViewModel U = this.f21694a.U();
        String obj2 = ((mg.c) this.f21694a.M()).f20998z.getQuery().toString();
        F f10 = cVar.f16012a;
        j.e(f10, "first");
        long longValue = ((Number) f10).longValue();
        TimeZone timeZone = TimeZone.getDefault();
        Calendar instance = Calendar.getInstance(timeZone);
        j.e(instance, "getInstance(...)");
        int offset = timeZone.getOffset(instance.getTimeInMillis());
        int i11 = h.f12560a;
        Long valueOf = Long.valueOf(longValue - ((long) offset));
        S s10 = cVar.f16013b;
        j.e(s10, "second");
        long longValue2 = ((Number) s10).longValue();
        TimeZone timeZone2 = TimeZone.getDefault();
        Calendar instance2 = Calendar.getInstance(timeZone2);
        j.e(instance2, "getInstance(...)");
        l0.j0(l0.d0(U), (a0) null, new a1(U, valueOf, Long.valueOf(longValue2 - ((long) timeZone2.getOffset(instance2.getTimeInMillis()))), obj2, (d<? super a1>) null), 3);
        return i.f20112a;
    }
}
