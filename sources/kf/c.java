package kf;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: BaseAppUtils.kt */
public final class c extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f12550a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12551b;

    public c(int i10, View view) {
        this.f12550a = view;
        this.f12551b = i10;
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        boolean z10;
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f12550a.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f12550a.getLayoutParams();
        int i10 = this.f12551b;
        layoutParams.height = i10 - ((int) (((float) i10) * f10));
        this.f12550a.requestLayout();
    }

    public final boolean willChangeBounds() {
        return true;
    }
}
