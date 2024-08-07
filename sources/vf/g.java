package vf;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import sf.b;
import uf.d;

/* compiled from: ScaleAnimation */
public class g extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f23289g;

    /* renamed from: h  reason: collision with root package name */
    public float f23290h;

    /* renamed from: i  reason: collision with root package name */
    public d f23291i = new d();

    /* compiled from: ScaleAnimation */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            g gVar = g.this;
            gVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
            int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
            int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
            d dVar = gVar.f23291i;
            dVar.f23026a = intValue;
            dVar.f23027b = intValue2;
            dVar.f23035c = intValue3;
            dVar.f23036d = intValue4;
            b.a aVar = gVar.f23260b;
            if (aVar != null) {
                ((com.smarteist.autoimageslider.IndicatorView.a) aVar).b(dVar);
            }
        }
    }

    public g(b.a aVar) {
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

    public PropertyValuesHolder g(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f23289g;
            i11 = (int) (((float) i10) * this.f23290h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i11 = this.f23289g;
            i10 = (int) (((float) i11) * this.f23290h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i10, i11});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public final void h(float f10, int i10, int i11, int i12) {
        boolean z10;
        if (this.f23261c != null) {
            if (this.f23263e == i10 && this.f23264f == i11 && this.f23289g == i12 && this.f23290h == f10) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f23263e = i10;
                this.f23264f = i11;
                this.f23289g = i12;
                this.f23290h = f10;
                ((ValueAnimator) this.f23261c).setValues(new PropertyValuesHolder[]{e(false), e(true), g(false), g(true)});
            }
        }
    }
}
