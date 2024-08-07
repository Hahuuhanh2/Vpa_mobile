package mg;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;

/* compiled from: ItemOrganizationInfoBinding */
public abstract class k6 extends l {
    public final AppCompatEditText A;
    public final PasswordEditText B;
    public final AppCompatEditText C;
    public final AppCompatEditText D;
    public final AppCompatEditText E;
    public final TextInputLayout F;
    public final TextInputLayout G;
    public final TextInputLayout H;
    public final TextInputLayout I;
    public final TextInputLayout J;
    public final TextInputLayout K;
    public final LinearLayout L;
    public final AppTextView M;
    public final AppTextView N;
    public final AppTextView O;
    public final AppTextView P;
    public LoginViewModel Q;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21156w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f21157x;

    /* renamed from: y  reason: collision with root package name */
    public final PasswordEditText f21158y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatEditText f21159z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k6(Object obj, View view, MaterialButton materialButton, LinearLayout linearLayout, PasswordEditText passwordEditText, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, PasswordEditText passwordEditText2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, AppCompatEditText appCompatEditText5, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, LinearLayout linearLayout2, AppTextView appTextView, AppTextView appTextView2, AppTextView appTextView3, AppTextView appTextView4) {
        super(1, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f21156w = materialButton;
        this.f21157x = linearLayout;
        this.f21158y = passwordEditText;
        this.f21159z = appCompatEditText;
        this.A = appCompatEditText2;
        this.B = passwordEditText2;
        this.C = appCompatEditText3;
        this.D = appCompatEditText4;
        this.E = appCompatEditText5;
        this.F = textInputLayout;
        this.G = textInputLayout2;
        this.H = textInputLayout3;
        this.I = textInputLayout4;
        this.J = textInputLayout5;
        this.K = textInputLayout6;
        this.L = linearLayout2;
        this.M = appTextView;
        this.N = appTextView2;
        this.O = appTextView3;
        this.P = appTextView4;
    }

    public abstract void v(LoginViewModel loginViewModel);
}
