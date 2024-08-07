package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import com.ots.base.ui.AddressEdittext;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;

/* compiled from: FragmentStepThreeBinding */
public abstract class y3 extends l {
    public final MaterialButton A;
    public final AppCompatEditText B;
    public final AppCompatEditText C;
    public final AppCompatEditText D;
    public final AppCompatEditText E;
    public final AppCompatEditText F;
    public final AppCompatEditText G;
    public final AppCompatEditText H;
    public final TextInputLayout I;
    public final TextInputLayout J;
    public final TextInputLayout K;
    public final TextInputLayout L;
    public final TextInputLayout M;
    public final TextInputLayout N;
    public final TextInputLayout O;
    public final ImageView P;
    public final LinearLayout Q;
    public final LinearLayout R;
    public final LinearLayout S;
    public final AddressEdittext T;
    public final AddressEdittext U;
    public final AddressEdittext V;
    public final AddressEdittext W;
    public final GradientTextView X;
    public final AddressEdittext Y;
    public LoginViewModel Z;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f21494w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageButton f21495x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f21496y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f21497z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y3(Object obj, View view, TextView textView, ImageButton imageButton, TextView textView2, TextView textView3, MaterialButton materialButton, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, AppCompatEditText appCompatEditText5, AppCompatEditText appCompatEditText6, AppCompatEditText appCompatEditText7, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, AddressEdittext addressEdittext, AddressEdittext addressEdittext2, AddressEdittext addressEdittext3, AddressEdittext addressEdittext4, GradientTextView gradientTextView, AddressEdittext addressEdittext5) {
        super(5, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f21494w = textView;
        this.f21495x = imageButton;
        this.f21496y = textView2;
        this.f21497z = textView3;
        this.A = materialButton;
        this.B = appCompatEditText;
        this.C = appCompatEditText2;
        this.D = appCompatEditText3;
        this.E = appCompatEditText4;
        this.F = appCompatEditText5;
        this.G = appCompatEditText6;
        this.H = appCompatEditText7;
        this.I = textInputLayout;
        this.J = textInputLayout2;
        this.K = textInputLayout3;
        this.L = textInputLayout4;
        this.M = textInputLayout5;
        this.N = textInputLayout6;
        this.O = textInputLayout7;
        this.P = imageView;
        this.Q = linearLayout;
        this.R = linearLayout2;
        this.S = linearLayout3;
        this.T = addressEdittext;
        this.U = addressEdittext2;
        this.V = addressEdittext3;
        this.W = addressEdittext4;
        this.X = gradientTextView;
        this.Y = addressEdittext5;
    }

    public abstract void v(LoginViewModel loginViewModel);
}
