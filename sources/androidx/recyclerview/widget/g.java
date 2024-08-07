package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;

/* compiled from: DefaultItemAnimator */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.d f3216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3217b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3218c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f3219d;

    public g(c cVar, c.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3219d = cVar;
        this.f3216a = dVar;
        this.f3217b = viewPropertyAnimator;
        this.f3218c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3217b.setListener((Animator.AnimatorListener) null);
        this.f3218c.setAlpha(1.0f);
        this.f3218c.setTranslationX(0.0f);
        this.f3218c.setTranslationY(0.0f);
        this.f3219d.h(this.f3216a.f3191a);
        this.f3219d.f3184r.remove(this.f3216a.f3191a);
        this.f3219d.t();
    }

    public final void onAnimationStart(Animator animator) {
        c cVar = this.f3219d;
        RecyclerView.a0 a0Var = this.f3216a.f3191a;
        cVar.getClass();
    }
}
