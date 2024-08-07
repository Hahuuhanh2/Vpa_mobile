package zg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.ForgotActivity;
import com.vpa.daugia.module.auth.ui.activity.OtpActivity;
import ek.i;
import mg.b0;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: ForgotActivity.kt */
public final class h extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ForgotActivity f23669a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ForgotActivity forgotActivity) {
        super(1);
        this.f23669a = forgotActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23669a.O().dismiss();
            View view = ((b0) this.f23669a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23669a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23669a.O().dismiss();
            Intent intent = new Intent(this.f23669a, OtpActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("KEY_FLOW", "FORGOT");
            if (((b0) this.f23669a.M()).E.isChecked()) {
                str = "ACTION_EMAIL";
            } else {
                str = "ACTION_PHONE";
            }
            bundle.putString("ACTION_FORGOT", str);
            User user = (User) this.f23669a.U().L.f8545b;
            String str3 = null;
            if (user != null) {
                str2 = user.getPhone();
            } else {
                str2 = null;
            }
            bundle.putString("PHONE", str2);
            User user2 = (User) this.f23669a.U().L.f8545b;
            if (user2 != null) {
                str3 = user2.getEmail();
            }
            bundle.putString("EMAIL", str3);
            intent.putExtras(bundle);
            this.f23669a.startActivity(intent);
        }
        return i.f20112a;
    }
}
