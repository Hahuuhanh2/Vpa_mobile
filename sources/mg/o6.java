package mg;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;

/* compiled from: ItemPersonalInfoBinding */
public abstract class o6 extends l {
    public final AppCompatEditText A;
    public final AppCompatEditText B;
    public final AppCompatEditText C;
    public final AppCompatEditText D;
    public final PasswordEditText E;
    public final AppCompatEditText F;
    public final TextInputLayout G;
    public final TextInputLayout H;
    public final LinearLayout I;
    public final TextInputLayout J;
    public final TextInputLayout K;
    public final AppTextView L;
    public final AppTextView M;
    public final AppTextView N;
    public final AppTextView O;
    public LoginViewModel P;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21275w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialCheckBox f21276x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f21277y;

    /* renamed from: z  reason: collision with root package name */
    public final PasswordEditText f21278z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o6(Object obj, View view, MaterialButton materialButton, MaterialCheckBox materialCheckBox, LinearLayout linearLayout, PasswordEditText passwordEditText, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, PasswordEditText passwordEditText2, AppCompatEditText appCompatEditText5, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, LinearLayout linearLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, AppTextView appTextView, AppTextView appTextView2, AppTextView appTextView3, AppTextView appTextView4) {
        super(1, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f21275w = materialButton;
        this.f21276x = materialCheckBox;
        this.f21277y = linearLayout;
        this.f21278z = passwordEditText;
        this.A = appCompatEditText;
        this.B = appCompatEditText2;
        this.C = appCompatEditText3;
        this.D = appCompatEditText4;
        this.E = passwordEditText2;
        this.F = appCompatEditText5;
        this.G = textInputLayout;
        this.H = textInputLayout2;
        this.I = linearLayout2;
        this.J = textInputLayout3;
        this.K = textInputLayout4;
        this.L = appTextView;
        this.M = appTextView2;
        this.N = appTextView3;
        this.O = appTextView4;
    }

    public abstract void v(LoginViewModel loginViewModel);
}
