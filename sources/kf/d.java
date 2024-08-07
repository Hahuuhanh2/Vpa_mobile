package kf;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: BaseAppUtils.kt */
public final class d extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f12552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12553b;

    public d(int i10, View view) {
        this.f12552a = view;
        this.f12553b = i10;
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        boolean z10;
        int i10;
        ViewGroup.LayoutParams layoutParams = this.f12552a.getLayoutParams();
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = -2;
        } else {
            i10 = (int) (((float) this.f12553b) * f10);
        }
        layoutParams.height = i10;
        this.f12552a.requestLayout();
    }

    public final boolean willChangeBounds() {
        return true;
    }
}
