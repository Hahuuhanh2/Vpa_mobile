package oi;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import mg.z;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FilterActivity f21808a;

    public /* synthetic */ a(FilterActivity filterActivity) {
        this.f21808a = filterActivity;
    }

    public final void onGlobalLayout() {
        boolean z10;
        FilterActivity filterActivity = this.f21808a;
        int i10 = FilterActivity.Y;
        j.f(filterActivity, "this$0");
        Rect rect = new Rect();
        filterActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = filterActivity.getWindow().getDecorView().getHeight();
        if (((double) (height - rect.bottom)) > ((double) height) * 0.15d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            NestedScrollView nestedScrollView = ((z) filterActivity.M()).E;
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), ((z) filterActivity.M()).f21508y.getTop() - nestedScrollView.getScrollY(), false);
        }
    }
}
