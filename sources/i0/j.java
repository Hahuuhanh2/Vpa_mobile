package i0;

import al.g0;
import java.util.List;
import z0.b;

/* compiled from: ListFuture */
public final class j implements b.c<List<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f10914a;

    public j(m mVar) {
        this.f10914a = mVar;
    }

    public final String e(b.a aVar) {
        boolean z10;
        if (this.f10914a.f10924f == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("The result can only set once!", z10);
        this.f10914a.f10924f = aVar;
        return "ListFuture[" + this + "]";
    }
}
