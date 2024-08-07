package zg;

import android.view.View;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import mg.r;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordActivity f23633a;

    public /* synthetic */ c(ChangePasswordActivity changePasswordActivity) {
        this.f23633a = changePasswordActivity;
    }

    public final void onFocusChange(View view, boolean z10) {
        ChangePasswordActivity changePasswordActivity = this.f23633a;
        int i10 = ChangePasswordActivity.Y;
        j.f(changePasswordActivity, "this$0");
        if (z10) {
            AppTextView appTextView = ((r) changePasswordActivity.M()).M;
            j.e(appTextView, "tvTitleConfirmassword");
            PasswordEditText passwordEditText = ((r) changePasswordActivity.M()).f21322y;
            j.e(passwordEditText, "edtConfirmPassword");
            changePasswordActivity.U(appTextView, passwordEditText);
        } else {
            AppTextView appTextView2 = ((r) changePasswordActivity.M()).M;
            j.e(appTextView2, "tvTitleConfirmassword");
            PasswordEditText passwordEditText2 = ((r) changePasswordActivity.M()).f21322y;
            j.e(passwordEditText2, "edtConfirmPassword");
            ChangePasswordActivity.V(appTextView2, passwordEditText2, changePasswordActivity.V);
        }
        ((r) changePasswordActivity.M()).B.setSelected(z10);
    }
}
