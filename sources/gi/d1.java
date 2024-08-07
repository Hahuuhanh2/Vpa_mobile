package gi;

import android.view.View;
import com.vpa.daugia.module.auth.data.api.response.EkycReponse;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import ek.i;
import lf.g;
import mg.y1;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: VerifyActivity.kt */
public final class d1 extends k implements l<f<? extends EkycReponse>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VerifyActivity f20362a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(VerifyActivity verifyActivity) {
        super(1);
        this.f20362a = verifyActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20362a.O().dismiss();
            View view = ((y1) this.f20362a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f20362a.O().show();
        } else if (fVar instanceof f.c) {
            this.f20362a.O().dismiss();
            VerifyActivity verifyActivity = this.f20362a;
            v.f fVar2 = new v.f(29, verifyActivity, fVar);
            verifyActivity.getClass();
            g.b.a(verifyActivity, fVar2, 1000);
        }
        return i.f20112a;
    }
}
