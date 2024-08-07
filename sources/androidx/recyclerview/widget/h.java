package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;

/* compiled from: DefaultItemAnimator */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.d f3220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3221b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3222c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f3223d;

    public h(c cVar, c.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3223d = cVar;
        this.f3220a = dVar;
        this.f3221b = viewPropertyAnimator;
        this.f3222c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3221b.setListener((Animator.AnimatorListener) null);
        this.f3222c.setAlpha(1.0f);
        this.f3222c.setTranslationX(0.0f);
        this.f3222c.setTranslationY(0.0f);
        this.f3223d.h(this.f3220a.f3192b);
        this.f3223d.f3184r.remove(this.f3220a.f3192b);
        this.f3223d.t();
    }

    public final void onAnimationStart(Animator animator) {
        c cVar = this.f3223d;
        RecyclerView.a0 a0Var = this.f3220a.f3192b;
        cVar.getClass();
    }
}
