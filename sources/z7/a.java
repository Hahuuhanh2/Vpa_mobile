package z7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.c;

/* compiled from: CircularRevealCompat */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f17893a;

    public a(c cVar) {
        this.f17893a = cVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f17893a.b();
    }

    public final void onAnimationStart(Animator animator) {
        this.f17893a.a();
    }
}
