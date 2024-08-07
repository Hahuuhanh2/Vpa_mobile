package th;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.datepicker.q;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.menu.ui.activity.SettingActivity;
import ef.f;
import ff.a;
import j7.a;
import sk.j;
import ve.b;

/* compiled from: ConfirmBiometricDialog.kt */
public final class c extends f.a<c> {

    /* renamed from: i  reason: collision with root package name */
    public b f23014i;

    /* renamed from: j  reason: collision with root package name */
    public d f23015j;

    public c(SettingActivity settingActivity) {
        super(settingActivity);
        boolean z10;
        View inflate = LayoutInflater.from(settingActivity).inflate(C0535R$layout.dialog_confirm_biometric, (ViewGroup) null, false);
        int i10 = 2131361931;
        MaterialButton materialButton = (MaterialButton) a.D(2131361931, inflate);
        if (materialButton != null) {
            i10 = 2131361937;
            MaterialButton materialButton2 = (MaterialButton) a.D(2131361937, inflate);
            if (materialButton2 != null) {
                i10 = 2131362747;
                TextView textView = (TextView) a.D(2131362747, inflate);
                if (textView != null) {
                    i10 = 2131362806;
                    TextView textView2 = (TextView) a.D(2131362806, inflate);
                    if (textView2 != null) {
                        b bVar = new b((MaterialCardView) inflate, materialButton, materialButton2, textView, textView2);
                        this.f23014i = bVar;
                        ((TextView) bVar.f16195e).setText("Cài đặt vân tay");
                        this.f23014i.f16194d.setText("Bạn có đồng ý sử dụng vân tay để đăng nhập?");
                        boolean z11 = true;
                        if ("Xác nhận".length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            this.f23014i.f16193c.setText("Xác nhận");
                            MaterialButton materialButton3 = this.f23014i.f16193c;
                            j.e(materialButton3, "btnConfirm");
                            materialButton3.setVisibility(0);
                        } else {
                            MaterialButton materialButton4 = this.f23014i.f16193c;
                            j.e(materialButton4, "btnConfirm");
                            materialButton4.setVisibility(8);
                        }
                        if ("Từ chối".length() <= 0 ? false : z11) {
                            this.f23014i.f16192b.setText("Từ chối");
                            MaterialButton materialButton5 = this.f23014i.f16192b;
                            j.e(materialButton5, "btnCancel");
                            materialButton5.setVisibility(0);
                        } else {
                            MaterialButton materialButton6 = this.f23014i.f16192b;
                            j.e(materialButton6, "btnCancel");
                            materialButton6.setVisibility(8);
                        }
                        this.f23014i.f16192b.setOnClickListener(new com.google.android.material.textfield.b(this, 25));
                        this.f23014i.f16193c.setOnClickListener(new q(this, 27));
                        e(this.f23014i.f16191a);
                        ff.a.f10210a.getClass();
                        a.C0107a aVar = a.C0107a.f10211a;
                        c();
                        d(false);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
