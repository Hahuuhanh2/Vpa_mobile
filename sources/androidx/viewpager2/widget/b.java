package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: AnimateLayoutChangeDetector */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f3625b;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayoutManager f3626a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f3625b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public b(LinearLayoutManager linearLayoutManager) {
        this.f3626a = linearLayoutManager;
    }

    public static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (a(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }
}
