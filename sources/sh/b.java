package sh;

import com.vpa.daugia.module.menu.ui.activity.SettingActivity;
import mg.p1;
import q.l;
import sk.j;
import th.d;

/* compiled from: SettingActivity.kt */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SettingActivity f22903a;

    public b(SettingActivity settingActivity) {
        this.f22903a = settingActivity;
    }

    public final void a(boolean z10) {
        if (z10) {
            SettingActivity settingActivity = this.f22903a;
            l lVar = settingActivity.S;
            if (lVar != null) {
                l.d dVar = settingActivity.T;
                if (dVar != null) {
                    lVar.a(dVar);
                } else {
                    j.l("promptInfo");
                    throw null;
                }
            } else {
                j.l("biometricPrompt");
                throw null;
            }
        } else {
            ((p1) this.f22903a.M()).f21283w.setChecked(false);
        }
    }
}
