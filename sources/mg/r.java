package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;

/* compiled from: ActivityChangePasswordBinding */
public abstract class r extends l {
    public final PasswordEditText A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final AppTextView H;
    public final AppTextView I;
    public final AppTextView J;
    public final AppTextView K;
    public final AppTextView L;
    public final AppTextView M;
    public final AppTextView N;
    public final AppTextView O;
    public LoginViewModel P;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f21320w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialButton f21321x;

    /* renamed from: y  reason: collision with root package name */
    public final PasswordEditText f21322y;

    /* renamed from: z  reason: collision with root package name */
    public final PasswordEditText f21323z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Object obj, View view, ImageView imageView, MaterialButton materialButton, PasswordEditText passwordEditText, PasswordEditText passwordEditText2, PasswordEditText passwordEditText3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, AppTextView appTextView, AppTextView appTextView2, AppTextView appTextView3, AppTextView appTextView4, AppTextView appTextView5, AppTextView appTextView6, AppTextView appTextView7, AppTextView appTextView8) {
        super(1, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f21320w = imageView;
        this.f21321x = materialButton;
        this.f21322y = passwordEditText;
        this.f21323z = passwordEditText2;
        this.A = passwordEditText3;
        this.B = linearLayout;
        this.C = linearLayout2;
        this.D = linearLayout3;
        this.E = linearLayout4;
        this.F = linearLayout5;
        this.G = linearLayout6;
        this.H = appTextView;
        this.I = appTextView2;
        this.J = appTextView3;
        this.K = appTextView4;
        this.L = appTextView5;
        this.M = appTextView6;
        this.N = appTextView7;
        this.O = appTextView8;
    }

    public abstract void v(LoginViewModel loginViewModel);
}
