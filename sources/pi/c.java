package pi;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.k;
import com.ots.core.R$color;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import ef.d;
import ek.i;
import gf.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import mg.j7;
import rk.l;
import sk.j;

/* compiled from: VehicleTypeAdapter.kt */
public final class c extends d<b, j7> {

    /* renamed from: p  reason: collision with root package name */
    public final l<b, i> f22658p;

    public c(com.vpa.daugia.module.searching.ui.activity.c cVar) {
        super(cVar);
        this.f22658p = cVar;
    }

    public final ArrayList B() {
        List<Model> list = this.f9444f;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((b) next).f10499c) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        j7 j7Var = (j7) lVar;
        b bVar = (b) serializable;
        j.f(j7Var, "binding");
        j.f(bVar, "model");
        com.bumptech.glide.l e10 = com.bumptech.glide.b.e(j7Var.f21134w);
        Integer num = bVar.f10501e;
        e10.getClass();
        new k(e10.f4948a, e10, Drawable.class, e10.f4949b).D(num).B(j7Var.f21134w);
        j7Var.f21137z.setText(bVar.a());
        if (bVar.f10499c) {
            j7Var.f21135x.setVisibility(0);
            j7Var.f21136y.setBackgroundResource(C0531R$drawable.bg_filter_selected);
            AppTextView appTextView = j7Var.f21137z;
            appTextView.setTextColor(a.getColor(appTextView.getContext(), 2131100626));
            j7Var.f21137z.setTypeface((Typeface) null, 1);
            return;
        }
        j7Var.f21135x.setVisibility(8);
        j7Var.f21136y.setBackgroundResource(C0531R$drawable.bg_filter_normal);
        AppTextView appTextView2 = j7Var.f21137z;
        appTextView2.setTextColor(a.getColor(appTextView2.getContext(), R$color.dark_500));
        j7Var.f21137z.setTypeface((Typeface) null, 0);
    }

    public final int x() {
        return C0535R$layout.item_vehicle_type;
    }

    public final void z(Serializable serializable) {
        b bVar = (b) serializable;
        j.f(bVar, "model");
        for (Model model : this.f9444f) {
            if (!j.a(model, bVar)) {
                model.f10499c = false;
            }
        }
        bVar.f10499c = !bVar.f10499c;
        f();
        this.f22658p.invoke(bVar);
    }
}
