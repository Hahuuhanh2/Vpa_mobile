package okhttp3.internal.platform.android;

import al.g0;
import fk.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@SuppressSignatureCheck
/* compiled from: AndroidLog.kt */
public final class AndroidLog {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidLog f22569a = new AndroidLog();

    /* renamed from: b  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f22570b = new CopyOnWriteArraySet<>();

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, String> f22571c;

    static {
        String str;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = OkHttpClient.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = s.f20214a;
        } else if (size != 1) {
            map = new LinkedHashMap<>(linkedHashMap);
        } else {
            map = g0.k0(linkedHashMap);
        }
        f22571c = map;
    }

    private AndroidLog() {
    }
}
