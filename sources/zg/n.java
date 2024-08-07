package zg;

import com.vpa.daugia.module.auth.ui.activity.Hilt_ReadQrCodeActivity;
import com.vpa.daugia.module.auth.ui.activity.ReadQrCodeActivity;
import e.b;

/* compiled from: Hilt_ReadQrCodeActivity */
public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Hilt_ReadQrCodeActivity f23695a;

    public n(Hilt_ReadQrCodeActivity hilt_ReadQrCodeActivity) {
        this.f23695a = hilt_ReadQrCodeActivity;
    }

    public final void a() {
        Hilt_ReadQrCodeActivity hilt_ReadQrCodeActivity = this.f23695a;
        if (!hilt_ReadQrCodeActivity.Q) {
            hilt_ReadQrCodeActivity.Q = true;
            ReadQrCodeActivity readQrCodeActivity = (ReadQrCodeActivity) hilt_ReadQrCodeActivity;
            ((z) hilt_ReadQrCodeActivity.d()).u();
        }
    }
}
