package zg;

import android.view.View;
import com.ots.core.base.BaseActivity;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import mg.c4;
import mg.r;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f23623b;

    public /* synthetic */ b(BaseActivity baseActivity, int i10) {
        this.f23622a = i10;
        this.f23623b = baseActivity;
    }

    public final void onFocusChange(View view, boolean z10) {
        switch (this.f23622a) {
            case 0:
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) this.f23623b;
                int i10 = ChangePasswordActivity.Y;
                j.f(changePasswordActivity, "this$0");
                if (z10) {
                    AppTextView appTextView = ((r) changePasswordActivity.M()).N;
                    j.e(appTextView, "tvTitleNewPassword");
                    PasswordEditText passwordEditText = ((r) changePasswordActivity.M()).A;
                    j.e(passwordEditText, "edtPassword");
                    changePasswordActivity.U(appTextView, passwordEditText);
                } else {
                    AppTextView appTextView2 = ((r) changePasswordActivity.M()).N;
                    j.e(appTextView2, "tvTitleNewPassword");
                    PasswordEditText passwordEditText2 = ((r) changePasswordActivity.M()).A;
                    j.e(passwordEditText2, "edtPassword");
                    ChangePasswordActivity.V(appTextView2, passwordEditText2, changePasswordActivity.U);
                }
                ((r) changePasswordActivity.M()).C.setSelected(z10);
                return;
            default:
                StepTwoActivity stepTwoActivity = (StepTwoActivity) this.f23623b;
                int i11 = StepTwoActivity.V;
                j.f(stepTwoActivity, "this$0");
                if (z10) {
                    stepTwoActivity.V();
                } else {
                    stepTwoActivity.W();
                }
                ((c4) stepTwoActivity.M()).f21010y.L.setSelected(z10);
                return;
        }
    }
}
