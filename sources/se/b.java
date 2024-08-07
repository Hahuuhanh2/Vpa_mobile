package se;

import android.animation.ValueAnimator;
import com.luck.picture.lib.magical.MagicalView;

/* compiled from: MagicalView */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MagicalView f14749a;

    public b(MagicalView magicalView) {
        this.f14749a = magicalView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MagicalView magicalView = this.f14749a;
        magicalView.h(false, floatValue, (float) magicalView.f8102c, (float) magicalView.f8108p, (float) magicalView.f8101b, (float) magicalView.f8111s, (float) magicalView.f8104e, (float) magicalView.f8109q, (float) magicalView.f8103d, (float) magicalView.f8110r);
    }
}
