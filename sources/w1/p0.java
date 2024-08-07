package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ViewPropertyAnimatorCompat */
public final class p0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r0 f16347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f16348b;

    public p0(r0 r0Var, View view) {
        this.f16347a = r0Var;
        this.f16348b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f16347a.b(this.f16348b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16347a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f16347a.c();
    }
}
