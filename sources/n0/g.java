package n0;

import android.view.Surface;
import c0.x0;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f13330a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x0 f13331b;

    public /* synthetic */ g(j jVar, x0 x0Var) {
        this.f13330a = jVar;
        this.f13331b = x0Var;
    }

    public final void accept(Object obj) {
        j jVar = this.f13330a;
        x0 x0Var = this.f13331b;
        x0.a aVar = (x0.a) obj;
        jVar.getClass();
        x0Var.close();
        Surface surface = (Surface) jVar.f13345h.remove(x0Var);
        if (surface != null) {
            m mVar = jVar.f13338a;
            mVar.d(true);
            mVar.c();
            mVar.r(surface, true);
        }
    }
}
