package pi;

import af.a;
import com.vpa.daugia.C0535R$layout;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.e7;
import rk.l;
import sk.j;

/* compiled from: SelectedProvinceAdapter.kt */
public final class b extends d<gf.b, e7> {

    /* renamed from: p  reason: collision with root package name */
    public final l<gf.b, i> f22657p;

    public b(com.vpa.daugia.module.searching.ui.activity.b bVar) {
        super(bVar);
        this.f22657p = bVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        e7 e7Var = (e7) lVar;
        gf.b bVar = (gf.b) serializable;
        j.f(e7Var, "binding");
        j.f(bVar, "model");
        e7Var.f21054x.setText(bVar.a());
        e7Var.f21053w.setOnClickListener(new a(2, this, bVar));
    }

    public final int x() {
        return C0535R$layout.item_selected_province;
    }
}
