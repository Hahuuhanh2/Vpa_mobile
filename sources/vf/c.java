package vf;

import android.animation.ValueAnimator;
import com.smarteist.autoimageslider.IndicatorView.a;
import sf.b;
import v.v;

/* compiled from: DropAnimation */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f23267b;

    public c(d dVar, int i10) {
        this.f23267b = dVar;
        this.f23266a = i10;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d dVar = this.f23267b;
        int i10 = this.f23266a;
        dVar.getClass();
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int g2 = v.g(i10);
        if (g2 == 0) {
            dVar.f23273i.f23028a = intValue;
        } else if (g2 == 1) {
            dVar.f23273i.f23029b = intValue;
        } else if (g2 == 2) {
            dVar.f23273i.f23030c = intValue;
        }
        b.a aVar = dVar.f23260b;
        if (aVar != null) {
            ((a) aVar).b(dVar.f23273i);
        }
    }
}
