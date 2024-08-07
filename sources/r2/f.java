package r2;

import al.i1;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import java.util.concurrent.CancellationException;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f14471a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i1 f14472b;

    public /* synthetic */ f(j jVar, i1 i1Var) {
        this.f14471a = jVar;
        this.f14472b = i1Var;
    }

    public final void q(l lVar, i.a aVar) {
        j jVar = this.f14471a;
        i1 i1Var = this.f14472b;
        sk.j.f(jVar, "this$0");
        sk.j.f(i1Var, "$parentJob");
        if (lVar.B().f2785d == i.b.DESTROYED) {
            i1Var.cancel((CancellationException) null);
            jVar.a();
        } else if (lVar.B().f2785d.compareTo(jVar.f2775b) < 0) {
            jVar.f2776c.f14467a = true;
        } else {
            d dVar = jVar.f2776c;
            if (dVar.f14467a) {
                if (!dVar.f14468b) {
                    dVar.f14467a = false;
                    dVar.a();
                    return;
                }
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
        }
    }
}
