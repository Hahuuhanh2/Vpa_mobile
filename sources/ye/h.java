package ye;

import android.widget.CompoundButton;
import com.vpa.daugia.C0535R$layout;
import ef.d;
import ek.i;
import gf.b;
import java.io.Serializable;
import mg.o4;
import rk.l;
import sk.j;

/* compiled from: AddressSelectionAdapter.kt */
public final class h extends d<b, o4> {

    /* renamed from: p  reason: collision with root package name */
    public final l<b, i> f17735p;

    /* renamed from: q  reason: collision with root package name */
    public Integer f17736q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f17737r;

    public h(boolean z10, com.ots.base.ui.b bVar) {
        super(bVar);
        this.f17735p = bVar;
        this.f17737r = z10;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        o4 o4Var = (o4) lVar;
        b bVar = (b) serializable;
        j.f(o4Var, "binding");
        j.f(bVar, "model");
        o4Var.f21274y.setText(bVar.a());
        o4Var.f21272w.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        o4Var.f21272w.setChecked(bVar.f10499c);
        o4Var.f21274y.setSelected(bVar.f10499c);
        if (!this.f17737r && bVar.f10499c) {
            Integer num = this.f17736q;
            if (num != null) {
                ((b) this.f9444f.get(num.intValue())).f10499c = false;
            }
            this.f17736q = Integer.valueOf(i10);
        }
        o4Var.f21273x.setOnClickListener(new com.google.android.material.textfield.b(o4Var, 3));
        o4Var.f21272w.setOnCheckedChangeListener(new g(bVar, this, i10));
    }

    public final int x() {
        return C0535R$layout.item_address_selection;
    }
}
