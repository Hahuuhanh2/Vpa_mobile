package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.m f3290a;

    /* renamed from: b  reason: collision with root package name */
    public int f3291b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3292c = new Rect();

    public q(RecyclerView.m mVar) {
        this.f3290a = mVar;
    }

    public static q a(RecyclerView.m mVar, int i10) {
        if (i10 == 0) {
            return new o(mVar);
        }
        if (i10 == 1) {
            return new p(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f3291b) {
            return 0;
        }
        return l() - this.f3291b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);
}
