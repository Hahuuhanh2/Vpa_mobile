package vf;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import sf.b;
import uf.g;

/* compiled from: ThinWormAnimation */
public final class m extends n {

    /* renamed from: i  reason: collision with root package name */
    public g f23301i = new g();

    /* compiled from: ThinWormAnimation */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            m mVar = m.this;
            mVar.f23301i.f23040c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            b.a aVar = mVar.f23260b;
            if (aVar != null) {
                ((com.smarteist.autoimageslider.IndicatorView.a) aVar).b(mVar.f23301i);
            }
        }
    }

    public m(b.a aVar) {
        super(aVar);
    }

    public final /* bridge */ /* synthetic */ n f(float f10) {
        throw null;
    }

    public final ValueAnimator g(int i10, int i11, long j10) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new a());
        return ofInt;
    }

    public final void h(float f10) {
        T t10 = this.f23261c;
        if (t10 != null) {
            long j10 = (long) (f10 * ((float) this.f23259a));
            int size = ((AnimatorSet) t10).getChildAnimations().size();
            for (int i10 = 0; i10 < size; i10++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f23261c).getChildAnimations().get(i10);
                long startDelay = j10 - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i10 != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
    }
}
