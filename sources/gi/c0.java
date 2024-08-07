package gi;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepFourActivity;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import lf.g;
import mg.m0;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: OrganizationProfileActivity.kt */
public final class c0 extends k implements l<f<? extends User>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20358a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(OrganizationProfileActivity organizationProfileActivity) {
        super(1);
        this.f20358a = organizationProfileActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20358a.O().dismiss();
            View view = ((m0) this.f20358a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f20358a.O().show();
        } else if (fVar instanceof f.c) {
            this.f20358a.O().dismiss();
            OrganizationProfileActivity organizationProfileActivity = this.f20358a;
            if (organizationProfileActivity.T) {
                Intent intent = new Intent(this.f20358a, StepFourActivity.class);
                intent.putExtra("REGISTER_ORG", true);
                this.f20358a.startActivity(intent);
                this.f20358a.finish();
            } else {
                View view2 = ((m0) organizationProfileActivity.M()).f8554e;
                j.e(view2, "getRoot(...)");
                new a(view2).a("Cập nhật thành công", b.SUCCESS);
                this.f20358a.O().dismiss();
                OrganizationProfileActivity organizationProfileActivity2 = this.f20358a;
                b0 b0Var = new b0(organizationProfileActivity2, 0);
                organizationProfileActivity2.getClass();
                g.b.a(organizationProfileActivity2, b0Var, 1500);
            }
        }
        return i.f20112a;
    }
}
