package h8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j3.c;

/* compiled from: CircularIndeterminateAnimatorDelegate */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10634a;

    public e(f fVar) {
        this.f10634a = fVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f10634a.c();
        f fVar = this.f10634a;
        c cVar = fVar.f10647k;
        if (cVar != null) {
            cVar.a((l) fVar.f13020a);
        }
    }
}
