package g3;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout */
public final class e extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f10332a;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f10332a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        this.f10332a.setAnimationProgress(f10);
    }
}
