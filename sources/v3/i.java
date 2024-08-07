package v3;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import r1.a;
import sk.j;
import t3.c;
import y3.k;

/* compiled from: NetworkStateTracker.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f16028a = 0;

    static {
        j.e(o3.j.b("NetworkStateTracker"), "tagWithPrefix(\"NetworkStateTracker\")");
    }

    public static final c a(ConnectivityManager connectivityManager) {
        boolean z10;
        boolean z11;
        j.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = true;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z10 = false;
        } else {
            z10 = true;
        }
        try {
            NetworkCapabilities a10 = y3.j.a(connectivityManager, k.a(connectivityManager));
            if (a10 != null) {
                z11 = y3.j.b(a10, 16);
                boolean a11 = a.a(connectivityManager);
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z12 = false;
                }
                return new c(z10, z11, a11, z12);
            }
        } catch (SecurityException unused) {
            o3.j.a().getClass();
        }
        z11 = false;
        boolean a112 = a.a(connectivityManager);
        z12 = false;
        return new c(z10, z11, a112, z12);
    }
}
