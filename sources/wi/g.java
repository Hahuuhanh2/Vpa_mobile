package wi;

import android.content.Intent;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.ui.MainActivity;
import ek.i;
import rk.a;
import sk.k;

/* compiled from: MainActivity.kt */
public final class g extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f23429a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(MainActivity mainActivity) {
        super(0);
        this.f23429a = mainActivity;
    }

    public final Object invoke() {
        this.f23429a.startActivity(new Intent(this.f23429a, RegisterAccountActivity.class));
        return i.f20112a;
    }
}
