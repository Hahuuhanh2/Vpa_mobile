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
public final class m1 extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23693a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f23694b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1(StepThreePersonalActivity stepThreePersonalActivity, q qVar) {
        super(1);
        this.f23693a = stepThreePersonalActivity;
        this.f23694b = qVar;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        LinearLayout linearLayout = ((a4) this.f23693a.M()).S;
        j.e(linearLayout, "lnBank");
        e.j(linearLayout);
        if (this.f23694b.f22930a) {
            ((a4) this.f23693a.M()).f20951y.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_card_white, 0, C0531R$drawable.ic_direction_down, 0);
        } else {
            ((a4) this.f23693a.M()).f20951y.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_card_white, 0, C0531R$drawable.ic_direction_up, 0);
        }
        q qVar = this.f23694b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}
