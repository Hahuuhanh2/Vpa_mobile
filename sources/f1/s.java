package f1;

import android.view.animation.Interpolator;
import b1.c;

/* compiled from: ViewTransition */
public final class s implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9773a;

    public s(c cVar) {
        this.f9773a = cVar;
    }

    public final float getInterpolation(float f10) {
        return (float) this.f9773a.a((double) f10);
    }
}
