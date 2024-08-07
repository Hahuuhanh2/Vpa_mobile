package i3;

import androidx.transition.Transition;
import s1.e;

/* compiled from: FragmentTransitionSupport */
public final class d implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transition f11034a;

    public d(Transition transition) {
        this.f11034a = transition;
    }

    public final void onCancel() {
        this.f11034a.cancel();
    }
}
