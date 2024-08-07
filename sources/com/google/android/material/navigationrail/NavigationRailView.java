package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: f  reason: collision with root package name */
    public final int f6609f;

    /* renamed from: n  reason: collision with root package name */
    public View f6610n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f6611o;

    /* renamed from: p  reason: collision with root package name */
    public Boolean f6612p;

    /* renamed from: q  reason: collision with root package name */
    public Boolean f6613q;

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static boolean b(NavigationRailView navigationRailView, Boolean bool) {
        navigationRailView.getClass();
        if (bool != null) {
            return bool.booleanValue();
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        return d0.d.b(navigationRailView);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    public final NavigationBarMenuView a(Context context) {
        return new NavigationRailMenuView(context);
    }

    public View getHeaderView() {
        return this.f6610n;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        View view = this.f6610n;
        boolean z12 = true;
        int i14 = 0;
        if (view == null || view.getVisibility() == 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            int bottom = this.f6610n.getBottom() + this.f6609f;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i14 = bottom - top;
            }
        } else {
            if ((navigationRailMenuView.P.gravity & 112) != 48) {
                z12 = false;
            }
            if (z12) {
                i14 = this.f6609f;
            }
        }
        if (i14 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i14, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i14);
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumWidth > 0) {
            int paddingLeft = getPaddingLeft();
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingRight() + paddingLeft + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i10, i11);
        View view = this.f6610n;
        if (view == null || view.getVisibility() == 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            measureChild(getNavigationRailMenuView(), i10, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f6610n.getMeasuredHeight()) - this.f6609f, Integer.MIN_VALUE));
        }
    }

    public void setItemMinimumHeight(int i10) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.navigationRailStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationRailView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.R$style.Widget_MaterialComponents_NavigationRailView
            r9.<init>(r10, r11, r12, r4)
            r10 = 0
            r9.f6611o = r10
            r9.f6612p = r10
            r9.f6613q = r10
            android.content.res.Resources r0 = r9.getResources()
            int r1 = com.google.android.material.R$dimen.mtrl_navigation_rail_margin
            int r6 = r0.getDimensionPixelSize(r1)
            r9.f6609f = r6
            android.content.Context r7 = r9.getContext()
            int[] r2 = com.google.android.material.R$styleable.NavigationRailView
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r7
            r1 = r11
            r3 = r12
            androidx.appcompat.widget.n0 r11 = com.google.android.material.internal.u.e(r0, r1, r2, r3, r4, r5)
            int r12 = com.google.android.material.R$styleable.NavigationRailView_headerLayout
            int r12 = r11.i(r12, r8)
            r0 = 49
            if (r12 == 0) goto L_0x0056
            android.content.Context r1 = r9.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            android.view.View r12 = r1.inflate(r12, r9, r8)
            android.view.View r1 = r9.f6610n
            if (r1 == 0) goto L_0x0047
            r9.removeView(r1)
            r9.f6610n = r10
        L_0x0047:
            r9.f6610n = r12
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r10.<init>(r1, r1)
            r10.gravity = r0
            r10.topMargin = r6
            r9.addView(r12, r8, r10)
        L_0x0056:
            int r10 = com.google.android.material.R$styleable.NavigationRailView_menuGravity
            int r10 = r11.h(r10, r0)
            r9.setMenuGravity(r10)
            int r10 = com.google.android.material.R$styleable.NavigationRailView_itemMinHeight
            boolean r12 = r11.l(r10)
            if (r12 == 0) goto L_0x006f
            r12 = -1
            int r10 = r11.d(r10, r12)
            r9.setItemMinimumHeight(r10)
        L_0x006f:
            int r10 = com.google.android.material.R$styleable.NavigationRailView_paddingTopSystemWindowInsets
            boolean r12 = r11.l(r10)
            if (r12 == 0) goto L_0x0081
            boolean r10 = r11.a(r10, r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.f6611o = r10
        L_0x0081:
            int r10 = com.google.android.material.R$styleable.NavigationRailView_paddingBottomSystemWindowInsets
            boolean r12 = r11.l(r10)
            if (r12 == 0) goto L_0x0093
            boolean r10 = r11.a(r10, r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.f6612p = r10
        L_0x0093:
            int r10 = com.google.android.material.R$styleable.NavigationRailView_paddingStartSystemWindowInsets
            boolean r12 = r11.l(r10)
            if (r12 == 0) goto L_0x00a5
            boolean r10 = r11.a(r10, r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.f6613q = r10
        L_0x00a5:
            android.content.res.Resources r10 = r9.getResources()
            int r12 = com.google.android.material.R$dimen.m3_navigation_rail_item_padding_top_with_large_font
            int r10 = r10.getDimensionPixelOffset(r12)
            android.content.res.Resources r12 = r9.getResources()
            int r0 = com.google.android.material.R$dimen.m3_navigation_rail_item_padding_bottom_with_large_font
            int r12 = r12.getDimensionPixelOffset(r0)
            r0 = 0
            r1 = 1050253722(0x3e99999a, float:0.3)
            android.content.res.Resources r2 = r7.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            float r2 = r2.fontScale
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r3
            float r0 = t7.b.a(r0, r3, r1, r3, r2)
            int r1 = r9.getItemPaddingTop()
            int r10 = t7.b.b(r0, r1, r10)
            float r10 = (float) r10
            int r1 = r9.getItemPaddingBottom()
            int r12 = t7.b.b(r0, r1, r12)
            float r12 = (float) r12
            int r10 = java.lang.Math.round(r10)
            r9.setItemPaddingTop(r10)
            int r10 = java.lang.Math.round(r12)
            r9.setItemPaddingBottom(r10)
            r11.n()
            g8.b r10 = new g8.b
            r10.<init>(r9)
            com.google.android.material.internal.x.b(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
