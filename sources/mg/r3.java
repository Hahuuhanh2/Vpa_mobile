package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.base.utils.customview.EmptyView;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;

/* compiled from: FragmentRegisterAuctionBinding */
public abstract class r3 extends l {
    public final EmptyView A;
    public final EmptyView B;
    public final RecyclerView C;
    public final RecyclerView D;
    public final RecyclerView E;
    public final AppTextView F;
    public final GradientTextView G;
    public final GradientTextView H;
    public final GradientTextView I;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f21326w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageButton f21327x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f21328y;

    /* renamed from: z  reason: collision with root package name */
    public final EmptyView f21329z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r3(Object obj, View view, ImageView imageView, ImageButton imageButton, ImageView imageView2, EmptyView emptyView, EmptyView emptyView2, EmptyView emptyView3, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, AppTextView appTextView, GradientTextView gradientTextView, GradientTextView gradientTextView2, GradientTextView gradientTextView3) {
        super(0, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f21326w = imageView;
        this.f21327x = imageButton;
        this.f21328y = imageView2;
        this.f21329z = emptyView;
        this.A = emptyView2;
        this.B = emptyView3;
        this.C = recyclerView;
        this.D = recyclerView2;
        this.E = recyclerView3;
        this.F = appTextView;
        this.G = gradientTextView;
        this.H = gradientTextView2;
        this.I = gradientTextView3;
    }
}
