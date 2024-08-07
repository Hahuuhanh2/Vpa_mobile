package h8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10633a;

    public d(f fVar) {
        this.f10633a = fVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        f fVar = this.f10633a;
        fVar.f10644h = (fVar.f10644h + 4) % fVar.f10643g.f10625c.length;
    }
}
