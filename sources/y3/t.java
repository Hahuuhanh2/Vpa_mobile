package y3;

import android.content.Context;
import android.os.PowerManager;
import f0.b0;
import sk.j;

/* compiled from: WakeLocks.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f17418a = 0;

    static {
        j.e(o3.j.b("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        j.f(context, "context");
        j.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        j.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String r10 = b0.r("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, r10);
        synchronized (u.f17419a) {
            String put = u.f17420b.put(newWakeLock, r10);
        }
        j.e(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
