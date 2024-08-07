package g0;

import android.os.Handler;
import android.os.Looper;
import s1.i;

/* compiled from: MainThreadAsyncHandler */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f10262a;

    public static Handler a() {
        if (f10262a != null) {
            return f10262a;
        }
        synchronized (l.class) {
            if (f10262a == null) {
                f10262a = i.a(Looper.getMainLooper());
            }
        }
        return f10262a;
    }
}
