package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public g f5650a;

    /* renamed from: b  reason: collision with root package name */
    public int f5651b = 0;

    public ViewOffsetBehavior() {
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        x(coordinatorLayout, v2, i10);
        if (this.f5650a == null) {
            this.f5650a = new g(v2);
        }
        g gVar = this.f5650a;
        gVar.f5671b = gVar.f5670a.getTop();
        gVar.f5672c = gVar.f5670a.getLeft();
        this.f5650a.a();
        int i11 = this.f5651b;
        if (i11 == 0) {
            return true;
        }
        this.f5650a.b(i11);
        this.f5651b = 0;
        return true;
    }

    public final int w() {
        g gVar = this.f5650a;
        if (gVar != null) {
            return gVar.f5673d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        coordinatorLayout.u(i10, v2);
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
