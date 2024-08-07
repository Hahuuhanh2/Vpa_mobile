package he;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import fe.d;

/* compiled from: SlideInBottomAnimationAdapter */
public final class c extends b {
    public c(d dVar) {
        super(dVar);
    }

    public final Animator[] t(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) view.getMeasuredHeight(), 0.0f})};
    }
}
