package i3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* compiled from: Transition */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transition f11061a;

    public o(Transition transition) {
        this.f11061a = transition;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11061a.p();
        animator.removeListener(this);
    }
}
