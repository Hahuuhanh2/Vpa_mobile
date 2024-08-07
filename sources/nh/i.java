package nh;

import android.view.View;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.register.data.model.RegisterAuction;
import mg.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AnnouncementListActivity.kt */
public final class i extends k implements l<f<? extends RegisterAuction>, ek.i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21661a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(AnnouncementListActivity announcementListActivity) {
        super(1);
        this.f21661a = announcementListActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((a) this.f21661a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new of.a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (!j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            this.f21661a.S = ((RegisterAuction) ((f.c) fVar).f18006a).getId();
        }
        return ek.i.f20112a;
    }
}
