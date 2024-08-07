package ih;

import com.vpa.daugia.module.common.ui.CommonViewModel;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import ek.i;
import java.util.Calendar;
import java.util.TimeZone;
import kf.h;
import mg.i0;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: MyDocumentActivity.kt */
public final class c extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MyDocumentActivity f20566a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(MyDocumentActivity myDocumentActivity) {
        super(0);
        this.f20566a = myDocumentActivity;
    }

    public final Object invoke() {
        Long l10;
        Long l11;
        Long l12;
        MyDocumentActivity myDocumentActivity = this.f20566a;
        if (myDocumentActivity.S != null) {
            CommonViewModel U = myDocumentActivity.U();
            String obj = ((i0) this.f20566a.M()).f21105z.getQuery().toString();
            v1.c<Long, Long> cVar = this.f20566a.S;
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
            v1.c<Long, Long> cVar2 = this.f20566a.S;
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
            CommonViewModel.e(myDocumentActivity.U(), ((i0) this.f20566a.M()).f21105z.getQuery().toString(), 6);
        }
        return i.f20112a;
    }
}
