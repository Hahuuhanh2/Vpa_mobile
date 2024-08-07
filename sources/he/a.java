package he;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import fe.d;

/* compiled from: AlphaInAnimationAdapter */
public final class a extends b {
    public a(d dVar) {
        super(dVar);
    }

    public final Animator[] t(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f})};
    }
}
