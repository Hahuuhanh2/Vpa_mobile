package vf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import sf.b;
import uf.e;

/* compiled from: SlideAnimation */
public final class j extends a<ValueAnimator> {

    /* renamed from: d  reason: collision with root package name */
    public e f23294d = new e();

    /* renamed from: e  reason: collision with root package name */
    public int f23295e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f23296f = -1;

    public j(b.a aVar) {
        super(aVar);
    }

    public final Animator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new i(this));
        return valueAnimator;
    }
}
