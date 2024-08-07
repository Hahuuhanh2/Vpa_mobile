package androidx.fragment.app;

import f.f;
import f.g;
import p.a;

/* compiled from: Fragment */
public final class j implements a<Void, f> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f2654a;

    public j(Fragment fragment) {
        this.f2654a = fragment;
    }

    public final Object apply(Object obj) {
        Void voidR = (Void) obj;
        Fragment fragment = this.f2654a;
        r<?> rVar = fragment.f2461z;
        if (rVar instanceof g) {
            return ((g) rVar).k();
        }
        return fragment.c0().f278s;
    }
}
