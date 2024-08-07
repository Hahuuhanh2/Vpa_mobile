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
public final class r0 extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreeOrganizationActivity f23712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f23713b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(StepThreeOrganizationActivity stepThreeOrganizationActivity, q qVar) {
        super(1);
        this.f23712a = stepThreeOrganizationActivity;
        this.f23713b = qVar;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        LinearLayout linearLayout = ((y3) this.f23712a.M()).S;
        j.e(linearLayout, "lnInfo");
        e.j(linearLayout);
        if (this.f23713b.f22930a) {
            ((y3) this.f23712a.M()).f21497z.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_file_minus, 0, C0531R$drawable.ic_direction_down, 0);
        } else {
            ((y3) this.f23712a.M()).f21497z.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_file_minus, 0, C0531R$drawable.ic_direction_up, 0);
        }
        q qVar = this.f23713b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}
