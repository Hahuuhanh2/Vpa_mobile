package l2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ConcurrencyHelpers */
public final class b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
