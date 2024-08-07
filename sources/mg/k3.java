package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import rh.f;

/* compiled from: FragmentMenuBinding */
public abstract class k3 extends l {
    public final AppTextView A;
    public final AppTextView B;
    public final NestedScrollView C;
    public final ImageView D;
    public final LinearLayout E;
    public final AppTextView F;
    public final AppTextView G;
    public final AppTextView H;
    public final AppTextView I;
    public f J;

    /* renamed from: w  reason: collision with root package name */
    public final AppTextView f21150w;

    /* renamed from: x  reason: collision with root package name */
    public final AppTextView f21151x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21152y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21153z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k3(Object obj, View view, AppTextView appTextView, AppTextView appTextView2, AppTextView appTextView3, AppTextView appTextView4, AppTextView appTextView5, AppTextView appTextView6, NestedScrollView nestedScrollView, ImageView imageView, LinearLayout linearLayout, AppTextView appTextView7, AppTextView appTextView8, AppTextView appTextView9, AppTextView appTextView10) {
        super(0, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f21150w = appTextView;
        this.f21151x = appTextView2;
        this.f21152y = appTextView3;
        this.f21153z = appTextView4;
        this.A = appTextView5;
        this.B = appTextView6;
        this.C = nestedScrollView;
        this.D = imageView;
        this.E = linearLayout;
        this.F = appTextView7;
        this.G = appTextView8;
        this.H = appTextView9;
        this.I = appTextView10;
    }

    public abstract void v(f fVar);
}
