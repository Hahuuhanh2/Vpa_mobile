package zg;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepFourActivity;
import com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity;
import ek.i;
import mg.y3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: StepThreeOrganizationActivity.kt */
public final class t0 extends k implements l<f<? extends User>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreeOrganizationActivity f23725a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0(StepThreeOrganizationActivity stepThreeOrganizationActivity) {
        super(1);
        this.f23725a = stepThreeOrganizationActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23725a.O().dismiss();
            View view = ((y3) this.f23725a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23725a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23725a.O().dismiss();
            this.f23725a.startActivity(new Intent(this.f23725a, StepFourActivity.class));
            this.f23725a.finish();
        }
        return i.f20112a;
    }
}
