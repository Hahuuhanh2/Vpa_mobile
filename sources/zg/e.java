package zg;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import com.vpa.daugia.module.auth.ui.activity.SuccessActivity;
import ek.i;
import mg.r;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: ChangePasswordActivity.kt */
public final class e extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordActivity f23649a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ChangePasswordActivity changePasswordActivity) {
        super(1);
        this.f23649a = changePasswordActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23649a.O().dismiss();
            View view = ((r) this.f23649a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23649a.O().show();
        } else if (fVar instanceof f.c) {
            if (j.a(this.f23649a.X, "FORGOT")) {
                Intent intent = new Intent(this.f23649a, SuccessActivity.class);
                intent.putExtra("KEY_FLOW", this.f23649a.X);
                this.f23649a.startActivity(intent);
                this.f23649a.finish();
            } else {
                ah.a aVar = new ah.a(this.f23649a);
                aVar.f18957j = new d(this.f23649a);
                aVar.h();
            }
        }
        return i.f20112a;
    }
}
