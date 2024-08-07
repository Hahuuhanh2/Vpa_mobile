package y3;

import android.net.ConnectivityManager;
import android.net.Network;
import sk.j;

/* compiled from: NetworkApi23.kt */
public final class k {
    public static final Network a(ConnectivityManager connectivityManager) {
        j.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
