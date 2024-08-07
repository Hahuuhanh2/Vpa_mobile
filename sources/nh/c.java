package nh;

import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ek.i;
import lg.b;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: AnnouncementListActivity.kt */
public final class c extends k implements p<Boolean, Plate, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21645a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(AnnouncementListActivity announcementListActivity) {
        super(2);
        this.f21645a = announcementListActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Plate plate = (Plate) obj2;
        j.f(plate, "item");
        AnnouncementListActivity announcementListActivity = this.f21645a;
        b bVar = announcementListActivity.U;
        if (bVar != null) {
            if (ze.b.l(announcementListActivity, bVar)) {
                HomeViewModel U = this.f21645a.U();
                String bksId = plate.getBksId();
                if (bksId == null) {
                    bksId = "";
                }
                U.d(bksId, booleanValue);
            }
            return i.f20112a;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }
}
