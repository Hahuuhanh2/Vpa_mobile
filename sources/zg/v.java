package zg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vpa.daugia.module.auth.data.api.response.CheckRecover;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import com.vpa.daugia.module.auth.ui.activity.OtpActivity;
import com.vpa.daugia.ui.MainActivity;
import ek.i;
import mg.o0;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: OtpActivity.kt */
public final class v extends k implements l<f<? extends CheckRecover>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OtpActivity f23738a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(OtpActivity otpActivity) {
        super(1);
        this.f23738a = otpActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23738a.O().dismiss();
            View view = ((o0) this.f23738a.M()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23738a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23738a.O().dismiss();
            if (j.a(this.f23738a.S, "LOGIN")) {
                OtpActivity otpActivity = this.f23738a;
                otpActivity.getClass();
                Intent intent = new Intent(otpActivity, MainActivity.class);
                Intent intent2 = otpActivity.getIntent();
                if (intent2 != null && intent2.hasExtra("click_action")) {
                    intent.putExtra("value", intent2.getStringExtra("value"));
                    intent.putExtra("click_action", intent2.getStringExtra("click_action"));
                }
                otpActivity.startActivity(intent);
                otpActivity.finish();
            } else {
                Intent intent3 = new Intent(this.f23738a, ChangePasswordActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("KEY_FLOW", this.f23738a.S);
                bundle.putString("ACTION_FORGOT", this.f23738a.T);
                User user = (User) this.f23738a.T().L.f8545b;
                String str3 = null;
                if (user != null) {
                    str = user.getPhoneVerificationCode();
                } else {
                    str = null;
                }
                bundle.putString("OTP", str);
                User user2 = (User) this.f23738a.T().L.f8545b;
                if (user2 != null) {
                    str2 = user2.getEmail();
                } else {
                    str2 = null;
                }
                bundle.putString("EMAIL", str2);
                User user3 = (User) this.f23738a.T().L.f8545b;
                if (user3 != null) {
                    str3 = user3.getPhone();
                }
                bundle.putString("PHONE", str3);
                intent3.putExtras(bundle);
                this.f23738a.startActivity(intent3);
            }
        }
        return i.f20112a;
    }
}
