package zg;

import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import ek.i;
import mg.c4;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: StepTwoActivity.kt */
public final class j2 extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f23682a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j2(StepTwoActivity stepTwoActivity) {
        super(1);
        this.f23682a = stepTwoActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23682a.O().dismiss();
            View view = ((c4) this.f23682a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23682a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23682a.O().dismiss();
            StepTwoActivity stepTwoActivity = this.f23682a;
            ((c4) stepTwoActivity.M()).f21011z.M.setEnabled(false);
            ((c4) stepTwoActivity.M()).f21010y.O.setEnabled(false);
            new k2(stepTwoActivity).start();
            ((c4) this.f23682a.M()).f21011z.F.setEnabled(false);
            ((c4) this.f23682a.M()).f21010y.C.setEnabled(false);
            View view2 = ((c4) this.f23682a.M()).f8554e;
            j.e(view2, "getRoot(...)");
            new a(view2).a("Gửi mã OTP thành công", b.SUCCESS);
        }
        return i.f20112a;
    }
}
