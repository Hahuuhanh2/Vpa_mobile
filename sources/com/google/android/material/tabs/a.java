package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.x;
import com.google.android.material.tabs.TabLayout;
import t7.b;

/* compiled from: TabIndicatorInterpolator */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.L || !(view instanceof TabLayout.TabView)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int c10 = (int) x.c(tabView.getContext(), 24);
        if (contentWidth < c10) {
            contentWidth = c10;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF((float) (right - i10), (float) (bottom - (contentHeight / 2)), (float) (i10 + right), (float) ((right / 2) + bottom));
    }

    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(b.b(f10, (int) a10.left, (int) a11.left), drawable.getBounds().top, b.b(f10, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
