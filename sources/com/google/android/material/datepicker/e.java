package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.x;
import com.google.android.material.textfield.k;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import mg.c4;
import mg.r;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6145a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6146b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f6145a = i10;
        this.f6146b = obj;
    }

    public final void onFocusChange(View view, boolean z10) {
        switch (this.f6145a) {
            case 0:
                EditText[] editTextArr = (EditText[]) this.f6146b;
                int length = editTextArr.length;
                int i10 = 0;
                while (i10 < length) {
                    if (!editTextArr[i10].hasFocus()) {
                        i10++;
                    } else {
                        return;
                    }
                }
                x.f(view, false);
                return;
            case 1:
                com.google.android.material.textfield.e eVar = (com.google.android.material.textfield.e) this.f6146b;
                eVar.t(eVar.u());
                return;
            case 2:
                k kVar = (k) this.f6146b;
                kVar.f7041l = z10;
                kVar.q();
                if (!z10) {
                    kVar.t(false);
                    kVar.f7042m = false;
                    return;
                }
                return;
            case 3:
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) this.f6146b;
                int i11 = ChangePasswordActivity.Y;
                j.f(changePasswordActivity, "this$0");
                if (z10) {
                    AppTextView appTextView = ((r) changePasswordActivity.M()).O;
                    j.e(appTextView, "tvTitleOldPassword");
                    PasswordEditText passwordEditText = ((r) changePasswordActivity.M()).f21323z;
                    j.e(passwordEditText, "edtOldPassword");
                    changePasswordActivity.U(appTextView, passwordEditText);
                } else {
                    AppTextView appTextView2 = ((r) changePasswordActivity.M()).O;
                    j.e(appTextView2, "tvTitleOldPassword");
                    PasswordEditText passwordEditText2 = ((r) changePasswordActivity.M()).f21323z;
                    j.e(passwordEditText2, "edtOldPassword");
                    ChangePasswordActivity.V(appTextView2, passwordEditText2, changePasswordActivity.T);
                }
                ((r) changePasswordActivity.M()).D.setSelected(z10);
                return;
            default:
                StepTwoActivity stepTwoActivity = (StepTwoActivity) this.f6146b;
                int i12 = StepTwoActivity.V;
                j.f(stepTwoActivity, "this$0");
                if (z10) {
                    stepTwoActivity.V();
                } else {
                    stepTwoActivity.W();
                }
                ((c4) stepTwoActivity.M()).f21011z.I.setSelected(z10);
                return;
        }
    }
}
