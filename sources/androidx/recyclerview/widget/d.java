package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3203b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3204c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f3205d;

    public d(View view, ViewPropertyAnimator viewPropertyAnimator, c cVar, RecyclerView.a0 a0Var) {
        this.f3205d = cVar;
        this.f3202a = a0Var;
        this.f3203b = viewPropertyAnimator;
        this.f3204c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3203b.setListener((Animator.AnimatorListener) null);
        this.f3204c.setAlpha(1.0f);
        this.f3205d.h(this.f3202a);
        this.f3205d.f3183q.remove(this.f3202a);
        this.f3205d.t();
    }

    public final void onAnimationStart(Animator animator) {
        this.f3205d.getClass();
    }
}
