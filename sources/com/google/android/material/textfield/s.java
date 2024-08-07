package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;

/* compiled from: PasswordToggleEndIconDelegate */
public final class s extends m {

    /* renamed from: e  reason: collision with root package name */
    public int f7110e = R$drawable.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    public EditText f7111f;

    /* renamed from: g  reason: collision with root package name */
    public final b f7112g = new b(this, 2);

    public s(l lVar, int i10) {
        super(lVar);
        if (i10 != 0) {
            this.f7110e = i10;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return R$string.password_toggle_content_description;
    }

    public final int d() {
        return this.f7110e;
    }

    public final View.OnClickListener f() {
        return this.f7112g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        boolean z10;
        EditText editText = this.f7111f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = false;
        } else {
            z10 = true;
        }
        return !z10;
    }

    public final void m(EditText editText) {
        this.f7111f = editText;
        q();
    }

    public final void r() {
        boolean z10;
        EditText editText = this.f7111f;
        if (editText == null || !(editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f7111f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f7111f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
