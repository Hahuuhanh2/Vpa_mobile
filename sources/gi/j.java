package gi;

import android.view.View;
import android.widget.LinearLayout;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import kf.e;
import mg.m0;
import rk.l;
import sk.k;
import sk.q;

/* compiled from: OrganizationProfileActivity.kt */
public final class j extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f20386b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(OrganizationProfileActivity organizationProfileActivity, q qVar) {
        super(1);
        this.f20385a = organizationProfileActivity;
        this.f20386b = qVar;
    }

    public final Object invoke(Object obj) {
        sk.j.f((View) obj, "it");
        LinearLayout linearLayout = ((m0) this.f20385a.M()).f21198p0;
        sk.j.e(linearLayout, "lnInfoBasic");
        e.j(linearLayout);
        if (this.f20386b.f22930a) {
            ((m0) this.f20385a.M()).E.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_document_basic, 0, (int) C0531R$drawable.ic_direction_down, 0);
        } else {
            ((m0) this.f20385a.M()).E.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_document_basic, 0, (int) C0531R$drawable.ic_direction_up, 0);
        }
        q qVar = this.f20386b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}
