package t1;

import t1.k;
import v1.a;

/* compiled from: FontRequestWorker */
public final class h implements a<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f14772a;

    public h(c cVar) {
        this.f14772a = cVar;
    }

    public final void accept(Object obj) {
        k.a aVar = (k.a) obj;
        if (aVar == null) {
            aVar = new k.a(-3);
        }
        this.f14772a.a(aVar);
    }
}
