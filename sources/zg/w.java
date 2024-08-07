package zg;

import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.OtpActivity;
import ek.i;
import mg.o0;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: OtpActivity.kt */
public final class w extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OtpActivity f23750a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(OtpActivity otpActivity) {
        super(1);
        this.f23750a = otpActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23750a.O().dismiss();
            View view = ((o0) this.f23750a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23750a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23750a.O().dismiss();
            OtpActivity otpActivity = this.f23750a;
            otpActivity.getClass();
            new x(otpActivity).start();
        }
        return i.f20112a;
    }
}
