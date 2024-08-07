package mg;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import rh.f;

/* compiled from: FragmentHomeBinding */
public abstract class g3 extends l {
    public final RecyclerView A;
    public final RecyclerView B;
    public final RecyclerView C;
    public final RecyclerView D;
    public final AppTextView E;
    public final GradientTextView F;
    public final GradientTextView G;
    public final AppTextView H;
    public f I;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f21075w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f21076x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f21077y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f21078z;

    public g3(Object obj, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, AppTextView appTextView, GradientTextView gradientTextView, GradientTextView gradientTextView2, AppTextView appTextView2) {
        super(0, view, obj);
        this.f21075w = imageView;
        this.f21076x = imageView2;
        this.f21077y = imageView3;
        this.f21078z = imageView4;
        this.A = recyclerView;
        this.B = recyclerView2;
        this.C = recyclerView3;
        this.D = recyclerView4;
        this.E = appTextView;
        this.F = gradientTextView;
        this.G = gradientTextView2;
        this.H = appTextView2;
    }

    public abstract void v(f fVar);
}
