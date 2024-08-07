package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.textfield.e;
import n1.d;
import t7.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6601b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f6600a = i10;
        this.f6601b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6600a) {
            case 0:
                ((DrawerLayout) this.f6601b).setScrimColor(d.d(-1728053248, b.b(valueAnimator.getAnimatedFraction(), c.f6604a, 0)));
                return;
            case 1:
                ((i.d) this.f6601b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                e eVar = (e) this.f6601b;
                eVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar.f7077d.setScaleX(floatValue);
                eVar.f7077d.setScaleY(floatValue);
                return;
        }
    }
}
