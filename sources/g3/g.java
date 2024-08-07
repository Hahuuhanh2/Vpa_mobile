package g3;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout */
public final class g extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10334a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10335b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f10336c;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.f10336c = swipeRefreshLayout;
        this.f10334a = i10;
        this.f10335b = i11;
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        d dVar = this.f10336c.H;
        int i10 = this.f10334a;
        dVar.setAlpha((int) ((((float) (this.f10335b - i10)) * f10) + ((float) i10)));
    }
}
