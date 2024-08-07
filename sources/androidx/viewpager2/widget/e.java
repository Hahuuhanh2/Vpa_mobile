package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: MarginPageTransformer */
public final class e implements ViewPager2.i {

    /* renamed from: a  reason: collision with root package name */
    public final int f3631a;

    public e(int i10) {
        if (i10 >= 0) {
            this.f3631a = i10;
            return;
        }
        throw new IllegalArgumentException("Margin must be non-negative");
    }
}
