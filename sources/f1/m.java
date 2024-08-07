package f1;

import android.view.animation.Interpolator;
import b1.c;

/* compiled from: MotionController */
public final class m implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9728a;

    public m(c cVar) {
        this.f9728a = cVar;
    }

    public final float getInterpolation(float f10) {
        return (float) this.f9728a.a((double) f10);
    }
}
