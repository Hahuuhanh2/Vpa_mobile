package androidx.fragment.app;

import android.transition.Transition;
import androidx.appcompat.app.p;

/* compiled from: FragmentTransitionCompat21 */
public final class f0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f2618a;

    public f0(p pVar) {
        this.f2618a = pVar;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.f2618a.run();
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
