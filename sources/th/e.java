package th;

import a1.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.search.h;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.menu.ui.activity.SettingActivity;
import ef.f;
import ff.a;
import j7.a;

/* compiled from: IsBiometricDialog.kt */
public final class e extends f.a<e> {

    /* renamed from: i  reason: collision with root package name */
    public c f23016i;

    public e(SettingActivity settingActivity) {
        super(settingActivity);
        View inflate = LayoutInflater.from(settingActivity).inflate(C0535R$layout.dialog_is_biometric, (ViewGroup) null, false);
        int i10 = 2131361937;
        MaterialButton materialButton = (MaterialButton) a.D(2131361937, inflate);
        if (materialButton != null) {
            i10 = 2131362747;
            TextView textView = (TextView) a.D(2131362747, inflate);
            if (textView != null) {
                i10 = 2131362806;
                TextView textView2 = (TextView) a.D(2131362806, inflate);
                if (textView2 != null) {
                    c cVar = new c((MaterialCardView) inflate, materialButton, textView, textView2);
                    this.f23016i = cVar;
                    ((TextView) cVar.f27d).setText("Chưa cài đặt FaceID");
                    ((TextView) this.f23016i.f26c).setText("Thiết bị chưa cài đặt vân tay. Vui lòng cài đặt để sử dụng!");
                    ((MaterialButton) this.f23016i.f25b).setText("Đóng");
                    ((MaterialButton) this.f23016i.f25b).setOnClickListener(new h(this, 28));
                    e((MaterialCardView) this.f23016i.f24a);
                    ff.a.f10210a.getClass();
                    a.C0107a aVar = a.C0107a.f10211a;
                    c();
                    d(false);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
