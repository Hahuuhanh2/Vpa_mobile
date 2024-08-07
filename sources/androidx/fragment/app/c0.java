package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: FragmentTransitionCompat21 */
public final class c0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f2589a;

    public c0(Rect rect) {
        this.f2589a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f2589a;
    }
}
