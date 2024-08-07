package fb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f10172a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10173b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10174c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f10175d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final Executor f10176e;

    public w(SharedPreferences sharedPreferences, Executor executor) {
        this.f10172a = sharedPreferences;
        this.f10173b = "topic_operation_queue";
        this.f10174c = ",";
        this.f10176e = executor;
    }

    public static w a(SharedPreferences sharedPreferences, Executor executor) {
        w wVar = new w(sharedPreferences, executor);
        synchronized (wVar.f10175d) {
            wVar.f10175d.clear();
            String string = wVar.f10172a.getString(wVar.f10173b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(wVar.f10174c)) {
                    String[] split = string.split(wVar.f10174c, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            wVar.f10175d.add(str);
                        }
                    }
                }
            }
        }
        return wVar;
    }
}
