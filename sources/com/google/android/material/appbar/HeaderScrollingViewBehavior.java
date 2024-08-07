package com.google.android.material.appbar;

import al.g0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.e;
import w1.q0;
import w1.w0;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f5639c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5640d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f5641e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f5642f;

    public HeaderScrollingViewBehavior() {
    }

    public int A(View view) {
        return view.getMeasuredHeight();
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout y10;
        int i13;
        w0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (y10 = y(coordinatorLayout.o(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.d.b(y10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.b() + lastWindowInsets.e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int A = size + A(y10);
        int measuredHeight = y10.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            A -= measuredHeight;
        }
        if (i14 == -1) {
            i13 = 1073741824;
        } else {
            i13 = Integer.MIN_VALUE;
        }
        coordinatorLayout.v(view, i10, i11, View.MeasureSpec.makeMeasureSpec(A, i13));
        return true;
    }

    public final void x(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout y10 = y(coordinatorLayout.o(view));
        int i11 = 0;
        if (y10 != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.f5639c;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, y10.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((y10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            w0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.d.b(coordinatorLayout) && !d0.d.b(view)) {
                    rect.left = lastWindowInsets.c() + rect.left;
                    rect.right -= lastWindowInsets.d();
                }
            }
            Rect rect2 = this.f5640d;
            int i12 = eVar.f2069c;
            if (i12 == 0) {
                i12 = 8388659;
            }
            e.b(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f5642f != 0) {
                float z10 = z(y10);
                int i13 = this.f5642f;
                i11 = g0.G((int) (z10 * ((float) i13)), 0, i13);
            }
            view.layout(rect2.left, rect2.top - i11, rect2.right, rect2.bottom - i11);
            this.f5641e = rect2.top - y10.getBottom();
            return;
        }
        coordinatorLayout.u(i10, view);
        this.f5641e = 0;
    }

    public abstract AppBarLayout y(ArrayList arrayList);

    public float z(View view) {
        return 1.0f;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
