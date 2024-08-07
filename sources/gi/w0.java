package gi;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepFourActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import kf.h;
import lf.g;
import mg.x0;
import nh.g0;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: ProfileActivity.kt */
public final class w0 extends k implements l<f<? extends User>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20419a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0(ProfileActivity profileActivity) {
        super(1);
        this.f20419a = profileActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20419a.O().dismiss();
            View view = ((x0) this.f20419a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f20419a.O().show();
        } else if (fVar instanceof f.c) {
            this.f20419a.O().dismiss();
            ProfileActivity profileActivity = this.f20419a;
            if (profileActivity.V) {
                View view2 = ((x0) profileActivity.M()).f8554e;
                j.e(view2, "getRoot(...)");
                new a(view2).a("Xác minh thành công", b.SUCCESS);
                ProfileActivity profileActivity2 = this.f20419a;
                g0 g0Var = new g0(profileActivity2, 1);
                profileActivity2.getClass();
                g.b.a(profileActivity2, g0Var, 1000);
            } else if (profileActivity.U) {
                Intent intent = new Intent(this.f20419a, StepFourActivity.class);
                int i10 = h.f12560a;
                boolean z10 = this.f20419a.V;
                intent.putExtra("ON_VERIFY_PROFILE", "ON_VERIFY_PROFILE");
                intent.putExtra("ON_VERIFY_PROFILE", this.f20419a.V);
                this.f20419a.startActivity(intent);
                this.f20419a.finish();
            } else {
                View view3 = ((x0) profileActivity.M()).f8554e;
                j.e(view3, "getRoot(...)");
                new a(view3).a("Cập nhật thành công", b.SUCCESS);
                ProfileActivity profileActivity3 = this.f20419a;
                b0 b0Var = new b0(profileActivity3, 1);
                profileActivity3.getClass();
                g.b.a(profileActivity3, b0Var, 1500);
            }
        }
        return i.f20112a;
    }
}
