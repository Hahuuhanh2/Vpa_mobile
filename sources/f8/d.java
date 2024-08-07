package f8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: MaterialBottomContainerBackHelper */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10052a;

    public d(e eVar) {
        this.f10052a = eVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f10052a.f10041b.setTranslationY(0.0f);
        this.f10052a.b(0.0f);
    }
}
