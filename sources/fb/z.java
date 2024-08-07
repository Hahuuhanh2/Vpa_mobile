package fb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* compiled from: TopicsStore */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<z> f10185b;

    /* renamed from: a  reason: collision with root package name */
    public w f10186a;

    public z(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
    }

    public final synchronized y a() {
        String peek;
        y yVar;
        w wVar = this.f10186a;
        synchronized (wVar.f10175d) {
            peek = wVar.f10175d.peek();
        }
        Pattern pattern = y.f10181d;
        yVar = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                yVar = new y(split[0], split[1]);
            }
        }
        return yVar;
    }
}
