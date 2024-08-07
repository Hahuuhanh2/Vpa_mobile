package di;

import com.vpa.daugia.C0535R$layout;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.s6;
import rk.l;
import sk.j;

/* compiled from: PlateSelectionAdapter.kt */
public final class a extends d<String, s6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<String, i> f19942p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.vpa.daugia.module.plate_selection.ui.activity.a aVar) {
        super(aVar);
        j.f(aVar, "listener");
        this.f19942p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        j.f((s6) lVar, "binding");
        j.f((String) serializable, "model");
    }

    public final int x() {
        return C0535R$layout.item_plate_selection;
    }
}
