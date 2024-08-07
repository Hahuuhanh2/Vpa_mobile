package ef;

import android.net.ConnectivityManager;
import android.net.Network;
import com.ots.core.base.BaseActivity;
import d2.l;
import lf.f;
import sk.j;

/* compiled from: BaseActivity.kt */
public final class b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity<l> f9440a;

    public b(BaseActivity<l> baseActivity) {
        this.f9440a = baseActivity;
    }

    public final void onAvailable(Network network) {
        j.f(network, "network");
        super.onAvailable(network);
        this.f9440a.Q(f.CONNECTED);
    }

    public final void onLost(Network network) {
        j.f(network, "network");
        super.onLost(network);
        this.f9440a.Q(f.DISCONNECTED);
    }
}
