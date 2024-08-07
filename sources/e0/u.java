package e0;

import androidx.appcompat.app.p;
import androidx.fragment.app.FragmentManager;
import e0.v;
import i1.k;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9038a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9039b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f9038a = i10;
        this.f9039b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f9038a) {
            case 0:
                v vVar = (v) this.f9039b;
                v.b bVar = (v.b) obj;
                vVar.getClass();
                if (!((x) bVar.b().f9055e).f9065g) {
                    vVar.f9040a.execute(new p(10, vVar, bVar));
                    return;
                }
                return;
            default:
                FragmentManager fragmentManager = (FragmentManager) this.f9039b;
                k kVar = (k) obj;
                if (fragmentManager.L()) {
                    fragmentManager.m(kVar.f10954a, false);
                    return;
                }
                return;
        }
    }
}
