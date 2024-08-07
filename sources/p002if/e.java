package p002if;

import android.widget.CompoundButton;
import com.google.android.material.search.h;
import com.ots.core.R$layout;
import ef.d;
import ek.i;
import gf.b;
import hf.r;
import java.io.Serializable;
import rk.l;
import sk.j;

/* renamed from: if.e  reason: invalid package */
/* compiled from: ItemSelectionAdapter.kt */
public final class e extends d<b, r> {

    /* renamed from: p  reason: collision with root package name */
    public final l<b, i> f11444p;

    /* renamed from: q  reason: collision with root package name */
    public Integer f11445q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11446r;

    public e(boolean z10, com.ots.core.utils.customview.b bVar) {
        super(bVar);
        this.f11444p = bVar;
        this.f11446r = z10;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        r rVar = (r) lVar;
        b bVar = (b) serializable;
        j.f(rVar, "binding");
        j.f(bVar, "model");
        rVar.f10811y.setText(bVar.a());
        rVar.f10809w.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        rVar.f10809w.setChecked(bVar.f10499c);
        if (!this.f11446r && bVar.f10499c) {
            this.f11445q = Integer.valueOf(i10);
        }
        rVar.f10810x.setOnClickListener(new h(rVar, 2));
        rVar.f10809w.setOnCheckedChangeListener(new d(bVar, this, i10));
    }

    public final int x() {
        return R$layout.item_selection;
    }
}
