package nh;

import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.a;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AnnouncementListActivity.kt */
public final class h extends k implements l<f<? extends ArrayList<Plate>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21659a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(AnnouncementListActivity announcementListActivity) {
        super(1);
        this.f21659a = announcementListActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            if (((a) this.f21659a.M()).f20932y.getOnLoadMore()) {
                this.f21659a.T().t((List) ((f.c) fVar).f18006a);
                ((a) this.f21659a.M()).f20932y.setOnLoadMore(false);
            } else {
                this.f21659a.T().A((List) ((f.c) fVar).f18006a);
            }
            ((a) this.f21659a.M()).f20932y.b(this.f21659a.T().f9444f);
        }
        return i.f20112a;
    }
}
