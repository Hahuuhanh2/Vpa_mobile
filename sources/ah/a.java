package ah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.b;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import ef.f;
import ff.a;
import mg.m2;
import sk.j;

/* compiled from: DialogChangePasswordSuccess.kt */
public final class a extends f.a<a> {

    /* renamed from: i  reason: collision with root package name */
    public m2 f18956i;

    /* renamed from: j  reason: collision with root package name */
    public b f18957j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ChangePasswordActivity changePasswordActivity) {
        super(changePasswordActivity);
        MaterialCardView materialCardView;
        j.f(changePasswordActivity, "context");
        View inflate = LayoutInflater.from(changePasswordActivity).inflate(C0535R$layout.dialog_change_password_success, (ViewGroup) null, false);
        int i10 = 2131361936;
        ImageButton imageButton = (ImageButton) j7.a.D(2131361936, inflate);
        if (imageButton != null) {
            i10 = 2131361937;
            GradientTextView gradientTextView = (GradientTextView) j7.a.D(2131361937, inflate);
            if (gradientTextView != null) {
                i10 = C0533R$id.imvIcon;
                if (((ImageView) j7.a.D(C0533R$id.imvIcon, inflate)) != null) {
                    i10 = C0533R$id.tvContent;
                    if (((AppTextView) j7.a.D(C0533R$id.tvContent, inflate)) != null) {
                        i10 = 2131362806;
                        AppTextView appTextView = (AppTextView) j7.a.D(2131362806, inflate);
                        if (appTextView != null) {
                            this.f18956i = new m2((MaterialCardView) inflate, imageButton, gradientTextView, appTextView);
                            gradientTextView.setOnClickListener(new b(this, 15));
                            ff.a.f10210a.getClass();
                            a.C0107a aVar = a.C0107a.f10211a;
                            c();
                            f(17);
                            d(false);
                            m2 m2Var = this.f18956i;
                            switch (m2Var.f21214a) {
                                case 0:
                                    materialCardView = m2Var.f21215b;
                                    break;
                                default:
                                    materialCardView = m2Var.f21215b;
                                    break;
                            }
                            e(materialCardView);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
