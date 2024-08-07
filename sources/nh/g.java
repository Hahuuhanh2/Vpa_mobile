package nh;

import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import ek.i;
import lg.b;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AnnouncementListActivity.kt */
public final class g extends k implements l<Plate, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21656a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(AnnouncementListActivity announcementListActivity) {
        super(1);
        this.f21656a = announcementListActivity;
    }

    public final Object invoke(Object obj) {
        Plate plate = (Plate) obj;
        j.f(plate, "it");
        AnnouncementListActivity announcementListActivity = this.f21656a;
        b bVar = announcementListActivity.U;
        if (bVar != null) {
            if (ze.b.l(announcementListActivity, bVar)) {
                this.f21656a.U().j(plate.getBksId());
            }
            return i.f20112a;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }
}
