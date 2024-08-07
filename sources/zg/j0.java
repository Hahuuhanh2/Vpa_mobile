package zg;

import android.view.View;
import android.widget.LinearLayout;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity;
import ek.i;
import kf.e;
import mg.y3;
import rk.l;
import sk.j;
import sk.k;
import sk.q;

/* compiled from: StepThreeOrganizationActivity.kt */
public final class j0 extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreeOrganizationActivity f23678a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f23679b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f23680c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(StepThreeOrganizationActivity stepThreeOrganizationActivity, q qVar, q qVar2) {
        super(1);
        this.f23678a = stepThreeOrganizationActivity;
        this.f23679b = qVar;
        this.f23680c = qVar2;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        LinearLayout linearLayout = ((y3) this.f23678a.M()).R;
        j.e(linearLayout, "lnCitizen");
        e.j(linearLayout);
        if (this.f23679b.f22930a) {
            ((y3) this.f23678a.M()).f21496y.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_notes_edit, 0, C0531R$drawable.ic_direction_down, 0);
        } else {
            ((y3) this.f23678a.M()).f21496y.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_notes_edit, 0, C0531R$drawable.ic_direction_up, 0);
        }
        this.f23679b.f22930a = !this.f23680c.f22930a;
        return i.f20112a;
    }
}
