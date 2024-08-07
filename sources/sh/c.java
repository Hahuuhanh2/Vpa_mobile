package sh;

import com.vpa.daugia.module.menu.ui.activity.SettingActivity;
import q.l;
import sk.j;
import th.b;

/* compiled from: SettingActivity.kt */
public final class c extends l.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SettingActivity f22904a;

    /* compiled from: SettingActivity.kt */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SettingActivity f22905a;

        public a(SettingActivity settingActivity) {
            this.f22905a = settingActivity;
        }

        public final void a(boolean z10) {
            if (z10) {
                SettingActivity settingActivity = this.f22905a;
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
                this.f22905a.T(false);
            }
        }
    }

    public c(SettingActivity settingActivity) {
        this.f22904a = settingActivity;
    }

    public final void a(CharSequence charSequence) {
        j.f(charSequence, "errString");
        this.f22904a.T(false);
    }

    public final void b() {
        l lVar = this.f22904a.S;
        if (lVar != null) {
            lVar.b();
            this.f22904a.T(false);
            th.a aVar = new th.a(this.f22904a, "Không nhận diện được", "Hệ thống không thể xác minh vân tay của bạn. Vui lòng thử lại!", "Hủy bỏ", "Xác thực lại");
            aVar.f23013j = new a(this.f22904a);
            aVar.h();
            return;
        }
        j.l("biometricPrompt");
        throw null;
    }

    public final void c(l.b bVar) {
        j.f(bVar, "result");
        this.f22904a.T(true);
        new th.a(this.f22904a, "Xác thực thành công", "Vân tay đã sẵn sàng. Bạn có thể sử dụng dấu vân tay của mình để đăng nhập.", "", "").h();
    }
}
