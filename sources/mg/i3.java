package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;

/* compiled from: FragmentLoginBinding */
public abstract class i3 extends l {
    public final TextInputLayout A;
    public final AppCompatEditText B;
    public final ImageView C;
    public final w5 D;
    public final PasswordEditText E;
    public final AppTextView F;
    public final GradientTextView G;
    public LoginViewModel H;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21111w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialCardView f21112x;

    /* renamed from: y  reason: collision with root package name */
    public final MaterialButton f21113y;

    /* renamed from: z  reason: collision with root package name */
    public final TextInputLayout f21114z;

    public i3(Object obj, View view, ImageButton imageButton, MaterialCardView materialCardView, MaterialButton materialButton, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AppCompatEditText appCompatEditText, ImageView imageView, w5 w5Var, PasswordEditText passwordEditText, AppTextView appTextView, GradientTextView gradientTextView) {
        super(3, view, obj);
        this.f21111w = imageButton;
        this.f21112x = materialCardView;
        this.f21113y = materialButton;
        this.f21114z = textInputLayout;
        this.A = textInputLayout2;
        this.B = appCompatEditText;
        this.C = imageView;
        this.D = w5Var;
        this.E = passwordEditText;
        this.F = appTextView;
        this.G = gradientTextView;
    }

    public abstract void v(LoginViewModel loginViewModel);
}
