package e8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ExtendedFloatingActionButton */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f9263b;

    public c(a aVar) {
        this.f9263b = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9262a = true;
        this.f9263b.c();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9263b.a();
        if (!this.f9262a) {
            this.f9263b.b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f9263b.onAnimationStart(animator);
        this.f9262a = false;
    }
}
