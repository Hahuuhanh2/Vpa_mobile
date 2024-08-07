package g3;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout */
public final class h extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f10337a;

    public h(SwipeRefreshLayout swipeRefreshLayout) {
        this.f10337a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f10337a;
        float f11 = swipeRefreshLayout.D;
        swipeRefreshLayout.setAnimationProgress(((-f11) * f10) + f11);
        this.f10337a.e(f10);
    }
}
