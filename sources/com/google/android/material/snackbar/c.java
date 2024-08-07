package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import q2.b;

/* compiled from: BaseTransientBottomBar */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6853a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f6853a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        b bVar = BaseTransientBottomBar.f6805u;
        this.f6853a.f6818i.setTranslationY((float) intValue);
    }
}
