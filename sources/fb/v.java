package fb;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

/* compiled from: ServiceStarter */
public final class v {

    /* renamed from: e  reason: collision with root package name */
    public static v f10167e;

    /* renamed from: a  reason: collision with root package name */
    public String f10168a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f10169b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f10170c = null;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f10171d = new ArrayDeque();

    public static synchronized v a() {
        v vVar;
        synchronized (v.class) {
            if (f10167e == null) {
                f10167e = new v();
            }
            vVar = f10167e;
        }
        return vVar;
    }

    public final boolean b(Context context) {
        boolean z10;
        if (this.f10170c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10170c = Boolean.valueOf(z10);
        }
        if (!this.f10169b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f10170c.booleanValue();
    }

    public final boolean c(Context context) {
        boolean z10;
        if (this.f10169b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10169b = Boolean.valueOf(z10);
        }
        if (!this.f10169b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f10169b.booleanValue();
    }
}
