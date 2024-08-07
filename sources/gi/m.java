package gi;

import android.view.View;
import android.widget.LinearLayout;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import kf.e;
import mg.m0;
import rk.l;
import sk.j;
import sk.k;
import sk.q;

/* compiled from: OrganizationProfileActivity.kt */
public final class m extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20396a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f20397b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(OrganizationProfileActivity organizationProfileActivity, q qVar) {
        super(1);
        this.f20396a = organizationProfileActivity;
        this.f20397b = qVar;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        LinearLayout linearLayout = ((m0) this.f20396a.M()).f21193k0;
        j.e(linearLayout, "lnCitizen");
        e.j(linearLayout);
        if (this.f20397b.f22930a) {
            ((m0) this.f20396a.M()).C.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_notes_edit, 0, (int) C0531R$drawable.ic_direction_down, 0);
        } else {
            ((m0) this.f20396a.M()).C.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_notes_edit, 0, (int) C0531R$drawable.ic_direction_up, 0);
        }
        q qVar = this.f20397b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}
