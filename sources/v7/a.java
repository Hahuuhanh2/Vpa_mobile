package v7;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import l8.h;

/* compiled from: BottomSheetBehavior */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f16074a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f16074a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h hVar = this.f16074a.f5824p;
        if (hVar != null) {
            hVar.o(floatValue);
        }
    }
}
