package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public final class p extends q {
    public p(RecyclerView.m mVar) {
        super(mVar);
    }

    public final int b(View view) {
        this.f3290a.getClass();
        return RecyclerView.m.F(view) + view.getBottom() + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f3290a.getClass();
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f3007b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f3290a.getClass();
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f3007b;
        return view.getMeasuredWidth() + rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public final int e(View view) {
        this.f3290a.getClass();
        return (view.getTop() - RecyclerView.m.S(view)) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    public final int f() {
        return this.f3290a.f3061w;
    }

    public final int g() {
        RecyclerView.m mVar = this.f3290a;
        return mVar.f3061w - mVar.getPaddingBottom();
    }

    public final int h() {
        return this.f3290a.getPaddingBottom();
    }

    public final int i() {
        return this.f3290a.f3059u;
    }

    public final int j() {
        return this.f3290a.f3058t;
    }

    public final int k() {
        return this.f3290a.getPaddingTop();
    }

    public final int l() {
        RecyclerView.m mVar = this.f3290a;
        return (mVar.f3061w - mVar.getPaddingTop()) - this.f3290a.getPaddingBottom();
    }

    public final int n(View view) {
        this.f3290a.T(view, this.f3292c);
        return this.f3292c.bottom;
    }

    public final int o(View view) {
        this.f3290a.T(view, this.f3292c);
        return this.f3292c.top;
    }

    public final void p(int i10) {
        this.f3290a.Z(i10);
    }
}
