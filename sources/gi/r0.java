package gi;

import android.view.View;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import mg.x0;
import of.b;
import rk.a;
import sk.j;
import sk.k;
import yk.l;

/* compiled from: ProfileActivity.kt */
public final class r0 extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20409a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(ProfileActivity profileActivity) {
        super(0);
        this.f20409a = profileActivity;
    }

    public final Object invoke() {
        String str;
        CharSequence text = ((x0) this.f20409a.M()).f21440l0.getText();
        if (text == null) {
            str = "";
        } else {
            str = l.k1(text.toString()).toString();
        }
        if (j.a(str, "Quận/ huyện *")) {
            View view = ((x0) this.f20409a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new of.a(view).a("Vui lòng chọn Quận/Huyện", b.ERROR);
            ((x0) this.f20409a.M()).E.setScrollY((int) ((x0) this.f20409a.M()).f21440l0.getY());
        } else {
            ((x0) this.f20409a.M()).P.b();
        }
        return i.f20112a;
    }
}
