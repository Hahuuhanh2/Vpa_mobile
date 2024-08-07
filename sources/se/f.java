package se;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: MagicalViewWrapper */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup.MarginLayoutParams f14753a;

    /* renamed from: b  reason: collision with root package name */
    public final View f14754b;

    public f(FrameLayout frameLayout) {
        this.f14754b = frameLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        this.f14753a = marginLayoutParams;
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = 8388611;
        }
    }

    public final void a(float f10) {
        this.f14753a.height = Math.round(f10);
        this.f14754b.setLayoutParams(this.f14753a);
    }

    public final void b(float f10) {
        this.f14753a.width = Math.round(f10);
        this.f14754b.setLayoutParams(this.f14753a);
    }
}
