package zg;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepFourActivity;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import ek.i;
import mg.a4;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: StepThreePersonalActivity.kt */
public final class n1 extends k implements l<f<? extends User>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23697a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1(StepThreePersonalActivity stepThreePersonalActivity) {
        super(1);
        this.f23697a = stepThreePersonalActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23697a.O().dismiss();
            View view = ((a4) this.f23697a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23697a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23697a.O().dismiss();
            this.f23697a.startActivity(new Intent(this.f23697a, StepFourActivity.class));
            this.f23697a.finish();
        }
        return i.f20112a;
    }
}
