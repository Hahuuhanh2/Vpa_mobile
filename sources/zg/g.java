package zg;

import android.widget.RadioGroup;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.ui.activity.ForgotActivity;
import mg.b0;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ForgotActivity f23666a;

    public /* synthetic */ g(ForgotActivity forgotActivity) {
        this.f23666a = forgotActivity;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        ForgotActivity forgotActivity = this.f23666a;
        int i11 = ForgotActivity.S;
        j.f(forgotActivity, "this$0");
        switch (i10) {
            case C0533R$id.radioButton1:
                TextInputLayout textInputLayout = ((b0) forgotActivity.M()).B;
                j.e(textInputLayout, "inputEmail");
                textInputLayout.setVisibility(0);
                TextInputLayout textInputLayout2 = ((b0) forgotActivity.M()).C;
                j.e(textInputLayout2, "inputPhone");
                textInputLayout2.setVisibility(8);
                break;
            case C0533R$id.radioButton2:
                TextInputLayout textInputLayout3 = ((b0) forgotActivity.M()).B;
                j.e(textInputLayout3, "inputEmail");
                textInputLayout3.setVisibility(8);
                TextInputLayout textInputLayout4 = ((b0) forgotActivity.M()).C;
                j.e(textInputLayout4, "inputPhone");
                textInputLayout4.setVisibility(0);
                break;
        }
        ((b0) forgotActivity.M()).f20964w.setEnabled(forgotActivity.T());
    }
}
