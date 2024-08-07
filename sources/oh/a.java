package oh;

import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.home.data.model.Item;
import ef.d;
import ek.i;
import java.io.Serializable;
import lg.b;
import mg.k4;
import rk.l;
import sk.j;

/* compiled from: ActionsAdapter.kt */
public final class a extends d<Item, k4> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Item, i> f21791p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, l<? super Item, i> lVar) {
        super(lVar);
        j.f(lVar, "listener");
        this.f21791p = lVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        k4 k4Var = (k4) lVar;
        Item item = (Item) serializable;
        j.f(k4Var, "binding");
        j.f(item, "model");
        k4Var.v(new qh.a(y(), item));
    }

    public final int x() {
        return C0535R$layout.item_action_home;
    }

    public final void z(Serializable serializable) {
        Item item = (Item) serializable;
        j.f(item, "model");
        this.f21791p.invoke(item);
    }
}
