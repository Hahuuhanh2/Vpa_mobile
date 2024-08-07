package zg;

import android.view.View;
import android.widget.LinearLayout;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import ek.i;
import kf.e;
import mg.a4;
import rk.l;
import sk.j;
import sk.k;
import sk.q;

/* compiled from: StepThreePersonalActivity.kt */
public final class b1 extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23626a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f23627b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(StepThreePersonalActivity stepThreePersonalActivity, q qVar) {
        super(1);
        this.f23626a = stepThreePersonalActivity;
        this.f23627b = qVar;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        LinearLayout linearLayout = ((a4) this.f23626a.M()).T;
        j.e(linearLayout, "lnCitizen");
        e.j(linearLayout);
        if (this.f23627b.f22930a) {
            ((a4) this.f23626a.M()).B.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_menu_user, 0, C0531R$drawable.ic_direction_down, 0);
        } else {
            ((a4) this.f23626a.M()).B.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_menu_user, 0, C0531R$drawable.ic_direction_up, 0);
        }
        q qVar = this.f23627b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}
