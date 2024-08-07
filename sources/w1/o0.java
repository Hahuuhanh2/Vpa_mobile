package w1;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.v;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t0 f16344a;

    public /* synthetic */ o0(v.c cVar, View view) {
        this.f16344a = cVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) v.this.f501d.getParent()).invalidate();
    }
}
