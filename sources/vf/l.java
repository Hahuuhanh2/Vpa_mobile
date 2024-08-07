package vf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import sf.b;
import uf.f;

/* compiled from: SwapAnimation */
public final class l extends a<ValueAnimator> {

    /* renamed from: d  reason: collision with root package name */
    public int f23298d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f23299e = -1;

    /* renamed from: f  reason: collision with root package name */
    public f f23300f = new f();

    public l(b.a aVar) {
        super(aVar);
    }

    public final Animator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new k(this));
        return valueAnimator;
    }
}
