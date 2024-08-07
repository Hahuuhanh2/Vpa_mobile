package androidx.transition;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport */
public final class e extends g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f3482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3483b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3484c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3485d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3486e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3487f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f3488g;

    public e(d dVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3488g = dVar;
        this.f3482a = obj;
        this.f3483b = arrayList;
        this.f3486e = obj2;
        this.f3487f = arrayList2;
    }

    public final void b(Transition transition) {
        Object obj = this.f3482a;
        if (obj != null) {
            this.f3488g.t(obj, this.f3483b, (ArrayList<View>) null);
        }
        Object obj2 = this.f3484c;
        if (obj2 != null) {
            this.f3488g.t(obj2, this.f3485d, (ArrayList<View>) null);
        }
        Object obj3 = this.f3486e;
        if (obj3 != null) {
            this.f3488g.t(obj3, this.f3487f, (ArrayList<View>) null);
        }
    }

    public final void d(Transition transition) {
        transition.z(this);
    }
}
