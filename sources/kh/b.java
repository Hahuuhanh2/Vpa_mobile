package kh;

import com.vpa.daugia.module.history.HistoryViewModel;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import ek.i;
import java.util.Calendar;
import java.util.TimeZone;
import kf.h;
import mg.e;
import rk.a;
import sk.j;
import sk.k;
import v1.c;

/* compiled from: AuctionHistoryActivity.kt */
public final class b extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionHistoryActivity f20811a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AuctionHistoryActivity auctionHistoryActivity) {
        super(0);
        this.f20811a = auctionHistoryActivity;
    }

    public final Object invoke() {
        Long l10;
        Long l11;
        Long l12;
        AuctionHistoryActivity auctionHistoryActivity = this.f20811a;
        if (auctionHistoryActivity.S != null) {
            HistoryViewModel U = auctionHistoryActivity.U();
            String obj = ((e) this.f20811a.M()).f21033z.getQuery().toString();
            c<Long, Long> cVar = this.f20811a.S;
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
            c<Long, Long> cVar2 = this.f20811a.S;
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
            HistoryViewModel.e(auctionHistoryActivity.U(), ((e) this.f20811a.M()).f21033z.getQuery().toString(), 6);
        }
        return i.f20112a;
    }
}
