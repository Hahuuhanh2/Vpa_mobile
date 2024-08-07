package vf;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import sf.b;

/* compiled from: ColorAnimation */
public class b extends a<ValueAnimator> {

    /* renamed from: d  reason: collision with root package name */
    public uf.a f23262d = new uf.a();

    /* renamed from: e  reason: collision with root package name */
    public int f23263e;

    /* renamed from: f  reason: collision with root package name */
    public int f23264f;

    /* compiled from: ColorAnimation */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b bVar = b.this;
            bVar.getClass();
            int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
            uf.a aVar = bVar.f23262d;
            aVar.f23026a = intValue;
            aVar.f23027b = intValue2;
            b.a aVar2 = bVar.f23260b;
            if (aVar2 != null) {
                ((com.smarteist.autoimageslider.IndicatorView.a) aVar2).b(aVar);
            }
        }
    }

    public b(b.a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public final PropertyValuesHolder e(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f23264f;
            i11 = this.f23263e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i10 = this.f23263e;
            i11 = this.f23264f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i10, i11});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    public final a f(float f10) {
        T t10 = this.f23261c;
        if (t10 != null) {
            long j10 = (long) (f10 * ((float) this.f23259a));
            if (((ValueAnimator) t10).getValues() != null && ((ValueAnimator) this.f23261c).getValues().length > 0) {
                ((ValueAnimator) this.f23261c).setCurrentPlayTime(j10);
            }
        }
        return this;
    }
}
