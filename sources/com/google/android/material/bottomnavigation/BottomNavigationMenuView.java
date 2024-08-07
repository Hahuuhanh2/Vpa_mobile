package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import com.google.android.material.R$dimen;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public boolean S;
    public final ArrayList T = new ArrayList();

    public BottomNavigationMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.O = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_max_width);
        this.P = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_min_width);
        this.Q = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_max_width);
        this.R = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_min_width);
    }

    public final NavigationBarItemView e(Context context) {
        return new BottomNavigationItemView(context);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.e.d(this) == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        f menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        this.T.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i15 = 1;
        if (!NavigationBarMenuView.f(getLabelVisibilityMode(), size2) || !this.S) {
            if (size2 != 0) {
                i15 = size2;
            }
            int min = Math.min(size / i15, this.Q);
            int i16 = size - (size2 * min);
            for (int i17 = 0; i17 < childCount; i17++) {
                if (getChildAt(i17).getVisibility() == 8) {
                    i12 = 0;
                } else if (i16 > 0) {
                    i12 = min + 1;
                    i16--;
                } else {
                    i12 = min;
                }
                this.T.add(Integer.valueOf(i12));
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i18 = this.R;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.Q, Integer.MIN_VALUE), makeMeasureSpec);
                i18 = Math.max(i18, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            int i19 = size2 - i13;
            int min2 = Math.min(size - (this.P * i19), Math.min(i18, this.Q));
            int i20 = size - min2;
            if (i19 != 0) {
                i15 = i19;
            }
            int min3 = Math.min(i20 / i15, this.O);
            int i21 = i20 - (i19 * min3);
            for (int i22 = 0; i22 < childCount; i22++) {
                if (getChildAt(i22).getVisibility() != 8) {
                    if (i22 == getSelectedItemPosition()) {
                        i14 = min2;
                    } else {
                        i14 = min3;
                    }
                    if (i21 > 0) {
                        i14++;
                        i21--;
                    }
                } else {
                    i14 = 0;
                }
                this.T.add(Integer.valueOf(i14));
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.T.get(i24)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i23 = childAt2.getMeasuredWidth() + i23;
            }
        }
        setMeasuredDimension(i23, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.S = z10;
    }
}
