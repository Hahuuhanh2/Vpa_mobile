package oh;

import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.ui.a;
import ef.d;
import ek.i;
import java.io.Serializable;
import kf.b;
import mg.q4;
import rk.l;
import rk.p;
import sk.j;
import tg.e;

/* compiled from: AnnouncementPlateAdapter.kt */
public final class c extends d<Plate, q4> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Plate, i> f21794p;

    /* renamed from: q  reason: collision with root package name */
    public l<? super Plate, i> f21795q;

    /* renamed from: r  reason: collision with root package name */
    public p<? super Boolean, ? super Plate, i> f21796r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(aVar);
        j.f(aVar, "listener");
        this.f21794p = aVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        boolean z10;
        q4 q4Var = (q4) lVar;
        Plate plate = (Plate) serializable;
        j.f(q4Var, "binding");
        j.f(plate, "model");
        q4Var.v(new qh.d(y(), plate));
        MaterialButton materialButton = q4Var.f21311w;
        j.e(materialButton, "btnRegister");
        materialButton.setOnClickListener(new b(500, materialButton, new b(this, plate)));
        AppTextView appTextView = q4Var.f21314z;
        Boolean interested = plate.getInterested();
        if (interested != null) {
            z10 = interested.booleanValue();
        } else {
            z10 = false;
        }
        appTextView.setSelected(z10);
        q4Var.f21314z.setOnClickListener(new e(q4Var, this, plate, 2));
    }

    public final int x() {
        return C0535R$layout.item_announcement_plate;
    }
}
