package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21 */
public final class e0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2607a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2608b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2609c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2610d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f2611e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2612f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d0 f2613g;

    public e0(d0 d0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2613g = d0Var;
        this.f2607a = obj;
        this.f2608b = arrayList;
        this.f2611e = obj2;
        this.f2612f = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.f2607a;
        if (obj != null) {
            this.f2613g.t(obj, this.f2608b, (ArrayList<View>) null);
        }
        Object obj2 = this.f2609c;
        if (obj2 != null) {
            this.f2613g.t(obj2, this.f2610d, (ArrayList<View>) null);
        }
        Object obj3 = this.f2611e;
        if (obj3 != null) {
            this.f2613g.t(obj3, this.f2612f, (ArrayList<View>) null);
        }
    }
}
