package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3211b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3212c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3213d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3214e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f3215f;

    public f(c cVar, RecyclerView.a0 a0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3215f = cVar;
        this.f3210a = a0Var;
        this.f3211b = i10;
        this.f3212c = view;
        this.f3213d = i11;
        this.f3214e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f3211b != 0) {
            this.f3212c.setTranslationX(0.0f);
        }
        if (this.f3213d != 0) {
            this.f3212c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3214e.setListener((Animator.AnimatorListener) null);
        this.f3215f.h(this.f3210a);
        this.f3215f.f3182p.remove(this.f3210a);
        this.f3215f.t();
    }

    public final void onAnimationStart(Animator animator) {
        this.f3215f.getClass();
    }
}
