package gi;

import android.view.View;
import android.widget.LinearLayout;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import kf.e;
import mg.m0;
import sk.j;
import sk.k;
import sk.q;

/* compiled from: OrganizationProfileActivity.kt */
public final class l extends k implements rk.l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f20394b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(OrganizationProfileActivity organizationProfileActivity, q qVar) {
        super(1);
        this.f20393a = organizationProfileActivity;
        this.f20394b = qVar;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        LinearLayout linearLayout = ((m0) this.f20393a.M()).f21192j0;
        j.e(linearLayout, "lnBank");
        e.j(linearLayout);
        if (this.f20394b.f22930a) {
            ((m0) this.f20393a.M()).f21211z.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_card_white, 0, (int) C0531R$drawable.ic_direction_down, 0);
        } else {
            ((m0) this.f20393a.M()).f21211z.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_card_white, 0, (int) C0531R$drawable.ic_direction_up, 0);
        }
        q qVar = this.f20394b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}
