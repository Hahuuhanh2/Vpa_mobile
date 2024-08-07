package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3207b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3208c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f3209d;

    public e(View view, ViewPropertyAnimator viewPropertyAnimator, c cVar, RecyclerView.a0 a0Var) {
        this.f3209d = cVar;
        this.f3206a = a0Var;
        this.f3207b = view;
        this.f3208c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3207b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3208c.setListener((Animator.AnimatorListener) null);
        this.f3209d.h(this.f3206a);
        this.f3209d.f3181o.remove(this.f3206a);
        this.f3209d.t();
    }

    public final void onAnimationStart(Animator animator) {
        this.f3209d.getClass();
    }
}
