package vf;

import android.animation.ValueAnimator;
import com.smarteist.autoimageslider.IndicatorView.a;
import sf.b;
import uf.e;

/* compiled from: SlideAnimation */
public final class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f23293a;

    public i(j jVar) {
        this.f23293a = jVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        j jVar = this.f23293a;
        jVar.getClass();
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        e eVar = jVar.f23294d;
        eVar.f23037a = intValue;
        b.a aVar = jVar.f23260b;
        if (aVar != null) {
            ((a) aVar).b(eVar);
        }
    }
}
