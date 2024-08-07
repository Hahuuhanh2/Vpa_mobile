package g3;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout */
public final class f extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f10333a;

    public f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f10333a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        this.f10333a.setAnimationProgress(1.0f - f10);
    }
}
