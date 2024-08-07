package m8;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: RightSheetDelegate */
public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f13184a;

    public b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f13184a = sideSheetBehavior;
    }

    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    public final float b(int i10) {
        float f10 = (float) this.f13184a.f6737t;
        return (f10 - ((float) i10)) / (f10 - ((float) d()));
    }

    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f13184a;
        return Math.max(0, (sideSheetBehavior.f6737t - sideSheetBehavior.f6736s) - sideSheetBehavior.f6739v);
    }

    public final int e() {
        return this.f13184a.f6737t;
    }

    public final int f() {
        return this.f13184a.f6737t;
    }

    public final int g() {
        return d();
    }

    public final <V extends View> int h(V v2) {
        return v2.getLeft() - this.f13184a.f6739v;
    }

    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    public final int j() {
        return 0;
    }

    public final boolean k(float f10) {
        return f10 < 0.0f;
    }

    public final boolean l(View view) {
        if (view.getLeft() > (d() + this.f13184a.f6737t) / 2) {
            return true;
        }
        return false;
    }

    public final boolean m(float f10, float f11) {
        boolean z10;
        if (Math.abs(f10) > Math.abs(f11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float abs = Math.abs(f10);
            this.f13184a.getClass();
            if (abs > ((float) 500)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(View view, float f10) {
        float abs = Math.abs((f10 * this.f13184a.f6735r) + ((float) view.getRight()));
        this.f13184a.getClass();
        if (abs > 0.5f) {
            return true;
        }
        return false;
    }

    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int i12 = this.f13184a.f6737t;
        if (i10 <= i12) {
            marginLayoutParams.rightMargin = i12 - i10;
        }
    }
}
