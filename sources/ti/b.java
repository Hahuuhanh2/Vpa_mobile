package ti;

import com.vpa.daugia.module.support.ui.activity.Hilt_SupportActivity;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;

/* compiled from: Hilt_SupportActivity */
public final class b implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_SupportActivity f23018a;

    public b(Hilt_SupportActivity hilt_SupportActivity) {
        this.f23018a = hilt_SupportActivity;
    }

    public final void a() {
        Hilt_SupportActivity hilt_SupportActivity = this.f23018a;
        if (!hilt_SupportActivity.Q) {
            hilt_SupportActivity.Q = true;
            SupportActivity supportActivity = (SupportActivity) hilt_SupportActivity;
            ((h) hilt_SupportActivity.d()).C();
        }
    }
}
