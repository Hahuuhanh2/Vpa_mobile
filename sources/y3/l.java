package y3;

import android.net.ConnectivityManager;
import sk.j;

/* compiled from: NetworkApi24.kt */
public final class l {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        j.f(connectivityManager, "<this>");
        j.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
