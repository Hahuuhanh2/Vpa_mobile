package mg;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.otp.helpers.OtpTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import h1.a;

/* compiled from: ActivityOtpBinding */
public abstract class o0 extends l {
    public final RelativeLayout A;
    public final OtpTextView B;
    public final a C;
    public final AppTextView D;
    public final AppTextView E;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21262w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f21263x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f21264y;

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f21265z;

    public o0(Object obj, View view, MaterialButton materialButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout, OtpTextView otpTextView, a aVar, AppTextView appTextView, AppTextView appTextView2) {
        super(0, view, obj);
        this.f21262w = materialButton;
        this.f21263x = linearLayout;
        this.f21264y = linearLayout2;
        this.f21265z = linearLayout3;
        this.A = relativeLayout;
        this.B = otpTextView;
        this.C = aVar;
        this.D = appTextView;
        this.E = appTextView2;
    }
}
