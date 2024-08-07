package oh;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.R$dimen;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.home.data.api.response.Plate;
import ef.d;
import java.io.Serializable;
import lg.b;
import mg.a6;
import rk.l;
import rk.p;
import sk.j;
import tg.h;

/* compiled from: PlateAdapter.kt */
public final class i extends d<Plate, a6> {

    /* renamed from: p  reason: collision with root package name */
    public final l<Plate, ek.i> f21805p;

    /* renamed from: q  reason: collision with root package name */
    public p<? super Plate, ? super String, ek.i> f21806q;

    /* renamed from: r  reason: collision with root package name */
    public p<? super Boolean, ? super Plate, ek.i> f21807r;

    public i(b bVar, com.vpa.daugia.module.home.ui.d dVar) {
        super(dVar);
        this.f21805p = dVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        a6 a6Var = (a6) lVar;
        Plate plate = (Plate) serializable;
        j.f(a6Var, "binding");
        j.f(plate, "model");
        GradientTextView gradientTextView = a6Var.f20959z;
        j.e(gradientTextView, "tvMore");
        gradientTextView.setOnClickListener(new kf.b(500, gradientTextView, new f(this, plate)));
        a6Var.B.setText(String.valueOf(plate.getTotalInterested()));
        a6Var.v(new qh.d(y(), plate));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        boolean z10 = false;
        if (i10 == 0) {
            layoutParams.setMargins(y().getResources().getDimensionPixelSize(R$dimen.dp_8), 0, y().getResources().getDimensionPixelSize(R$dimen.dp_8), 0);
        } else {
            layoutParams.setMargins(0, 0, y().getResources().getDimensionPixelSize(R$dimen.dp_8), 0);
        }
        a6Var.f20958y.setLayoutParams(layoutParams);
        MaterialButton materialButton = a6Var.f20957x;
        j.e(materialButton, "btnRegister");
        materialButton.setOnClickListener(new kf.b(500, materialButton, new g(this, plate)));
        ImageButton imageButton = a6Var.f20956w;
        j.e(imageButton, "btnCart");
        imageButton.setOnClickListener(new kf.b(500, imageButton, new h(this, plate)));
        AppTextView appTextView = a6Var.B;
        Boolean interested = plate.getInterested();
        if (interested != null) {
            z10 = interested.booleanValue();
        }
        appTextView.setSelected(z10);
        a6Var.B.setOnClickListener(new h(a6Var, this, plate, 1));
    }

    public final int x() {
        return C0535R$layout.item_license_plate;
    }

    public final void z(Serializable serializable) {
        Plate plate = (Plate) serializable;
        j.f(plate, "model");
        this.f21805p.invoke(plate);
    }
}
