package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.base.utils.customview.TimeCounterView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import ug.b;

/* compiled from: ItemAwaitPlateBinding */
public abstract class g5 extends l {
    public final TextView A;
    public final TimeCounterView B;
    public final AppTextView C;
    public final AppTextView D;
    public b E;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21080w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialButton f21081x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f21082y;

    /* renamed from: z  reason: collision with root package name */
    public final GradientTextView f21083z;

    public g5(Object obj, View view, ImageButton imageButton, MaterialButton materialButton, LinearLayout linearLayout, GradientTextView gradientTextView, TextView textView, TimeCounterView timeCounterView, AppTextView appTextView, AppTextView appTextView2) {
        super(0, view, obj);
        this.f21080w = imageButton;
        this.f21081x = materialButton;
        this.f21082y = linearLayout;
        this.f21083z = gradientTextView;
        this.A = textView;
        this.B = timeCounterView;
        this.C = appTextView;
        this.D = appTextView2;
    }

    public abstract void v(b bVar);
}
