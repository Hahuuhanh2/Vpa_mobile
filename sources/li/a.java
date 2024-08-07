package li;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.regulation.ui.b;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.y6;
import rk.l;
import sk.j;

/* compiled from: RegulationAdapter.kt */
public final class a extends d<String, y6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<String, i> f20856p;

    public a(b bVar) {
        super(bVar);
        this.f20856p = bVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        j.f((y6) lVar, "binding");
        j.f((String) serializable, "model");
    }

    public final int x() {
        return C0535R$layout.item_regulation;
    }

    public final void z(Serializable serializable) {
        String str = (String) serializable;
        j.f(str, "model");
        this.f20856p.invoke(str);
    }
}
