package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import com.ots.base.ui.AddressEdittext;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;
import yg.a;

/* compiled from: FragmentStepThreePersonalBinding */
public abstract class a4 extends l {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final MaterialButton D;
    public final MaterialButton E;
    public final AppCompatEditText F;
    public final AppCompatEditText G;
    public final AppCompatEditText H;
    public final AppCompatEditText I;
    public final AppCompatEditText J;
    public final AppCompatEditText K;
    public final TextInputLayout L;
    public final TextInputLayout M;
    public final TextInputLayout N;
    public final TextInputLayout O;
    public final TextInputLayout P;
    public final ImageView Q;
    public final ImageView R;
    public final LinearLayout S;
    public final LinearLayout T;
    public final LinearLayout U;
    public final LinearLayout V;
    public final RelativeLayout W;
    public final AddressEdittext X;
    public final AddressEdittext Y;
    public final AddressEdittext Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AddressEdittext f20944a0;

    /* renamed from: b0  reason: collision with root package name */
    public final GradientTextView f20945b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AddressEdittext f20946c0;

    /* renamed from: d0  reason: collision with root package name */
    public LoginViewModel f20947d0;

    /* renamed from: e0  reason: collision with root package name */
    public a f20948e0;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f20949w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f20950x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f20951y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageButton f20952z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a4(Object obj, View view, LinearLayout linearLayout, ImageView imageView, TextView textView, ImageButton imageButton, ImageView imageView2, TextView textView2, TextView textView3, MaterialButton materialButton, MaterialButton materialButton2, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, AppCompatEditText appCompatEditText5, AppCompatEditText appCompatEditText6, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout, AddressEdittext addressEdittext, AddressEdittext addressEdittext2, AddressEdittext addressEdittext3, AddressEdittext addressEdittext4, GradientTextView gradientTextView, AddressEdittext addressEdittext5) {
        super(5, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f20949w = linearLayout;
        this.f20950x = imageView;
        this.f20951y = textView;
        this.f20952z = imageButton;
        this.A = imageView2;
        this.B = textView2;
        this.C = textView3;
        this.D = materialButton;
        this.E = materialButton2;
        this.F = appCompatEditText;
        this.G = appCompatEditText2;
        this.H = appCompatEditText3;
        this.I = appCompatEditText4;
        this.J = appCompatEditText5;
        this.K = appCompatEditText6;
        this.L = textInputLayout;
        this.M = textInputLayout2;
        this.N = textInputLayout3;
        this.O = textInputLayout4;
        this.P = textInputLayout5;
        this.Q = imageView3;
        this.R = imageView4;
        this.S = linearLayout2;
        this.T = linearLayout3;
        this.U = linearLayout4;
        this.V = linearLayout5;
        this.W = relativeLayout;
        this.X = addressEdittext;
        this.Y = addressEdittext2;
        this.Z = addressEdittext3;
        this.f20944a0 = addressEdittext4;
        this.f20945b0 = gradientTextView;
        this.f20946c0 = addressEdittext5;
    }

    public abstract void v(a aVar);

    public abstract void w(LoginViewModel loginViewModel);
}
