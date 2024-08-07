package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public final class o extends q {
    public o(RecyclerView.m mVar) {
        super(mVar);
    }

    public final int b(View view) {
        this.f3290a.getClass();
        return RecyclerView.m.Q(view) + view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    public final int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f3290a.getClass();
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f3007b;
        return view.getMeasuredWidth() + rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f3290a.getClass();
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f3007b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final int e(View view) {
        this.f3290a.getClass();
        return (view.getLeft() - RecyclerView.m.N(view)) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    public final int f() {
        return this.f3290a.f3060v;
    }

    public final int g() {
        RecyclerView.m mVar = this.f3290a;
        return mVar.f3060v - mVar.getPaddingRight();
    }

    public final int h() {
        return this.f3290a.getPaddingRight();
    }

    public final int i() {
        return this.f3290a.f3058t;
    }

    public final int j() {
        return this.f3290a.f3059u;
    }

    public final int k() {
        return this.f3290a.getPaddingLeft();
    }

    public final int l() {
        RecyclerView.m mVar = this.f3290a;
        return (mVar.f3060v - mVar.getPaddingLeft()) - this.f3290a.getPaddingRight();
    }

    public final int n(View view) {
        this.f3290a.T(view, this.f3292c);
        return this.f3292c.right;
    }

    public final int o(View view) {
        this.f3290a.T(view, this.f3292c);
        return this.f3292c.left;
    }

    public final void p(int i10) {
        this.f3290a.Y(i10);
    }
}
