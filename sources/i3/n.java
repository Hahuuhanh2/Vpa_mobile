package i3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import v0.b;

/* compiled from: Transition */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transition f11060b;

    public n(Transition transition, b bVar) {
        this.f11060b = transition;
        this.f11059a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11059a.remove(animator);
        this.f11060b.f3443t.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f11060b.f3443t.add(animator);
    }
}
