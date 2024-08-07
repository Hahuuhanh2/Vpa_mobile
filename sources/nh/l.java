package nh;

import android.view.View;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import ek.i;
import mg.a;
import of.b;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AnnouncementListActivity.kt */
public final class l extends k implements rk.l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21667a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(AnnouncementListActivity announcementListActivity) {
        super(1);
        this.f21667a = announcementListActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((a) this.f21667a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new of.a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        }
        return i.f20112a;
    }
}
