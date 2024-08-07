package h8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f10683a;

    public p(r rVar) {
        this.f10683a = rVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        r rVar = this.f10683a;
        rVar.f10692h = (rVar.f10692h + 1) % rVar.f10691g.f10625c.length;
        rVar.f10693i = true;
    }
}
