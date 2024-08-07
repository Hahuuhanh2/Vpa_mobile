package oi;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import mg.z;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21809a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FilterActivity f21810b;

    public /* synthetic */ b(FilterActivity filterActivity, int i10) {
        this.f21809a = i10;
        this.f21810b = filterActivity;
    }

    public final void onClick(View view) {
        switch (this.f21809a) {
            case 0:
                FilterActivity filterActivity = this.f21810b;
                int i10 = FilterActivity.Y;
                j.f(filterActivity, "this$0");
                filterActivity.finish();
                return;
            default:
                FilterActivity filterActivity2 = this.f21810b;
                int i11 = FilterActivity.Y;
                j.f(filterActivity2, "this$0");
                NestedScrollView nestedScrollView = ((z) filterActivity2.M()).E;
                j.e(nestedScrollView, "scrollView");
                nestedScrollView.u(0, (nestedScrollView.getPaddingBottom() + nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getBottom()) - (nestedScrollView.getHeight() + nestedScrollView.getScrollY()), false);
                return;
        }
    }
}
