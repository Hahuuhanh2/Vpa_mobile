package nh;

import android.view.View;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import d.h;
import ji.d;
import lf.g;
import mg.a;
import of.b;

/* compiled from: AnnouncementListActivity.kt */
public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21663a;

    public j(AnnouncementListActivity announcementListActivity) {
        this.f21663a = announcementListActivity;
    }

    public final void a() {
        View view = ((a) this.f21663a.M()).f8554e;
        sk.j.e(view, "getRoot(...)");
        new of.a(view).a("Đăng kí biển số thành công", b.SUCCESS);
        AnnouncementListActivity announcementListActivity = this.f21663a;
        h hVar = new h(announcementListActivity, 29);
        announcementListActivity.getClass();
        g.b.a(announcementListActivity, hVar, 1000);
    }
}
