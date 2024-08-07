package sg;

import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import ek.i;
import java.util.Calendar;
import java.util.TimeZone;
import kf.h;
import mg.m;
import rk.a;
import sk.j;
import sk.k;
import v1.c;

/* compiled from: AuctionResultActivity.kt */
public final class g extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionResultActivity f22878a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(AuctionResultActivity auctionResultActivity) {
        super(0);
        this.f22878a = auctionResultActivity;
    }

    public final Object invoke() {
        Long l10;
        Long l11;
        Long l12;
        AuctionResultActivity auctionResultActivity = this.f22878a;
        if (auctionResultActivity.S != null) {
            AuctionViewModel U = auctionResultActivity.U();
            String obj = ((m) this.f22878a.M()).f21182z.getQuery().toString();
            c<Long, Long> cVar = this.f22878a.S;
            Long l13 = null;
            if (cVar == null || (l12 = (Long) cVar.f16012a) == null) {
                l10 = null;
            } else {
                long longValue = l12.longValue();
                TimeZone timeZone = TimeZone.getDefault();
                Calendar instance = Calendar.getInstance(timeZone);
                j.e(instance, "getInstance(...)");
                int offset = timeZone.getOffset(instance.getTimeInMillis());
                int i10 = h.f12560a;
                l10 = Long.valueOf(longValue - ((long) offset));
            }
            c<Long, Long> cVar2 = this.f22878a.S;
            if (!(cVar2 == null || (l11 = (Long) cVar2.f16013b) == null)) {
                long longValue2 = l11.longValue();
                TimeZone timeZone2 = TimeZone.getDefault();
                Calendar instance2 = Calendar.getInstance(timeZone2);
                j.e(instance2, "getInstance(...)");
                int offset2 = timeZone2.getOffset(instance2.getTimeInMillis());
                int i11 = h.f12560a;
                l13 = Long.valueOf(longValue2 - ((long) offset2));
            }
            j.c(l13);
            U.d(obj, l10, Long.valueOf(l13.longValue() + ((long) 68400000)));
        } else {
            AuctionViewModel.e(auctionResultActivity.U(), ((m) this.f22878a.M()).f21182z.getQuery().toString(), 6);
        }
        return i.f20112a;
    }
}
