package sg;

import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import ef.n;
import ek.i;
import java.util.Calendar;
import java.util.TimeZone;
import kf.h;
import mg.m;
import rk.l;
import sk.j;
import v1.c;

/* compiled from: AuctionResultActivity.kt */
public final class k extends sk.k implements l<c<Long, Long>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionResultActivity f22885a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(AuctionResultActivity auctionResultActivity) {
        super(1);
        this.f22885a = auctionResultActivity;
    }

    public final Object invoke(Object obj) {
        c<Long, Long> cVar = (c) obj;
        AuctionResultActivity auctionResultActivity = this.f22885a;
        auctionResultActivity.S = cVar;
        auctionResultActivity.U().f19386g = new n<>((Object) null);
        AuctionViewModel U = this.f22885a.U();
        U.f19396q = 0;
        U.f19397r = 1;
        AuctionViewModel U2 = this.f22885a.U();
        String obj2 = ((m) this.f22885a.M()).f21182z.getQuery().toString();
        F f10 = cVar.f16012a;
        j.e(f10, "first");
        long longValue = ((Number) f10).longValue();
        TimeZone timeZone = TimeZone.getDefault();
        Calendar instance = Calendar.getInstance(timeZone);
        j.e(instance, "getInstance(...)");
        int offset = timeZone.getOffset(instance.getTimeInMillis());
        int i10 = h.f12560a;
        Long valueOf = Long.valueOf(longValue - ((long) offset));
        S s10 = cVar.f16013b;
        j.e(s10, "second");
        long longValue2 = ((Number) s10).longValue();
        TimeZone timeZone2 = TimeZone.getDefault();
        Calendar instance2 = Calendar.getInstance(timeZone2);
        j.e(instance2, "getInstance(...)");
        U2.d(obj2, valueOf, Long.valueOf((longValue2 - ((long) timeZone2.getOffset(instance2.getTimeInMillis()))) + ((long) 68400000)));
        return i.f20112a;
    }
}
