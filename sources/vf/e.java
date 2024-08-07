package vf;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import sf.b;
import uf.c;

/* compiled from: FillAnimation */
public final class e extends b {

    /* renamed from: g  reason: collision with root package name */
    public c f23274g = new c();

    /* renamed from: h  reason: collision with root package name */
    public int f23275h;

    /* renamed from: i  reason: collision with root package name */
    public int f23276i;

    /* compiled from: FillAnimation */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            e eVar = e.this;
            eVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
            int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
            int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
            int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
            int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
            c cVar = eVar.f23274g;
            cVar.f23026a = intValue;
            cVar.f23027b = intValue2;
            cVar.f23031c = intValue3;
            cVar.f23032d = intValue4;
            cVar.f23033e = intValue5;
            cVar.f23034f = intValue6;
            b.a aVar = eVar.f23260b;
            if (aVar != null) {
                ((com.smarteist.autoimageslider.IndicatorView.a) aVar).b(cVar);
            }
        }
    }

    public e(b.a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public final ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public final PropertyValuesHolder g(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f23275h;
            i11 = i10 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i11 = this.f23275h;
            i10 = i11 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i11, i10});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public final PropertyValuesHolder h(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f23275h;
            str = "ANIMATION_STROKE_REVERSE";
            i11 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i11 = this.f23275h;
            i10 = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i10, i11});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
