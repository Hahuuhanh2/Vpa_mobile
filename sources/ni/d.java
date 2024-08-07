package ni;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.scope.ui.activity.a;
import ek.g;
import ek.i;
import java.io.Serializable;
import mg.c7;
import rk.l;
import sk.j;

/* compiled from: ScopeAdapter.kt */
public final class d extends ef.d<String, c7> {

    /* renamed from: p  reason: collision with root package name */
    public final l<String, i> f21720p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(aVar);
        j.f(aVar, "listener");
        this.f21720p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        c7 c7Var = (c7) lVar;
        j.f(c7Var, "binding");
        j.f((String) serializable, "model");
        g b02 = j7.a.b0(c.f21719a);
        RecyclerView recyclerView = c7Var.f21016w;
        y();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter((a) b02.getValue());
        ((a) b02.getValue()).A(j7.a.g0("1", "1", "1"));
    }

    public final int x() {
        return C0535R$layout.item_scope;
    }
}
