package vf;

import android.animation.ValueAnimator;
import com.smarteist.autoimageslider.IndicatorView.a;
import sf.b;
import uf.f;

/* compiled from: SwapAnimation */
public final class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f23297a;

    public k(l lVar) {
        this.f23297a = lVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l lVar = this.f23297a;
        lVar.getClass();
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        f fVar = lVar.f23300f;
        fVar.f23038a = intValue;
        fVar.f23039b = intValue2;
        b.a aVar = lVar.f23260b;
        if (aVar != null) {
            ((a) aVar).b(fVar);
        }
    }
}
