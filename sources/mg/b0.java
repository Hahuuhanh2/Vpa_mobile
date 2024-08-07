package mg;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.edit.TextInputLayout;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;
import h1.a;

/* compiled from: ActivityForgotBinding */
public abstract class b0 extends l {
    public final AppCompatEditText A;
    public final TextInputLayout B;
    public final TextInputLayout C;
    public final RelativeLayout D;
    public final RadioButton E;
    public final RadioButton F;
    public final RadioGroup G;
    public final a H;
    public LoginViewModel I;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f20964w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatEditText f20965x;

    /* renamed from: y  reason: collision with root package name */
    public final TextInputLayout f20966y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatEditText f20967z;

    public b0(Object obj, View view, MaterialButton materialButton, AppCompatEditText appCompatEditText, TextInputLayout textInputLayout, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, RelativeLayout relativeLayout, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, a aVar) {
        super(1, view, obj);
        this.f20964w = materialButton;
        this.f20965x = appCompatEditText;
        this.f20966y = textInputLayout;
        this.f20967z = appCompatEditText2;
        this.A = appCompatEditText3;
        this.B = textInputLayout2;
        this.C = textInputLayout3;
        this.D = relativeLayout;
        this.E = radioButton;
        this.F = radioButton2;
        this.G = radioGroup;
        this.H = aVar;
    }

    public abstract void v(LoginViewModel loginViewModel);
}
