package h8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j3.c;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f10684a;

    public q(r rVar) {
        this.f10684a = rVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f10684a.c();
        r rVar = this.f10684a;
        c cVar = rVar.f10695k;
        if (cVar != null) {
            cVar.a((l) rVar.f13020a);
        }
    }
}
