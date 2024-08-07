package zg;

import android.content.Intent;
import android.view.View;
import bc.h;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import mg.c4;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: StepTwoActivity.kt */
public final class i2 extends k implements l<f<? extends Auth>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23676a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i2(StepTwoActivity stepTwoActivity) {
        super(1);
        this.f23676a = stepTwoActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23676a.O().dismiss();
            View view = ((c4) this.f23676a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23676a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23676a.O().dismiss();
            User user = (User) this.f23676a.X().L.f8545b;
            if (user != null) {
                StepTwoActivity stepTwoActivity = this.f23676a;
                Intent intent = new Intent(stepTwoActivity, OrganizationProfileActivity.class);
                intent.putExtra("DATA_ORG", new h().i(user));
                intent.putExtra("ON_CREATE_PROFILE", "ON_CREATE_PROFILE");
                intent.putExtra("REGISTER_ORG", true);
                stepTwoActivity.startActivity(intent);
                stepTwoActivity.finish();
            }
        }
        return i.f20112a;
    }
}
