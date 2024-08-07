package wi;

import android.content.Intent;
import com.vpa.daugia.module.auth.ui.activity.AuthActivity;
import com.vpa.daugia.ui.MainActivity;
import ek.i;
import rk.a;
import sk.k;

/* compiled from: MainActivity.kt */
public final class f extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f23428a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(MainActivity mainActivity) {
        super(0);
        this.f23428a = mainActivity;
    }

    public final Object invoke() {
        this.f23428a.startActivity(new Intent(this.f23428a, AuthActivity.class));
        return i.f20112a;
    }
}
