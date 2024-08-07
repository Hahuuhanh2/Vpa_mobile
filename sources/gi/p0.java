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
public final class p0 extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20405a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(ProfileActivity profileActivity) {
        super(0);
        this.f20405a = profileActivity;
    }

    public final Object invoke() {
        String str;
        CharSequence text = ((x0) this.f20405a.M()).f21437i0.getText();
        if (text == null) {
            str = "";
        } else {
            str = l.k1(text.toString()).toString();
        }
        if (j.a(str, "Tỉnh/ thành phố *")) {
            View view = ((x0) this.f20405a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new of.a(view).a("Vui lòng chọn Tỉnh/Thành phố", b.ERROR);
            ((x0) this.f20405a.M()).E.setScrollY((int) ((x0) this.f20405a.M()).f21437i0.getY());
        } else {
            ((x0) this.f20405a.M()).I.b();
        }
        return i.f20112a;
    }
}
