package a3;

import androidx.lifecycle.i;
import androidx.lifecycle.n;
import r2.l;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f81a;

    public /* synthetic */ b(c cVar) {
        this.f81a = cVar;
    }

    public final void q(l lVar, i.a aVar) {
        c cVar = this.f81a;
        j.f(cVar, "this$0");
        if (aVar == i.a.ON_START) {
            cVar.f87f = true;
        } else if (aVar == i.a.ON_STOP) {
            cVar.f87f = false;
        }
    }
}
