package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import n8.b;
import n8.g;

/* compiled from: BaseTransientBottomBar */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6856a;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6856a = baseTransientBottomBar;
    }

    public final void run() {
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.f6856a.f6818i;
        if (snackbarBaseLayout != null) {
            if (snackbarBaseLayout.getParent() != null) {
                this.f6856a.f6818i.setVisibility(0);
            }
            if (this.f6856a.f6818i.getAnimationMode() == 1) {
                BaseTransientBottomBar baseTransientBottomBar = this.f6856a;
                baseTransientBottomBar.getClass();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(baseTransientBottomBar.f6813d);
                ofFloat.addUpdateListener(new a(baseTransientBottomBar));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat2.setInterpolator(baseTransientBottomBar.f6815f);
                ofFloat2.addUpdateListener(new b(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setDuration((long) baseTransientBottomBar.f6810a);
                animatorSet.addListener(new g(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = this.f6856a;
            int height = baseTransientBottomBar2.f6818i.getHeight();
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f6818i.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            baseTransientBottomBar2.f6818i.setTranslationY((float) height);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(baseTransientBottomBar2.f6814e);
            valueAnimator.setDuration((long) baseTransientBottomBar2.f6812c);
            valueAnimator.addListener(new b(baseTransientBottomBar2));
            valueAnimator.addUpdateListener(new c(baseTransientBottomBar2, height));
            valueAnimator.start();
        }
    }
}
