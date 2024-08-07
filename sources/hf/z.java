package hf;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import d2.l;

/* compiled from: WidgetBaseRecyclerViewBinding */
public abstract class z extends l {

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f10823w;

    /* renamed from: x  reason: collision with root package name */
    public final RecyclerView f10824x;

    /* renamed from: y  reason: collision with root package name */
    public final ShimmerFrameLayout f10825y;

    /* renamed from: z  reason: collision with root package name */
    public final SwipeRefreshLayout f10826z;

    public z(Object obj, View view, LinearLayout linearLayout, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, SwipeRefreshLayout swipeRefreshLayout) {
        super(0, view, obj);
        this.f10823w = linearLayout;
        this.f10824x = recyclerView;
        this.f10825y = shimmerFrameLayout;
        this.f10826z = swipeRefreshLayout;
    }
}
