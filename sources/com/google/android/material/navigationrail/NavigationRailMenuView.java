package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import g8.a;

public class NavigationRailMenuView extends NavigationBarMenuView {
    public int O = -1;
    public final FrameLayout.LayoutParams P;

    public NavigationRailMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.P = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    public final NavigationBarItemView e(Context context) {
        return new a(context);
    }

    public final int g(View view, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (view == null) {
            int max = i11 / Math.max(1, i12);
            int i15 = this.O;
            if (i15 == -1) {
                i15 = View.MeasureSpec.getSize(i10);
            }
            i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i15, max), 0);
        } else {
            i13 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, i13);
                    i14 = childAt.getMeasuredHeight();
                } else {
                    i14 = 0;
                }
                i16 += i14;
            }
        }
        return i16;
    }

    public int getItemMinimumHeight() {
        return this.O;
    }

    public int getMenuGravity() {
        return this.P.gravity;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().l().size();
        if (size2 <= 1 || !NavigationBarMenuView.f(getLabelVisibilityMode(), size2)) {
            i12 = g((View) null, i10, size, size2);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int max = size / Math.max(1, size2);
                int i14 = this.O;
                if (i14 == -1) {
                    i14 = View.MeasureSpec.getSize(i10);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i14, max), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, makeMeasureSpec);
                    i13 = childAt.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                size -= i13;
                size2--;
            } else {
                i13 = 0;
            }
            i12 = g(childAt, i10, size, size2) + i13;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState(i12, i11, 0));
    }

    public void setItemMinimumHeight(int i10) {
        if (this.O != i10) {
            this.O = i10;
            requestLayout();
        }
    }

    public void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.P;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }
}
