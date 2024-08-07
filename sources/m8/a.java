package m8;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: LeftSheetDelegate */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f13183a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f13183a = sideSheetBehavior;
    }

    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    public final float b(int i10) {
        float e10 = (float) e();
        return (((float) i10) - e10) / (((float) d()) - e10);
    }

    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f13183a;
        return Math.max(0, sideSheetBehavior.f6738u + sideSheetBehavior.f6739v);
    }

    public final int e() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f13183a;
        return (-sideSheetBehavior.f6736s) - sideSheetBehavior.f6739v;
    }

    public final int f() {
        return this.f13183a.f6739v;
    }

    public final int g() {
        return -this.f13183a.f6736s;
    }

    public final <V extends View> int h(V v2) {
        return v2.getRight() + this.f13183a.f6739v;
    }

    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    public final int j() {
        return 1;
    }

    public final boolean k(float f10) {
        return f10 > 0.0f;
    }

    public final boolean l(View view) {
        if (view.getRight() < (d() - e()) / 2) {
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
            this.f13183a.getClass();
            if (abs > ((float) 500)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(View view, float f10) {
        float abs = Math.abs((f10 * this.f13183a.f6735r) + ((float) view.getLeft()));
        this.f13183a.getClass();
        if (abs > 0.5f) {
            return true;
        }
        return false;
    }

    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f13183a.f6737t) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
