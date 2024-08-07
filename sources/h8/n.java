package h8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f10675a;

    public n(o oVar) {
        this.f10675a = oVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        o oVar = this.f10675a;
        oVar.f10680g = (oVar.f10680g + 1) % oVar.f10679f.f10625c.length;
        oVar.f10681h = true;
    }
}
