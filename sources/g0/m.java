package g0;

import al.g0;
import android.os.Looper;

/* compiled from: Threads */
public final class m {
    public static void a() {
        g0.E("Not in application's main thread", b());
    }

    public static boolean b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
