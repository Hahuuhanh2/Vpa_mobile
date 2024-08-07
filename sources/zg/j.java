package zg;

import com.vpa.daugia.module.auth.ui.activity.AuthActivity;
import com.vpa.daugia.module.auth.ui.activity.Hilt_AuthActivity;
import e.b;

/* compiled from: Hilt_AuthActivity */
public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_AuthActivity f23677a;

    public j(Hilt_AuthActivity hilt_AuthActivity) {
        this.f23677a = hilt_AuthActivity;
    }

    public final void a() {
        Hilt_AuthActivity hilt_AuthActivity = this.f23677a;
        if (!hilt_AuthActivity.Q) {
            hilt_AuthActivity.Q = true;
            AuthActivity authActivity = (AuthActivity) hilt_AuthActivity;
            ((a) hilt_AuthActivity.d()).g();
        }
    }
}
