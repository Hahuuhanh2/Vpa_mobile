package g3;

import android.animation.ValueAnimator;
import g3.d;

/* compiled from: CircularProgressDrawable */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f10298a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f10299b;

    public b(d dVar, d.a aVar) {
        this.f10299b = dVar;
        this.f10298a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f10299b;
        d.a aVar = this.f10298a;
        dVar.getClass();
        d.d(floatValue, aVar);
        this.f10299b.a(floatValue, this.f10298a, false);
        this.f10299b.invalidateSelf();
    }
}
