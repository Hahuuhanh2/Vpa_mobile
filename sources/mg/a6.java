package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import qh.d;

/* compiled from: ItemLicensePlateBinding */
public abstract class a6 extends l {
    public final TextView A;
    public final AppTextView B;
    public final AppTextView C;
    public d D;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f20956w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialButton f20957x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f20958y;

    /* renamed from: z  reason: collision with root package name */
    public final GradientTextView f20959z;

    public a6(Object obj, View view, ImageButton imageButton, MaterialButton materialButton, LinearLayout linearLayout, GradientTextView gradientTextView, TextView textView, AppTextView appTextView, AppTextView appTextView2) {
        super(0, view, obj);
        this.f20956w = imageButton;
        this.f20957x = materialButton;
        this.f20958y = linearLayout;
        this.f20959z = gradientTextView;
        this.A = textView;
        this.B = appTextView;
        this.C = appTextView2;
    }

    public abstract void v(d dVar);
}
